package com.linus.api.order;

import com.linus.api.product.Product;
import com.linus.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
public class Order {
  @Id
  @Column(name="id",nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;


}
