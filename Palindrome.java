import java.util.Scanner;

public class Solution {

    public static boolean palindrome(int i, String s) {
        int n = s.length();
        if (i >= n / 2) return true;
        if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean ans = palindrome(0, s);
        System.out.println("Is palindrome: " + ans);
        sc.close();
    }
}
