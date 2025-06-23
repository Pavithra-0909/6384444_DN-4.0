import java.util.Scanner;

public class EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int count = 0;

    public static void addEmployee(Scanner sc) {
        if (count >= employees.length) {
            System.out.println("Employee array is full!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble(); sc.nextLine();

        employees[count++] = new Employee(id, name, position, salary);
        System.out.println("Employee added successfully.");
    }

    public static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1]; 
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n-----Employee Management System------");
            System.out.println("1.Add Employee");
            System.out.println("2.Search Employee");
            System.out.println("3.Display All Employees");
            System.out.println("4.Delete Employee");
            System.out.println("5.Exit");
            System.out.print("Choose an option: ");
            int choice=sc.nextInt();

            switch (choice){
                case 1: addEmployee(sc); 
                        break;
                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int sid = sc.nextInt(); 
                    sc.nextLine();
                    searchEmployee(sid);
                    break;
                case 3: traverseEmployees();
                        break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int did = sc.nextInt(); 
                    sc.nextLine();
                    deleteEmployee(did);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
