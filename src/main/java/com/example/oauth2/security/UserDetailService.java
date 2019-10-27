package com.example.oauth2.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserJpaRepo userJpaRepo;
    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userJpaRepo.findByUid(username).orElseThrow(() -> new UsernameNotFoundException("UserNotFound : [" + username + "]"));
        detailsChecker.check(user);

        return user;
    }
}
