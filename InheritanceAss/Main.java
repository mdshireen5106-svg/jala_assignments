public class Main {
    public static void main(String[] args) {
        System.out.println(" == This is a main method == ");

        // Calling A class methods
        System.out.println(" Class A methods calling... ");
        A objA = new A();
        objA.methodOneA();
        objA.methodTwoA();
        objA.printMethod();

        System.out.println("Class A variable: " + objA.name);

        // Calling B class methods
        System.out.println(" Class B methods calling... ");
        B objB = new B();
        objB.methodOneA();
        objB.methodTwoA();
        objB.methodOneB();
        objB.methodTwoB();
        objB.printMethod();

        System.out.println("Class B variable: " + objB.name);


        // Calling C class methods
        System.out.println(" Class C methods calling... ");
        C objC = new C();
        objC.methodOneA();
        objC.methodTwoA();
        objC.methodOneB();
        objC.methodTwoB();
        objC.methodOneC();
        objC.methodTwoC();
        objA.printMethod();

        System.out.println("Class C variable: " + objC.name);

        // Runtime polymorphism
        System.out.println(" === Runtime polymorphism === ");
        A variableReference;
        variableReference = new B();
        System.out.println(variableReference.name);
        variableReference = new C();
        System.out.println(variableReference.name); 
    }
}
