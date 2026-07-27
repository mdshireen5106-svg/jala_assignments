package access_modifiers_ass.package2;

import access_modifiers_ass.package1.PublicAss;

public class PublicAssMain2 {
    public static void main(String[] args) {
        PublicAss ass = new PublicAss();
        System.out.println("Printing public variable in different package - " + ass.demo);
        System.out.print("Calling public method in different package - ");
        ass.publicMethod();
    }    
}
