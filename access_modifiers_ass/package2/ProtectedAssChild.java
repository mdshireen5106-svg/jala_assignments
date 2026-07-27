package access_modifiers_ass.package2;

import access_modifiers_ass.package1.ProtectedAss;

public class ProtectedAssChild extends ProtectedAss {

    public void accessProtectedMembers() {

        System.out.println(str);

        protectedMethod();
    }

    public static void main(String[] args) {

        ProtectedAssChild pro = new ProtectedAssChild();

        pro.accessProtectedMembers();
    }
}
