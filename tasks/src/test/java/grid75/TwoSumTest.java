package grid75;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testOne() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        assertArrayEquals(new int[]{2, 4}, TwoSum.twoSum(nums, target));
    }

    @Test
    void testTwo() {
        int[] nums = {2, 7, 11, 15, 16, 18};
        int target = 20;
        assertArrayEquals(new int[]{0, 5}, TwoSum.twoSum(nums, target));
    }

    @Test
    void testThird() {
        int[] nums = {2};
        int target = 20;
        assertArrayEquals(new int[]{0, 0}, TwoSum.twoSum(nums, target));
    }

}