package br.com.gt.msplsblog.dto.response;

import br.com.gt.msplsblog.domain.Post;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AllPostResponse {

    List<Post> posts;
}
