package org.example;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero,
shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place and do not return anything.
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/
public class duplicateZeroes {
    public int[] duplicateZero(int[] arr) {
        for (int i= 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // move All numbers 1 space to the right but not out of array index
                for (int j = arr.length -2; j >= i; j--){
                    arr[j+1] = arr[j];
                }
                // the next element is also 0, so we skip it by incrementing i;
                i++;
            }

        }
        for(int i: arr){
            System.out.println(i);
        }
        return arr;
    }
}
