public class LoopsAss {
    // 1. Write a program to print “Bright IT Career” ten times using for loop
    public void forloop(){
        for(int i=1; i<=10; i++){
            System.out.println("Bright IT Career");
        }
    }

    // 2. Write a java program to print 1 to 20 numbers using the while loop.
    public void whileloop(){
        int i=1;
        while(i<=20){
            System.out.println(i);
            i++;
        }
    }

    // 3. Program to equal operator and not equal operators
    public void equalityOperators(int a, int b) {
        System.out.println("a == b: " + (a==b));
        System.out.println("a != b: " + (a!=b));
    }

    // 4. Write a program to print the odd and even numbers.
    public void oddEvenNumbers(int num) {
        if(num % 2 == 0){
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
    }

    // 5. Write a program to print largest number among three numbers.
    public void largestAmong3(int a, int b, int c){
        System.out.println("Numbers are: " + a + ", " + b + ", " + c);
        if (a>b && a>c){
            System.out.println(a + " is largest.");
        } else if (b>a && b>c){
            System.out.println(b + " is largest.");
        } else if (c>a && c>b){
            System.out.println(c + " is largest.");
        } else {
            System.out.println("All numbers are equal.");
        }
    }

    // 6. Write a program to print even number between 10 and 100 using while
    public void printEvenNumbers(){
        int i=10;
        while(i<=100){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    } 

    // 7. Write a program to print 1 to 10 using the do-while loop statement.
    public void doWhileLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);
    }

    // 8. Write a program to find Armstrong number or not
    public void armstrong(int n){
        int res = 0;
        int arm = n;
        while(arm>0){
            int dig = arm%10;
            res = res + dig * dig * dig;
            arm = arm/10;
        }
        if(res == n){
            System.out.println(n + " is an Armstrong number");
        } else{
            System.out.println(n + " is not an Armstrong number");
        } 
    }

    // 9. Write a program to find the prime or not.
    public void primeOrNot(int n){
        boolean isPrime  = true;

        if(n <=1 ){
            isPrime = false;
        } else{
            for(int i = 2; i <= n/2; i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(n + " is a prime number");
        } else{
            System.out.println(n + " is not a prime number");
        }
    }

    //10. Write a program to palindrome or not.
    public void palindrome(int x){
        int num = x;
        int sum = 0;

        while(num>0){
            int rem = num%10;
            sum = sum * 10 + rem;
            num = num/10;
        }

        if(sum == x){
            System.out.println("Number is palindrome");
        } else{
            System.out.println("Number is not palindrome");
        }
    }

    // 11. Program to check whether a number is EVEN or ODD using switch
    public void evenOddUsingSwitch(int n){
        switch(n%2){
            case 0:
                System.out.println(n + " is Even");
                break;
            case 1:
                System.out.println(n + " is Odd");
                break;    
        }
    }

    // 12. Print gender (Male/Female) program according to given M/F using switch
    public void gender(char ch){
        switch(ch){
            case 'M':
            case 'm':    
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;    
        }
    }

    // 13. Program for multiple if else statement(Largest number in 10,20 and 30)
    public void largestUsingMultipleIf(int x, int y, int z){
        if (x>y && x>z){
            System.out.println("Largest number - " + x);
        } else if (y>x && y>z){
            System.out.println("Largest number - " + y);
        } else if (z>x && z>y){
            System.out.println("Largest number - " + z);
        } else {
            System.out.println("All numbers are equal.");
        }
    }
    

    public static void main(String[] args){
        LoopsAss obj = new LoopsAss();
        System.out.println("== For Loop ==");
        obj.forloop();
        System.out.println();

        System.out.println("== While Loop ==");
        obj.whileloop();
        System.out.println();

        System.out.println("== Equality Operators ==");
        obj.equalityOperators(10, 20);
        System.out.println();

        System.out.println("== Odd or Even ==");
        obj.oddEvenNumbers(15);
        System.out.println();

        System.out.println("== Largest Among 3 Numbers ==");
        obj.largestAmong3(20, 50, 30);
        System.out.println();

        System.out.println("== Even Numbers between 10 and 100 ==");
        obj.printEvenNumbers();
        System.out.println();

        System.out.println("== Do-While Loop ==");
        obj.doWhileLoop();
        System.out.println();

        System.out.println("== Armstrong number ==");
        obj.armstrong(153);
        obj.armstrong(235);
        System.out.println();

        System.out.println("== Prime number ==");
        obj.primeOrNot(29);
        System.out.println();

        System.out.println("== Palindrome number ==");
        obj.palindrome(121);
        System.out.println();

        System.out.println("== Even/Odd using switch ==");
        obj.evenOddUsingSwitch(65);
        obj.evenOddUsingSwitch(32);
        System.out.println();


        System.out.println("== Gender using switch ==");
        obj.gender('F');
        obj.gender('m');
        System.out.println();

        System.out.println("== Largest number using multiple if ==");
        obj.largestUsingMultipleIf(10, 20, 30); 
       }
}
