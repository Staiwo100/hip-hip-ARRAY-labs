/*
Name: Samuel Taiwo
Date: 10/2/2025
Description:  This code this a array of 15 integers and splits them up into list of even and odd
*/

import java.util.Scanner;

public class EvenOddSplitter {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void getEvens(int[] arr){
        int[] arrEven = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arrEven[count++] = arr[i];
            }
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < arrEven.length; i++){
            if (arrEven[i] != 0) {
                System.out.print(arrEven[i] + " ");
            }
        }
        System.out.println();
    }
    public static void getOdds(int[] arr){
        int[] arrOdd = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arrOdd[count++] = arr[i];
            }
        }
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < arrOdd.length; i++){
            if (arrOdd[i] != 0 ){
                System.out.print(arrOdd[i] + " ");
            }

        }
        System.out.println();
    }


    public static void main(String[] args) {
        String intPrompt = getInput("Enter 15 integers with one space between each integer: ");
        String[] stringList = intPrompt.split(" ");
        int[] intList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++){
            intList[i] = Integer.parseInt(stringList[i]);

        }
        getEvens(intList);
        getOdds(intList);
    }

}
