public class StaticAss {
    //1. Instance variable
    String name1 = "Instanace variable1";
    String name2 = "Instanace variable2";

    //1. Static variable
    static String name3 = "Static variable1";
    static String name4 = "Static variable2";

    //1. instance methods
    public void instanceMethod1(){
        System.out.println("Inside instance method1");

        //3. Printing static variables 
        System.out.println(name3);
        System.out.println(name4);

        //5. calling static method 
        staticMethod2();
    }

    public void instanceMethod2(){
        System.out.println("Inside instance method2");

        // Printing static variables 
        System.out.println(name3);
        System.out.println(name4);
    }

    //1. static methods
    public static void staticMethod1(){
        System.out.println("Inside static method1");

        //2. printing instance variables using obj
        StaticAss obj = new StaticAss();
        System.out.println(obj.name1);
        System.out.println(obj.name2);

        //4. calling instance method using obj
        obj.instanceMethod1();

    }

    public static void staticMethod2(){
        System.out.println("Inside static method2");

        // printing instance variables using obj
        StaticAss obj = new StaticAss();
        System.out.println(obj.name1);
        System.out.println(obj.name2);

        // calling instance method using obj
        obj.instanceMethod2();
    }
    


    public static void main(String[] args) {
        StaticAss obj = new StaticAss();

        //6. printing all instance and static variables in main
        System.out.println(" == Printing instance variables == ");
        System.out.println(obj.name1);
        System.out.println(obj.name2);

        System.out.println(" == Printing static variables == ");
        System.out.println(name3);
        System.out.println(name4);

        //7. calling static and instance methods in main
        System.out.println(" == Calling instance method == ");
        obj.instanceMethod1();
        obj.instanceMethod2();

        System.out.println(" == Calling static method == ");
        staticMethod1();
        staticMethod2();
    }
}
