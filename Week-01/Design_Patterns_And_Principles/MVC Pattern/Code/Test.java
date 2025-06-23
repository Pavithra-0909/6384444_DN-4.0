import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = sc.nextLine();

        Student model = new Student(name, id, grade);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        sc.close();
    }
}

