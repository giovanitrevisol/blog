package com.gt.pslblog.controller;

import com.gt.pslblog.dto.response.AllCommentResponse;
import com.gt.pslblog.dto.response.CommentResponse;
import com.gt.pslblog.service.ComentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private ComentService comentService;

    @GetMapping(value = "/all")
    public ResponseEntity<AllCommentResponse> findAll(){
        return ResponseEntity.ok().body(comentService.allCommentResponse());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CommentResponse> findByid(@PathVariable Long id){
        return ResponseEntity.ok().body(comentService.commentById(id));
    }
}
