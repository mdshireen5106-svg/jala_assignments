public class SubClass extends BaseClass {
    String studentName;
    int studentId;
    
    // 3. Call Current Class Constructor using this()
    public SubClass() {
        this("Shireen", 205);
        System.out.println("Child Default Constructor");
    }

    // 4. Call Argument Constructor using this()
    public SubClass(String studentName, int studentId) {

        // 5. Call Parent Constructor using super()
        super("Called from Child Constructor");

        this.studentName = studentName;
        this.studentId = studentId;

        System.out.println("Child Parameterized Constructor");
    }

    // 1. Print Current Class Fields using this
    public void printCurrentClassFields() {

        System.out.println("Using this Keyword:");

        System.out.println("Student Name : "
                + this.studentName);

        System.out.println("Student ID   : "
                + this.studentId);

        System.out.println();

        System.out.println("Without Object Reference:");

        System.out.println("Student Name : "
                + studentName);

        System.out.println("Student ID   : "
                + studentId);
    }

    // 2. Print Parent Class Fields using super
    public void printParentFields() {

        System.out.println("Parent Platform : " + super.platform);
        System.out.println("Parent Platform ID : " + super.platformID);
    }

    // 6. Using this and super in Methods

    public void demonstrateThisAndSuperInMethod() {

        System.out.println("Using this inside method:");

        this.printCurrentClassFields();

        System.out.println();

        System.out.println("Using super inside method:");

        System.out.println(super.platform);
        System.out.println(super.platformID);

        /*
         * Important:
         *
         * this() and super()
         * are constructor calls only.
         *
         * They CANNOT be used inside methods.
         *
         * Only this.variable, this.method(),
         * super.variable and super.method()
         * can be used inside methods.
         */
    }
}
