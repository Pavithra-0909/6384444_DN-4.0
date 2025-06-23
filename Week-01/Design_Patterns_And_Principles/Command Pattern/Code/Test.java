import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Light bedroomLight = new Light();
        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(bedroomLight);
        Command lightOff = new LightOffCommand(bedroomLight);

        System.out.println("1.Turn ON the Light");
        System.out.println("2.Turn OFF the Light");
        System.out.print("Enter your choice: ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                remote.setCommand(lightOn);
                System.out.println("\nTurning the light ON >>");
                remote.pressButton();
                break;

            case 2:
                remote.setCommand(lightOff);
                System.out.println("\nTurning the light OFF >>");
                remote.pressButton();
                break;

            default:
                System.out.println("Invalid choice!!!");
        }
        sc.close();
    }
}
