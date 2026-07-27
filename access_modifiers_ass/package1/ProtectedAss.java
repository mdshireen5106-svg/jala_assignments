package access_modifiers_ass.package1;

public class ProtectedAss {
    //3. Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package.
    // Also, Access the PROTECTED fields and methods from child class located in a different package
    // Access the PROTECTED fields and methods from any class in different package

    protected String str = "Protected variable";

    protected void protectedMethod(){
        System.out.println("Inside protected method");
    }
}
