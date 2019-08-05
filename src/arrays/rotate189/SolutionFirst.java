package arrays.rotate189;

import java.util.Arrays;

class SolutionFirst {

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
        SolutionFirst solutionFirst = new SolutionFirst();
        solutionFirst.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0) return;
        k = k % nums.length;
        int n = nums.length;
        int m = 0;
        int l = n - 1;
        while (m < n) {
            int x = nums[l];
            int i = l;
            int j;
            do {
                for (j = i; j >= k; j = j - k) {
                    nums[j] = nums[j - k];
                    m++;
                }
                i = Math.abs((n - (k - j)) % n);
                nums[j] = nums[i];
                m++;
            } while (i != l);
            nums[j] = x;
            l--;
        }
    }
}