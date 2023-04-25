package Easy;
import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args) {
        // nums = [2,7,11,15], target = 9
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("Target is 9 and output should be [0,1]" + twoSum(nums, target));
    }

    // Code solution for twoSum

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int keyPair = target - nums[i]; // 7 -> 2
            if(myMap.containsKey(keyPair)) {
                return new int[] {myMap.get(keyPair), i};
            }
            myMap.put(nums[i], i); // [2, 0] -> [7, 1]
        }
        return nums;
    }

}
