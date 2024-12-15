public class Product {
    int productID;
    String name;
    double price;

    Product() {
        productID = 0;
        name = "";
        price = 0;
    }

    Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    void showProduct() {
        System.out.println(name);
        System.out.println("productID: " + productID + " Name: " + name + " Price: " + price + " kzt");
    }

    int getProductID() {
        return productID;
    }
}
