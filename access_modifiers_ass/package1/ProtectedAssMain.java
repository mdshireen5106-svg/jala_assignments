package access_modifiers_ass.package1;

public class ProtectedAssMain {
    public static void main(String[] args) {
        ProtectedAss pro = new ProtectedAss();
        System.out.println("Protected variable = " + pro.str);
        System.out.print("Protected method = ");
        pro.protectedMethod();        
    }
}
