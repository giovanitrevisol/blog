package com.gt.pslblog.service;

import com.gt.pslblog.response.AllPostResponse;
import com.gt.pslblog.response.PostResponse;
import org.springframework.stereotype.Service;


public interface PostService {

    AllPostResponse allPostResponse();

    PostResponse postByid(Long id);
}
