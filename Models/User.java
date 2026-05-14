package Models;

public class User {
    private int userId;
    private String name;
    private String address;
    private Cart cart;

    public User(int userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.cart = new Cart();
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public Cart getCart() { return cart; }
}
