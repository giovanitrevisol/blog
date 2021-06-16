package br.com.gt.msplsblog.controller;

import br.com.gt.msplsblog.dto.request.CommentRequest;
import br.com.gt.msplsblog.dto.response.AllCommentResponse;
import br.com.gt.msplsblog.dto.response.CommentResponse;
import br.com.gt.msplsblog.service.ComentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/comment")

public class CommentController {

    private final ComentService commentService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public AllCommentResponse findAll(){
        return commentService.allCommentResponse();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CommentResponse findByid(@PathVariable Long id){
        return commentService.commentById(id);
    }

    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.OK)
    public void insert(@RequestBody CommentRequest commentRequest){
        commentService.insertComment(commentRequest);
    }

    @PutMapping(value = "/edit/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody CommentRequest commentRequest){
        commentService.updateComment(id, commentRequest);
    }
}
