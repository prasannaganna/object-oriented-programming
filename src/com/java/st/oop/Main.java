package com.java.st.oop;

public class Main {
    static void main(String[] args) {
        Product product1;
        product1 = new Product();
        /*System.out.println("Product id : " + product1.id);
        System.out.println("Product name : " + product1.name);
        System.out.println("maxRetailPrice : " + product1.maxRetailPrice);
        System.out.println("centalTax : " + product1.centalTax);
        System.out.println("quantity : " + product1.quantity);

        //System.out.println("memberShip : " + product1.memberShip);
        Product product2 = new Product(1, " laptop", 1234.4f,2.5f,100);
        //System.out.println("Product id : " + product2.id);
        //System.out.println("Product name : " + product2.name);
        //System.out.println("maxRetailPrice : " + product2.maxRetailPrice);
        //System.out.println("discountPercentage : " + product2.discountPercentage);
        //System.out.println(" discountAmount : " + product2.discountAmount);
        //System.out.println("totalSavedAmount : " + product2.totalSavedAmount);
        //System.out.println(" finalPrice : " + product2.finalPrice);
        //System.out.println(" finalQuantityPrice : " + product2.finalQuantityPrice);
        //System.out.println("centalTax : " + product2.centalTax);
        //System.out.println("stateTax : " + product2.stateTax);
        //System.out.println("quantity : " + product2.quantity);
        //System.out.println("shippingCharges : " + product2.shippingCharges);

        //System.out.format("id: %d%n"+ "name: %s%n"+ "maxRetailPrice: " );*/
       product1.displayProduct();

    }
}