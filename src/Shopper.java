public class Shopper {
    int userID;
    String userName;
    String password;
    int phone;
    String address;

    Shopper() {
        userID = 0;
        userName = "Not set";
        password = "Not set";
        phone = 0;
        address = "Not set";
    }

    Shopper(int userID, String userName, String password, int phone, String address) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    void showShopper() {
        System.out.println(userName);
        System.out.println("UserID: " + userID + " Phone: " + phone + " Address: " + address);
    }

    String getAddress() {
        return address;
    }

    int getUserID() {
        return userID;
    }
}
