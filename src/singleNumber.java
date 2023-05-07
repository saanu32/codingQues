import java.util.Scanner;

public class singleNumber {
    public static int singleNumbr(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
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

        int singleNum = singleNumbr(nums);
        System.out.println("The single number in the array is: " + singleNum);
    }
}
// TC O(n)
//SC O(1)