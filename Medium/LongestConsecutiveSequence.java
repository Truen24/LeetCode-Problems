package Medium;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        // Java solution
        // Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
        // You must write an algorithm that runs in O(n) time.
        // Solution is O(2n) since I used the first for loop to add the items into the HashSet, with Python easily
        // a O(n) solution
        
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        int result = 1;

        for (int num : nums){
            set.add(num);
        } 

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                result = Math.max(count, result);
            }
        }
        return result;
    }
}
