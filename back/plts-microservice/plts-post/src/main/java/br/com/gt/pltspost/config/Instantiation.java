package br.com.gt.pltspost.config;

import br.com.gt.pltspost.domain.User;
import br.com.gt.pltspost.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Component
public class Instantiation {

    private final UserRepository userRepository;

    @PostConstruct
    public void createUsers(){

        userRepository.deleteAll();

        User user1 = User.builder()
                .name("Giovani Trevisol")
                .email("giovani.trevisol@email.com")
                .build();

        User user2 = User.builder()
                .name("Lara Talita ")
                .email("laratalita.email.com")
                .build();

        User user3 = User.builder()
                .name("Titan Dog")
                .email("dog.titan@email.com")
                .build();

        List<User> users = new ArrayList<>();
        users.addAll(Arrays.asList(user1, user2, user3));
        userRepository.saveAll(users);
    }
}
