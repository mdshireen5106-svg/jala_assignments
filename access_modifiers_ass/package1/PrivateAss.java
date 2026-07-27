package access_modifiers_ass.package1;

public class PrivateAss {
    //1. Create a class with PRIVATE fields, private method and a main method. Print the fields in main method.
    // Call the private method in main method.
    private String name = "Private variable";

    private void privateMethod(){
        System.out.println("Inside private method");
    } 
    
    public static void main(String[] args) {
        PrivateAss obj = new PrivateAss();

        // Printing private variable
        System.out.println(" === Printing private variable === ");
        System.out.println("Private variable - " + obj.name);

        System.out.println(" === Calling private method === ");
        obj.privateMethod();
    }
}
