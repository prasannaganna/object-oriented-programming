package com.java.st.oop.collections;

import java.util.TreeSet;

public class TreeSetTest {
    static void main(String[] args) {
        TreeSet<String> names =new TreeSet<>();
        names.add("prasanna");
        names.add("malli");
        names.add("ramya");
        names.add("prasanna");
        System.out.println(names);
        TreeSet<Product> products =new TreeSet<>();
        products.add(new Product("2", "prasanna", 23.5f));
        products.add(new Product("3", "lavanya", 24.5f));
        products.add(new Product("4", "ramya", 25.5f));
        products.add(new Product("2", "prasanna", 23.5f));
        System.out.println(products);
        //System.out.println(products);
    }
}
