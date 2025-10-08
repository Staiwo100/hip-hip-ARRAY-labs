/*
Name: Samuel Taiwo
Date: 10/8/2025
Description:  This code takes an input and turns it into an array. Then it takes the max and min of the array and finds the difference.
*/

import java.util.Scanner;

public class MaxDifference {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        String intPrompt = getInput("Enter numbers: ");
        String[] stringList = intPrompt.split(" ");
        int[] intList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++){
            intList[i] = Integer.parseInt(stringList[i]);

        }

        maxDifference(intList);
    }
    public static void maxDifference(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int diff = (max - min);
        System.out.println("Maximum difference: " + diff);
    }

}
