package com.linus.api.product;

import com.linus.api.order.Order;
import com.linus.api.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="PRODUCTS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

public class Product {
    @Id
    @Column(name="ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "product")
    private List<Order> order;

    @Column(name="NAME")
    private String name ;

    @Column(name="COMPANY")
    private String company;

    @Column(name="PRICE")
    private int price;

    @Builder(builderMethodName = "builder")

    public Product(int id, int i, String name, String company, int price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
