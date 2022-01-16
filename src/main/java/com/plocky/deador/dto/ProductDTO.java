package com.plocky.deador.dto;

import com.plocky.deador.model.Category;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProductDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
