package recursion.principle.reversestring344;

public class Solution {
    public void reverseString(char[] s) {
        helper(0, s);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= (str.length / 2)) {
            return;
        }
        helper(index + 1, str);
        char temp = str[index];
        str[index] = str[str.length - index - 1];
        str[str.length - index - 1] = temp;
    }
}