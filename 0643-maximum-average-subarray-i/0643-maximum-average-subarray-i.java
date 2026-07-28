class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate sum of the first window
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        // Step 2: Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return max average
        return maxSum / k;
    }
}