package CarRental;

public class Car {
    private String brand;
    private String model;
    private String plate;

    public Car(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }
    @Override
    public String toString() {
        return "Car [Brand: " + brand + " | Model: " + model + " | Plate: " + plate + " ]";
    }
}
