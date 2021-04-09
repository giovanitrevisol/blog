package com.gt.pslblog.controller;

import com.gt.pslblog.response.AllPostResponse;
import com.gt.pslblog.service.ConsultPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {


    @Autowired
    private ConsultPostService consultPostService;


    @GetMapping(value = "/test")
    public String test(){
        return "This is a test Post controller endpoint ";
    }

    @GetMapping(value = "all")
    public AllPostResponse allPostResponse(){
        return consultPostService.allPostResponse();
    }


}
