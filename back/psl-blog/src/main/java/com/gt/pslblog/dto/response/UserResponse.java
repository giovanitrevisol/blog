package com.gt.pslblog.dto.response;

import com.gt.pslblog.domain.Post;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class UserResponse {

    private long id;
    private String firtName;
    private String lastName;
    private String email;
    private LocalDateTime birth;
    private List<Post> posts;
}