package br.com.gt.msplsblog.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PerfilUserEnum {

    MASTER("Master"),
    OWNER("Owner"),
    READER("Reader");

    private final String nome;
}
