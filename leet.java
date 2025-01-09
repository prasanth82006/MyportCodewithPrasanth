import java.util.*;
// class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         for (int i = 0; i < n - 2; i++) {
//             if (i > 0 && arr[i] == arr[i - 1]) {
//                 continue;
//             }
//             int left = i + 1;
//             int right = n - 1;
//             while (left < right) {
//                 int sum = arr[i] + arr[left] + arr[right];
//                 if (sum == 0) {
//                     System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
//                     while (left < right && arr[left] == arr[left + 1]) left++;
//                     while (left < right && arr[right] == arr[right - 1]) right--;

//                     left++;
//                     right--;
//                 } else if (sum < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }
//     }
// }

// class Solution {
//      public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          int arr[]=new int[n];
//          for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//          }
//          int count=0;
//          for(int i=0;i<n;i++){
//                if(arr[i]>arr[(i+1)%n]){
//                     count++;
//                }
//          }
//          if(count==1){
//                System.out.println("YES");
//          }
//          else{
//                System.out.println("NO");
//          }
//      }
// }

// class Solution {
//      public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          int arr[]=new int[n];
//          int arr1[]=new int[n];
//          for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//          }
//          for(int i=0;i<n;i++){
//                arr1[i]=arr[i];
//          }
//          int a=sc.nextInt();
//          for(int i=0;i<n;i++){
//                for(int j=1;j<=a;j++){
//                     arr[i]=arr1[(n-i-1)%n];
//                }
//          }
//          System.out.println(Arrays.toString(arr));
//      }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Map<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
//         }
//         int q = sc.nextInt();
//         while (q-- > 0) {
//             int number = sc.nextInt();
//             System.out.println("->"+frequencyMap.getOrDefault(number, 0));
//         }

//         sc.close();
//     }
// }

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int[] hash = new int[100001];
//         for (int i = 0; i < n; i++) {
//             hash[arr[i]]++;
//         }

//         boolean found = false;
//         for (int i = 0; i < n; i++) {
//             if (hash[arr[i]] > n / 2) {
//                 System.out.println(arr[i]);
//                 found = true;
//                 break;
//             }
//         }
//         if (!found) {
//             System.out.println("NULL");
//         }
//     }
// }



// class Solution{
//      public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           int n=sc.nextInt();
//           int arr[]=new int[n];
//           for(int i=0;i<n;i++){
//                arr[i]=sc.nextInt();
//           }
//           int sum=0;
//           for(int i=0;i<n;i++){
//                for(int j=0;j<i;j++){
//                     sum+=arr[j];
//                }
//           }
//      }
// }

// public class Solution {

//     public static int product(int arr[], int start, int end) {
//         int product = 1;
//         for (int i = start; i <= end; i++) {
//             product *= arr[i];
//         }
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int maxProd = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int prodArr = product(arr, i, j);
//                 if (prodArr > maxProd) {
//                     maxProd = prodArr;
//                 }
//             }
//         }

//         System.out.println(maxProd);
//     }
// }

// public class Solution {

//     public static void main(String[] args) {
     //    Scanner sc=new Scanner(System.in);
     //    int n=sc.nextInt();
     //    int arr[]=new int[n];
     //    for(int i=0;i<n;i++){
     //        arr[i]=sc.nextInt();
     //    }
//         int target=sc.nextInt();
     //    int count=0;
     //    for(int i=0;i<n;i++){   
     //        int sum=0;
     //        for(int j=i;j<n;j++){
     //            sum+=arr[j];
     //            if(sum==target){
     //                count++;
     //            }
     //        }
     //    }
     //    System.out.print(count);
//     }
// }



// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int min=arr[0];
//         int profit=0;
//         for(int i=0;i<n;i++){
//             int cost=arr[i]-min;
//             profit=Math.max(cost,profit);
//             min=Math.min(arr[i],min);
//         }
//         System.out.print(profit);
//     }
// }