// Leetcode Problem 1480: Running Sum of 1d Array

import java.util.Scanner;

public class running_sum_array {
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] result = runningSum(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}