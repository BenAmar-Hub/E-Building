package tn.dksoft.ebuilding.security;

import com.nimbusds.jose.jwk.source.ImmutableSecret;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.crypto.spec.SecretKeySpec;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Value("${jwt.secret}")
    private String secretKey;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                //on indique a springSecurity que on est entrain d'utiliser stateless: session gerer coter client
                // il faut desactiver csrf
                .sessionManagement(sm->sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .csrf(csrf->csrf.disable())
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(ar->ar.requestMatchers(new AntPathRequestMatcher("/auth/login/**")).permitAll())
                .authorizeHttpRequests(ar-> ar.anyRequest().authenticated())
                //cette facon dauthentification exige d envoyer le username et password pour chaque requete envoyer
                // pour palier ce pb on utilisera le JWT
                // .httpBasic(Customizer.withDefaults())
                /// une facon de dire a springsecurity qu'on utilisera JWT
                .oauth2ResourceServer(oa->oa.jwt(Customizer.withDefaults()))
                .build();
    }
    // c'est le bean qui permettera de générer et signer les tokens au moment
    // d'authentification
    @Bean
    JwtEncoder jwtEncoder(){
        return new NimbusJwtEncoder(new ImmutableSecret<>(secretKey.getBytes()));
    }
    // ce bean intercepte la requête, récupère le token, vérifie la signature
    //et récupère les infos sur le token
    @Bean
    JwtDecoder jwtDecoder(){
        // on utilise une cle prive de 64 bytes pour la raison qu'on utilise algo HS512
        SecretKeySpec secretKeySpec=new SecretKeySpec(secretKey.getBytes(),"RSA");

        return NimbusJwtDecoder.withSecretKey(secretKeySpec).macAlgorithm(MacAlgorithm.HS512).build();
    }
    // il faut le cree pour qu'on puisse l'injecter dans le controller
    @Bean
    public AuthenticationManager authenticationManager(UserDetailServiceImpl userDetailService){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        //on spécifie au authentication provider quel type de password encoder utilisera
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        //on spécifie au authentication provider quel type de userDetails utilisera
        daoAuthenticationProvider.setUserDetailsService(userDetailService);
        return new ProviderManager(daoAuthenticationProvider);
    }
    // qu'on travail avec spring security c'est la meilleur facon de gerer pb de cors
    @Bean
    public CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration corsConfiguration=new CorsConfiguration();
        //on dit que les origines possedant * sont autorises
        corsConfiguration.addAllowedOrigin(CorsConfiguration.ALL);
        //autoriser n'importe quel methode (requete) provenant de *
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
        corsConfiguration.setExposedHeaders(List.of("x-auth-token"));
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        //pour ttes les requetes j'utilise ces regeles definies dessus
        source.registerCorsConfiguration("/**",corsConfiguration);
        return source;
    }
}
