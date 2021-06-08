package com.gt.pslblog.service;

import com.gt.pslblog.dto.response.AllPostResponse;
import com.gt.pslblog.dto.response.PostResponse;


public interface PostService {

    AllPostResponse allPostResponse();

    PostResponse postByid(Long id);
}
