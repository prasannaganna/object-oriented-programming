package com.java.st.oop.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    static void main(String[] args) {
        LinkedHashSet<Product> products = new LinkedHashSet<>();
        products.add(new Product("2", "prasanna", 23.5f));
        products.add(new Product("3", "lavanya", 24.5f));
        products.add(new Product("4", "ramya", 25.5f));
        products.add(new Product("2", "prasanna", 23.5f));
        products.add(new Product("3", "prasanna", 23.5f));
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        products.remove(new Product("2", "prasanna", 23.5f));
        System.out.println(products.size());
        //contain only accepet the only the one arguments
        System.out.println(products.contains(new Product("3","prasanna",23.5f)));
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

