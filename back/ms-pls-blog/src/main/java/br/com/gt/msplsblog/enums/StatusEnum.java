package br.com.gt.msplsblog.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StatusEnum {
    ACTIVE("Active"),
    DELETED("Deleted");

    private final String nome;
}