public class AccessModifierConstructors {

    // Public Constructor
    public AccessModifierConstructors() {
        System.out.println("Public Constructor");
    }

    // Protected Constructor
    protected AccessModifierConstructors(int id) {
        System.out.println("Protected Constructor");
        System.out.println("ID: " + id);
    }

    // Default Constructor
    AccessModifierConstructors(String name) {
        System.out.println("Default Constructor");
        System.out.println("Name: " + name);
    }

    // Private Constructor
    private AccessModifierConstructors(String name, int age) {
        System.out.println("Private Constructor");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void createPrivateObject() {
        AccessModifierConstructors obj = new AccessModifierConstructors(
                "John",
                25);
    }
}