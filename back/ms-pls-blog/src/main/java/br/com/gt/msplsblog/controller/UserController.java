package br.com.gt.msplsblog.controller;

import br.com.gt.msplsblog.dto.request.UserRequest;
import br.com.gt.msplsblog.dto.response.AllUserResponse;
import br.com.gt.msplsblog.dto.response.UserResponse;
import br.com.gt.msplsblog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/all")
    public AllUserResponse allUserResponse(){
        return userService.allUserResponse();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public UserResponse userByIdResponse(@PathVariable long id) {
        return userService.userByIdResponse(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/insert")
    public void insertUser(@RequestBody UserRequest userRequest){
        userService.saveUser(userRequest);
    }

    @PutMapping(value = "/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse updateUser(@PathVariable Long id, @RequestBody UserRequest userRequest){
        return userService.updateUser(id, userRequest);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }
}