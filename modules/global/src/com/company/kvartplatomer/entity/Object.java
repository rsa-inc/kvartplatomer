package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "KVARTPLATOMER_OBJECT")
@Entity(name = "kvartplatomer_Object")
@NamePattern("%s|shortName")
public class Object extends StandardEntity {
    private static final long serialVersionUID = -8463384241925166666L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "OBJECT_TYPE")
    private String object_type;

    @Column(name = "POST_INDEX", length = 6)
    @Length(message = "{msg://kvartplatomer_Object.postIndex.validation.Length}", min = 6, max = 6)
    private String postIndex;

    @Column(name = "DESCRIPTION")
    private String description;

    public void setObject_type(Object_types object_type) {
        this.object_type = object_type == null ? null : object_type.getId();
    }

    public Object_types getObject_type() {
        return object_type == null ? null : Object_types.fromId(object_type);
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}