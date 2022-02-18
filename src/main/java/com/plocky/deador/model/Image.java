package com.plocky.deador.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String imageName;
//    @ManyToMany(mappedBy = "images")
//    private List<Product> products;


}
