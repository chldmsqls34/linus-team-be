package com.linus.api.account;

import com.linus.api.enums.Messenger;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountServiceImpl accountService;
    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }

    public Messenger createAccount(Scanner sc) {
       return accountService.save(Account.builder()
                .id(sc.nextLong()) //아이디
                .accountNumber(sc.next()) //계좌번호
                .accountHolder(sc.next()) //예금주
                .balance(sc.nextDouble())
                .transactionDate(null) //현재날짜
                .build()
        );
    }

    public String deposit(Scanner sc) {
        return accountService.deposit(Account.builder()
                .id(sc.nextLong()) //아이디
                .accountNumber(sc.next()) //계좌번호
                .accountHolder(sc.next()) //예금주
                .balance(sc.nextDouble())
                .transactionDate(null) //현재날짜
                .build()
        );

    }

    public String withdraw(Scanner sc) {
        return accountService.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }


    public String getBalance(Scanner sc) {
        System.out.println("잔고를 확인합니다\n" +
                "계좌번호를 입력해주세요");
        return accountService.getBalance(sc.next());
    }

    public String deleteAccount(Scanner sc) {
        System.out.println("계좌를 해지합니다 \n" +
                "계좌번호를 입력해주세요");
        return accountService.delete(Account.builder()
                .accountNumber(sc.next())
                .build());
    }


    public List<?> getAccounts() {
        System.out.println("계좌목록을 확인합니다.\n" +
                "id를 입력해주세요");
        return accountService.findAll();

    }
}
