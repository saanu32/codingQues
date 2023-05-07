import java.util.*;

public class DivideArrayIntoPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = canDivideIntoPairs(nums);
        System.out.println("Output: " + result);
    }

    public static boolean canDivideIntoPairs(int[] nums) {
        if (nums.length % 2 != 0) {
            return false; // If the array length is odd, it can't be divided into pairs
        }

        Arrays.sort(nums); // Sort the array in ascending order

        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false; // If the elements in a pair are not equal, return false
            }
        }

        return true;
    }
}
//time complexity of the code is O(n log n), and the space complexity is O(n).
