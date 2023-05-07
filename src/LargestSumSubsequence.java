import java.util.*;

public class LargestSumSubsequence {
    public static int[] findLargestSumSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        // Add all elements to the max heap
        for (int num : nums) {
            maxHeap.add(num);
        }

        int[] subsequence = new int[k];
        int i = 0;

        // Extract the k largest elements from the max heap
        while (k > 0) {
            subsequence[i] = maxHeap.poll();
            i++;
            k--;
        }

        return subsequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array size and elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the value of k
        System.out.print("Enter the length of the subsequence (k): ");
        int k = scanner.nextInt();

        // Find the subsequence with the largest sum
        int[] subsequence = findLargestSumSubsequence(nums, k);

        // Print the result
        System.out.println("The subsequence with the largest sum is: " + Arrays.toString(subsequence));
    }
}
