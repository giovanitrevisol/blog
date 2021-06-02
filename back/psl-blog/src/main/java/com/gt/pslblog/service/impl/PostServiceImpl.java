package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.Post;
import com.gt.pslblog.exception.BadRequestException;
import com.gt.pslblog.repository.PostRepository;
import com.gt.pslblog.response.AllPostResponse;
import com.gt.pslblog.response.PostResponse;
import com.gt.pslblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public AllPostResponse allPostResponse() {
        List<Post> posts = postRepository.findAll();
        if(posts.isEmpty()){
            throw new BadRequestException("Nenhum post encontrado!!!");
        }
        return AllPostResponse.builder()
                .posts(posts)
                .build();
    }

    public PostResponse postByid(Long id){
        Post post = postRepository.findById(id)
                        .orElseThrow(() -> new BadRequestException("Nenhum post com id: " + id + " encontrado."));
        return PostResponse.builder()
                .id(post.getId())
                .title(post.getTitle())
                .date(post.getDate())
                .subtitle(post.getSubtitle())
                .contents(post.getContents())
                .comments(post.getComments())
                .build();
    }
}
