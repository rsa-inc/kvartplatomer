package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "KVARTPLATOMER_SERVICE_ACCOUNT")
@Entity(name = "kvartplatomer_ServiceAccount")
@NamePattern("%s %s|organization,accountedObject")
public class ServiceAccount extends StandardEntity {
    private static final long serialVersionUID = -3838763336942034464L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNTED_OBJECT_ID")
    private Object accountedObject;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORGANIZATION_ID")
    private ServiceProvider organization;

    @NotNull
    @Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "AUTOPAY")
    private Boolean autopay;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getAutopay() {
        return autopay;
    }

    public void setAutopay(Boolean autopay) {
        this.autopay = autopay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public ServiceProvider getOrganization() {
        return organization;
    }

    public void setOrganization(ServiceProvider organization) {
        this.organization = organization;
    }

    public Object getAccountedObject() {
        return accountedObject;
    }

    public void setAccountedObject(Object accountedObject) {
        this.accountedObject = accountedObject;
    }


}