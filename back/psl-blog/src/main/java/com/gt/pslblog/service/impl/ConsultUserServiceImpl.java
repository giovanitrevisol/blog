package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.User;
import com.gt.pslblog.repository.UserRepository;
import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserByIdResponse;
import com.gt.pslblog.service.ConsultUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultUserServiceImpl implements ConsultUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public AllUserResponse allUserResponse() {
        List<User> users = userRepository.findAll();

        return AllUserResponse.builder()
                .users(users)
                .build();
    }

    @Override
    public UserByIdResponse userByIdResponse(long id) {
        Optional<User> userById = userRepository.findById(id);
        return UserByIdResponse.builder()
                .user(userById.get())
                .build();
    }
}
