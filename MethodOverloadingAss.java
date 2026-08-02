public class MethodOverloadingAss {
    // 1. Write two methods with the same name but different number of parameters of same type and call the methods from main method
    public void add(int a, int b){
        System.out.println("Add 2 num's: " + a + b);
    }

    public void add(int a, int b, int c){
        System.out.println("Add 3 num's: " + a + b + c);
    }

    // 2. Write two methods with the same name but different number of parameters of different data type and call the methods from main method
    public void student(String name, int age){
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    public void student(String name, int marks, double percentage){
        System.out.println("My name is " + name + ". I got " + marks + " and my percentage is " + percentage);
    }

    // 3. Write two methods with the same name and same number of parameters of same type and call from main method
    // Same name , same number of parameters and same type is not allowed in method overloading
    // It can be achieved using method overriding in inheritance

    // 4. Write two methods with the same name and same number of parameters of different type and call from main method
    public void values(int a){
        System.out.println("Integer value: " + a);
    }

    public void values(double b){
        System.out.println("Double value: " + b);
    } 

    // 5. Write two methods with the same name, number of parameters and data type but different return Type
    // Return type alone cannot distinguish overloaded methods. Parameter type also should be different

    public static void main(String[] args) {
        MethodOverloadingAss obj = new MethodOverloadingAss();
        System.out.println(" === same name but different parameters === ");
        obj.add(1,3);
        obj.add(3,6,9);

        System.out.println(" === same name but different parameters and different data type === ");
        obj.student("John", 19);
        obj.student("Aliya", 578, 96);

        System.out.println(" === Same name , same number of parameters and same type is not allowed in method overloading ===");

        System.out.println(" === Same name , same number of parameters and different type === ");
        obj.values(9);
        obj.values(58.9);

        System.out.println("Return type alone cannot distinguish overloaded methods. Parameter type also should be different");
    }
}
