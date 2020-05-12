package model;

import impl.ProductStatic;

public class Product implements ProductStatic {
    private String id;
    private String name;
    private int price;
    private int status;

    public Product() {
    }
    public Product(String id,String name,int price,int status) {
        this.id=id;
        this.name = name;
        this.price=price;
        this.status=status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
