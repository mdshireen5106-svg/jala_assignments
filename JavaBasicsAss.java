public class JavaBasicsAss {

    //5. Global variable
    String name  = "Global Variable";

    //1 & 6. method creation 
    //1. Method signature - public void displayName()
    public void displayName(){
        System.out.println("This is John Doe");
    }
    public static void main (String[] args){
        //2. print name
        System.out.println("== Print Name ==");
        System.out.println("My name is Albert Robinson");

        //1. object creation
        JavaBasicsAss java_obj = new JavaBasicsAss();
        //1 & 6. method calling
        System.out.println(" == Method calling - displayName() ==");
        java_obj.displayName();

        System.out.println();
        
        //3. Comments in java
        System.out.println("== Comments in Java == ");

        // This is single line comment

        /*
         * This is multi line comment
        */

        /**
         * This is documentation comment 
         * used to generate API documentation
         */

        System.out.println();

        // 4. Data types in java
        System.out.println("== Data types ==");

        int intVal = 10;
        boolean boolVal = true;
        char charVal = 'a';
        float floatVal = 9.8f;
        double doubleVal = 99.98;

        System.out.println("Integer value: " + intVal);
        System.out.println("Boolean value: " + boolVal);
        System.out.println("Character value: " + charVal);
        System.out.println("Float value: " + floatVal);
        System.out.println("Double value: " + doubleVal);

        System.out.println();

        // 5. Local and global variables in java
        System.out.println("== Local and Global Variables ==");
        String name = "Local Variable";
        System.out.println("Local variable value: " + name);
        System.out.println("Global variable value: " + java_obj.name);
    } 
}
