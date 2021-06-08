package com.gt.pslblog.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gt.pslblog.dto.response.UserResponse;
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
