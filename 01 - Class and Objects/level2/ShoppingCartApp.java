import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total price for this item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}

class ShoppingCart {
    ArrayList<CartItem> cartItems;

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Add item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                item.quantity += quantity;
                System.out.println("Updated quantity of " + itemName);
                return;
            }
        }
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    // Remove item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    // Display total cost
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cart Cost: $" + total);
    }

    // Display cart items
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("\nShopping Cart Items:");
        for (CartItem item : cartItems) {
            item.displayItem();
        }
        displayTotalCost();
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(name, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = scanner.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
