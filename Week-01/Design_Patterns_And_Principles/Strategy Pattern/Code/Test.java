import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();
        System.out.println("Select Payment Method:- \n1. Credit Card  2. PayPal");
        int ch = sc.nextInt();
        sc.nextLine(); 
        if (ch == 1) {
            System.out.print("Enter Credit Card Number: ");
            String card = sc.nextLine();
            context.setPaymentStrategy(new CreditCardPayment(card));
        } else if (ch== 2) {
            System.out.print("Enter PayPal Email: ");
            String email = sc.nextLine();
            context.setPaymentStrategy(new PayPalPayment(email));
        } else {
            System.out.println("Invalid choice.");  
            System.exit(0);

        }
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();
        context.payAmount(amount);
        sc.close();
    }
}
