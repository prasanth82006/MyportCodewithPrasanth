
import java.util.*;

// public class DP {
//     public static boolean find(int arr[], int n, int target) {
//         boolean dp[][] = new boolean[n + 1][target + 1];
//         for (int i = 0; i <= n; i++) {
//             dp[i][0] = true;
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= target; j++) {
//                 if (arr[i - 1] <= j) {
//                     dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
//                 } else {
//                     dp[i][j] = dp[i - 1][j];
//                 }
//             }
//         }
//         return dp[n][target];
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         int target = 6;
//         System.out.println(find(arr, n, target));
//     }
// }
// class Solution {
//     public int fib(int n) {
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         return findallseries(n, dp);
//     }
//     private int findallseries(int n, int[] dp) {
//         if (n <= 1) {
//             return n;
//         }
//         if (dp[n] != -1) {
//             return dp[n];
//         }
//         dp[n] = findallseries(n - 1, dp) + findallseries(n - 2, dp);
//         return dp[n];
//     }
// }
// public class DP {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node reverse(Node head) {
//         Node prev = null;
//         Node next;
//         Node current = head;
//         while (current != null) {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         return prev;
//     }
//     public static void printList(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.println(curr.data);
//             curr = curr.next;
//         }
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         head = reverse(head);
//         System.out.println("Reversed Linked List:");
//         printList(head);
//     }
// }
class NextGreaterElement {

    public static void printNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }
        System.out.println(nge[1]);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 20, 25};
        printNextGreater(arr);
    }
}
