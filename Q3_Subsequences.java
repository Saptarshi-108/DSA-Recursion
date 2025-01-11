
// Question: Write a program to print count of all subsequence of an array that add up to become the sum that is given as input k.

public class Q3_Subsequences {

    public static int countSubsequences(int[] arr, int index, int target) {
        if (target == 0) {
            return 1; // Found a valid subsequence
        }
        if (index == arr.length || target < 0) {
            return 0; // No valid subsequence possible
        }

        // Include the current element in the subsequence
        int include = countSubsequences(arr, index + 1, target - arr[index]);

        // Exclude the current element from the subsequence
        int exclude = countSubsequences(arr, index + 1, target);

        return include + exclude;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        int count = countSubsequences(arr, 0, target);
        System.out.println("Total number of subsequences with sum " + target + ": " + count);
    }
}

