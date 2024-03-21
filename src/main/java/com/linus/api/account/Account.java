package com.linus.api.account;

import com.linus.api.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Account {
    @Id
    @Column(name="id")
    private Long id; //아이디
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user; //유저
    @Column(name="account_number")
    private String accountNumber; //계좌번호
    @Column(name="account_holder")
    private String accountHolder; // 예금주
    @Column(name="balance")
    private Double balance; //잔고
    @Column(name="transaction_date")
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
