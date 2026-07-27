package access_modifiers_ass.package1;

public class DefaultAssMainMethod {
    public static void main(String[] args) {
        DefaultAss def = new DefaultAss();
        System.out.println("Printing default variable = "+ def.example);
        System.out.print("Calling default method = ");
        def.defaultMethod();
    }
}
