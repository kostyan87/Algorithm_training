package lection1;

import java.util.Scanner;

public class MakingPalindromes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(getMinSum(s));
    }

    public static int getMinSum(String s) {
        int middle, right, left;
        if (s.length() == 1) return 0;
        if (s.length() % 2 == 0) {
            right = s.length() / 2;
            left = right - 1;
        }
        else {
            middle = s.length() / 2;
            right = middle + 1;
            left = middle - 1;
        }
        return calculateSum(s, right, left);
    }

    public static int calculateSum(String s, int right, int left) {
        int minSum = 0;
        while (left >= 0) {
            if (s.charAt(left) != s.charAt(right)) {
                minSum++;
            }
            right++;
            left--;
        }
        return minSum;
    }
}
