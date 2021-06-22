package br.com.gt.msplsblog.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PerfilUserEnum {

    DEVELOPER("Developer"),
    OWNER("Owner"),
    READER("Reader");

    private final String nome;
}
