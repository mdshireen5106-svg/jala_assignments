package abstract_ass;

// 1. Create an abstract class with abstract and non-abstract methods.
public abstract class Vehicle {
    //Abstract method
    public abstract void state();

    // Non abstract method
    public void start(){
        System.out.println("Vehicle is started...");
    }

    // another abstract method
    public void stop(){
        System.out.println("Vehicle is stopped...");
    }
}
