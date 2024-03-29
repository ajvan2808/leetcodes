package org.example;


/*
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
* and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
* Merge nums1 and nums2 into a single array sorted in non-decreasing order.
* The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
* To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
* and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
public class mergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length < m + n) {
            // Resize the array
            int[] temp = new int[m + n];
            int length = temp.length;
            for (int j = 0; j < length; j++) {
                temp[j] = nums1[j];
            }
            nums1 = temp;
        }

        m -= 1;
        n -= 1;
        // walkthrough array backward
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (n < 0)
                break;
            else if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (nums1[m] >= nums2[n]) {
                nums1[i] = nums1[m--];
            } else
                nums1[i] = nums2[n--];
        }
        return nums1;
    }

}

