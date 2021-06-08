package com.gt.pslblog.service;

import com.gt.pslblog.dto.response.AllCommentResponse;
import com.gt.pslblog.dto.response.CommentResponse;

public interface ComentService {

    public AllCommentResponse allCommentResponse();

    CommentResponse commentById(Long id);

}
