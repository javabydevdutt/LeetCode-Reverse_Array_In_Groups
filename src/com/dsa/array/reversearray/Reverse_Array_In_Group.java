package com.dsa.array.reversearray;
/*
This question is asked by google interview
        Input:- [1, 2, 3, 4, 5, 6, 7, 8]
        Output:- [3, 2, 1, 6, 5, 4, 8, 7]
    logic :- left=i; right=i+k-1, increment the i=i+k
*/

import java.util.Arrays;

public class Reverse_Array_In_Group {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println("Input:- " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i = i + k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            int temp;

            while (left <= right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }//while
        }//for
        System.out.println("Output:- " + Arrays.toString(arr));
    }//main
}//class
