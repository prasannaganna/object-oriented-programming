//package assignments;
//
//import java.util.List;
//
//public class ProductTest {
//    public static void display(List<Product> products){
//        for(Product prods : products){
//            System.out.println(prods);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        ProductRepository productRepository = new ProductRepository();
//        String[] data = {
//
//                "p-101,Lenovo Laptop,58999.00,10.5",
//
//                "p-102,Dell Inspiron 15,54999.00,8.0",
//
//                "p-103,HP Pavilion 14,62999.00,12.0",
//
//                "p-104,Apple iPhone 14,79999.00,5.0",
//
//                "p-105,Samsung Galaxy S23,74999.00,7.5",
//
//                "p-106,OnePlus 11R,45999.00,9.0",
//
//                "p-107,Boat Rockerz Headphones,2999.00,15.0",
//
//                "p-108,Sony Bravia 43inch TV,52999.00,11.5",
//
//                "p-109,LG Double Door Refrigerator,38999.00,13.0",
//
//                "p-110,Canon EOS 1500D Camera,41999.00,6.5"
//
//        };
//
//        // Load Products
//        productRepository.loadProducts(data);
//        display( productRepository.displayAllProducts());
//
//        //Adding new Products
//        System.out.println("Adding new Product");
//        productRepository.add(new Product("p-111","Iphone",699.99,10));
//        display(productRepository.displayAllProducts());
//
//        //Getting the product by id
//        System.out.println("Getting the product by ID");
//        Product product = productRepository.getProductById("p-110");
//        System.out.println(product);
//
//        //Updating the Product
//        System.out.println("Updating the product");
////        productRepository.update("p-111",new Product("p-111","IPHONE16",10.5,10));
//        display(productRepository.displayAllProducts());
//
//        //Deleting the product
//        System.out.println("Deleting the Product");
//        productRepository.delete("p-101");
//        display(productRepository.displayAllProducts());
//
//        //Sorting the Products by Ascending Order
//        System.out.println("Sorting by Ascending Order");
//        display(productRepository.sortByAscendingOrder());
//
//        //Sorting The Products by descending Order
//        System.out.println("Products by Descending Order");
//        display(productRepository.sortByDescendingOrder());
//
//        //Highest Price Product
//        System.out.println("Product with the Highest Price");
//        Product highestProducts = productRepository.getHighestPriceProduct();
//        System.out.println(highestProducts);
//
//        //Lowest Price Product
//        System.out.println("Product with the Lowest Price");
//        Product lowestProducts = productRepository.getLowestPriceProduct();
//        System.out.println(lowestProducts);
//
//        //Product with high Discount
//        System.out.println("Product with the Highest Delete");
//        Product highDiscountProduct =  productRepository.getHighestDiscountProduct();
//        System.out.println(highDiscountProduct);
//
//        //total cost of products
//        System.out.println("Total cost of the products");
//        float totalProductCost = productRepository.getTotalValue();
//        System.out.println(totalProductCost);
//
//        //Average Cost of all produccts
//        System.out.println("The average cost of the product");
//        float avgPriceOfProduct = productRepository.getAveragePrice();
//        System.out.println(avgPriceOfProduct);
//
//        //List of Products with 10%
//        System.out.println("List of products with 10%");
//        List<Product> productsWithDiscount = productRepository.countProductsAboveDiscount(12);
//        display(productsWithDiscount);
//
//        //List of Products with price greter than 25000
//        System.out.println("List of Products with 25000");
//        List<Product> productsWithPrice = productRepository.countProductsAbovePrice(25000);
//        display(productsWithPrice);
//
//    }
//}
