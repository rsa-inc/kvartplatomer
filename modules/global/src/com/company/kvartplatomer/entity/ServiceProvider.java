package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "KVARTPLATOMER_SERVICE_PROVIDER", indexes = {
        @Index(name = "IDX_KVARTPLATOMER_SERVICE_PROVIDER_UNQ", columnList = "INN", unique = true)
})
@Entity(name = "kvartplatomer_ServiceProvider")
@NamePattern("%s|name")
public class ServiceProvider extends StandardEntity {
    private static final long serialVersionUID = 1571165233161116041L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_TYPE_ID")
    private ServiceType serviceType;

    @Column(name = "PC")
    private Integer pc;

    @Column(name = "INN", unique = true, length = 10)
    @Length(message = "Длина ИНН должна быть 10 символов", min = 10, max = 10)
    private String inn;

    @Column(name = "URL")
    private String url;

    @Column(name = "DESCRIPTION")
    private String description;

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}