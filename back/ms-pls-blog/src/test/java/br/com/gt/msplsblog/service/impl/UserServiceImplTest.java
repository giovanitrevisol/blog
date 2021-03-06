package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.dto.request.UserRequest;
import br.com.gt.msplsblog.dto.response.AllUserResponse;
import br.com.gt.msplsblog.dto.response.UserResponse;
import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.repository.UserRepository;
import br.com.gt.msplsblog.util.UserMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

    private UserMock userMock;

    @BeforeEach
    public void setup() {
        userMock = new UserMock();
    }


    @Test
    void allUserResponse() {
        Mockito.when(userRepository.findAll()).thenReturn(userMock.buildListUser());
        AllUserResponse allUserResponse = userService.allUserResponse();
        Assertions.assertNotNull(allUserResponse);
        Assertions.assertEquals("Giovani", allUserResponse.getUsers().get(0).getFirtName());
        Assertions.assertEquals("Lara", allUserResponse.getUsers().get(1).getFirtName());
    }

    @Test
    void userByIdResponse_valid() {
        Mockito.when(userRepository.findById(ArgumentMatchers.any()))
                .thenReturn(java.util.Optional.ofNullable(userMock.user1));
        UserResponse userResponse = userService.userByIdResponse(1L);
        Assertions.assertNotNull(userResponse);
        Assertions.assertEquals("Giovani", userResponse.getFirtName());
    }

    @Test
    void userByIdResponse_invalid() {
        Assertions.assertThrows(BadRequestException.class, () -> userService.userByIdResponse(10000L));
    }

    @Test
    void saveUser() {
        Mockito.when(passwordEncoder.encode(ArgumentMatchers.any())).thenReturn("estaEASenhaCriptograda!!!AgoraCriptografou");
        userService.saveUser(userMock.userRequest1);
        Mockito.verify(userRepository).save(ArgumentMatchers.any());
    }

    @Test
    void updateUser() {
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.ofNullable(userMock.user1));
        UserRequest userRequest = userMock.userRequest1;
        userRequest.setFirtName("Editando");
        UserResponse userResponse = userService.updateUser(1L, userMock.userRequest1);
        Assertions.assertEquals(userResponse.getFirtName(), "Editando");
    }

    @Test
    void delete() {
        Mockito.when(userRepository.findById(ArgumentMatchers.any()))
                .thenReturn(java.util.Optional.ofNullable(userMock.user1));
        userService.delete(1L);
        Mockito.verify(userRepository).delete(ArgumentMatchers.any());
    }

    @Test
    void whenExistUserTheBase() {
        Mockito.when(userRepository.findByEmail("giovanitrevisol93@gmail.com"))
                .thenReturn(java.util.Optional.ofNullable(userMock.user1));
        Assertions.assertThrows(BadRequestException.class, () -> userService.existUser(userMock.userRequest1));
    }

    @Test
    void whenNotExistUserTheBase() {
        Mockito.when(userRepository.findByEmail(ArgumentMatchers.any()))
                .thenReturn(null);
    }

    @Test
    void validUserRequest() {
        userService.validUserRequest(userMock.userRequest1);
        Assertions.assertEquals("Giovani", userMock.userRequest1.getFirtName());
    }

    @Test
    void validUserRequest_fail() {
        Assertions.assertThrows(BadRequestException.class, () -> userService.validUserRequest(userMock.userRequest_fail));
    }
}