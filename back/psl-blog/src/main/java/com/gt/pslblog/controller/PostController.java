package com.gt.pslblog.controller;

import com.gt.pslblog.dto.response.AllPostResponse;
import com.gt.pslblog.dto.response.PostResponse;
import com.gt.pslblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/all")
    public ResponseEntity<AllPostResponse> allPostResponse(){
        return ResponseEntity.ok().body(postService.allPostResponse());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PostResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(postService.postByid(id));
    }
}
