package abstract_ass;

public class Car extends Vehicle {
     // Implementing Abstract Method
    @Override
    public void state() {
        System.out.println("Car's state");
    }

    public static void main(String[] args) {

        // 2. Create Object Using Abstract Class Reference
        System.out.println("===== Abstract Reference =====");

        Vehicle vehicle = new Car();

        // Calling Non-Abstract Methods
        vehicle.start();
        vehicle.stop();

        System.out.println("\n===================================\n");

        // 3. Create Child Class Object
        // Call Abstract Method
        System.out.println("===== Child Object - Abstract Method =====");

        Car car = new Car();

        car.state();

        System.out.println("\n===================================\n");

        // 4. Create Child Class Object
        // Call Non-Abstract Methods

        System.out.println("===== Child Object - Non-Abstract Methods =====");

        car.start();
        car.stop();

        System.out.println("\n===================================\n");
    }
}