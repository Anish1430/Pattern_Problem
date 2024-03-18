import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDequesProblemJava {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                ans[ri++] = nums[q.peek()];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input window size
        System.out.print("Enter the window size (k): ");
        int k = scanner.nextInt();

        // Calculate maximum sliding window
        int[] result = maxSlidingWindow(nums, k);

        // Output the result
        System.out.print("Maximum sliding window: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
