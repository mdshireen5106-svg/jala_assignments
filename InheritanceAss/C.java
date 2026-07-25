public class C extends B {

    String name = "Class C variable";

    public void methodOneC(){
        System.out.println("This is method one in C class");
    }

    public void methodTwoC(){
        System.out.println("This is method two in C class");
    }

    @Override
    public void printMethod(){
        System.out.println("This is print method in C class");
    }
    
}
