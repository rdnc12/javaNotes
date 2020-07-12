package javapractice;

import java.util.Arrays;
public class SortStringsArray {
    public static void main(String[] args) {
//      Create a string array : monthOfYear and add the months
//      Use main method
//      Task1: Soft the whole list and print them all in alphabetical order-CASE SENSITIVE
//      E.g
//      String[] monthOfYear = { "Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "aug", "Sep", "Oct", "Nov", "Dec" }; 
//      Output: Apr Dec Feb Jan Jul Jun Mar Nov Oct Sep aug may
//      Task2: Sort the whole list ignoring case and print them all-CASE INSENSITIVE
//      Output: Apr aug Dec Feb Jan Jul Jun Mar may Nov Oct Sep 
        String[] monthOfYear = { "Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "aug", "Sep", "Oct", "Nov", "Dec" };
        System.out.println("TASK 1: Printing alphabetical order-CASE SENSITIVE");
        
        //sort method sorts arrays based on ascii table from smallest to greatest
        Arrays.sort(monthOfYear);
        for (String month : monthOfYear) {
            System.out.print(month + " ");//printing each month in the array
        }
        System.out.println();//Going to the next line
        System.out.println(Arrays.toString(monthOfYear));//printing as an array
        
        System.out.println("TASK 2: Printing alphabetical order-CASE INSENSITIVE");
        //sort and String.CASE_INSENSITIVE_ORDER sorts based on alpabetical order.
        //This method ignore the case sensitivity
        Arrays.sort(monthOfYear, String.CASE_INSENSITIVE_ORDER);
        for (String month : monthOfYear) {
            System.out.print(month + " ");//printing each month in the array
        }
        System.out.println();//Going to the next line
        System.out.println(Arrays.toString(monthOfYear));//printing as an array
    }
}

