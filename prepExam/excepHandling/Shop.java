package prepExam.excepHandling;

import java.util.ArrayList;

public class Shop {
    ArrayList<Order> orderList;

    public Shop() {
        orderList = new ArrayList<>();
    }
    public void addOrder(Order order){
        orderList.add(order);
    }
    public void removeOrder(Order order){
        orderList.remove(order);
    }
}
