package br.com.gt.msplsblog.controller;

import br.com.gt.msplsblog.dto.request.PostRequest;
import br.com.gt.msplsblog.dto.response.AllPostResponse;
import br.com.gt.msplsblog.dto.response.PostResponse;
import br.com.gt.msplsblog.service.PostService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    private PostService postService;

    @ApiOperation(value = "Busca todos os posts")
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/all")
    public AllPostResponse allPostResponse(){
        return postService.allPostResponse();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{id}")
    public PostResponse findById(@PathVariable Long id){
        return postService.postByid(id);
    }

    @PreAuthorize("hasAnyRole('Owner')")
    @PostMapping(value = "/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void insertPost(@RequestBody PostRequest postRequest){
        postService.savePost(postRequest);
    }

    @PutMapping(value = "/update/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void update(@PathVariable Long id, @RequestBody PostRequest postRequest){
        postService.updatePost(id, postRequest);
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        postService.deletePost(id);
    }
}
