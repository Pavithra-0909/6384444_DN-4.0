import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }

        System.out.println("\nChoose Search Method:-");
        System.out.println("1.Linear Search");
        System.out.println("2.Binary Search");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name to search: ");
        String searchName = sc.nextLine();

        Product found=null;

        if (choice == 1){
            found = Search.linearSearch(products, searchName);
        } else if (choice == 2){
            Search.sortByName(products);
            found = Search.binarySearch(products, searchName);
        } else{
            System.out.println("Invalid choice.");
        }

        if (found != null) {
            System.out.println("Product Found: " + found);
        } else {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}
