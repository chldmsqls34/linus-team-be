package com.linus.api.product;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

public class Product {
    private int id;
    private int i;
    private String name ;
    private String company;
    private int price;

    @Builder(builderMethodName = "builder")

    public Product(int id, int i, String name, String company, int price) {
        this.id = id;
        this.i = i;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
