public class B extends A {

    String name = "Class B variable";

    public void methodOneB(){
        System.out.println("This is method one in B class");
    }

    public void methodTwoB(){
        System.out.println("This is method two in B class");
    }

    @Override
    public void printMethod(){
        System.out.println("This is print method in B class");
    }
}
