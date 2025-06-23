import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customer orders: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Order[] orders = new Order[n];
 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1) + ":");
            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Total Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); 
            orders[i] = new Order(id, name, price);
        }

        System.out.println("\nChoose Sorting Method:-");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            Sort.bubbleSort(orders);
            System.out.println("\nOrders sorted using Bubble Sort:");
        }else if (choice == 2){
            Sort.quickSort(orders, 0, orders.length - 1);
            System.out.println("\nOrders sorted using Quick Sort:");
        }else{
            System.out.println("Invalid choice!!!");
            return;
        }

        Sort.displayOrders(orders);

        sc.close();
    }
}
