package br.com.gt.msplsblog.controller;

import br.com.gt.msplsblog.security.JwtUtil;
import br.com.gt.msplsblog.security.UserSS;
import br.com.gt.msplsblog.service.impl.UserSsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/auth")
@AllArgsConstructor
public class AuthController {

    private final JwtUtil jwtUtil;

    @PostMapping(value = "/refresh")
    public void refreshtoken(HttpServletResponse response){
        UserSS userSS = UserSsServiceImpl.authenticated();
        String token = jwtUtil.generateToken(userSS.getUsername());
        response.addHeader("Authorization", "Bearer " + token);
    }
}
