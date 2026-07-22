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
        System.out.print("Duplicates are : ");
        for(int i = 0; i < arr.length; i++){
            for ( int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    // 11. Write a program to find the common values between two arrays
    public static void commonValues(int[] arr1, int[] arr2){
        System.out.print("Common values = ");
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    // 12 & 18. Write a method to remove duplicate elements from an array
    public static void removeDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr){
            set.add(num);
        }

        int[] res = new int[set.size()];
        int ind = 0;

        for(int n : set){
            res[ind++] = n;
        }
        System.out.println("Array after removing duplicates = " + Arrays.toString(res));
    }

    // 13 & 14. Write a method to find the second largest number in an array
    public static void secLargest(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second largest element = " + arr[arr.length - 2]);
    }

    // 15. Write a method to find number of even number and odd numbers in an array
    public static void countEvenAndOdd(int[] arr){
        int evenCount = 0;
        int oddCount =0;

        for(int num : arr){
            if(num%2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        System.out.println("Number of even numbers = " + evenCount);
        System.out.println("Number of odd numbers = " + oddCount);
    }

    // 16. Write a function to get the difference of largest and smallest value
    public static int diffBtnLarSmallest(int[] arr){
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
        return max-min;
    }


    // 17. Write a method to verify if the array contains two specified elements(12,23)
    public static boolean containsSpecificEle(int[]arr) {
        boolean has12 = false;
        boolean has23 = false;

        for(int num : arr){
            if (num == 12){
                has12 = true;
            }

            if (num == 23){
                has23 = true;
            }
        }
        return has12 && has23;
    }

    // 19. Write a function to find the missing number of sorted array of 1 to 100
    public static int findMissingNumber(int[] arr) {
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 9, 10, 9};
        int[] arr1 = {5, 2, 7, 9, 2, 3, 0, 3};
        int[] arr2 = {1, 2, 4, 6, 9, 0, 3, 8, 7, 6};

        System.out.println("Sum of array elements = " + sumOfArray(arr));
        System.out.println("Average of array elements = " + avgOfArray(arr));
        System.out.println("Index of Array = " + findIndex(arr, 40));
        System.out.println("Conatins elements in array =                    " + containElement(arr, 8));
        System.out.println("Remove specific element from array = " + Arrays.toString(removeEle(arr, 4)));
        System.out.println("Copy of array to another array = " + Arrays.toString(copyOfArray(arr)));
        System.out.println("Insert element at given position in an array = " + Arrays.toString(insertElement(arr, 12, 5)));
        minAndMax(arr);
        System.out.println("Reverse of an array = " + Arrays.toString(reverseOfArray(arr)));
        findDuplicate(arr);
        System.out.println();
        commonValues(arr1, arr2);
        System.out.println();
        removeDuplicate(arr);
        secLargest(arr);
        countEvenAndOdd(arr);
        diffBtnLarSmallest(arr);
        System.out.println("Array contains specific numbers 12 & 23 = " + containsSpecificEle(arr));
        System.out.println("Missing numbers from 1 to 100 are : " + findMissingNumber(arr));
    }
}   