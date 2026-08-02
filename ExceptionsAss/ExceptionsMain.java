import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class ExceptionsMain {

    public static void throwException()
            throws Exception {

        throw new Exception(
                "Exception calling from method");
    }

    public static void main(String[] args) {
        
        // 1. Write a program to generate Arithmetic Exception without exception handling
        int i = 10;
        // int ans  = i/0;
        System.out.println("Code commented for code execution");

        // 2. Handle the Arithmetic exception using try-catch block
        int a = 25;
        try {
            int res = a/0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled");
        }
        
        // 3. Write a method which throws exception, Call that method in main class without try block
        try {
            throwException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4. Write a program with multiple catch blocks
        try {
            String s = null;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        } catch (Exception e){
            System.out.println("General Exception");
        }

        // 5. Write a program to throw exception with your own message
        try {
            throw new Exception("This is my Custom Exception Message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 6. Write a program to create your own exception
        try {
            throw new CustomException("Custom Exception Occurred");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // 7. Write a program with finally block
        try {
            int number = 78 * 2;
        } catch (Exception e) {
            System.out.println("Catch block" + e);
        } finally {
            System.out.println("Finally block always execute");
        }

        // 8. Write a program to generate Arithmetic Exception
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Generated");
        }

        // 9. Write a program to generate ArrayIndexOutOfBoundException
        try {
            char[] arr = { 'a', 'b', 'c' };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Generated");
        }

        // 10. Write a program to generate ClassNotFoundException
        try {
            Class.forName("InvalidClass");
         } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException Generated");
        }

        // 11. Write a program to generate FileNotFoundException
        try {
            FileInputStream file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Generated");
        }

        // 12. Write a program to generate IOException
        try {
            FileReader file = new FileReader("output.txt");
            file.close();
            file.read();
        } catch (IOException e) {
            System.out.println("IOException Generated");
        }

        // 13. Write a program to generate NoSuchFieldException
        try {
            Field field = String.class.getField("invalidField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException Generated");
        }

        // 14. Write a program to generate NoSuchMethodException
        try {
            Method method = String.class.getMethod("invalidMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException Generated");
        }
        
        // 15. Write a program to generate NullPointerException
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Generated");
        }

        // 16. Write a program to generate NumberFormatException
        try {
            Integer.parseInt("HELLO");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Generated");
        }

        // 17. Write a program to generate StringIndexOutOfBoundsException
        try {
            String text = "Java";
            System.out.println(text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Generated");
        }

        // 18. Write a program to generate SQLException
        try {
            throw new SQLException("Database Error");
        } catch (SQLException e) {
            System.out.println("SQLException Generated");
        }
    }
}