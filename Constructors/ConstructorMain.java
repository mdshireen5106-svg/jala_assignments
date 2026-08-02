public class ConstructorMain {
    public static void main(String[] args) {
        
        // 1. Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class
        BasicConstructors obj1 = new BasicConstructors();
        BasicConstructors obj2 = new BasicConstructors("David");
        BasicConstructors obj3 = new BasicConstructors("Happy", 5);

        // 2. Call the constructors(both default and argument constructors) of super class from a child class
        System.out.println("=== Calling both default and argument constructors ===");

        Child child1 = new Child();
        System.out.println();
        Child child2 = new Child("Hello Parent");
        
        // 3. Apply private, public, protected and default access modifiers to the constructor
        System.out.println("=== Access modifiers to the constructor ===");

        new AccessModifierConstructors();
        new AccessModifierConstructors(101);
        new AccessModifierConstructors("David");
        AccessModifierConstructors.createPrivateObject();

        // 4. Write constructors with return type int and String
        // Constructors CANNOT have return types.
        System.out.println(" === Constructors cannot have return types. === ");
        System.out.println("int BasicConstructors() and String BasicConstructors() are methods, not constructors.");

        // 5. Try to call the constructor multiple times with the same object        
         BasicConstructors score = new BasicConstructors();

        /* Constructors cannot be called again using an existing object.
         * score.BasicConstructors();
         */

        System.out.println("A constructor executes only during object creation.");

        System.out.println("To execute it again, create a new object.");

        score = new BasicConstructors();
    }
}
