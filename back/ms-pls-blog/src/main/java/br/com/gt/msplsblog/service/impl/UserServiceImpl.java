package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.domain.User;
import br.com.gt.msplsblog.dto.request.UserRequest;
import br.com.gt.msplsblog.dto.response.AllUserResponse;
import br.com.gt.msplsblog.dto.response.UserResponse;
import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.repository.UserRepository;
import br.com.gt.msplsblog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public AllUserResponse allUserResponse() {
        List<User> users = userRepository.findAll();
        if (users.isEmpty()) {
            throw new BadRequestException("Nunhum usuário encontrado!");
        }
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user : users) {
            userResponses.add(user.toUserResponse());
        }
        return AllUserResponse.builder()
                .users(userResponses)
                .build();
    }

    @Override
    public UserResponse userByIdResponse(long id) {
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new BadRequestException("Usuário não encontrado. Id : " + id));
        try {
            return UserResponse.builder()
                    .id(user.getId())
                    .birth(user.getBirth())
                    .email(user.getEmail())
                    .firtName(user.getFirtName())
                    .lastName(user.getLastName())
                    .build();
        } catch (Exception e) {
            throw new BadRequestException("Erro ao converter User.");
        }
    }

    @Override
    public void saveUser(UserRequest userRequest) {
        validUserRequest(userRequest);
        existUser(userRequest);
        try{
            userRepository.save(this.formUser(userRequest));
        } catch (Exception e){
            throw new BadRequestException("Erro ao salvar  usuário");
        }
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Id inválido"));
        user.setFirtName(userRequest.getFirtName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setBirth(userRequest.getBirth());
        userRepository.save(user);
        return user.toUserResponse();
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id).
                orElseThrow(() -> new BadRequestException("Usuário não encontrado"));
        try {
            userRepository.delete(user);
        } catch (BadRequestException e){
            throw new BadRequestException(e.getMessage());
        }
    }

    public void existUser(UserRequest userRequest){
        Optional<User> user = userRepository.findByEmail(userRequest.getEmail());
        if(user.isPresent()){
            throw new BadRequestException("Usuário já cadastrado no banco de dados");
        }
    }

    public User formUser(UserRequest userRequest) {
        return User.builder()
                .firtName(userRequest.getFirtName())
                .lastName(userRequest.getLastName())
                .birth(userRequest.getBirth())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
    }

    public void validUserRequest(UserRequest userRequest) {
        if (userRequest == null) {
            throw new BadRequestException("User Request is null");
        }
        //todo adicionar validação dos dados
        //data de nascimento nao pode ser maior que a data atual
    }
}
