package com.gt.pslblog.util;

import com.gt.pslblog.domain.User;
import com.gt.pslblog.dto.request.UserRequest;
import com.gt.pslblog.dto.response.AllUserResponse;
import com.gt.pslblog.dto.response.UserResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserMock {
    public User user1 = User.builder()
            .id(1)
            .firtName("Giovani")
            .lastName("Trevisol")
            .email("giovanitrevisol93@gmail.com")
            .birth(LocalDateTime.now())
            .password("123")
            .build();

    public User user2 = User.builder()
            .id(2)
            .firtName("Lara")
            .lastName("Santiago")
            .email("laratalita.santiago.com.br")
            .birth(LocalDateTime.now())
            .password("123")
            .build();

    List<User> listUsers = new ArrayList<>();

    public List<User> buildListUser(){
        listUsers.add(user1);
        listUsers.add(user2);
        return listUsers;
    }

    public UserResponse userResponse1 = UserResponse.builder()
            .id(1)
            .firtName("Giovani")
            .lastName("Trevisol")
            .email("giovanitrevisol93@gmail.com")
            .birth(LocalDateTime.now())
            .build();

    public UserResponse userResponse2 = UserResponse.builder()
            .id(2)
            .firtName("Lara")
            .lastName("Santiago")
            .email("laratalita.santiago.com.br")
            .birth(LocalDateTime.now())
            .build();

    List<UserResponse> listUserResponse = new ArrayList<>();

    public void buildListUserResponse(){
        listUserResponse.add(userResponse1);
        listUserResponse.add(userResponse2);
    }

    AllUserResponse  allUserResponse = AllUserResponse.builder()
            .users(listUserResponse)
            .build();


    public UserRequest userRequest1 = UserRequest.builder()
            .firtName("Giovani")
            .lastName("Trevisol")
            .email("giovanitrevisol93@gmail.com")
            .birth(LocalDateTime.now())
            .password("123")
            .build();
}