package arrays.rotate189;

import java.util.Arrays;

class SolutionThird {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        int k = 1;
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
//        int[] nums = {1, 2};
//        int k = 1;
//        int[] nums = {1, 2, 3};
//        int k = 4;
//        int[] nums = {1};
//        int k = 1;
//        int[] nums = {1, 2, 3, 4, 5, 6};
//        int k = 2;
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 4;
        SolutionThird solutionFirst = new SolutionThird();
        solutionFirst.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0) return;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}