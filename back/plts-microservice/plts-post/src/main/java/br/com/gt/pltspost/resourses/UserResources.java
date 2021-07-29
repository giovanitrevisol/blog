package br.com.gt.pltspost.resourses;

import br.com.gt.pltspost.domain.User;
import br.com.gt.pltspost.dto.UserDto;
import br.com.gt.pltspost.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserResources {

    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<UserDto>> findAll(){
        List<User> users = userService.findAll();
        List<UserDto> usersDto = users.stream()
                .map(User::toUserDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(usersDto);
    }
}
