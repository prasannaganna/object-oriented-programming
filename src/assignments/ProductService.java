package assignments;

import java.util.HashSet;

public class ProductService {

    public HashSet<Product> getProducts(String[] productsData) {
        HashSet<Product> productsSet = new HashSet<>();
        for(String productData : productsData){
           // System.out.println(productData);
            String[] split =productData.split(",");
            Product product = new Product();
            product.setId(split(0));
            product.setMaxRetailPrice(Double.parseDouble(split(2)));
            productsSet.add(product);
        }
        return productsSet;
    }
    double calculateFinalPrice(Product product){
        return product.getMaxRetailPrice()-(product.getMaxRetailPrice()*product.getDiscountPercentage()/100);
    }
    void displayProductDetails(Product product){
        System.out.println("id:" +product.getId());



    }
}
