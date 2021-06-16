package br.com.gt.msplsblog.service;

import br.com.gt.msplsblog.dto.request.UserRequest;
import br.com.gt.msplsblog.dto.response.AllUserResponse;
import br.com.gt.msplsblog.dto.response.UserResponse;


public interface UserService {

    public AllUserResponse allUserResponse();

    public UserResponse userByIdResponse(long id);

    public void saveUser(UserRequest userRequest);

    public UserResponse updateUser(Long id, UserRequest userRequest);

    public void delete(Long id);
}
