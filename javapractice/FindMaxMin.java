package javapractice;

import java.util.Arrays;
public class FindMaxMin {
//  Task1: Given an int array, write a method to find the biggest number.
//  Create a void method : findMax 
//  It should take an int array as parameter
//  And print the max biggest number in that array
//  e.g.
//  int list[] = { 1, 3, 24, 5, 6, -7, 5, 0, 10, 9, 19,1 };
//  Output: Max : 24
//  ============================
//  Task2: Given an int array, write a method to find the smallest number.
//  Create a void method : findMin 
//  It should take an int array as parameter
//  And print the smallest number in that array
//  e.g.
//       int list[] = { 1, 3, 24, 5, 6, -7 };
//  Output: Max : -7
    public static void main(String[] args) {
        int list[] = { 1, 3, 24, 5, 6, -7 };
        findMin(list);
        findMax(list);
    }
    public static void findMin(int[] nums) {
        Arrays.sort(nums);// Sorts the numbers from smallest to greatest: -7,1,3,5,6,24
        System.out.println("Min : " + nums[0]);// min number is in the 0 index
    }
    public static void findMax(int[] nums) {
        Arrays.sort(nums);// Sorts the numbers from smallest to greatest: -7,1,3,5,6,24
        System.out.println("Max : " + nums[nums.length - 1]);// max number is in the last index
    }
}
