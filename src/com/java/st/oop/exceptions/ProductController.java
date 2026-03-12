package com.java.st.oop.exceptions;

public  class ProductController {
    private final ProductService productService;
    public ProductController(){
       this.productService = new ProductService();
    }
    public Product saveProduct(Product product) throws ProductExistException{
        return productService.save(product);
    }
}
