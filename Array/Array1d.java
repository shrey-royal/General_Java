// import java.util.Scanner;
// import java.util.Random;
import java.util.*;

public class Array1d {
    public static void main(String[] args) {        
        // int arr[] = new int[10];
        // int arr[];
        // arr = new int[10];

        int arr[] = {326, 81, 719, 125, 782, 504, 465, 708, 407, 767};

        //Generating array of random elements
        // Random r = new Random();
        // for(int i=0; i<10; i++) {
        //     arr[i] = r.nextInt(1000);
        // }


        // for (int i = 0; i < 10; i++) {
        //     System.out.println("arr[" + i + "] = " + arr[i]);
        //     // System.out.print(arr[i] + ", ");
        // }

        for (int i : arr) {
            System.out.print(i + ", ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter the element to search: ");
        int key = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index " + i);
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("Element not found");
        }
    }
}

/*
Tasks:

> Write a Java program to find the maximum and minimum value of an array.
> Write a Java program to reverse an array of integer values.
> Write a Java program to find duplicate values in an array of integer values.
> Write a Java program to find duplicate values in an array of string values.
> Write a Java program to find common elements between two arrays (string values).
> Write a Java program to find common elements between two integer arrays.
> Write a Java program to remove duplicate elements from an array.
> Write a Java program to find the second largest element in an array.
> Write a Java program to find the second smallest element in an array.

Duplicate array: {326, 81, 719, 125, 782, 504, 465, 708, 407, 767, 326, 81, 719, 125}

Test Cases:

1. Find the maximum and minimum value of an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: Maximum: 9, Minimum: 1

int[] array2 = {0, 0, 0, 0, 0};
// Test case 2
// Expected output: Maximum: 0, Minimum: 0


2. Reverse an array of integer values:

int[] array = {1, 2, 3, 4, 5};
// Test case 1
// Expected output: [5, 4, 3, 2, 1]

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: [50, 40, 30, 20, 10]


3. Find duplicate values in an array of integer values:

int[] array = {1, 2, 2, 3, 4, 4, 5};
// Test case 1
// Expected output: [2, 4]

int[] array2 = {10, 20, 30, 10, 40, 30, 50};
// Test case 2
// Expected output: [10, 30]


4. Find duplicate values in an array of string values:

String[] array = {"apple", "banana", "cherry", "banana", "date"};
// Test case 1
// Expected output: ["banana"]

String[] array2 = {"apple", "banana", "cherry", "date", "apple"};
// Test case 2
// Expected output: ["apple"]


5. Find common elements between two arrays (string values):

String[] array1 = {"apple", "banana", "cherry", "date"};
String[] array2 = {"banana", "date", "grape", "kiwi"};
// Test case 1
// Expected output: ["banana", "date"]

String[] array3 = {"apple", "banana", "cherry"};
String[] array4 = {"date", "grape", "kiwi"};
// Test case 2
// Expected output: []


6. Find common elements between two integer arrays:

int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {4, 5, 6, 7, 8};
// Test case 1
// Expected output: [4, 5]

int[] array3 = {1, 2, 3};
int[] array4 = {4, 5, 6};
// Test case 2
// Expected output: []


7. Remove duplicate elements from an array:

int[] array = {1, 2, 2, 3, 4, 4, 5};
// Test case 1
// Expected output: [1, 2, 3, 4, 5]

int[] array2 = {10, 20, 30, 10, 40, 30, 50};
// Test case 2
// Expected output: [10, 20, 30, 40, 50]


8. Find the second largest element in an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: 7

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: 40


9. Find the second smallest element in an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: 3

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: 20


You can use these test cases to verify the correctness of your Java programs.


*/