package com.plocky.deador.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ProductDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int categoryId;
    private double price;
    private String brand;
    private String model;
    private String operatingSystem;
    private String screenSize;
    private String displayResolution;
    private String matrixType;
    private String processor;
    private String numberOfCores;
    private String battery;
    private String ram;
    private String storageCapacity;
    private String numberOfMainCameras;
    private String mainCameraResolution;
    private String numberOfFrontCameras;
    private String frontCameraResolution;
    private String numberOfSimCards;
    private String connectivity;
    private String bluetooth;
    private String nfc;
    private double weight;
    private String action;
    private double priceBeforeAction;
    private double priceAfterAction;
    private String description;
    private String imageName;
    private Integer countOfViews;
}
