package Medium;


public class MaximumSubarray {
    
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // Output: 6
        // Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        System.out.println("Correct output should be 6: " + maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        // initialize variables we need max and current sum
        int max = nums[0];
        int currentSum = 0;

        // Starting loop, need to reset currentsum to 0 everytime it becomes negative
        for(int i = 0; i < nums.length; i++) {
            if(currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            max = Math.max(currentSum, max);
        }

        return max;
    }

}
