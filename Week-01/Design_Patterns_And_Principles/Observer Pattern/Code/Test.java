import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockMarket market = new StockMarket();

        
        Observer mobileApp = new MobileApp("Mobile");
        Observer webApp = new WebApp("WebPortal");

        market.registerObserver(mobileApp);
        market.registerObserver(webApp);

        

        String choice;
        do {
            System.out.print("Enter stock name: ");
            String name = scanner.nextLine();

            System.out.print("Enter stock price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            market.setStock(name, price);

            System.out.print("Do you want to enter another stock update? (Yes/No): ");
            choice = scanner.nextLine().trim();

        } while (choice.equals("Yes"));

        scanner.close();
        System.out.println("Exiting...");
    }
}
