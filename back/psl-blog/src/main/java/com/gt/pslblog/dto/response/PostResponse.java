package com.gt.pslblog.dto.response;

import com.gt.pslblog.domain.Comment;
import com.gt.pslblog.domain.User;
import com.gt.pslblog.enums.PostStatusEnum;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class PostResponse {

    private long id;

    private String title;

    private LocalDateTime date;

    private String subtitle;

    private String contents;

    private List<Comment> comments;

    private User author;

    private PostStatusEnum postStatusEnum;
}
