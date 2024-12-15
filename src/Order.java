public class Order {
    int orderID;
    int userID;
    int productID;
    int quantity;
    String address;

    Order() {
        quantity = 0;
    }

    Order(int orderID, int userID, int productID, int quantity, String address) {
        this.orderID = orderID;
        this.userID = userID;
        this.productID = productID;
        this.quantity = quantity;
        this.address = address;
    }

    void showOrder() {
        System.out.println("OrderID: " + orderID);
    }
}
