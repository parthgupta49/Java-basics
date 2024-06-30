package prepExam.excepHandling;

public class Order {
    int orderId;
    String customerName;
    double price;
    int quantity;

    public Order(int orderId, String customerName, double price, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.price = price;
        this.quantity = quantity;
    }
        public void checkOrderIsValid(int quantity, String shippingAddress) throws InvalidInputException {
            if (quantity <= 0 || shippingAddress == null || shippingAddress.isEmpty()) {
                throw new InvalidInputException("Invalid order input: Quantity must be positive, and shipping address must not be empty.");

            }



        }

}
