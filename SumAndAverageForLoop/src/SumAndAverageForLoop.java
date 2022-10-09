/*
Mosammad Kabir
Professor Debello
CUS 1115
April 11, 2021
 */

import java.util.Scanner;

public class SumAndAverageForLoop {
    public static void main(String[] args) {
        //using a for loop to calculate sum and average
        // using inputs from a keyboard/
        //Steps to calculate the sum and average using a loop interactively
        // ^ assuming Scanner is imported and created
        // Step 1: You must assign the 1st sum to be either 0 or 0.0
        // depending if working with integers or decimals
        // Step 2: Create the loop you want to work with for the calculation
        // Step 3: Interactively get a value by asking a question and taking in the input
        // Step 4: Add that value to the previous sum
        // Step 5: Output the sum outside of the loop
        // Step 6: You can also output the average outside of the loop
        // */

        Scanner kb = new Scanner(System.in);
        int sum = 0;//Step 1
        int numTimes = 3;
        for (int i = 1; i <= numTimes; i++)
        //Step 2
        {
            System.out.print("Enter an integer:");
            int val = kb.nextInt();
            sum = sum + val;
        }
        System.out.println("Sum is " + sum);//Step 5
        System.out.println("Average is " + (sum) / numTimes);//Step 6
    }}
    /*
Enter an integer:5
Enter an integer:5
Enter an integer:5
Enter an integer:5
Enter an integer:5
Sum is 25
Average is 5
     */