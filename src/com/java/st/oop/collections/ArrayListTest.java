package com.java.st.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    static void main(String[] args) {
        ArrayList<Product>products= new ArrayList<>();
        products.add(new Product("2", "prasanna", 23.5f));
        products.add(new Product("3", "lavanya", 24.5f));
        products.add(new Product("4", "ramya", 25.5f));
        products.add(new Product("2", "prasanna", 23.5f));
        products.add(new Product("3", "prasanna", 23.5f));
        System.out.println(products);
        //System.out.println(products.size());
        //System.out.println(products.isEmpty());
        //System.out.println(products.get(0));
        //System.out.println(products.remove(1));
        //System.out.println(products);
        System.out.println(products.size());
        products.add(4,new Product("6","sri",34.5f));
        System.out.println(products.size());
        System.out.println(products);
        //products.set()
    }
}
