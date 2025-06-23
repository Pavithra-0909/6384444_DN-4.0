public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer findCustomerById(int id){
        if (id == 101){
            return new Customer(101, "Avi");
        }else if (id == 102){
            return new Customer(102, "Pavi");
        } else if(id == 103){
            return new Customer(103, "Pravi");
        }else{
            return null;
        }
    }
}
