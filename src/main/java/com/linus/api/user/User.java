package com.linus.api.user;

import com.linus.api.account.Account;
import com.linus.api.board.Board;
import com.linus.api.order.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="USERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class User {
    @Id
    @Column(name= "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Board> board;

    @OneToMany(mappedBy = "user")
    private List<Account> account;

    @OneToMany(mappedBy = "user")
    private List<Order> order;

    @Column(name= "USERNAME")
    private String username;

    @Column(name= "PASSWORD")
    private String password;

    @Column(name= "NAME")
    private String name;

    @Column(name= "PHONE")
    private String phone;

    @Column(name= "ADDRESS")
    private String address;

    @Column(name= "JOB")
    private String job;

    @Column(name= "HEIGHT")
    private double height;

    @Column(name= "WEIGHT")
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password,
                String name, String phone,
                String address, String job,
                double height, double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}