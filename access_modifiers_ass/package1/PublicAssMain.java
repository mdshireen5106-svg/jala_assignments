package access_modifiers_ass.package1;

public class PublicAssMain {
    public static void main(String[] args) {
        PublicAss ass = new PublicAss();
        System.out.println("Printing public variable in same package - " + ass.demo);
        System.out.print("Calling public method in same package - ");
        ass.publicMethod();
    }
}
