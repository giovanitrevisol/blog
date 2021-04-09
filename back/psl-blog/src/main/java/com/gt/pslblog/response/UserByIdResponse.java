package com.gt.pslblog.response;

import com.gt.pslblog.domain.User;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserByIdResponse {
    User user;
}
