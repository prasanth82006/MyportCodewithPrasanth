
// Trees
// preorder traversal

// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int preorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           System.out.print(root.data+" ");
//           preorder(root.left);
//           preorder(root.right);
//           return 0;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           preorder(root);
//      }
// }

// inorder Traversal
// left-- root--right
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int inorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           inorder(root.left);
//           System.out.println(root.data);
//           inorder(root.right);
//           return 0;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           inorder(root);
//      }
// }

// postorder Traversal
// left--right--root
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int postorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           postorder(root.left);
//           postorder(root.right);
//           System.out.print(root.data+" ");
//           return 0;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           postorder(root);
//      }
// }

// level order Trasveral
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static void levelorder(Node root){
//           if(root==null){
//                return;
//           }
//           Queue<Node> q=new LinkedList<>();
//           q.add(root);
//           q.add(null);
//           while(!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                          break;
//                     }
//                     else{
//                          q.add(null);
//                     }
//                }else{
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left!=null){
//                          q.add(currNode.left);
//                     }
//                     if(currNode.right!=null){
//                          q.add(currNode.right);
//                     }
//                }
//           }
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           levelorder(root);
//      }
// }

// Question of Trees
// 1
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int count(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=count(root.left);
//           int rightnode=count(root.right);
//           return leftnode+rightnode+1;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(count(root));
//      }
// }
// 2 Sum of Nodes
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int sumoofNodes(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=sumoofNodes(root.left);
//           int rightnode=sumoofNodes(root.right);
//           return leftnode+rightnode+root.data;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(sumoofNodes(root));
//      }
// }

// height of tree
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
     // public static int height(Node root){
     //      if(root==null){
     //           return 0;
     //      }
     //      int leftheight=height(root.left);
     //      int rightheight=height(root.right);
     //      if(leftheight>rightheight){
     //           return leftheight+1;
     //      }
     //      else{
     //           return rightheight+1;
     //      }
     // }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(height(root));
//      }
// }

// Diameter of tree
// case1:- search the diameter through root
// case2:- search the diameter not throught root
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int height(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftheight=height(root.left);
//           int rightheight=height(root.right);
//           if(leftheight>rightheight){
//                return leftheight+1;
//           }
//           else{
//                return rightheight+1;
//           }
//      }
//      public static int diameter(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=diameter(root.left);
//           int rightnode=diameter(root.right);
//           int bothnode=height(root.left)+height(root.right)+1;
//           return Math.max(bothnode,Math.max(rightnode,leftnode));
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println("the max diameter is:"+" "+diameter(root));
//      }
// }
// other method
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int height(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftheight=height(root.left);
//           int rightheight=height(root.right);
//           if(leftheight>rightheight){
//                return leftheight+1;
//           }
//           else{
//                return rightheight+1;
//           }
//      }
//      public static int diameter(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=diameter(root.left);
//           int rightnode=diameter(root.right);
//           int bothnode=height(root.left)+height(root.right)+1;
//           return Math.max(bothnode,Math.max(rightnode,leftnode));
//      }
//      public static class Treeinfo{
//           int ht;
//           int da;
//           Treeinfo(int ht,int da){
//                this.ht=ht;
//                this.da=da;
//           }
//      }
//      public static Treeinfo diameter2(Node root){
//           if(root==null){
//                return new Treeinfo(0, 0);
//           }
//           Treeinfo left=diameter2(root.left);
//           Treeinfo right=diameter2(root.right);
//           int myht=Math.max(left.ht,right.ht)+1;
//           int dia=left.da;
//           int dia1=right.da;
//           int dia2=left.ht+right.ht+1;
//           int myda=Math.max(dia2,Math.max(dia,dia1));
//           Treeinfo myinfo=new Treeinfo(myht, myda);
//           return myinfo;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println("the max diameter is:"+" "+diameter2(root).da);
//      }
// }

// sum of nodes kth level
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static void levelorder(Node root){
//           Scanner sc=new Scanner(System.in);
//           int k=sc.nextInt();
//           if(root==null){
//                return;
//           }
//           Queue<Node> q=new LinkedList<>();
//           q.add(root);
//           q.add(null);
//           int sum=0;
//           int currLevel=1;
//           while(!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                     if(currLevel==k){
//                          System.out.println(sum);
//                     }
//                     sum=0;
//                     currLevel++;
//                     if(q.isEmpty()){
//                          break;
//                     }
//                     else{
//                          q.add(null);
//                     }
//                }else{
//                     sum+=currNode.data;
//                     if(currNode.left!=null){
//                          q.add(currNode.left);
//                     }
//                     if(currNode.right!=null){
//                          q.add(currNode.right);
//                     }
//                }
//           }
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           levelorder(root);
//      }
// }

// BST(Binary sub Tree)
// public class Tree {
//      static class Node {
//          int data;
//          Node left, right;
//          Node(int data) {
//              this.data = data;
//          }
//      }
 
//      public static Node insert(Node root, int val) {
//          if (root == null) {
//              root = new Node(val);
//              return root;
//          }
//          if (root.data > val) {
//              root.left = insert(root.left, val);
//          } else {
//              root.right = insert(root.right, val);
//          }
//          return root;
//      }
 
//      public static void inorder(Node root) {
//          if (root == null) {
//              return;
//          }
//          inorder(root.left);
//          System.out.print(root.data + " ");
//          inorder(root.right);
//      }
 
//      public static boolean search(Node root, int key) {
//          if (root == null) {
//              return false;
//          }
//          if (root.data > key) {
//              return search(root.left, key);
//          } else if (root.data < key) {
//              return search(root.right, key);
//          } else {
//              return true;
//          }
//      }
 
//      public static Node delete(Node root, int val) {
//          if (root == null) {
//              return null;
//          }
//          if (root.data > val) {
//              root.left = delete(root.left, val);
//          } else if (root.data < val) {
//              root.right = delete(root.right, val);
//          } else {
//              // case 1: no children
//              if (root.left == null && root.right == null) {
//                  return null;
//              }
//              // case 2: one child
//              if (root.left == null) {
//                  return root.right;
//              }
//              if (root.right == null) {
//                  return root.left;
//              }
//              // case 3: two children
//              Node is = inorderSuccessor(root.right);
//              root.data = is.data;
//              root.right = delete(root.right, is.data);
//          }
//          return root;
//      }
 
//      public static Node inorderSuccessor(Node root) {
//          while (root.left != null) {
//              root = root.left;
//          }
//          return root;
//      }
 
//      public static void main(String[] args) {
//          int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//          Node root = null;
//          for (int i = 0; i < values.length; i++) {
//              root = insert(root, values[i]);
//          }
//          inorder(root);
//          System.out.println();
//          if (search(root, 5)) {
//              System.out.println("Found");
//          } else {
//              System.out.println("Not found");
//          }
 
//          root = delete(root, 14);
//          inorder(root);
//      }
//  }
 
// class ppk{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = "123";
//         int len = a.length();
//         int c = Integer.parseInt(a);
//         int count = 0;
//         int d = c;

//         while (c != 0) {
//             int r = c % 10;
//             count += r * Math.pow(10, len - 1);
//             len--;
//             c = c / 10;
//         }
//         System.out.println(count);
//     }
// }

// class ArraySortExample {
//      public static void main(String[] args) {
//          int[] array = {5, 3, 8, 1, 2, 7};
//          System.out.println("Before sorting: ");
//          printArray(array);
//          Sort(array);
//          System.out.println("After sorting: ");
//          printArray(array);
//      }
 
//      public static void Sort(int reska[]) {
//          int n = reska.length;
//          for (int i = 0; i < n - 1; i++) {
//              for (int j = 0; j < n - i - 1; j++) {
//                  if (reska[j] > reska[j + 1]) {
//                      int temp = reska[j];
//                      reska[j] = reska[j + 1];
//                      reska[j + 1] = temp;
//                  }
//              }
//          }
//      }
//      public static void printArray(int[] array) {
//          for (int i : array) {
//              System.out.print(i + " ");
//          }
//          System.out.println();
//      }
//  }

// import java.util.Scanner;
// public class Tree{
//      public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           System.out.println("enter a number:");
//           int a=sc.nextInt();
//           System.out.println(factorial(a));
//      }    
//      public static int factorial(int n){
//           if(n<=0){
//                return 1;
//           }
//           else{
//                return n*factorial(n-1);
//           }
//      }
// }

import java.util.*;
// public class Tree {
//      public static void main(String[] args){
//           Scanner sc=new Scanner(System.in);
//           int a=sc.nextInt();
//           int b=sc.nextInt();
//           int arr[][]=new int[a][b];
//           int ar[][]=new int[a][b];
//           for(int i=0;i<a;i++){
//                for(int j=0;j<b;j++){
//                     arr[i][j]=sc.nextInt();
//                }
//           }
//           System.out.println(Arrays.deepToString(arr));
//           for(int i=0;i<2;i++){
//                for(int j=0;j<2;j++){
//                     ar[j][i]=arr[i][j];
//                }
//           }
//           System.out.println(Arrays.deepToString(ar));
//      }
// }

// public class Tree {
//      public static class Node{
//           int data;
//           Node next;
//           Node(int data){
//                this.data=data;
//                next=null;
//           }
//      }
//      public static class stack{
//           static Node head;
//           public static boolean isEmpty(){
//                return head==null;
//           }
//           public  static void push(int data){
//                Node newnode=new Node(data);
//                if(isEmpty()){
//                     head=newnode;
//                     return;
//                }
//                newnode.next=head;
//                head=newnode;
//           }
//           public static int pop(){
//                if(isEmpty()){
//                     return -1;
//                }
//                int top=head.data;
//                head=head.next;
//                return top;
//           }
//           public static int peek(){
//                if(isEmpty()){
//                     return -1;
//                }
//                int top=head.data;
//                return top;
//           }
          
//      }
//      public static void main(String[] args) {
//           stack s=new stack();
//           s.push(3);
//           s.push(1);
//           s.push(2);
//           while (!s.isEmpty()){
//                System.out.println(s.peek());
//                s.pop();
               
//           }
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n=sc.nextInt();
//           for(int i=1;i<n;i++){
//                for(int j=0;j<i;j++){
//                     System.out.print("*"+" ");
//                }
//                System.out.println();
//           }
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter first number:");
//           int a = sc.nextInt();
//           System.out.println("Enter second number:");
//           int b = sc.nextInt();
//           String A=Integer.toBinaryString(a);
//           String B=Integer.toBinaryString(b);
//           int sum=Integer.parseInt(A,2)+Integer.parseInt(B,2);
//           System.out.println(Integer.toBinaryString(sum));

          // String binaryA = Integer.toBinaryString(a);
          // String binaryB = Integer.toBinaryString(b);
          // int sum = Integer.parseInt(binaryA, 2) + Integer.parseInt(binaryB, 2);
          // String binarySum = Integer.toBinaryString(sum);
          // System.out.println("Binary representation of first number: " + binaryA);
          // System.out.println("Binary representation of second number: " + binaryB);
          // System.out.println("Sum of the binary numbers: " + binarySum);
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           char ch='c';
//           String CH=Character.toString(ch);
//           System.out.print(CH);
//           String str="Prasanth";
//           System.out.println(str.charAt(0));
//      }
// }

// public class Tree{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String input = sc.nextLine();
        
//         if (isPalindromeUsingQueue(input)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }

//         sc.close();
//     }

//     public static boolean isPalindromeUsingQueue(String str) {
//         Queue<Character> queue = new LinkedList<>();
//         Stack<Character> st=new Stack<>();
//         for (int i = str.length()-1; i >= 0; i--) {
//             st.add(str.charAt(i));
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if (st.pop() != str.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


// public class Tree{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String input = sc.nextLine();
//         System.out.println("Enter the number of equal parts:");
//         int n = sc.nextInt();
//           divideString(input, n);

//         sc.close();
//     }

//     public static void divideString(String str, int n) {
//         int length = str.length();
//           if (length % n != 0) {
//             System.out.println("The string cannot be divided into " + n + " equal parts.");
//             return;
//         }
//         int partLength = length / n;
//         for (int i = 0; i < n; i++) {
//             int start = i * partLength;
//             int end = start + partLength;
//             String part = str.substring(start, end);
//             System.out.println("Part " + (i + 1) + ": " + part);
//         }
//     }
// }


// public class Tree {
//      public static void main(String[] args) {
//           int a[][]=new int[2][2];
//           Scanner sc=new Scanner(System.in);
//           for(int i=0;i<2;i++){
//                for(int j=0;j<2;j++){
//                     a[i][j]=sc.nextInt();
//                }
//           }
//           // int sumr=0;
//           // int sumc=0;
//           for(int i=0;i<2;i++){
//                int sumr=0;
//                for(int j=0;j<2;j++){
//                     sumr+=a[i][j];
//                }
//                System.out.println("the "+(i+1)+"row sum:"+sumr);
//           }
//           for(int i=0;i<2;i++){
//                int sumc=0;
//                for(int j=0;j<2;j++){
//                     sumc+=a[j][i];
//                }
//                System.out.println("the "+(i+1)+"row sum:"+sumc);
//           }
//           System.out.println(Arrays.deepToString(a));
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           int arr[]={1,2,3,4,5};
//           int a[]=new int[4];
//           int index=0;
//           for(int i=0;i<5;i++){
//                if(i<index){
//                     a[i]=arr[i];
//                }
//                if(i>index){
//                     a[i-1]=arr[i];
//                }
//           }
//           System.out.println(Arrays.toString(a));
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           int arr[]={1,2,3,4,5};
//           int ar[]=new int[6];
//           int index=4;
//           for(int i=0;i<index;i++){
//                ar[i]=arr[i];
//           }
//           ar[index]=6;
//           for(int i=index;i<5;i++){
//                ar[i+1]=arr[i];
//           }
//           System.out.println(Arrays.toString(ar));
//      }
// }

// public class Tree {
//      public static void main(String[] args) {
//           int arr[]={1,2,3,4,5};
//           int a[]={6,7};
//           int ar[]=new int [7];
//           for(int i=0;i<5;i++){
//                ar[i]=arr[i];
//           }
//           for(int i=0;i<2;i++){
//                ar[i+5]=a[i];
//           }
//           System.out.println(Arrays.toString(ar));
//      }
// }

// public class Tree {
//      static class Node{
//           String data;
//           Node next;
//           Node(String data){
//                this.data=data;
//                this.next=null;
//           }
//      }
//      static class LL{
//           static Node head;
//           public static void addFirst(String data){
//                Node newNode=new Node(data);
//                if(head==null){
//                     head=newNode;
//                     return;
//                }
//                newNode.next=head;
//                head=newNode;
//           }
//           public static void addLast(String data){
//                Node newNode=new Node(data);
//                if(head==null){
//                     head=newNode;
//                     return;
//                }
//                Node currNode=head;
//                while (currNode.next!=null){
//                     currNode=currNode.next;
//                }    
//                currNode.next=newNode;
//           }
//           public static void printList(){
//                if(head==null){
//                     System.out.println("Is Empty");
//                     return;
//                }
//                Node currNode=head;
//                while (currNode!=null){
//                     System.out.println(currNode.data);
//                     currNode=currNode.next;
//                } 
//           }
//           public static void delete(String data){
//                if(head==null){
//                     System.out.println("Is empty");
//                     return;
//                }
//                if (head.data.equals(data)) {
//                     head = head.next;
//                     return;
//                 }
//                Node secNode=head;
//                Node lasNode=null;
//                while (secNode!=null && !secNode.data.equals(data)){
//                     lasNode=secNode;
//                     secNode=secNode.next;
//                }
//                if (secNode == null) {
//                     System.out.println("Node with data \"" + data + "\" not found");
//                     return;
//                 }
//                lasNode.next = secNode.next;
//           }
//      }
//      public static void main(String[] args) {
//           LL l=new LL();
//           l.addFirst("a");
//           l.addFirst("Is");
//           l.addLast("Prasanth");
//           l.delete("Is");
//           l.printList();
//      }
// }

// public class Tree {
//      static class CQueue{
//           static Scanner sc=new Scanner(System.in);
//           static int n=sc.nextInt();
//           static int arr[]=new int[n];
//           static int front =-1;
//           static int rear=-1;
//           public static void CQenqueue(int data){
//                if(rear==-1){
//                     rear=0;
//                     front=0;
//                     arr[rear]=data;
//                }
//                else{
//                     int next=(rear+1)%n;
//                     if(next==rear){
//                          System.out.println("The Queue is Full");
//                     }
//                     else{
//                          rear=next;
//                          arr[rear]=data;
//                     }
//                }
//           }
//           public static void CQdequeue(){
//                if(front==-1){
//                     System.out.println("The Queue is Empty");
//                }
//                else{
//                     int item=arr[front];
//                     if(front==rear){
//                          front=rear=-1;
//                     }
//                     else{
//                          front=(front+1)%n;
//                     }
//                }
//           }
//           public static void display(){
//                if(front==-1){
//                     System.out.println("The Queue is Empty");
//                }
//                else{
//                     int t=front;
//                     while (t!=rear){
//                          System.err.println(arr[t]);
//                          t=(t+1)%n;
//                     }
//                     System.out.println(arr[rear]);
//                }
//           }
//      }
//      public static void main(String[] args) {
//           CQueue cq=new CQueue();
//           cq.CQenqueue(1);
//           cq.CQenqueue(2);
//           cq.CQenqueue(3);
//           cq.CQenqueue(4);
//           cq.CQenqueue(5);
//           cq.CQenqueue(6);
//           cq.CQdequeue();
//           cq.display();
//      }
// }

// public class Tree {
//      static class Queue{
//           static int size;
//           static int arr[];
//           static int rear=-1;
//           static int front=-1;
//           Queue(int size){
//                this.size=size;
//                arr=new int[size];
//           }
//           public static void enqueue(int data){
//                if(rear==size-1){
//                     System.out.println("The Queue is Full");
//                }
//                else{
//                     rear++;
//                     arr[rear]=data;
//                     if(rear==0){
//                          front=0;
//                     }
//                }
//           }
//           public static void dequeue(){
//                if(front==-1){
//                     System.out.println("The Queue is Empty");
//                }
//                else{
//                     int re=arr[front];
//                     if(front==rear){
//                          front=rear=-1;
//                     }
//                     else{
//                          front++;
//                     }
//                }
//           }
//           public static void display(){
//                if(front==-1){
//                     System.out.println("The Queue is Empty");
//                }
//                else{
//                     for(int i=front;i<=rear;i++){
//                          System.out.println(arr[i]);
//                     }
//                }
//           }
//      }
//      public static void main(String[] args){
//           Queue q=new Queue(5);
//           q.enqueue(1);
//           q.enqueue(2);
//           q.enqueue(3);
//           q.enqueue(4);
//           q.dequeue();
//           q.display();
//      }
// }

// Linked List
// class Node{
//      int data;
//      Node link;
// }
// class myList{
//      Node start,end;
//      myList(){
//           start=end=null;
//      }
//      void create(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.link=n;
//                end=n;
//           }
//      }
//      void infront(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.link=start;
//                start=n;
//           }
//      }
//      void inrear(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.link=n;
//                end=n;
//           }
//      }
//      void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.print("-->"+n.data);
//                n=n.link;
//           }
//           System.out.println("--> null");
//      }
//      public static void main(String[] args) {
//           myList ll=new myList();
//           ll.create(1);
//           ll.create(2);
//           ll.inrear(4);
//           ll.display();
//      }
// }


// class Node{
//      int data;
//      Node link;
// }
// class myStack{
//      Node top;
//      public void push(int x){
//           Node n=new Node();
//           n.data=x;
//           if(top==null){
//                top=n;
//           }
//           else{
//                n.link=top;
//                top=n;
//           }
//      }
//      public void pop(){
//           if(top==null){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                top=top.link;
//           }
//      }
//      public void display(){
//           Node n=top;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.link;
//           }
//      }
//      public static void main(String[] args) {
//           myStack s=new myStack();
//           s.push(1);
//           s.push(3);
//           s.push(4);
//           s.push(5);
//           s.pop();
//           s.display();
//      }
// }


