package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "KVARTPLATOMER_BILL")
@Entity(name = "kvartplatomer_Bill")
@NamePattern("%s %s|id,month")
public class Bill extends StandardEntity {
    private static final long serialVersionUID = 3136281376176963494L;

    @Column(name = "MONTH_")
    @NumberFormat(pattern = "######")
    private Integer month = LocalDate.now().getYear() * 100 + LocalDate.now().getMonthValue();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accounted_Object")
    private ServiceAccount object;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ACCOUNT_ID")
    private ServiceAccount serviceAccount;

    @Column(name = "C_ACCRUED")
    private Double c_accrued;

    @Column(name = "C_PAID")
    private Double c_paid;

    @Column(name = "C_DEBT_SM")
    private Double c_debt_sm;

    @Column(name = "P_DEBT_SM")
    private Double p_debt_sm;

    @Column(name = "P_ACCRUED")
    private Double p_accrued;

    @Column(name = "P_PAID")
    private Double p_paid;

    @Column(name = "IS_PAID")
    private Boolean isPaid;

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) { this.month=month;}

    public ServiceAccount getObject() {
        return object;
    }

    public void setServiceAccount(ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public Double getP_paid() {
        return p_paid;
    }

    public Bill setP_paid(Double p_paid) {
        this.p_paid = p_paid;
        return null;
    }

    public Double getP_accrued() {
        return p_accrued;
    }

    public void setP_accrued(Double p_accrued) {
        this.p_accrued = p_accrued;
    }

    public Double getP_debt_sm() {
        return p_debt_sm;
    }

    public void setP_debt_sm(Double p_debt_sm) {
        this.p_debt_sm = p_debt_sm;
    }

    public Double getC_paid() {
        return c_paid;
    }

    public void setC_paid(Double c_paid) {
        this.c_paid = c_paid;
    }

    public Double getC_accrued() {
        return c_accrued;
    }

    public void setC_accrued(Double c_accrued) {
        this.c_accrued = c_accrued;
    }

    public Double getC_debt_sm() {
        return c_debt_sm;
    }

    public void setC_debt_sm(Double c_debt_sm) {
        this.c_debt_sm = c_debt_sm;
    }

    public ServiceAccount getServiceAccount() {
        return serviceAccount;
    }


}