package com.gt.pslblog.response;

import com.gt.pslblog.domain.Post;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AllPostResponse {

    List<Post> posts;
}
