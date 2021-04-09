package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.Post;
import com.gt.pslblog.repository.PostRepository;
import com.gt.pslblog.response.AllPostResponse;
import com.gt.pslblog.service.ConsultPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultPostServiceImpl implements ConsultPostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public AllPostResponse allPostResponse() {
        List<Post> posts = postRepository.findAll();
        return AllPostResponse.builder()
                .posts(posts)
                .build();
    }
}
