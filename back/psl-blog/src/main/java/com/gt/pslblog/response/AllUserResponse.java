package com.gt.pslblog.response;

import com.gt.pslblog.domain.User;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class AllUserResponse {
    List<User> users;
}
