// class Node{
//      int data,height;
//      Node left,right;
//      Node(int data){
//           this.data=data;
//           this.right=null;
//           this.left=null;
//           this.height=1;
//      }
// }
// public class AVL{
//      Node root;
//      public int  height(Node n){
//           if(n==null){
//                return 0;
//           }
//           return n.height;
//      }
//      public int getBalance(Node n){
//           if(n==null){
//                return 0;
//           }
//           return height(n.left)-height(n.right);
//      }
//      public Node rightrotate(Node y){
//           Node x=y.left;
//           Node z=x.right;
//           x.right=y;
//           y.left=z;
//           y.height=1+Math.max(height(y.left),height(y.right));
//           x.height=1+Math.max(height(x.left),height(x.right));
//           return x;
//      }
//      public Node leftrotate(Node x){
//           Node y=x.right;
//           Node z=y.left;
//           y.left=x;
//           x.right=z;
//           x.height=1+Math.max(height(x.left),height(x.right));
//           y.height=1+Math.max(height(y.left),height(y.right));
//           return y;
//      }
//      public Node insert(Node n,int data){
//           if(n==null){
//                return new Node(data);
//           }
//           if(data<n.data){
//                n.left=insert(n.left, data);
//           }
//           else if(data>n.data){
//                n.right=insert(n.right, data);
//           }
//           else{
//                return n;
//           }
//           n.height=1+Math.max(height(n.left),height(n.right));
//           int balance=getBalance(n);
//           if(balance>1 && data<n.left.data){
//                return rightrotate(n);
//           }
//           if(balance<-1 && data>n.right.data){
//                return leftrotate(n);
//           }
//           if(balance>1 && data>n.left.data){
//                n.left=leftrotate(n.left);
//                return rightrotate(n);
//           }
//           if(balance<-1 && data<n.right.data){
//                n.right=rightrotate(n.right);
//                return leftrotate(n);
//           }
//           return n;
//      }
//      public void display(Node root) {
//           if (root != null) {
//               System.out.println(root.data);
//               display(root.left);
//               display(root.right);
//           }
//       }
//      public static void main(String[] args) {
//           AVL avl = new AVL();
//           Node root = null;
//           root = avl.insert(root, 10);
//           root = avl.insert(root, 20);
//           root = avl.insert(root, 30);
//           root = avl.insert(root, 40);
//           root = avl.insert(root, 50);
//           root = avl.insert(root, 25);
//           avl.display(root);
//      }
// }

// class Node{
//      int data;
//      int height;
//      Node left;
//      Node right;
//      Node(int data){
//           this.data=data;
//           this.height=1;
//           this.left=this.right=null;
//      }
// }
// public class AVL {
//      Node root;
//      public int height(Node n){
//           if(n==null){
//                return 0;
//           }
//           return n.height;
//      }
//      public int getBalance(Node n){
//           if(n==null){
//                return 0;
//           }
//           return height(n.left)-height(n.right);
//      }
//      public Node leftrotate(Node x){
//           Node y=x.right;
//           Node z=y.left;
//           x.right=z;
//           y.left=x;
//           x.height=Math.max(height(x.left),height(x.right))+1;
//           y.height=Math.max(height(y.left),height(y.right))+1;
//           return y;
//      }
//      public Node rightrotate(Node y){
//           Node x=y.left;
//           Node z=x.right;
//           y.left=z;
//           x.right=y;
//           x.height=Math.max(height(x.left),height(x.right))+1;
//           y.height=Math.max(height(y.left),height(y.right))+1;
//           return x;
//      }
//      public Node insert(Node n,int data){
//           if(n==null){
//                return new Node(data);
//           }
//           if(data<n.data){
//                n.left=insert(n.left, data);
//           }
//           else if(data>n.data){
//                n.right=insert(n.right, data);
//           }
//           else{
//                return n;
//           }
//           n.height=1+Math.max(height(n.left),height(n.right))+1;
//           int balance=getBalance(n);
//           if(balance>1 && data<n.left.data){
//                return rightrotate(n);
//           }
//           if(balance<-1 && data>n.right.data){
//                return leftrotate(n);
//           }
//           if(balance>1 && data>n.left.data){
//                n.left=leftrotate(n);
//                return rightrotate(n);
//           }
//           if(balance<-1 && data<n.right.data){
//                n.right=rightrotate(n);
//                return leftrotate(n);
//           }
//           return n;
//      }
//      public Node search(Node n,int data){
//           if(n==null){
//                return null;
//           }
//           if(data<n.data){
//                return search(n.left, data);
//           }
//           else if(data>n.data){
//                return search(n.right, data);
//           }
//           return n;
//      }
//      public Node inorderSuccessor(Node n){
//           if(n.left!=null){
//                n=n.left;
//           }
//           return n;
//      }
//      public Node delete(Node root,int data){
//           if(root==null){
//                return root;
//           }
//           if(data<root.data){
//                root.left=delete(root.left, data);
//           }
//           else if(data>root.data){
//                root.right=delete(root.right, data);
//           }
//           else{
//                if(root.left==null){
//                     return root.right;
//                }
//                else if(root.right==null){
//                     return root.left;
//                }
//                else{
//                     Node min=inorderSuccessor(root.right);
//                     root.data=min.data;
//                     root.right=delete(root.right, min.data);
//                }
//           }
//           root.height=1+Math.max(height(root.left),height(root.right));
//           int balance=getBalance(root);
//           if (balance > 1 && getBalance(root.left) > 0)
//                return rightrotate(root);
//           if (balance > 1 && getBalance(root.left) < 0) {
//                root.left = leftrotate(root.left);
//                return rightrotate(root);
//       }
//       if (balance < -1 && getBalance(root.right) < 0)
//           return leftrotate(root);
//       if (balance < -1 && getBalance(root.right) > 0) {
//           root.right = rightrotate(root.right);
//           return leftrotate(root);
//       }
//       return root;
//   }
//      public void display(Node n){
//           if(n!=null){
//                System.out.println(n.data);
//                display(n.left);
//                display(n.right);
//           }
//      }
//      public static void main(String[] args) {
//           AVL a=new AVL();
//           Node root=null;
//           root=a.insert(root,10);
//           root=a.insert(root,20);
//           root=a.insert(root,30);
//           root=a.insert(root,40);
//           root=a.insert(root,50);
//           // root=a.delete(root, 20);
//           a.display(root);
//           if(a.search(root,20)!=null){
//                System.out.println("The Node is Found");
//           }
//           else{
//                System.out.println("The Node is Not Found");
//           }
//      }
// }
import java.util.Arrays;

class Solution {

    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        Solution s = new Solution();
        s.sort012(arr);
        System.out.println("The Sorted Array is" + Arrays.toString(arr));
    }
}
