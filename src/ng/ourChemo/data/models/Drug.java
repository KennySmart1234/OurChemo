package ng.ourChemo.data.models;

import java.time.LocalDate;

public class Drug {
    private int  id;
    private String name;
    private String brand;
    private LocalDate expiryDate;
    private int price;

    public void  setId(int id) {
        this.id = 0;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

}
