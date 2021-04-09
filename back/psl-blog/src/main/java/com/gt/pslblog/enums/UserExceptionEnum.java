package com.gt.pslblog.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserExceptionEnum {

    USUARIO_JA_CADASTRADO("Usuário informado já consta na base de dados", 403),
    USUARIO_NAO_ENCONTRATO("Usuário não encontrado na base de dados.", 403),
    ERRO_INTERNO("Ocorreu um erro ao consultar os usuários na base de dados local.", 500);

    private final String message;
    private final int httpStatusCode;

}
