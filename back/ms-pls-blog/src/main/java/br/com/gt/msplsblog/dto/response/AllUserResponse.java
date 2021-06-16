package br.com.gt.msplsblog.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AllUserResponse {
    List<UserResponse> users;
}
