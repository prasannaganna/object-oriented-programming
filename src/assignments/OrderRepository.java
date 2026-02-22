package assignments;

import java.util.HashSet;
import java.util.Iterator;

public class OrderRepository {
     HashSet<Order>orders;                  // it only create empty order hash set
    public OrderRepository() {
        orders = new HashSet<>();
    }
     // adding the new oder
     Order save(Order order){
        orders.add(order);
        return  order;
     }
     Order findByID(String id){
         System.out.println("id: " + id);
         Order orderById = null;
         for (Order order: orders){
             if (order.getId().equals(id))
                 orderById = order;
         }
         return orderById;
     }
    Order update(Order order){
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            Order existingOrder = iterator.next();
            if (existingOrder.getId().equals(order.getId())){
                iterator.remove();
                break;
            }
        }
        orders.add(order);
        return order;
    }
    //delete by Id
    void delete(String id){
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            Order existingOrder = iterator.next();
            if (existingOrder.getId().equals(id)){
                iterator.remove();
                break;
            }
        }
    }
}
