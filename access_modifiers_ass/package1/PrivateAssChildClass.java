package access_modifiers_ass.package1;

//1. Create a sub class and try to access the private fields and methods from sub class.
public class PrivateAssChildClass extends PrivateAss {
    public static void main(String[] args) {
        PrivateAss child = new PrivateAss();

        // System.out.println("Private variable in sub class - " + child.name);

        // System.out.println("Calling private method in sub class - " + child.privateMethod);

        System.out.println("Private menmbers are accessed within the same class. It cannot be accessed in sub class");
    }
    
}
