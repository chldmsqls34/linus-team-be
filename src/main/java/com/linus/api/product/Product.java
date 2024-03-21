package com.linus.api.product;

import com.linus.api.order.Order;
import com.linus.api.user.User;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity(name= "PRODUCTS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Product {
    @Id
    @Column(name= "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "product")
    private List<Order> order;

    @Column(name= "NAME")
    private String product_name ;

    @Column(name= "COMPANY")
    private String company;

    @Column(name= "PRICE")

    private int price;
    @Column(name = "CATEGORY_ID")
    private int category_id;

    @Builder(builderMethodName = "builder")
    public Product(Long id, String product_name, String company, int price, int category_id) {
        this.id = id;
        this.product_name = product_name;
        this.company = company;
        this.price = price;
        this.category_id = category_id;
    }
}
