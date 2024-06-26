package com.dataarchiveunit.domain.account;

public enum Role {
    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");
    private String value;

    Role(String value) {
        this.value = value;
    }
}
