package com.javastart.springhomework.controller.dto;

import com.javastart.springhomework.entity.Bill;

import java.math.BigDecimal;

public class BillResponseDTO {

    private Long billId;

    private BigDecimal amount;

    private Boolean isDefault;

    public BillResponseDTO(Long billId, BigDecimal amount, Boolean isDefault) {
        this.billId = billId;
        this.amount = amount;
        this.isDefault = isDefault;
    }

    public BillResponseDTO(Bill bill) {
        billId = bill.getBillId();
        amount = bill.getAmount();
        isDefault = bill.getIsDefault();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
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

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}
