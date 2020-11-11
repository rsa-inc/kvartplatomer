package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "KVARTPLATOMER_SERVICE_TYPE")
@Entity(name = "kvartplatomer_ServiceType")
@NamePattern("%s|stypeName")
public class ServiceType extends StandardEntity {
    private static final long serialVersionUID = 1012134599303266995L;

    @Column(name = "STYPE_NAME")
    private String stypeName;

    @Column(name = "SHORT_NAME")
    private String shortName;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStypeName() {
        return stypeName;
    }

    public void setStypeName(String stypeName) {
        this.stypeName = stypeName;
    }
}