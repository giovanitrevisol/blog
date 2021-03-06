package br.com.gt.msplsblog.domain;

import br.com.gt.msplsblog.dto.response.UserResponse;
import br.com.gt.msplsblog.enums.PerfilUserEnum;
import br.com.gt.msplsblog.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@Table(name = "tb_user")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firtName;
    private String lastName;
    private String email;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime birth;
    private String password;
    @Enumerated(EnumType.STRING)
    private PerfilUserEnum perfilUserEnum;
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    @JsonIgnore
    @OneToMany(mappedBy = "author")
    private List<Post> posts;


    public UserResponse toUserResponse(){
        return UserResponse.builder()
                .id(this.id)
                .firtName(this.firtName)
                .lastName(this.lastName)
                .email(this.email)
                .birth(this.birth)
                .build();
    }
}
