import java.util.*;
import java.io.*;
class Node{
		int key;
		Node left,right;
		Node(int item){
				    key=item;
				    left=right=null;
}
}
public class Binarytree{
       		Node root;
		Binarytree(){

			    root=null;
}
      void printpostorder(Node node){
			if(node==null){
			    return;
      }
    	printpostorder(node.left);
	printpostorder(node.right);
  	System.out.println(node.key+" ");
}

void printinorder(Node node){
			if(node==null){
			    return;
      }
    	printinorder(node.left);
	System.out.println(node.key+" ");
printinorder(node.right);
  	}
void printpreorder(Node node){
			if(node==null){
			    return;
      }
    	System.out.println(node.key+" ");
        printpreorder(node.left);
	printpreorder(node.right);
  	
}
void printpostorder(){
       printpostorder(root);
}
void printinorder(){
       printpostorder(root);
}


void printpreorder(){
       printpreorder(root);
}
public static void main(String args[]){

	Binarytree tree=new Binarytree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);
tree.root.right.left=new Node(5);
System.out.println("traversal of postorder binary tree is : ");
tree.printpostorder();
System.out.println("traversal of inorder binary tree is : ");
tree.printinorder();
System.out.println("traversal of preorder binary tree is : ");
tree.printpreorder();
}
}




