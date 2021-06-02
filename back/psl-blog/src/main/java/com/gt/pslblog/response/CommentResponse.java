package com.gt.pslblog.response;
import com.gt.pslblog.domain.Post;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class CommentResponse {

    private long id;

    private String name;

    private String text;

    private LocalDateTime instant;

    private Long post_id;

}
