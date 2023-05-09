import java.util.Scanner;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimal length of subarray: " + result);
    }
}

//time complexity O(n)
//space complexity  O(1)

