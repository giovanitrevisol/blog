package com.gt.pslblog.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PostStatusEnum {
    NEW("New"),
    ACTIVE("Active"),
    DELETED("Deleted");

    private final String nome;
}