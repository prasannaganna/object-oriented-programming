package com.java.st.oop.exceptions;

import java.lang.classfile.CodeBuilder;

public class Main {
    static void main(String[] args) {
        ProductController productController = new ProductController();
        Product product = null;
        try{
            product = productController.saveProduct(new Product("101","prasanna", 23.45));
            System.out.println("the product is  saved");
        }
        catch(ProductExistException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
