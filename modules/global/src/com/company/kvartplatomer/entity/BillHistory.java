package com.company.kvartplatomer.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "KVARTPLATOMER_BILL_HISTORY")
@Entity(name = "kvartplatomer_BillHistory")
public class BillHistory extends StandardEntity {
    private static final long serialVersionUID = 4933658804798718682L;

    @Column(name = "MONTH_")
    private Integer month;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ACCOUNT_ID")
    private ServiceAccount serviceAccount;

    @Column(name = "C_PAID")
    private Double c_paid;

    @Column(name = "C_ACCRUED")
    private Double c_accrued;

    @Column(name = "C_DEBT_SM")
    private Double c_debt_sm;

    @Column(name = "PAID_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date paid_date;

    public void setC_debt_sm(Double c_debt_sm) {
        this.c_debt_sm = c_debt_sm;
    }

    public Double getC_debt_sm() {
        return c_debt_sm;
    }

    public void setPaid_date(Date paid_date) {
        this.paid_date = paid_date;
    }

    public Date getPaid_date(){return paid_date;}


    public Double getC_accrued() {
        return c_accrued;
    }

    public void setC_accrued(Double c_accrued) {
        this.c_accrued = c_accrued;
    }

    public Double getC_paid() {
        return c_paid;
    }

    public void setC_paid(Double c_paid) {
        this.c_paid = c_paid;
    }

    public ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}