package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.domain.User;
import br.com.gt.msplsblog.repository.UserRepository;
import br.com.gt.msplsblog.security.UserSS;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOpt = userRepository.findByEmail(email);
        if(userOpt.get() == null){
            throw new UsernameNotFoundException(email);
        }
        User user = userOpt.get();
        return new UserSS((int) user.getId(), user.getEmail(),
                user.getPassword(), Collections.singleton(user.getPerfilUserEnum()));
    }
}
