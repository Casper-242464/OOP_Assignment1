public class Main {
    public static void main(String[] args) {
        Product product0 = new Product(1, "Laptop", 100000);
        Shopper shopper0 = new Shopper(1, "Lorum", "Ipsum", 777888999, "Avenue6");
        Order order0 = new Order(0, shopper0.getUserID(), product0.getProductID(), 1, shopper0.getAddress());

        product0.showProduct();
        shopper0.showShopper();
        order0.showOrder();
    }
}