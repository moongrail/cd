package grid75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length - 1;

        for (int i = length; i > 0; i--) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                if (nums[j] + nums[i] == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        }

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];

            if (hashMap.containsKey(secondNum)) {
                return new int[]{hashMap.get(secondNum), i};
            }

            hashMap.put(nums[i], i);
        }

        return new int[2];
    }
}
