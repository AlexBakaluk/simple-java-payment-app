package com.javastart.springhomework.controller.dto;

import com.javastart.springhomework.entity.Bill;

import java.util.List;

public class AccountRequestDTO {

    private String name;

    private String email;

    private List<Bill> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Bill> getBills() {
        return bills;
    }
}
