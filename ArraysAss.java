import java.util.*;

public class ArraysAss {
    // 1. Write a function to add integer values of an array
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        return sum;
    }

    // 2. Write a function to calculate the average value of an array of integers
    public static int avgOfArray(int[] arr){
        int sum = 0;
        int len = arr.length;
        for(int num : arr){
            sum = sum + num;
        }
        return sum/len;
    }
    // 3. Write a program to find the index of an array element
    public static int findIndex(int[] arr, int val){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

    // 4. Write a function to test if array contains a specific value
    public static boolean containElement(int[]arr, int val) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }

    // 5. Write a function to remove a specific element from an array
    public static int[] removeEle(int[] arr, int val){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                count++;
            }
        }

        int[] res = new int[count];
        int ind = 0;
        for (int num : arr) {

            if (num != val) {
                res[ind++] = num;
            }
        }
        return res;
    }

    // 6. Write a function to copy an array to another array
    public static int[] copyOfArray(int[] arr){
        int[] res = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }

    // 7. Write a function to insert an element at a specific position in the array
    public static int[] insertElement(int[] arr, int val, int pos) {
        int[] res = new int[arr.length + 1];

        for (int i = 0, j = 0; i < res.length; i++) {
            if (i == pos) {
                res[i] = val;
            } else {
                res[i] = arr[j++];
            }
        }
        return res;
    }

    // 8. Write a function to find the minimum and maximum value of an array
    public static void minAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        
        for(int num : arr){
            if(num < min){
                min = num; 
            }

            if (num > max){
                max = num;
            }
        }
        
        System.out.println("Minimum value - " + min);
        System.out.println("Maximum value - " + max);
    }

    // 9. Write a function to reverse an array of integer values
    public static int[] reverseOfArray(int[] arr){
        int len = arr.length;
        int[] res = new int[len];
        for(int i = 0; i<len; i++){
            res[len-1-i] = arr[i];
        }
        return res;
    }

    // 10. Write a function to find the duplicate values of an array
    public static void findDuplicate(int[] arr){
        System.out.println("Duplicates are : ");
        for(int i = 0; i < arr.length; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " ");
                    break;
                }
            }
        }
    }

    // 11. Write a program to find the common values between two arrays



    // 12. Write a method to remove duplicate elements from an array



    // 13. Write a method to find the second largest number in an array



    // 14. Write a method to find the second largest number in an array



    // 15. Write a method to find number of even number and odd numbers in an array



    // 16. Write a function to get the difference of largest and smallest value
    // 17. Write a method to verify if the array contains two specified elements(12,23)
    // 18. Write a program to remove the duplicate elements and return the new array
    // 19. Write a function to find the missing number of sorted array of 1 to 100


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Sum of array elements = " + sumOfArray(arr));
        System.out.println("Average of array elements = " + avgOfArray(arr));
        System.out.println("Index of Array = " + findIndex(arr, 40));
        System.out.println("Conatins elements in array = " + containElement(arr, 8));
        System.out.println("Remove specific element from array = " + Arrays.toString(removeEle(arr, 4)));
        System.out.println("Copy of array to another array = " + Arrays.toString(copyOfArray(arr)));
        System.out.println("Insert element at given position in an array = " + Arrays.toString(insertElement(arr, 12, 5)));
        minAndMax(arr);
        System.out.println("Reverse of an array = " + Arrays.toString(reverseOfArray(arr)));
        findDuplicate(arr);
    }
}   