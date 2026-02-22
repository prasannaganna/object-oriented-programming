package assignments;

import java.util.HashSet;
import java.util.Iterator;

public class ProductService {
    private HashSet<Product> products;

    public ProductService() {
        this.products = new HashSet<>();
    }


    public HashSet<Product> getProducts(String[] productsData) {
        HashSet<Product> productsSet = new HashSet<>();
        for (String productData : productsData) {
            // System.out.println(productData);
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            productsSet.add(product);
        }
        return productsSet;
    }

    double calculateFinalPrice(Product product) {
        return product.getMaxRetailPrice() - (product.getMaxRetailPrice() * product.getDiscountPercentage() / 100);
    }

    void displayProductDetails(Product product) {
        System.out.println("id:" + product.getId());
        System.out.println("name: " + product.getName());
        System.out.println("maxRetail: " + product.getMaxRetailPrice());
        System.out.println("discountPercentage: " + product.getDiscountPercentage());

    }

    HashSet<Product> getProductsById(String[] ids) {
        HashSet<Product> productsById = new HashSet<>();
        for (String id : ids) {
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getId().equals(id))
                    productsById.add(product);
            }
        }
        return productsById;

    }


}
