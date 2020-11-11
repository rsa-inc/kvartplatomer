package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Object_types implements EnumClass<String> {

    APPARTMENT("APPARTMENT"),
    MOBILEPHONE("MOBILEPHONE");

    private String id;

    Object_types(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Object_types fromId(String id) {
        for (Object_types at : Object_types.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}