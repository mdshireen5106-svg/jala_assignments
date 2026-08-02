public class ThisAndSupaerMain {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
 
        // 1. Print the fields/instance members of the current class using this and without using object
        System.out.println("1. Current Class Fields");
        sub.printCurrentClassFields();

        // 2. Print the fields/instance members of the parent class using super
        System.out.println("2. Parent Class Fields");
        sub.printParentFields();

        // 3. Call constructor of the current class using this()
        // 4. Call argument constructor of current class using this()
        // 5. Call constructor of the parent class using super()
        System.out.println("3,4,5 Constructor Chaining Demonstrated Above");

        // 6. Use this() and super() in methods not in constructors
        System.out.println("6. this and super in Methods");
        sub.demonstrateThisAndSuperInMethod();
    }
}