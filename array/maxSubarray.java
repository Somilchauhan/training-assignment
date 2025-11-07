package array;
// Problem 53 of leetcode : Maximum Subarray

import java.util.Scanner;

public class maxSubarray {

    public int maxSubArr(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currSum = (nums[i] > currSum + nums[i]) ? nums[i] : currSum + nums[i];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxSubarray ms = new maxSubarray();
        int result = ms.maxSubArr(arr);
        System.out.println(result);
    }
}
