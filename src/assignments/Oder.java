package assignments;

import java.util.HashSet;
import java.util.Objects;

public class Oder {
    private  String  id;
    private  String CustomerName;
    private HashSet<Product> productHashSet;
    private  String Status;

    public Oder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public HashSet<Product> getProductHashSet() {
        return productHashSet;
    }

    public void setProductHashSet(HashSet<Product> productHashSet) {
        this.productHashSet = productHashSet;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Oder oder = (Oder) o;
        return Objects.equals(id, oder.id) && Objects.equals(CustomerName, oder.CustomerName) && Objects.equals(productHashSet, oder.productHashSet) && Objects.equals(Status, oder.Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, CustomerName, productHashSet, Status);
    }

    @Override
    public String toString() {
        return "Oder{" +
                "id='" + id + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", productHashSet=" + productHashSet +
                ", Status='" + Status + '\'' +
                '}';
    }
}
