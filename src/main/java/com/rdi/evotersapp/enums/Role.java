package com.rdi.evotersapp.enums;

public enum Role {
    SUPER_ADMIN("super_admin"),
    STATE_CHAIRMAN("state_chairman"),
    VOTER("voter");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
