package recursion.principle.pascalstriangle118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRecursiveRowImproved {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows < 1) {
            return triangle;
        }
        List row = new ArrayList<>(Arrays.asList(1));
        if (numRows > 1) {
            triangle = generate(numRows - 1);
            for (int i = 0; i < numRows - 2; i++) {
                row.add(triangle.get(numRows - 2).get(i) + triangle.get(numRows - 2).get(i + 1));
            }
            row.add(1);
        }
        triangle.add(row);
        return triangle;
    }

    public static void main(String[] args) {
        SolutionRecursiveRowImproved solution = new SolutionRecursiveRowImproved();
        List triangle = solution.generate(30);
        System.out.println(Arrays.toString(triangle.toArray()));
    }
}
