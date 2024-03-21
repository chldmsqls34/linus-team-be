package com.linus.api.product;

import com.linus.api.order.Order;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Product {
    @Id
    @Column(name="id")
    private int id;

    @OneToMany(mappedBy = "product")
    private List<Order> order;



    private String name ;
    private String company;
    private int price;

    @Builder(builderMethodName = "builder")

    public Product(int id, String name, String company, int price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
