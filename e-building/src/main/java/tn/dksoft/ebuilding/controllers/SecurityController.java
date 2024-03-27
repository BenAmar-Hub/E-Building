package tn.dksoft.ebuilding.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
@AllArgsConstructor
public class SecurityController {
private AuthenticationManager authenticationManager;
private JwtEncoder jwtEncoder;
    @GetMapping("/profile")
    public Authentication authentication(Authentication authentication){
        return  authentication;
    }
    @PostMapping("/login")
    public Map<String,String> login(String username, String password){
        // maintenant pour authentifier l utilisateur on convoque authentication manager
        //pour charger user
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));
        // maintenant on génére le JWT
        //recupere les role separer par un espace
        String scope = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority).collect(Collectors.joining(" "));
        // Ajouter la date système
        Instant instant=Instant.now();
        // definir les revondications
        JwtClaimsSet jwtClaimsSet=JwtClaimsSet.builder()
                //date de génération du token
                .issuedAt(instant)
                //Expire dans
                .expiresAt(instant.plus(10, ChronoUnit.MINUTES))
                //id de user
                .subject(username)
                //ajouter les roles
                .claim("scope",scope)
                .build();
        //finalement cree le jwt
        JwtEncoderParameters jwtEncoderParameters=
                JwtEncoderParameters.from(
                        // on encode, il faut rappeler algorithme
                        JwsHeader.with(MacAlgorithm.HS512).build(),
                        //deuxieme parametre, le claims
                        jwtClaimsSet
                );
        String jwt=jwtEncoder.encode(jwtEncoderParameters).getTokenValue();
        return Map.of("access-token",jwt);
    }
}
