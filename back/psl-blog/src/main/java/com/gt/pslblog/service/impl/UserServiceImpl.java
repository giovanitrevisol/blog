package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.User;
import com.gt.pslblog.exception.BadRequestException;
import com.gt.pslblog.repository.UserRepository;
import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserResponse;
import com.gt.pslblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public AllUserResponse allUserResponse() {
        List<User> users = userRepository.findAll();
        if(users.isEmpty()){
            throw new BadRequestException("Nunhum usuário encontrado!");
        }
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user: users) {
            userResponses.add(user.toUserResponse());
        }
        return AllUserResponse.builder()
                .users(userResponses)
                .build();
    }

    @Override
    public UserResponse userByIdResponse(long id) {
        try {
            Optional<User> obj = userRepository.findById(id);
            User user = obj.get();
            return UserResponse.builder()
                    .id(user.getId())
                    .birth(user.getBirth())
                    .email(user.getEmail())
                    .firtName(user.getFirtName())
                    .lastName(user.getLastName())
                    .build();
        } catch (Exception e) {
            throw new BadRequestException("Usuário não encontrado. Id : " + id);
        }
    }
}