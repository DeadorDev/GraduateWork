package com.plocky.deador.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private int id;

    @Column(name = "name")
    private String name;


}
