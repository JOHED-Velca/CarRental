import java.util.Scanner;

public class Display {
    Scanner scanner = new Scanner(System.in);

    protected void MainMenu() {
        System.out.println("------------ MAIN MENU ------------");
        System.out.println("1. Add a car");
        System.out.println("2. Remove a car");
        System.out.println("3. List of cars");
        System.out.println("4. Rent a car");
    }
    protected int GetOption() {
        int option;
        System.out.print("Choose an option: ");
        option = scanner.nextInt();
        return option;
    }
}
