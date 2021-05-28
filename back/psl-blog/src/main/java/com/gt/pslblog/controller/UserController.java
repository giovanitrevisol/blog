package com.gt.pslblog.controller;


import com.gt.pslblog.exception.UserException;
import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserResponse;
import com.gt.pslblog.service.ConsultUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private ConsultUserService consultUserService;

    private LocalDateTime dateNow = LocalDateTime.now();

    @GetMapping
    public String testUserController(){
        return "Endpoint User - " + dateNow.toString();
    }

    @GetMapping(value = "/all")
    public ResponseEntity<AllUserResponse> allUserResponse(){
        AllUserResponse allUserResponse = consultUserService.allUserResponse();
        return ResponseEntity.ok().body(allUserResponse);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponse> userByIdResponse(@PathVariable long id) throws UserException {
        UserResponse userResponse = consultUserService.userByIdResponse(id);
        return  ResponseEntity.ok().body(userResponse);
    }
}
