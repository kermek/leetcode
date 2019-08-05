package arrays.rotate189;

import java.util.Arrays;

class SolutionSecond {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 1;
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
//        int[] nums = {1, 2, 3, 4, 5, 6};
//        int k = 4;
        SolutionSecond solutionFirst = new SolutionSecond();
        solutionFirst.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0) return;
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}