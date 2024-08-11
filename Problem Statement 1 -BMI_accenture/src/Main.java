
/*     PROBLEM STATMENT

A person’s body mass index is a simple calculation based on height and weight that classifies the person as underweight, overweight, or normal. The formula for metric unit is,

BMI = weight in kilograms / (height in meters)2

You are given a function,

Int GetBMICategory(int weight, float height);

The function accepts the weight (an integer number) and height (a floating point number) of a person as its arguments. Implement the function such that it calculations the BMI of the person and returns an integer, the person’s BMI category as per the given rules:

If BMI < 18, return 0.
If 18 >= BMI < 25, return 1.
If 25 >= BMI <30, return 2.
If 30 >= BMI < 40, return 3.
If BMI >= 40, return 4.
Note:

Weight > 0 and its unit is kilogram.
Height > 0 and its unit is metre.
Compute BMI as a floating-point.
Example : Input:

42

1.54

Output:

0
 */


import java.util.Scanner;
class problem_1 {
    public int GetBMICategory(int weight, double height) {

        double bmi = weight / (height * height);

        if (bmi < 18) {

            return 0;

        } else if (bmi >= 18 && bmi < 25) {

            return 1;

        } else if (bmi >= 25 && bmi < 30) {

            return 2;

        } else if (bmi >= 30 && bmi < 40) {

            return 3;

        } else {

            return 4;

        }
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the bmi: ");
        int weight = sc.nextInt();
        System.out.println("Enter the height of the bmi: ");
        double height = sc.nextDouble();
      problem_1 p= new problem_1();

        int res = p.GetBMICategory(weight, height);

        System.out.println("result" + res );

        System.out.println(res);
    }
}




//******************************** PROBLEM _02***************************************************









/*
Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
Output:

4

Explanation:
Total amount of food required for all rats = r * unit

= 7 * 2 = 14.

The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.

*/


// Import the java.util package for using arrays and other utility classes
import java.util.*;

// Define a class named Problem_2
class Problem_2 {
    // Define a static method named calculate that takes three parameters: r, unit, and arr
    public static int calculate(int r, int unit, int[] arr) {
        // Check if the input array is null
        if (arr == null) {
            // Return -1 if the array is null
            return -1;
        }

        // Calculate the total amount of food required for all rats
        int totalFoodRequired = r * unit;

        // Initialize variables to store the cumulative sum and house count
        int sum = 0;
        int count = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Add the current house's food to the cumulative sum
            sum += arr[i];

            // Increment the house count
            count++;

            // Check if the cumulative sum is sufficient for all rats
            if (sum >= totalFoodRequired) {
                // Return the house count if the sum is sufficient
                return count;
            }
        }

        // Return 0 if the loop completes without finding a sufficient cumulative sum
        return 0;
    }
}

// Define the main class
public class Main {
    // Define the main method
    public static void main(String[] args) {
        // Print a welcome message (not necessary in this case)
        // System.out.print("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size");
        int n= sc.nextInt();
        int[] arr = new int[n]; // Sample array input
        System.out.printf("enter the number of rats");
        int r=sc.nextInt();
        System.out.printf("Enter the amount of food");
        int unit=sc.nextInt();
        // Create an instance of the Problem_2 class
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        // Call the calculate method with the user input
        int result = Problem_2.calculate(r, unit, arr);

        // Print the result
        System.out.println("Result: " + result);
    }
}















