public class StringsAss {
    public static void main(String[] args){

        //1. Different ways creating a string
        System.out.println(" === Creating strings in different ways and printing === ");
        String str1 = "Old string";
        String str2 = new String("New string");
        char[] chr = {'C','h','a','r',' ','s','t','r','i','n','g'};
        String str3 = new String(chr);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 2. Concatenating two strings using + operator
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("String concatination: " + firstName + " " + lastName);

        // 3. Finding the length of the string
        String greet = "Good Morning!";
        System.out.println("String length: " + greet.length());
        
        // 4. Extract a string using Substring
        String sentence = "The fox is on the box";
        System.out.println("Sub-string of a string: " + sentence.substring(0,6));

        // 5. Searching in strings using indexOf()
        String name = "Raghav";
        System.out.println("Search using index: " + name.indexOf('g'));

        // 6. Matching a String Against a Regular Expression With matches()

        // 7 & 8. Comparing strings using the methods equals(), equalsIgnoreCase(), startsWith(), endsWith() and compareTo
        System.out.println(" === Strings comparision === ");
        String s1 = "Java programming";
        String s2 = "java programming";
        System.out.println("equals() method: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase() method: " + s1.equalsIgnoreCase(s2));
        System.out.println("startsWith() method: " + s1.startsWith("Java"));
        System.out.println("endsWith() method: " + s2.endsWith("ing"));
        System.out.println("compareTo() method: " + s1.compareTo(s2));

        // 9. Trimming strings with trim()
        String rhyme = "  Five little monkeys jumping on the bed!  ";
        System.out.println("Trimming string: " + rhyme.trim());

        // 10. Replacing characters in strings with replace()
        String a = "Five little monkeys";
        System.out.println("Replacing characters: " + a.replace("monkeys", "fingers"));

        // 11. Splitting strings with split()
        String[] strArr = sentence.split(" ");
        System.out.println("String splitting: ");
        for(String str : strArr){
            System.out.println(str);
        }

        // 12. Converting Numbers to Strings with valueOf()
        int num = 123;
        String str = "";
        System.out.println("Convert num to str: " + str.valueOf(num));

        // 13. Converting integer objects to Strings
        Integer intVal = 235;
        String strObj = intVal.toString();
        System.out.println("Integer object to string: " + strObj);

        // 14. Converting to uppercase and lowercase
        System.out.println("Converting to upper case: " + name.toUpperCase());
        System.out.println("Converting to lower case: " + name.toLowerCase());
    }
}
