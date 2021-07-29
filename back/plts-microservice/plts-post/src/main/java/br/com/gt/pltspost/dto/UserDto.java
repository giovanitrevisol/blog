package br.com.gt.pltspost.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
public class UserDto implements Serializable {
    private String id;
    private String name;
    private String email;
}
