package Medium;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        // My solution to the medium difficulty leetcode problem
        
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] output_array = new int[nums.length];

        output_array[0] = 1;

        // nums[] = [1,2,3,4]

        // build left side first -> [1,1,2,6]
        for(int i = 1; i < nums.length; i++) {
            output_array[i] = output_array[i-1] * nums[i-1];
        }

        // build right side now -> [24,12,8,6]
        int right = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            output_array[i] = output_array[i] * right;
            right = right * nums[i]; 
        }

        return output_array;
    }
}
