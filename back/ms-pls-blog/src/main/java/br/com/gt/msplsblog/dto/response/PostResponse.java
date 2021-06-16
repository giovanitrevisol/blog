package br.com.gt.msplsblog.dto.response;

import br.com.gt.msplsblog.domain.Comment;
import br.com.gt.msplsblog.domain.User;
import br.com.gt.msplsblog.enums.PostStatusEnum;
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
