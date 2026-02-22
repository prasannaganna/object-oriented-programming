package com.java.st.oop.collections;

import java.util.HashSet;
import java.util.Objects;


public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private  float price;

    public Product() {
    }

    public Product(String id, String name,float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(price, product.price) == 0 && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getId().compareTo(product.getId());
        //return  this.getName().compareTo(product.getName());
       // return product.getId().compareTo(this.getId());
    }
}

