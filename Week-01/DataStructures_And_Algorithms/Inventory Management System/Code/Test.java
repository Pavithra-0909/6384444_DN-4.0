import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n-----Inventory Menu-----");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    manager.updateProduct(updateId, newName, newQty, newPrice);
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int delId = sc.nextInt();
                    manager.deleteProduct(delId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!!!");
            }
        }
    }
}
