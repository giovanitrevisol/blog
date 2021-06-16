package br.com.gt.msplsblog.service;

import br.com.gt.msplsblog.dto.request.CommentRequest;
import br.com.gt.msplsblog.dto.response.AllCommentResponse;
import br.com.gt.msplsblog.dto.response.CommentResponse;

public interface ComentService {

    public AllCommentResponse allCommentResponse();

    CommentResponse commentById(Long id);

    void insertComment(CommentRequest commentRequest);

    void updateComment(Long id, CommentRequest commentRequest);

}
