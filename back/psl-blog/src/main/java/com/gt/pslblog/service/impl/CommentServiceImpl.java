package com.gt.pslblog.service.impl;

import com.gt.pslblog.domain.Comment;
import com.gt.pslblog.exception.BadRequestException;
import com.gt.pslblog.repository.CommentRepository;
import com.gt.pslblog.dto.response.AllCommentResponse;
import com.gt.pslblog.dto.response.CommentResponse;
import com.gt.pslblog.service.ComentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ComentService {

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public AllCommentResponse allCommentResponse() {
        List<Comment> coments = commentRepository.findAll();
        if(coments.isEmpty()){
            throw new BadRequestException("Nenhum commentário encontrado!!!");
        }
        return AllCommentResponse.builder()
                .listComments(coments)
                .build();
    }

    @Override
    public CommentResponse commentById(Long id) {
       Comment comment = commentRepository.findById(id)
               .orElseThrow(() -> new BadRequestException("Nenhum Comentário encontrado"));
       return CommentResponse.builder()
               .id(comment.getId())
               .name(comment.getName())
               .text(comment.getText())
               .instant(comment.getInstant())
               .post_id(comment.getPost().getId())
               .build();
    }
}
