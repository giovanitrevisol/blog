package br.com.gt.msplsblog.dto.response;

import br.com.gt.msplsblog.domain.Comment;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Builder
@Getter
public class AllCommentResponse {

    List<Comment> listComments;
}
