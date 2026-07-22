public class OperatorsAss {
    // 1. Write a function for arithmetic operators(+,-,*,/)
    public void arithmeticOperators(int a, int b) {
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        if(b==0){
            System.out.println("Division = Division by zero is not allowed");
        } else {
            System.out.println("Division = " + (a/b));   
        }
    }

    // 2. Write a method for increment and decrement operators(++, --)
    public void incrementDecrementOperators(int a) {
        System.out.println("Initial value = " + a);
        System.out.println("Pre Increment = " + (++a));
        System.out.println("Post Increment = " + (a++));
        System.out.println("Pre Decrement = " + (--a));
        System.out.println("Post Decrement = " + (a--));
    }

    // 3. Program to equal operator and not equal operators
    public void equalityOperators(int a, int b) {
        System.out.println("Equal = " + (a==b));
        System.out.println("Not Equal = " + (a!=b));
    }

    // 4. Write a program to find the two numbers equal or not.
    public void checkEqualNumbers(int x, int y) {
        if(x==y){
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are not equal");
        }
    }

    // 5. Programs on Logical AND,OR operator and Logical NOT
    public void logicalOperators(boolean a, boolean b){
        System.out.println("Logical AND = " + (a && b));
        System.out.println("Logical OR = " + (a || b));
        System.out.println("Logical NOT = " + (!a));
    } 

    // 6. Program for relational operators (<,<==, >, >==)
    public void relationalOperators(int a, int b) {
        System.out.println("Greater than = " + (a>b));
        System.out.println("Less than = " + (a<b));
        System.out.println("Greater than or equal to = " + (a>=b));
        System.out.println("Less than or equal to = " + (a<=b));
    }

    // 7. Print the smaller and larger number
    public void printSmallerLarger(int m, int n) {
        if(m>n){
            System.out.println("Larger number is: " + m);
            System.out.println("Smaller number is: " + n);
        } else if(m<n) {
            System.out.println("Larger number is: " + n);
            System.out.println("Smaller number is: " + m);
        } else{
            System.out.println("Both numbers are equal: " + m);
        }
    } 


    public static void main(String[] args) {
        OperatorsAss obj = new OperatorsAss();
        System.out.println("== Arithmetic Operators ==");
        obj.arithmeticOperators(30,5);
        obj.arithmeticOperators(10,0);
        System.out.println();

        System.out.println("== Increment and Decrement Operators ==");
        obj.incrementDecrementOperators(10);
        System.out.println();

        System.out.println("== Equal or Not equal Operator ==");
        obj.equalityOperators(10, 20);
        System.out.println();

        System.out.println("== Check if two numbers are equal or not ==");
        obj.checkEqualNumbers(10, 10);
        obj.checkEqualNumbers(10, 20);
        System.out.println();

        System.out.println("== Logical AND, OR and NOT Operators ==");
        obj.logicalOperators(true, false);
        System.out.println();

        System.out.println("== Relational Operators ==");
        obj.relationalOperators(10, 20);
        System.out.println();


        System.out.println("== Print Smaller and Larger Number ==");
        obj.printSmallerLarger(10, 20);
        obj.printSmallerLarger(10, 10);
    }
}
