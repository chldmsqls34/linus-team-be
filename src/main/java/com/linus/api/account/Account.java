package com.linus.api.account;

import lombok.*;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Account {
    private Long id; //아이디

    private String accountNumber; //계좌번호

    private String accountHolder; // 예금주

    private Double balance; //잔고

    private Date transactionDate;  //현재날짜

    @Builder(builderMethodName = "builder")
    public Account(Long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }
}
