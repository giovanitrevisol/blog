package com.gt.pslblog.dto.response;

import com.gt.pslblog.domain.Comment;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

@Builder
@Getter
public class AllCommentResponse {

    List<Comment> listComments;
}