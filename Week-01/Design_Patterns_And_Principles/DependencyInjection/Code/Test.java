import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID to search: ");
        int id = sc.nextInt(); 
        service.displayCustomerDetails(id);
        sc.close();
    }
}
