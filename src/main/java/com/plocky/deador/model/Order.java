package com.plocky.deador.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String townCity;
    private String address;
    private String postcode;
    private String email;
    private String additionalInformation;
    private String deliveryStatus;
    private Integer totalAmount;
}
