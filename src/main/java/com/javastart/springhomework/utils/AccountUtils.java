package com.javastart.springhomework.utils;

import com.javastart.springhomework.entity.Account;
import com.javastart.springhomework.entity.Bill;
import com.javastart.springhomework.exception.NotDefaultBillException;

public class AccountUtils {

    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills()
                .stream()
                .filter(Bill::getIsDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: " + accountFrom.getAccountId()));
    }

}
