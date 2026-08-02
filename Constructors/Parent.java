public class Parent {
    public Parent() {
        System.out.println("I am Parent Default Constructor");
    }

    public Parent(String greet) {
        System.out.println("I am Parent Parameterized Constructor");
        System.out.println("Greeting: " + greet);
    }
}
