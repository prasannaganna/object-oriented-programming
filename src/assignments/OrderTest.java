package assignments;

public class OrderTest {
    static void main(String[] args) {
        String[] productsData = {
                "p-101,Lenovo Laptop,58999.00,10.5",
                "p-102,Dell Inspiron 15,54999.00,8.0",
                "p-103,HP Pavilion 14,62999.00,12.0",
                "p-104,Apple iPhone 14,79999.00,5.0",
                "p-105,Samsung Galaxy S23,74999.00,7.5",
                "p-106,OnePlus 11R,45999.00,9.0",
                "p-107,Boat Rockerz Headphones,2999.00,15.0",
                "p-108,Sony Bravia 43inch TV,52999.00,11.5",
                "p-109,LG Double Door Refrigerator,38999.00,13.0",
                "p-110,Canon EOS 1500D Camera,41999.00,6.5"
        };
        ProductService productService = new ProductService();
        productService.getProducts(productsData);

        OrderRepository orderRepository = new OrderRepository();
        // create a new order
        Order order1= new Order();
        order1.setId("oerder-  first order");
        order1.setCustomerName("prasanna");
        order1.setProductHashSet(productService.getProductsById(new String[] {"p-101"}));
        order1.setStatus("ordered");
         Order saved = orderRepository.save(order1);
        System.out.println("order saved sucessfullu : " +saved);

        Order order2= new Order();
        order2.setId("oerder-second order");
        order2.setCustomerName("ramya");
        order2.setProductHashSet(productService.getProductsById(new String[] {"p-102","p-103"}));
        order2.setStatus("shipped");
        Order secondordersaved = orderRepository.save(order2);
        System.out.println("order saved sucessfullu : " +secondordersaved);

        //get the order by id
        Order  byid = orderRepository.findByID("first order");
        System.out.println(byid);

      /*  System.out.println("-----Order to be updated----------");
        Order orderToBeUpdated = new Order();
        orderToBeUpdated.setId("order-first order");
        orderToBeUpdated.setCustomerName("lavanya");
        orderToBeUpdated.setProductHashSet(order1.getProductHashSet();
        orderToBeUpdated.setStatus("delivered");*/


    }
}
