package CarRental;
import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Car> CarList = new ArrayList<Car>();

    protected void MainMenu() {
        System.out.println("------------ MAIN MENU ------------");
        System.out.println("1. Add a car");
        System.out.println("2. Remove a car");
        System.out.println("3. List of cars");
        System.out.println("4. Rent a car");
        System.out.println("5. Exit");
    }
    protected int GetOption() {
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    protected void OptionChosen(int o) {
        switch (o) {
            case 1:
                String brand = AddCarBrand();
                String model = AddCarModel();
                String plate = AddCarPlate();
                Car car = new Car(brand, model, plate);
                CarList.add(car);
                System.out.println("Car added successfully!");
                break;

            case 2:
                int remove;
                do{
                    ListOfCars();
                    System.out.print("Choose the number of the car to remove: ");
                    remove = scanner.nextInt();
                    if (remove < 0 || remove > CarList.size()) {
                        System.out.println("WRONG INPUT! choose a valid option.");
                    }else {
                        break;
                    }
                }while (remove < 0 || remove > CarList.size());
                System.out.print("\n");
                CarList.remove(remove-1);
                System.out.println("Car removed successfully!");

                break;
            case 3:
                ListOfCars();
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input, choose only one of the options.");
                break;
        }
    }

    protected String AddCarBrand() {
        String brand;
        while (true) {
            System.out.print("Enter the brand: ");
            brand = scanner.nextLine().trim();
            if (!brand.isEmpty()) {
                break;
            }
            System.out.println("brand cannot be empty. Please try again.");
        }
        return brand;
    }
    protected String AddCarModel() {
        String model;
        while (true) {
            System.out.print("Enter the model: ");
            model = scanner.nextLine();
            if (!model.isEmpty()) {
                break;
            }
            System.out.println("model cannot be empty. Please try again.");
        }
        return model;
    }
    protected String AddCarPlate() {
        String plate;
        while (true) {
            System.out.print("Enter the plate: ");
            plate = scanner.nextLine();
            if (!plate.isEmpty()) {
                break;
            }
            System.out.println("plate cannot be empty. Please try again.");
        }
        return plate;
    }
    public static int getValidInput(String message){
        int number;
        while(true){
            System.out.println(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                return number;
            }
            else{
                System.out.println("INVALID INPUT! Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
    public static void ListOfCars() {
        System.out.println("------- LIST OF CARS -------");
        for (int i = 0; i < CarList.size(); i++) {
            System.out.println(i+1+". " + CarList.get(i));
        }
        System.out.print("\n");
    }
}
