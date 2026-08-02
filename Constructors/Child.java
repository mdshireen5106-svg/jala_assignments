public class Child extends Parent {
    public Child() {
        super();
        System.out.println("I am Child Default Constructor");
    }

    public Child(String greet) {
        super(greet);
        System.out.println("I am Child Parameterized Constructor");
    }
}