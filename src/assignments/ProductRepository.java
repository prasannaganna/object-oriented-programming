//package assignments;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class ProductRepository {            // no intialization
//     ArrayList<Product> productArrayList;
//
//    public ProductRepository() {
//        productArrayList=new ArrayList<>();
//    }                                                    //array<product> method name(string product)
//
//
//     public ArrayList<Product> loadProducts(String[] data){
//        for(String line:data){
//            String[] parts=line.split(",");
//            Product product = new Product();
//            product.setId(parts[0]);
//            product.setName(parts[1]);
//            product.setMaxRetailPrice(Double.parseDouble(parts[2]));
//            product.setDiscountPercentage(Float.parseFloat(parts[3]));
//            productArrayList.add(product); // always return the  product what we add
//        }
//
//         return productArrayList;
//     }
//
//
//
//    public Product getProductById(String id){
//
//        for(Product product : products){
//            if(product.getId().equals(id)) {   //when id id string
//                return product;
//            }
//        }
//        return null;
//    }
//
//
//    public int getIndex(String id){
//        for(int i = 0 ; i< products.size(); i++){
//            if(products.get(i).getId().equals(id)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    //
//
//    public void update(String id , Product product){
//        int  index = getIndex(id);
//        if(index > -1){
//            products.set(index , product);
//        }else{
//            System.out.println("Enter a valid Product ID");
//        }
//
//    }
// // two  ways to detele based on objects and based on id we can delete
//    //
//    public void delete(String id){
//        int index = getIndex( id );
//        if(index  > -1 ){
//            products.remove(index);
//        }else {
//            System.out.println(" Enter a valid Product ID");
//        }
//    }
//
//    public List<Product> displayAllProducts(){
//        return Collections.unmodifiableList(products);
//    }
//    //always print the all products in table formate
//
//    public List<Product> sortByAscendingOrder(){   //
//        Comparator<Product> sortByAsc = Comparator.comparing(Product::getMaxRetailPrice);
//        products.sort(sortByAsc);
//        return Collections.unmodifiableList(products);
//    }
//    public List<Product> sortByDescendingOrder(){
//        Comparator<Product> sortByAsc = Comparator.comparing(Product::getMaxRetailPrice).reversed();
//        products.sort(sortByAsc);
//        return Collections.unmodifiableList(products);
//    }
//
//
//    public Product getHighestPriceProduct(){
//        if(products.isEmpty()) return null;
//        Product highCostProduct = products.get(0);
//        for(int i = 1; i < products.size();i++){
//            if(products.get(i).getMaxRetailPrice() > highCostProduct.getMaxRetailPrice() ){
//                highCostProduct = products.get(i);
//            }
//        }
//        return highCostProduct;
//    }
//
//    public Product getLowestPriceProduct(){
//        if(products.isEmpty()) return null;
//        Product lowCostProduct = products.get(0);
//        for(int i = 1; i < products.size();i++){
//            if(products.get(i).getMaxRetailPrice() < lowCostProduct.getMaxRetailPrice() ){
//                lowCostProduct = products.get(i);
//            }
//        }
//        return lowCostProduct;
//    }
//
//    public Product getHighestDiscountProduct(){
//        if(products.isEmpty()) return null;
//        Product highDiscountedProduct = products.get(0);
//        for(int i = 1; i < products.size();i++){
//            if(products.get(i).getDiscountPercentage() > highDiscountedProduct.getDiscountPercentage() ){
//                highDiscountedProduct = products.get(i);
//            }
//        }
//        return highDiscountedProduct;
//    }
//
//    public float getTotalValue(){
//        float sum = 0;
//        for(Product product : products){
//            sum += product.getMaxRetailPrice();;
//        }
//        return sum;
//    }
//
//    public float getAveragePrice() {
//        float sumOfProducts = getTotalValue();
//        return sumOfProducts / products.size();
//    }
//
//    public List<Product> countProductsAbovePrice(double price){
//        List<Product> productsAbovePrice =  new ArrayList<>();
//        for(Product product : products){
//            if(product.getMaxRetailPrice() >= price ){
//                productsAbovePrice.add(product);
//            }
//        }
//        return productsAbovePrice;
//    }
//
//    public List<Product> countProductsAboveDiscount(float discount){
//        List<Product> productsAboveDiscount =  new ArrayList<>();
//        for(Product product : products){
//            if(product.getDiscountPercentage() >= discount){
//                productsAboveDiscount.add(product);
//            }
//        }
//        return productsAboveDiscount;
//    }
//}
