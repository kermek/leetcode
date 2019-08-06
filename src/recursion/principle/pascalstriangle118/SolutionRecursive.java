package recursion.principle.pascalstriangle118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRecursive {
    public List<List<Integer>> generate(int numRows) {
        List triangle = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            List row = new ArrayList<Integer>();
            for (int j = 1; j <= i; j++) {
                row.add(f(i, j));
            }
            triangle.add(row);
        }
        return triangle;
    }

    private int f(int i, int j) {
        if (i <= 0 || j <= 0) {
            return 0;
        }
        if (j == 1 || i == j) {
            return 1;
        }
        return f(i - 1, j - 1) + f(i - 1, j);
    }

    public static void main(String[] args) {
        SolutionRecursive solution = new SolutionRecursive();
        List triangle = solution.generate(30);
        System.out.println(Arrays.toString(triangle.toArray()));
    }
}
