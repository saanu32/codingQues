import java.util.Arrays;
import java.util.Scanner;

public class moveZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the moveZeroes method to modify the array
        moveZeroesToEnd(nums);

        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }

    public static void moveZeroesToEnd(int[] nums) {
        int i = 0; // index for non-zero elements

        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        // Fill the remaining elements with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}

