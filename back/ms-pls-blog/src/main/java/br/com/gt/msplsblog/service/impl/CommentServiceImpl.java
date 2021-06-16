package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.domain.Comment;
import br.com.gt.msplsblog.dto.request.CommentRequest;
import br.com.gt.msplsblog.dto.response.AllCommentResponse;
import br.com.gt.msplsblog.dto.response.CommentResponse;
import br.com.gt.msplsblog.exception.BadRequestException;
import br.com.gt.msplsblog.repository.CommentRepository;
import br.com.gt.msplsblog.service.ComentService;
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

    @Override
    public void insertComment(CommentRequest commentRequest) {
        validComment(commentRequest);
        commentRepository.save(fromComment(commentRequest));
    }

    @Override
    public void updateComment(Long id, CommentRequest commentRequest) {
        validComment(commentRequest);
        commentRepository.save(fromComment(commentRequest));
    }

    private void validComment(CommentRequest commentRequest){
        if(commentRequest == null){
            throw  new BadRequestException("Comentário inválido");
        }
    }

    public Comment fromComment(CommentRequest commentRequest){
        return Comment.builder()
                .id(commentRequest.getId())
                .name(commentRequest.getName())
                .text(commentRequest.getText())
                .instant(commentRequest.getInstant())
                .build();
    }
}
