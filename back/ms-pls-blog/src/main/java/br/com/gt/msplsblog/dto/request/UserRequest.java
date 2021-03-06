package br.com.gt.msplsblog.dto.request;

import br.com.gt.msplsblog.enums.PerfilUserEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UserRequest {

    private Long id;
    private String firtName;
    private String lastName;
    private String email;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime birth;
    private String password;
    private PerfilUserEnum perfilUser;
}
