package recursion.principle.pascalstriangle118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionRecursiveRow {
    public List<List<Integer>> generate(int numRows) {
        List triangle = new ArrayList<ArrayList<Integer>>();
        if (numRows < 1) {
            return triangle;
        }
        if (numRows == 1) {
            List<Integer> row = new ArrayList<>();
            row. add(1);
            triangle.add(row);
            return triangle;
        }
        if (numRows == 2) {
            List<Integer> row1 = new ArrayList<>();
            row1. add(1);
            List<Integer> row2= new ArrayList<>();
            row2. add(1);
            row2. add(1);
            triangle.add(row1);
            triangle.add(row2);
            return triangle;
        }
        List<List<Integer>> allButLast = generate(numRows - 1);
        int previous = allButLast.size() - 1;
        List<Integer> last = new ArrayList<>();
        last.add(1);
        for (int i = 0; i < allButLast.size() - 1; i++) {
            last.add(allButLast.get(previous).get(i) + allButLast.get(previous).get(i + 1));
        }
        last.add(1);
        allButLast.add(last);
        return allButLast;
    }

    public static void main(String[] args) {
        SolutionRecursiveRow solution = new SolutionRecursiveRow();
        List triangle = solution.generate(30);
        System.out.println(Arrays.toString(triangle.toArray()));
    }
}
