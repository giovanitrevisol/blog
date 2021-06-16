package br.com.gt.msplsblog.dto.response;

import br.com.gt.msplsblog.domain.Post;
import br.com.gt.msplsblog.enums.PerfilUserEnum;
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
    private PerfilUserEnum perfilUser;
}
