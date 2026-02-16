package com.java.st.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product("2", "prasanna", 23.5f));
        productSet.add(new Product("3", "lavanya", 24.5f));
        productSet.add(new Product("4", "ramya", 25.5f));
        productSet.add(new Product("2", "prasanna", 23.5f));
        System.out.println(productSet.size());

        Iterator<Product> productIterator = productSet.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }
//        System.out.println(productSet);

        productSet.remove(new Product("3","lavanya",24.5f));
        System.out.println(productSet);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("enter the id : ");
        //String id = scanner.next();

    }
}
