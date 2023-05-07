import java.util.Scanner;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int peakIndex = findPeakElement(nums);
        int peakElement = nums[peakIndex];

       // System.out.println("Peak element: " + peakElement);
        System.out.println("Peak index: " + peakIndex);
    }
}
// time complexity O(log n)
//space complexity O(1)