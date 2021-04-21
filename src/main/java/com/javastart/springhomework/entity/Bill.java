package com.javastart.springhomework.entity;

import com.javastart.springhomework.controller.dto.BillRequestDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.StringJoiner;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public Bill(BigDecimal amount, Boolean isDefault) {
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public Bill() {
    }

    public Bill(BillRequestDTO billRequestDTO) {
        amount = billRequestDTO.getAmount();
        isDefault = billRequestDTO.getDefault();
    }

    public Long getBillId() {
        return billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean idDefault) {
        this.isDefault = idDefault;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bill.class.getSimpleName() + "[", "]")
                .add("billId=" + billId)
                .add("amount=" + amount)
                .add("idDefault=" + isDefault)
                .toString();
    }
}
