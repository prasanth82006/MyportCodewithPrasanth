
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

import org.w3c.dom.Node;

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

// Double Linked List
// class Node {
//      int data;
//      Node Rlink;
//      Node Llink;
//  }
 
// class dList {
//      Node start, end;
 
//      dList() {
//          start = end = null;
//      }
 
//      public void infront(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//          } else {
//              n.Rlink = start;
//              start.Llink = n;
//              start = n;
//          }
//      }
 
//      public void inrear(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//          } else {
//              end.Rlink = n;
//              n.Llink = end;
//              end = n;
//          }
//      }
//      public void addany(int x,int pos){
//           Node temp;
//           Node n=new Node();
//           n.data=x;
//           temp=start;
//           if(pos==0){
//                infront(x);
//                return;
//           }
//           int k=1;
//           while (temp!=null && k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Position out of bounds");
//                return;
//           }
//           if(temp==end){
//                inrear(x);
//                return;
//           }
//           n.Rlink=temp.Rlink;
//           n.Llink=temp;
//           if(temp.Rlink!=null){
//                temp.Rlink.Llink=n;
//           }
//           temp.Rlink=n;
//      }
//      public void indel(){
//           if(start==null){
//                System.out.println("The Double List is Empty");
//                return;
//           }
//           if(start==end){
//                start=end=null;
//           }
//           start=start.Rlink;
//           start.Llink=null;
//      }
//      public void endel(){
//           if(start==null){
//                System.out.println("The Double List is Empty");
//                return;
//           }
//           if(start==end){
//                start=end=null;
//           }
//           else{
//                end=end.Llink;
//                end.Rlink=null;
//           }
//      }
//      public void delanyposition(int pos){
//           if(start==null){
//                System.out.println("The Double List is Empty");
//                return;
//           }
//           if(pos<0){
//                System.out.println("The position musst not be lesser than 0");
//           }
//           if(pos==0){
//                indel();
//                return;
//           }
//           Node temp=start;
//           int k=0;
//           while (temp!=null & k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Position out of bounds");
//                return;
//           }
//           if (temp == end) {
//                endel();
//                return;
//           }
//           temp.Llink.Rlink=temp.Rlink;
//           if(temp.Rlink!=null){
//                temp.Rlink.Llink=temp.Llink;
//           }
//      }
//      public void reverse(){
//           if(start==null){
//                System.out.println("The Doubly Linked List is Empty");
//                return;
//           }
//           Node current=start;
//           Node temp=null;
//           while (current!=null){
//                temp=current.Llink;
//                current.Llink=current.Rlink;
//                current.Rlink=temp;
//                current=current.Llink;
//           }
//           start=temp.Llink;
//      }
//      public void fDisplay() {
//          Node n = start;
//          while (n != null) {
//              System.out.println(n.data);
//              n = n.Rlink;
//          }
//      }
//      public void bDisplay() {
//          Node n = end;
//          while (n != null) {
//              System.out.println(n.data);
//              n = n.Llink;
//          }
//      }
//      public static void main(String[] args) {
//          dList d = new dList();
//          d.infront(1);
//          d.inrear(2);
//          d.inrear(3);
//          d.inrear(4);
//          d.addany(6,2);
//          d.indel();
//          d.endel();
//           d.delanyposition(3);
//           d.reverse();
//          d.fDisplay();
//          System.out.println();
//          d.bDisplay();
//      }
//  }
 
// class CQueue{
//      int arr[]=new int[5];
//      int front=-1;
//      int rear=-1;
//      public void Enqueue(int x){
//           if(rear==-1){
//                rear=0;
//                front=0;
//                arr[rear]=x;
//           }
//           else{
//                int next=(rear+1)%4;
//                if(rear==next){
//                     System.out.println("The cqueue is Full");
//                }
//                else{
//                     rear=next;
//                     arr[rear]=x;
//                }
//           }
//      }
//      public void dequeue(){
//           if(front==-1){
//                System.out.println("The CQueue is Empty");
//           }
//           else{
//                if(rear==front){
//                     rear=front=-1;
//                }
//                else{
//                     front=(front+1)%4;
//                }
//           }
//      }
//      public void display(){
//           if(front==-1){
//                System.out.println("The Cqueue is Empty");
//           }
//           else{
//                int t=front;
//                while (t!=rear){
//                     System.out.println(arr[t]);
//                     t=(t+1)%4;
//                }
//                System.out.println(arr[rear]);
//           }
//      }
//      public static void main(String[] args) {
//           CQueue c=new CQueue();
//           c.Enqueue(1);
//           c.Enqueue(2);
//           c.Enqueue(3);
//           c.Enqueue(4);
//           c.display();
//      }
// }

// class Node{
//      Node Rlink;
//      Node Llink;
//      int data;
// }
// class Cd{
//      Node start,end;
//      Cd(){
//           start=end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                n.Llink=n.Rlink=n;
//           }
//           else{
//                n.Rlink=start;
//                n.Llink=end;
//                start.Llink=n;
//                end.Rlink=n;
//                start=n;
//           }
//      }
//      public void addLast(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                n.Llink=n.Rlink=n;
//           }
//           else{
//                end.Rlink=n;
//                n.Llink=end;
//                n.Rlink=start;
//                start.Llink=n;
//                end=n;
//           }
//      }
//      public void addPost(int x,int pos){
//           Node n=new Node();
//           n.data=x;
//           if(pos==0){
//                addFirst(x);
//           }
//           Node temp=start;
//           int k=1;
//           while (temp!=end && k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==end){
//                addLast(x);
//                return;
//           }
//           n.Rlink=temp.Rlink;
//           n.Llink=temp;
//           if(temp.Rlink!=null){
//                temp.Rlink.Llink=n;
//           }
//           temp.Rlink=n;
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Double Linked list is Empty");
//                return;
//           }
//           if (start==end){
//                start=end=null;
//           }
//           else{
//                start=start.Rlink;
//                start.Llink=end;
//                end.Rlink=start;
//           }
//      }
//      public void delEnd(){
//           if(start==null){
//                System.out.println("The Double Linked list is Empty");
//                return;
//           }
//           if(start==end){
//                start=end=null;
//           }
//           else{
//                end=end.Llink;
//                end.Rlink=start;
//                start.Llink=end;
//           }
//      }
//      public void delpos(int pos){
//           if(pos==0){
//                delFirst();
//                return;
//           }
//           Node temp=start;
//           int k=0;
//           while (temp!=null && k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==null){
//                delEnd();
//                return;
//           }
//           temp.Rlink.Llink=temp.Llink;
//           temp.Llink.Rlink=temp.Rlink;
          
//      }
//      public void reverse(){
//           if(start==null){
//                System.out.println("The Doubly Linked List is Empty");
//                return;
//           }
//           Node current=start;
//           Node temp=null;
//           do {
//                temp = current.Llink;
//                current.Llink = current.Rlink;
//                current.Rlink = temp;
//                current = current.Llink;
//            } while (current != start);
//           start=temp.Llink;
//      }
//      public void fDisplay(){
//           if(start==null){
//                System.out.println("The Double Linked list is Empty");
//           }
//           else{
//                Node n=start;
//                do{
//                     System.out.println(n.data);
//                     n=n.Rlink;
//                }while(n!=start);

//           }
//      }
//      public void bDisplay(){
//           if(start==null){
//                System.out.println("The Double Linked list is Empty");
//           }
//           else{
//                Node n=start;
//                do{
//                     System.out.println(n.data);
//                     n=n.Llink;
//                }while(n!=start);

//           }
//      }
//      public static void main(String[] args) {
//           Cd d=new Cd();
//           d.addFirst(1);
//           d.addLast(2);
//           d.addLast(3);
//           d.addLast(4);
//           d.addLast(5);
//           d.delFirst();
//           d.delEnd();
//           d.addPost(5, 1);
//           d.delpos(1);
//           d.reverse();
//           d.fDisplay();
//      }
// }

//Binary Tree
// preorder tranversal(root,leftsubtree,righttree) 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1
// public class Tree{
//      static class Node {
//          int data;
//          Node left;
//          Node right;
 
//          Node(int data) {
//              this.data = data;
//              this.left = null;
//              this.right = null;
//          }
//      }
 
//      static class BinaryTree {
//          static int index = -1;
 
//          // Method to build the binary tree
//          public static Node buildTree(int nodes[]) {
          //    index++;
          //    if (index >= nodes.length || nodes[index] == -1) {  // Corrected condition
          //        return null;
          //    }
          //    Node newNode = new Node(nodes[index]);
          //    newNode.left = buildTree(nodes);
          //    newNode.right = buildTree(nodes);
          //    return newNode;
//          }
//      }
 
//      // Preorder traversal method
     // public static void preorder(Node root) {
     //     if (root == null) {
     //         return;
     //     }
     //     System.out.print(root.data + " ");
     //     preorder(root.left);
     //     preorder(root.right);
     // }
 
//      public static void main(String[] args) {
     //     int nodes[] = {25, 20, 10, -1, -1, 22, -1, -1, 36, 30, 28, -1, -1, -1, 40, -1, -1};  // Fixed input
     //     BinaryTree tree = new BinaryTree();
     //     Node root = tree.buildTree(nodes);
     //     preorder(root);
//      }
//  }
 


// inorder tranversal
// public class Tree {
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
//           public static Node bulidtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newNode=new Node(nodes[index]);
//                newNode.left=bulidtree(nodes);
//                newNode.right=bulidtree(nodes);
//                return newNode;
//           }
//      }
//      public static void inoder(Node root){
//           if(root==null){
//                return;
//           }

//           inoder(root.left);
//           System.out.println(root.data);
//           inoder(root.right);
//      }
//      public static void main(String[] args) {
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.bulidtree(nodes);
//           inoder(root);
//      }
// }

// postorder tranversal
// public class Tree {
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
//           public static Node bulidtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newNode=new Node(nodes[index]);
//                newNode.left=bulidtree(nodes);
//                newNode.right=bulidtree(nodes);
//                return newNode;
//           }
//      }
     // public static void postoder(Node root){
     //      if(root==null){
     //           return;
     //      }
     //      postoder(root.left);
     //      postoder(root.right);
     //      System.out.println(root.data);
     // }
//      public static void main(String[] args) {
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.bulidtree(nodes);
//           postoder(root);
//      }
// }

// levelorder tranversal
// public class Tree {
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
//           public static Node bulidtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newNode=new Node(nodes[index]);
//                newNode.left=bulidtree(nodes);
//                newNode.right=bulidtree(nodes);
//                return newNode;
//           }
//      }
     // public static void levelorder(Node root){
     //      if(root==null){
     //           return;
     //      }
     //      Queue<Node> q=new LinkedList<>();
     //      q.add(root);
     //      q.add(null);
     //      while (!q.isEmpty()){
     //           Node curNode=q.remove();
     //           if(curNode==null){
     //                System.out.print("\n");
     //                if(q.isEmpty()){
     //                     break;
     //                }
     //                else{
     //                     q.add(null);
     //                }
     //           }
     //           else{
     //                System.out.print(curNode.data);
     //                if(curNode.left!=null){
     //                     q.add(curNode.left);
     //                }
     //                if(curNode.right!=null){
     //                     q.add(curNode.right);
     //                }
     //           }
     //      }
     // }
//      public static void postoder(Node root){
//           if(root==null){
//                return;
//           }
//           postoder(root.left);
//           postoder(root.right);
//           System.out.println(root.data);
//      }
//      public static int count(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnodes=count(root.left);
//           int rightnode=count(root.right);
//           return leftnodes+rightnode+1;
//      }
//      public static int sum(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftsum=sum(root.left);
//           int righttsum=sum(root.right);
//           return leftsum+righttsum+root.data;
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
//           int leftdiameter=diameter(root.left);
//           int rightdiameter=diameter(root.right);
//           int total=height(root.left)+height(root.right)+1;
//           int result=Math.max(total,Math.max(leftdiameter,rightdiameter));
//           return result;

//      }
     
//      public static void main(String[] args) {
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.bulidtree(nodes);
//           postoder(root);
//           System.out.println("The Count: "+count(root));
//           System.out.println("The sum: "+sum(root));
//           System.out.println("The height: "+height(root));
//           System.out.println("The diameter: "+diameter(root));

//      }
// }

// class Node{
//      int data;
//      Node Rlink;
//      Node llink;
// }
// class DList{
//      Node start,end;
//      DList(){
//           start=end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.Rlink=start;
//                start.llink=n;
//                start=n;
//           } 
//      }
//      public void addEnd(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.llink=end;
//                end.Rlink=n;
//                end=n;
//           }
//      }
//      public void addanypos(int x,int pos){
//           Node n=new Node();
//           n.data=x;
//           Node temp=start;
//           int k=1;
//           if(pos<0){
//                System.out.println("The pos must be Greater than 0");
//                return;
//           }
//           if(pos==0){
//                addFirst(x);
//                return;
//           }
//           while (temp!=null && k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Position out of bounds");
//                return;
//           }
//           if(temp==end){
//                addEnd(x);
//                return;
//           }
//           n.Rlink=temp.Rlink;
//           n.llink=temp;
//           if(temp.Rlink!=null){
//                temp.Rlink.llink=n;
//           }
//           temp.Rlink=n;
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//           }
//           start=start.Rlink;
//           start.llink=null;
//      }
//      public void delEnd(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           if(start==end){
//                start=end=null;
//                return;
//           }
//           end=end.llink;
//           end.Rlink=null;
//      }
//      public void delany(int pos){
//           Node temp=start;
//           int k=0;
//           if(pos<0){
//                System.out.println("The pos must be Greater than 0");
//                return;
//           }
//           if(pos==0){
//                delFirst();
//                return;
//           }
//           while (temp!=null && k<pos){
//                temp=temp.Rlink;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Position out of bounds");
//                return;
//           }
//           if (temp == end) {
//                delEnd();
//                return;
//           }
//           temp.llink.Rlink=temp.Rlink;
//           if(temp.Rlink!=null){
//                temp.Rlink.llink=temp.llink;
//           }
//      }
//      public void reverse(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//           }
//           Node current=start;
//           Node temp=null;
//           while (current!=null){
//                temp=current.llink;
//                current.llink=current.Rlink;
//                current.Rlink=temp;
//                current=current.llink;
//           }
//           start=temp.llink;
//      }
//      public void fDisplay(){
//           Node n=start;
//           while (n!=null) {
//                System.out.println(n.data);
//                n=n.Rlink;
//           }
//      }
//      public void BDisplay(){
//           Node n=end;
//           while (n!=null) {
//                System.out.println(n.data);
//                n=n.llink;
//           }
//      }
//      public static void main(String[] args) {
//           DList d=new DList();
//           d.addFirst(1);
//           d.addEnd(2);
//           d.addEnd(3);
//           d.addEnd(4);
//           d.addanypos(5, 4);
//           d.delFirst();
//           d.delEnd();
//           d.delany(2);
//           d.fDisplay();
//           // System.out.println();
//           // d.BDisplay();
//      }
// }


// class Node{
//      int data;
//      Node left,right;
//      Node(int data){
//           this.right=null;
//           this.left=null;
//           this.data=data;
//      }
// }

// class tree{
//      public static Node create(){
//           int data;
//           Scanner sc=new Scanner(System.in);
//           Node root=null;
//           System.out.println("Enter Value");
//           data=sc.nextInt();
//           if(data==-1){
//                return null;
//           }
//           root=new Node(data);
//           System.out.println("Enter left child of:"+root.data);
//           root.left=create();
//           System.out.println("Enter right Child of:"+root.data);
//           root.right=create();
//           return root;
//      }
     
//      public static void inorder(Node root){
//           if(root==null){
//                return;
//           }
//           inorder(root.left);
//           System.out.println(root.data);
//           inorder(root.right);
//      }
//      public static void postoder(Node root){
//           if(root==null){
//                return;
//           }
//           postoder(root.left);
//           postoder(root.right);
//           System.out.println(root.data);
//      }
//      public static void preorder(Node root){
//           if(root==null){
//                return;
//           }
//           System.out.println(root.data);
//           preorder(root.left);
//           preorder(root.right);

//      }
//      public static Node Find(Node root){
//           while (root.left!=null){
//                root=root.left;
//           }
//           return root;
//      }
//      public static void main(String[] args) {
//           Node root=create();
//           preorder(root);
//           System.out.println("\n");
//           postoder(root);
//           System.out.println("\n");
//           inorder(root);
//      }

// }

// class Node{
//      int data;
//      Node left;
//      Node right;
//      Node(int data){
//           this.left=null;
//           this.data=data;
//           this.right=null;
//      }
// }
// class Tree{
//      public void insert(Node n,int data){
//           if(data<n.data){
//                if(n.left!=null){
//                     insert(n.left, data);
//                }
//                else{
//                     n.left=new Node(data);
//                }
//           }
//           else if(data>n.data){
//                if(n.right!=null){
//                     insert(n.right, data);
//                }
//                else{
//                     n.right=new Node(data);
//                }
//           }
//      }
//      public Node searching(Node root,int search_data){
//           if(root==null){
//                return null;
//           }
//           if(search_data==root.data){
//                return root;
//           }
//           else if(search_data<root.data){
//                return searching(root.left,search_data);
//           }
//           else{
//                return searching(root.right, search_data);
//           }
//      }
//      public Node inorderSuccessor(Node root){
//           while (root.left!=null){
//                root=root.left;
//           }
//           return root;
//      }
//      public Node delete(Node root,int data){
//           if(root==null){
//                return null;
//           }
//           if(data<root.data){
//                return delete(root.left, data);
//           }
//           else if(data>root.data){
//                return delete(root.right, data);
//           }
//           else{
//                if(root.left==null){
//                     return root.right;
//                }
//                else if(root.right==null){
//                     return root.left;
//                }
//                Node min=inorderSuccessor(root.left);
//                root.data=min.data;
//                root.right=delete(root.right, min.data);
//           }
//           return root;
//      }
//      public void display(Node root){
//           if(root!=null){
//                display(root.left);
//                System.out.println(root.data+" ");
//                display(root.right);
//           }
//      }
//      public static void main(String[] args) {
//           Tree tree=new Tree();
//           Node root=new Node(10);
//           tree.insert(root, 5);
//          tree.insert(root, 15);
//          tree.insert(root, 3);
//          tree.insert(root, 7);
//          tree.insert(root, 12);
//          tree.insert(root, 18);
//          tree.delete(root, 10);
//           tree.display(root);
//      }
// }


// class Node{
//      int data;
//      Node left;
//      Node right;
//      Node(int data){
//           this.data=data;
//           this.left=null;
//           this.right=null;
//      }
// }
// class Tree{
//      public void insert(Node n,int data){
//           if(data<n.data){
//                if(n.left!=null){
//                     insert(n.left, data);
//                }
//                else{
//                     n.left=new Node(data);
//                }
//           }
//           else if(data>n.data){
//                if(n.right!=null){
//                     insert(n.right, data);
//                }
//                else{
//                     n.right=new Node(data);
//                }
//           }
//      }
//      public Node searching(Node root,int search_data){
//           if(root==null){
//                return null;
//           }
//           if(search_data==root.data){
//                return root;
//           }
//           else if(search_data<root.data){
//                return searching(root.left, search_data);
//           }
//           else{
//                return searching(root.right, search_data);
//           }
//      }
//      public Node inorderSuccessor(Node root){
//           while (root.left!=null){
//                root=root.left;
//           }
//           return root;
//      }
//      public Node delete(Node root, int data) {
//           if (root == null) {
//               return null;
//           }
//           if (data < root.data) {
//               root.left = delete(root.left, data);
//           } else if (data > root.data) {
//               root.right = delete(root.right, data);
//           } else {
//               if (root.left == null) {
//                   return root.right;
//               } else if (root.right == null) {
//                   return root.left;
//               } else {
//                   Node min = inorderSuccessor(root.right);
//                   root.data = min.data;
//                   root.right = delete(root.right, min.data);
//               }
//           }
//           return root;
//       }
//      public void display(Node root){
//           if(root!=null){
//                System.out.println(root.data+" ");
//                display(root.left);
//                display(root.right);
//           }
//      }
//      public static void main(String[] args) {
//           Tree tree=new Tree();
//           Node root=new Node(10);
//           tree.insert(root, 1);
//           tree.insert(root, 2);
//           tree.insert(root, 3);
//           tree.insert(root, 4);
//           tree.delete(root,2);
//           tree.display(root);
//           Node result=tree.searching(root, 5);
//           if(result!=null){
//                System.out.println("The Element is Found");
//           }
//           else{
//                System.out.println("Not Found");
//           }
//      }
// }

// class Node{
//      int data;
//      Node left;
//      Node right;
//      Node(int data){
//           this.data=data;
//           this.left=null;
//           this.right=null;
//      }
// }
// class Tree {
//      public Node CreateBinary(){
//           System.out.print("Enter Node data (input -1 for no child): ");
//           Scanner sc=new Scanner(System.in);
//           int data=sc.nextInt();
//           if(data==-1){
//                return null;
//           }
//           Node current=new Node(data);
//           System.out.println("Creating left child of:"+data);
//           current.left=CreateBinary();
//           System.out.println("The Creating right of:"+data);
//           current.right=CreateBinary();
//           return current;
//      }
//      public boolean search(Node root,int data){
//           if(root==null){
//                return false;
//           }
//           if(root.data==data){
//                return true;
//           }
//           return search(root.left, data) || search(root.right, data);
//      }
//      public Node delete(Node root,int data){
//           if(root==null){
//                return null;
//           }
//           if(root.data==data){
//                if(root.left==null && root.right==null){
//                     return null;
//                }
//                if(root.left==null){
//                     return root.right;
//                }
//                if(root.right==null){
//                     return root.left;
//                }
//                Node rightmost = findRightmost(root.right);
//                root.data = rightmost.data;
//                root.right = delete(root.right, rightmost.data);
//                }
//                else {
//                     root.left = delete(root.left, data);
//                     root.right = delete(root.right, data);
//                }
//            return root;
//        }
//        private Node findRightmost(Node node) {
//            while (node.right != null) {
//                node = node.right;
//            }
//            return node;
//        }
   
//      public void preorder(Node root){
//           if(root==null){
//                return;
//           }
//           System.out.println(root.data);
//           preorder(root.left);
//           preorder(root.right);
//      }
//      public void inorder(Node root){
//           if(root==null){
//                return;
//           }
//           inorder(root.left);
//           System.out.println(root.data);
//           inorder(root.right);
//      }
//      public void postoder(Node root){
//           if(root==null){
//                return;
//           }
//           postoder(root.left);
//           postoder(root.right);
//           System.out.println(root.data);
//      }
//      public static void main(String[] args) {
//           Tree tree=new Tree();
//           Scanner sc=new Scanner(System.in);
//           Node root=tree.CreateBinary();
//           tree.inorder(root);
//           System.out.println("Enter the element to search: ");
//           int search_name=sc.nextInt();
//           System.out.println(tree.search(root,search_name));
//      }
// }