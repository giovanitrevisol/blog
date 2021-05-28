package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.User;
import com.gt.pslblog.repository.UserRepository;
import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserResponse;
import com.gt.pslblog.service.ConsultUserService;
import com.gt.pslblog.service.exception.ObjectNotFoundException;
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
            throw new ObjectNotFoundException("Falha ao buscar Usuário com ID: " + id, e.getCause());
        }
    }
}
