package br.com.gt.msplsblog.service.impl;

import br.com.gt.msplsblog.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserSsServiceImpl {


    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            return null;
        }
    }
}
