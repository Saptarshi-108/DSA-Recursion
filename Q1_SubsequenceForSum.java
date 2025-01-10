//Question: Write a program to print all the subsequences/count of an array that add up to become the result, sum.

import java.util.ArrayList;
import java.util.List;

public class Q1_SubsequenceForSum {
    public static void findsubsequence(int[] arr, int sum) {
        List<Integer> current = new ArrayList<>();
        int count = subsequence(arr, 0, sum, current);
        System.out.println("Total number of sequences possible: " + count);
    }

    public static int subsequence(int[] arr, int index, int target, List<Integer> current) {
        if (index == arr.length) {
            if (target == 0) {
                System.out.println(current);
                return 1;
            }
            return 0;
        }

        // Include the current element
        current.add(arr[index]);
        int include = subsequence(arr, index + 1, target - arr[index], current);

        // Exclude the current element
        current.remove(current.size() - 1);
        int exclude = subsequence(arr, index + 1, target, current);

        return include + exclude;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        System.out.println("Subsequences with sum " + target + ":");
        findsubsequence(arr, target);
    }
}
