package com.gt.pslblog.service;

import com.gt.pslblog.response.AllUserResponse;
import com.gt.pslblog.response.UserByIdResponse;

public interface ConsultUserService {

    public AllUserResponse allUserResponse();

    public UserByIdResponse userByIdResponse(long id);
}
