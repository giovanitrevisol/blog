package br.com.gt.pltspost.domain;

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

}
