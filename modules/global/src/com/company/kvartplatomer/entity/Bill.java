package com.company.kvartplatomer.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "KVARTPLATOMER_BILL")
@Entity(name = "kvartplatomer_Bill")
@NamePattern("%s %s|month,object")
public class Bill extends StandardEntity {
    private static final long serialVersionUID = 3136281376176963494L;

    @Column(name = "MONTH_")
    @NumberFormat(pattern = "######")
    private Integer month;


    @MetaProperty
    @Transient
    private ServiceAccount object;

    @MetaProperty
    @Transient
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

    public Integer getMonth() {
        return month
        //return 202010
        //int monthValue = LocalDate.now().getMonthValue();
        //int yearValue = LocalDate.now().getYear();
        //return yearValue*100+monthValue
                ;
    }


    public ServiceAccount getObject() {
        return object;
    }

    public void setServiceAccount(ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public Double getP_paid() {
        return p_paid;
    }

    public void setP_paid(Double p_paid) {
        this.p_paid = p_paid;
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