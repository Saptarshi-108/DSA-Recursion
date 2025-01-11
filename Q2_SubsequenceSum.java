
// Question: Write a program to print any one subsequence of an array that add up to become the sum that is given as input k.
import java.util.ArrayList;
import java.util.List;

public class Q2_SubsequenceSum {

    public static boolean findSubsequence(int[] arr, int index, int target, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return true;
        }
        if (index == arr.length || target < 0) {
            return false;
        }

        // Include the current element
        current.add(arr[index]);
        if (findSubsequence(arr, index + 1, target - arr[index], current)) {
            return true;
        }

        // Exclude the current element
        current.remove(current.size() - 1);
        return findSubsequence(arr, index + 1, target, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        List<Integer> current = new ArrayList<>();

        if (!findSubsequence(arr, 0, target, current)) {
            System.out.println("No subsequence found with the given sum.");
        }
    }
}
