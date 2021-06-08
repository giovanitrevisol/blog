package com.gt.pslblog.service;

import com.gt.pslblog.dto.request.UserRequest;
import com.gt.pslblog.dto.response.AllUserResponse;
import com.gt.pslblog.dto.response.UserResponse;

public interface UserService {

    public AllUserResponse allUserResponse();

    public UserResponse userByIdResponse(long id);

    public void saveUser(UserRequest userRequest);

    public UserResponse updateUser(Long id, UserRequest userRequest);

    public void delete(Long id);
}
