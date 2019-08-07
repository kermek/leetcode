package recursion.principle.pascalstriangle119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        if (rowIndex < 0) {
            return row;
        }
        row.add(1);
        if (rowIndex > 0) {
            List<Integer> top = getRow(rowIndex - 1);
            for (int i = 1; i < rowIndex; i++) {
                row.add(top.get(i - 1) + top.get(i));
            }
            row.add(1);
        }
        return row;
    }
}
