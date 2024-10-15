import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public double checkout() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        products.clear(); // Clear cart after checkout
        return total;
    }
}

class ECommerceApp {
    public static void main(String[] args) {
        User user = new User("Alice");
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.viewCart();

        double total = cart.checkout();
        System.out.println("Total amount due: $" + total);
    }
}
