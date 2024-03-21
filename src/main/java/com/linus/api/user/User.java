package com.linus.api.user;

import com.linus.api.account.Account;
import com.linus.api.order.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="phone")
    private String phone;
    @Column(name="address")
    private String address;
    @Column(name="job")
    private String job;
    @Column(name="height")
    private double height;
    @Column(name="weight")
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