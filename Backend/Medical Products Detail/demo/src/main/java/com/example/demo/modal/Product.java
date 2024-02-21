package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int id;
    private String heading;
    private String productdetail;
    private String description;
    private double rate;
    private String img;
    
    public Product()
    {

    }

    public Product(int id, String heading, String productdetail, String description, double rate, String img) {
        this.id = id;
        this.heading = heading;
        this.productdetail = productdetail;
        this.description = description;
        this.rate = rate;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getProductdetail() {
        return productdetail;
    }

    public void setProductdetail(String productdetail) {
        this.productdetail = productdetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

}
