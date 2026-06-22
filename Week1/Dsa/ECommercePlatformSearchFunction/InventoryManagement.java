import java.util.ArrayList;

public class InventoryManagement {

    ArrayList<Product> inventory = new ArrayList<>();

    public void addProduct(Product p) {
        inventory.add(p);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, int newQuantity) {
        for (Product p : inventory) {
            if (p.productId == id) {
                p.quantity = newQuantity;
                System.out.println("Product Updated");
                return;
            }
        }
        System.out.println("Product Not Found");
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).productId == id) {
                inventory.remove(i);
                System.out.println("Product Deleted");
                return;
            }
        }
        System.out.println("Product Not Found");
    }

    public void displayProducts() {
        System.out.println("\nInventory:");
        for (Product p : inventory) {
            p.display();
        }
    }

    public static void main(String[] args) {

        InventoryManagement ims = new InventoryManagement();

        ims.addProduct(new Product(101, "Laptop", 10, 50000));
        ims.addProduct(new Product(102, "Mouse", 50, 500));

        ims.displayProducts();

        ims.updateProduct(101, 15);

        ims.deleteProduct(102);

        ims.displayProducts();
    }
}