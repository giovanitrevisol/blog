package com.gt.pslblog.controller;

import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserResponse;
import com.gt.pslblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    private LocalDateTime dateNow = LocalDateTime.now();

    @GetMapping
    public String testUserController(){
        return "Endpoint User - " + dateNow.toString();
    }

    @GetMapping(value = "/all")
    public ResponseEntity<AllUserResponse> allUserResponse(){
        AllUserResponse allUserResponse = userService.allUserResponse();
        return ResponseEntity.ok().body(allUserResponse);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponse> userByIdResponse(@PathVariable long id) {
        UserResponse userResponse = userService.userByIdResponse(id);
        return  ResponseEntity.ok().body(userResponse);
    }
}
