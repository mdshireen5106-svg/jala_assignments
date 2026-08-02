public class InterfaceDemoClass implements InterfaceA, Interface1, Interface2, ChildInterface, PublicInterface {
    @Override
    public void interMethodA(){
        System.out.println("Inside implemented method of A interface");
    }

    /* @Override
    public void method2InB(){
        System.out.println("2nd method implemented from B interface");
    }

    Java does NOT allow implementing only one abstract method from an interface unless:
    1. The class is declared abstract OR 2. One method is made default
    */


    @Override
    public void methodOne(){
        System.out.println("Method one implemented in interface 1");
    }

    @Override
    public void methodTwo(){
        System.out.println("Method two implemented in interface 2");
    }

    @Override
    public void sameMethod(){
        System.out.println("Method implemented commonly");
    }

    @Override
    public void parentMethod(){
        System.out.println("I am from Parent method");
    }

    @Override
    public void childMethod(){
        System.out.println("I am from Child method");
    }

    @Override
    public void details() {
        System.out.println("These are my details");
    }


    public static void main(String[] args) {
        InterfaceDemoClass obj = new InterfaceDemoClass();
        // 1. Create an interface with only one method and implement it in a class. Call the method implemented.
        obj.interMethodA();

        // 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.
        // obj.method2InB();
        System.out.println("A concrete class must implement all interface methods.");

        // 3. Use Interface instances to call the implemented method in the implemented class
        InterfaceA objA = new InterfaceDemoClass();
        objA.interMethodA();

        // 4. Create two interfaces with one method each. Implement these two interfaces in one class.
        System.out.println("=== Multiple interfaces with different methods ===");
        obj.methodOne();
        obj.methodTwo();


        // 5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method.
        System.out.println("=== Multiple interfaces with different methods ===");
        obj.sameMethod();
        
        // 6. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method.
        System.out.println("=== Default Method ===");
        DefautMethodInterface def = new DefautMethodInterface() {
            @Override
            public void show() {
                System.out.println("Abstract Method Implemented in constructor");
            }
        };
        def.show();
        def.display();

        // 7. Create an interface and inherit it from the other interface.
        System.out.println("== Inheritance in interfaces == ");
        obj.parentMethod();
        obj.childMethod();

        // 8. Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some class and print the values of the interface fields and call the interface methods
        System.out.print("I am " + name + ". I am " + age + " years old. ");
        obj.details();

        // 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
        /*
         * Top-level interfaces cannot be
         * private or protected.
         *
         * Only nested interfaces can be private.
         */

        System.out.println("Top-level interfaces cannot be private or protected.");

        // 10. Create an interface with private, public and protected fields.

        /*
         * Interface fields are always:
         *
         * public static final
         *
         * private and protected fields are
         * not allowed in interfaces.
        */

        System.out.println("Interface fields are implicitly public static final.");

        // 11. Create an interface with static final variable
        System.out.println("=== Static Final Variable ===");
        System.out.println("Pi value = "+ StaticInterface.PI_VALUE);
    }
}
