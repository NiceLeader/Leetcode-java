package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicate0217Test {

    void containsDuplicate(int[] nums, boolean expected) {
        boolean actual = new Solution().containsDuplicate(nums);
        assertEquals(expected, actual);
    }

    /**
     * nums =
     * [1,2,3,1]
     * Output:
     * true
     * Expected:
     * true
     */
    @Test
    void test1() {
        int[] nums = {1, 2, 3, 1};
        containsDuplicate(nums, true);
    }

    /**
     * nums =
     * [1,2,3,4]
     * Output:
     * true
     * Expected:
     * false
     */

    @Test
    void test2() {
        int[] nums = {1, 2, 3, 4};
        containsDuplicate(nums, false);
    }

    /**
     * nums =
     * [1,1,1,3,3,4,3,2,4,2]
     * Output:
     * false
     * Expected:
     * true
     **/
    @Test
    void test3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        containsDuplicate(nums, true);
    }


}