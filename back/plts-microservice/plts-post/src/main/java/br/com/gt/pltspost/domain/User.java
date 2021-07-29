package br.com.gt.pltspost.domain;

import br.com.gt.pltspost.dto.UserDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@Document(collection = "user") //anotação para o MONGODB
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;

    public UserDto toUserDto() {
        return UserDto.builder()
                .id(this.getId())
                .name(this.name)
                .email(this.email)
                .build();
    }

}
