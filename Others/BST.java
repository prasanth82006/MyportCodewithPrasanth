
import java.util.*;
// The entire code of BST
// class Node{
//      int data;
//      Node left;
//      Node right;
//      Node(int data){
//           this.data=data;
//           this.left=this.right=null;
//      }
// }
// class BST{
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
//      public Node searching(Node root,int sd){
//           if(root==null){
//                return null;
//           }
//           if(sd==root.data){
//                return root;
//           }
//           else if(sd<root.data){
//                return searching(root.left, sd);
//           }
//           else{
//                return searching(root.right, sd);
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
//                     root.data=min,data;
//                     root.right=delete(root.right, min.data);
//                }
//           }
//           return root;
//      }
//      public void display(Node root){
//           if(root!=null){
//                display(root.left);
//                System.out.println(root.data);
//                display(root.right);
//           }
//      }
//      public static void main(String[] args) {
//           BST b=new BST();
//           Node root=new Node(10);
//           b.insert(root, 1);
//           b.insert(root, 19);
//           b.delete(root, 19);
//           b.display(root);
//      }
// }

// the entrie code of Binary tree
// class Node {
//      int data;
//      Node left, right;

//      Node(int data) {
//           this.data = data;
//           this.right = this.left = null;
//      }
// }

// class Binarytree {
//      public Node CreateBinary() {
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter the root node (input:-1 for no child)");
//           int data = sc.nextInt();
//           if (data == -1) {
//                return null;
//           }
//           Node current = new Node(data);
//           System.out.println("Enter the left child: " + data);
//           current.left = CreateBinary();
//           System.out.println("Enter the right child: " + data);
//           current.right = CreateBinary();
//           return current;
//      }

//      public boolean search(Node root, int data) {
//           if (root == null) {
//                return false;
//           }
//           if (data == root.data) {
//                return true;
//           }
//           return search(root.left, data) || search(root.right, data);
//      }

//      public Node inorderSuccessot(Node root) {
//           while (root.left != null) {
//                root = root.left;
//           }
//           return root;
//      }

//      public Node delete(Node root, int data) {
//           if (root == null) {
//                return null;
//           }
//           if (root.data == data) {
//                if (root.left == null && root.right == null) {
//                     return null;
//                }
//                if (root.left == null) {
//                     return root.right;
//                }
//                if (root.right == null) {
//                     return root.left;
//                } else {
//                     Node min = inorderSuccessot(root.right);
//                     root.data = min.data;
//                     root.right = delete(root.right, min.data);
//                }
//           } else {
//                root.left = delete(root.left, data);
//                root.right = delete(root.right, data);
//           }
//           return root;
//      }

//      public void display(Node root) {
//           if (root != null) {
//                System.out.println(root.data);
//                display(root.left);
//                display(root.right);
//           }
//      }

//      public static void main(String[] args) {
//           Binarytree b = new Binarytree();
//           Node root = b.CreateBinary();
//           b.delete(root, 10);
//           System.out.println("The Tree: ");
//           b.display(root);
//           System.out.println(b.search(root, 10) ? "The Element is Found" : "The Element is Not Found");
//      }
// }

// class Node{
//      int data;
//      Node left;
//      Node right;
//      Node(int data){
//           this.data=data;
//           this.right=this.left=null;
//      }
// }
// public class BST {
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
//      public Node search(Node root,int data){
//           if(root==null){
//                return null;
//           }
//           if(root.data==data){
//                return root;
//           }
//           else if(data<root.data){
//                return search(root.left, data);
//           }
//           else{
//                return search(root.right, data);
//           }
//      }
//      public Node inorderSuccessor(Node root){
//           if(root.left!=null){
//                root=root.left;
//           }
//           return root;
//      }
//      public Node delete(Node root,int data){
//           if(root==null){
//                return null;
//           }
//           if(data<root.data){
//                root.left=delete(root.left, data);
//           }
//           else if(data>root.data){
//                root.right=delete(root.left, data);
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
//                     root.right=delete(root.right,min.data);
//                }
//           }
//           return root;
//      }
//      public void display(Node root){
//           if(root!=null){
//                System.out.println(root.data);
//                display(root.left);
//                display(root.right);
//           }
//      }
//      public static void main(String[] args) {
//           BST b= new BST();
//           Node root=new Node(8);
//           b.insert(root,3);
//           b.insert(root, 9);
//           b.insert(root, 1);
//           b.insert(root, 7);
//           b.insert(root, 5);
//           b.insert(root, 6);
//           b.delete(root, 3);
//           b.display(root);
//      }
// }

// // class Node{
// //      Node left,right;
// //      int data;
// //      Node(int data){
// //           this.data=data;
// //           this.left=this.right=null;
// //      }
// // }
// // public class BST {
// //      public Node CreateBinary(){
// //           Scanner sc=new Scanner(System.in);
// //           int data;
// //           System.out.println("Enter the Node: ");
// //           data=sc.nextInt();
// //           if(data==-1){
// //                return null;
// //           }
// //           Node n=new Node(data);
// //           System.out.println("Enter the left Node "+data+" : ");
// //           n.left=CreateBinary();
// //           System.out.println("Enter the right Node "+data+" : ");
// //           n.right=CreateBinary();
// //           return n;
// //      }
// //      public boolean search(Node root,int data){
// //           if(root==null){
// //                return false;
// //           }
// //           if(data==root.data){
// //                return true;
// //           }
// //           else{
// //                return search(root.left, data) || search(root.right, data);
// //           }
// //      }
// //      public Node inorderSuccesor(Node root){
// //          if(root.left!=null){
// //                root=root.left;
// //          }
// //          return root;
// //      }
// //      public Node delete(Node root,int data){
// //           if(root==null){
// //                return null;
// //           }
// //           if(root.data==data){
// //                if(root.left==null){
// //                     return root.right;
// //                }
// //                else if(root.right==null){
// //                     return root.left;
// //                }
// //                else{
// //                     Node min=delete(root.right, data);
// //                     root.data=min.data;
// //                     root.right=delete(root.right,min.data);
// //                }
// //           }
// //           else{
// //                root.right=delete(root.right,data);
// //                root.left=delete(root.left,data);
// //           }
// //           return root;
// //      }
// //      public void display(Node root){
// //           if(root!=null){
// //                System.out.println(root.data);
// //                display(root.left);
// //                display(root.right);
// //           }
// //      }
// //      public static void main(String[] args) {
// //           BST b=new BST();
// //           Node root=b.CreateBinary();
// //           Scanner sc=new Scanner(System.in);
// //           b.delete(root, 12);
// //           b.display(root);
// //           int se=sc.nextInt();
// //           if(b.search(root,se)){
// //                System.out.println("The Element is Found");
// //           }
// //           else{
// //                System.out.println("The Element is Not Found");
// //           }
// //      }
// // }

