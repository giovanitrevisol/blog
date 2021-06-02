package com.gt.pslblog.service;

import com.gt.pslblog.response.AllCommentResponse;
import com.gt.pslblog.response.CommentResponse;

public interface ComentService {

    public AllCommentResponse allCommentResponse();

    CommentResponse commentById(Long id);

}
