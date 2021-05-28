package com.gt.pslblog.Dummy;

import com.gt.pslblog.domain.User;
import com.gt.pslblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class dummyData {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void insertUser() {
        User user1 = User.builder()
                .id(1)
                .firtName("Giovani")
                .lastName("Trevisol")
                .email("giovanitrevisol93@gmail.com")
                .birth(LocalDateTime.now())
                .password("123")
                .build();

        User user2 = User.builder()
                .id(2)
                .firtName("Lara")
                .lastName("Santiago")
                .email("laratalita.santiago.com.br")
                .birth(LocalDateTime.now())
                .password("123")
                .build();

        userRepository.save(user1);
        userRepository.save(user2);
    }

}
