package com.gt.pslblog.service;

import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserResponse;

public interface ConsultUserService {

    public AllUserResponse allUserResponse();

    public UserResponse userByIdResponse(long id);
}
