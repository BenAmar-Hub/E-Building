package tn.dksoft.ebuilding.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tn.dksoft.ebuilding.business.AccountService;
import tn.dksoft.ebuilding.entities.Tuser;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private final AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Tuser appUser = accountService.loadUserByUserName(username);
        if(appUser==null) throw new UsernameNotFoundException(String.format("User %s",username));
        UserDetails userDetails= User
                .withUsername(appUser.getUserName())
                .password(appUser.getPassword())
                .roles(appUser.getRoles().stream().map(u->u.getRoleName()).toArray(String[]::new))
                .authorities(appUser.getRoles().stream().
                        map(r-> new SimpleGrantedAuthority(r.getRoleName()))
                        .collect(Collectors.toList()))
                .build();
        return userDetails;
    }
}
