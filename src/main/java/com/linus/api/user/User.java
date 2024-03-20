package com.linus.api.user;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String address;
    private String job;
    private double height;
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