package br.com.gt.msplsblog.service;

import br.com.gt.msplsblog.dto.request.PostRequest;
import br.com.gt.msplsblog.dto.response.AllPostResponse;
import br.com.gt.msplsblog.dto.response.PostResponse;


public interface PostService {

    AllPostResponse allPostResponse();

    PostResponse postByid(Long id);

    void savePost(PostRequest postRequest);

    void updatePost(Long id, PostRequest postRequest);

    void deletePost(Long id);
}
