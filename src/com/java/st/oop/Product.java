package com.java.st.oop;

public class Product {
    int id;   // all this are  properties
    String name;
    float maxRetailPrice;
    float centalTax;
    float stateTax;
    //int quantity;
    float discountPercentage;
    float discountAmount;
    int shippingCharges;

    public Product() {
    }

    public Product(int id, String name, float maxRetailPrice, float centalTax, float stateTax, float discountPercentage, float discountAmount, int shippingCharges) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.centalTax = centalTax;
        this.stateTax = stateTax;
        this.discountPercentage = discountPercentage;
        this.discountAmount = discountAmount;
        this.shippingCharges = shippingCharges;
    }

    public void displayProduct() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("maxRetailPrice : " + maxRetailPrice);
        System.out.println("centalTax : " + centalTax);
        System.out.println("stateTax : " + stateTax);
        System.out.println(" discountPercentage : " + discountPercentage);
        System.out.println("discountAmount : " + discountAmount);
        System.out.println(" shippingCharges : " + shippingCharges);
        System.out.println("discount :" + calculateDiscount());
        System.out.println("priceAfterDiscount : " + priceAfterDiscont());
        System.out.println("stateTax : " + calculateStateTax());
        System.out.println("centralTax : " + calculatecentralTax());
        System.out.println("finalPrice : " + calculateFinalPrice());
    }

    float calculateDiscount() {
        return maxRetailPrice * discountPercentage / 100;
    }

    float priceAfterDiscont() {
        return maxRetailPrice - calculateDiscount();
    }

    float calculateStateTax() {
        return priceAfterDiscont() * stateTax / 100;
    }

    float calculatecentralTax() {
        return priceAfterDiscont() + centalTax / 100;
    }

    float calculateFinalPrice() {
        return priceAfterDiscont() + calculatecentralTax() + calculateStateTax();
    }
}
    //char memberShip;

  /*  Product() {
        id = 123;
        name = " laptop";
        maxRetailPrice = 123.4F;
        centalTax = 2.5F;
        stateTax = 2.5F;
        discountAmount =35.5F;
        shippingCharges =100;
        //quantity = 10;8
    }*/
    /*public Product(int id, String name, float maxRetailPrice, float centalTax, float stateTax, float discountPercentage,int shippingCharges) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        //this.quantity = quantity;
        this.centalTax = centalTax;
        this.stateTax = stateTax;
        this.discountPercentage = discountPercentage;
        this.shippingCharges = shippingCharges;
    }

    public Product(int id, String name, float maxRetailPrice, float centalTax, int quantity)
    {
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.centalTax = centalTax;
        this.quantity = quantity;
    }
    void displayProduct(){
        System.out.println("Product id : " + id);
        System.out.println("Product name : " + name);
        System.out.println("maxRetailPrice : " + maxRetailPrice);
        System.out.println("centalTax : " + centalTax);
        //System.out.println("quantity : " + quantity);
    }
    float calculateDiscount(){
        return maxRetailPrice * discountPercentage /100;
    }
    float calculateFinalPrice(){
        return maxRetailPrice - discountAmount + (centalTax+stateTax)+shippingCharges;*/


