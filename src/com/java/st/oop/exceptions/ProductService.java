package com.java.st.oop.exceptions;

public class ProductService {
     private final ProductRepository productRepository;
    public ProductService(){
        productRepository = new ProductRepository();
    }
    public  Product save(Product product) throws ProductExistException{
         if(productRepository.exists(product.getId())){

             throw new ProductExistException("product already exist" + product.getId());
         }
         return  productRepository.save(product);
    }
}
