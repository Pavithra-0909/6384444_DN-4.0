public class CustomerService{
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomerDetails(int id){
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null){
            System.out.println("<<<<Customer Found>>>>");
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
        } else{
            System.out.println("Customer not found with ID: " + id);
        }
    }
}
