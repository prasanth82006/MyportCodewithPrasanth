// Stack using array
// class myStack{
//      int arr[]=new int[5];
//      int top=-1;
//      public void push(int x){
//           if(top>=4){
//                System.out.println("The Stack is Full");
//           }
//           else{
//                top++;
//                arr[top]=x;
//           }
//      }
//      public void pop(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                top--;
//           }
//      }
//      public void peek(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                int ar=arr[top];
//                System.out.println(arr[top]+"is The peek value");
//           }
//      }
//      public void display(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                for(int i=top;i>=0;i--){
//                     System.out.println(arr[i]);
//                }
//           }
//      }
// public static void main(String[] args) {
//      myStack s=new myStack();
//      s.push(1);
//      s.push(2);
//      s.push(3);
//      s.push(4);
//      s.peek();
//      s.display();
// }
// }

// Stack using LinkedList
// class Node{
//      Node link;
//      int data;
// }
// class Stack{
//      Node top=null;
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
//      public void peek(){
//           if(top==null){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                System.out.println(top.data+":is The peek value");
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
//           Stack s=new Stack();
//           s.push(1);
//           s.push(2);
//           s.push(3);
//           s.pop();
//           s.display();
//           s.peek();
//      }
// }

// Linked list
// class Node{
//      Node link;
//      int data;
// }
// class LinkedList{
//      Node start,end;
//      int size=0;
//      LinkedList(){
//           start=end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.link=start;
//                start=n;
//           }
//           size++;
//      }
     
//      public void addLast(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.link=n;
//                end=n;
//           }
//           size++;
//      }
//      public void addanypost(int x,int pos){
//           Node n=new Node();
//           n.data=x;
//           if(pos<0){
//                System.out.println("The position must be Greater than 0");
//                return;
//           }
//           if(pos==0){
//                addFirst(x);
//                return;
//           }
//           Node temp=start;
//           int k=1;
//           while (temp!=null && k<pos){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Can not add");
//                return;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link==null){
//                end=n;
//           }
//           size++;
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Linked List is Empty");
//           }
//           else{
//                start=start.link;
//           }
//           size--;
//      }
//      public void deLast(){
//           Node temp=start;
//           while (temp.link.link!=null){
//                temp=temp.link;
//           }
//           temp.link=null;
//           size--;
//      }
//      public void delanypost(int pos){
//           Node temp=start;
//           Node prev=null;
//           int k=0;
//           if(pos<0){
//                System.out.println("The Position must be Greater than 0");
//                return;
//           }
//           if(pos==0){
//                delFirst();
//                return;
//           }
//           while(temp!=null && k<pos){
//                prev=temp;
//                temp=temp.link;
//                k++;
//           }
//           prev.link=temp.link;
//           size--;
//      }
//      public void reverse(){
//           Node prev=null;
//           Node Current=start;
//           Node next=null;
//           while (Current!=null){
//                next=Current.link;
//                Current.link=prev;
//                prev=Current;
//                Current=next;
//           }
//           start=prev;
//           size--;
//      }
//      public void getsize(){
//           System.out.println(size);
//      }
//      public void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.print(n.data+"-->");
//                n=n.link;
//           }
//           System.out.println("null");
//      }
//      public static void main(String[] args) {
//           LinkedList l=new LinkedList();
//           l.addFirst(1);
//           l.addLast(2);
//           l.addLast(3);
//           l.addLast(4);
//           l.addanypost(35,3);
//           // l.delFirst();
//           // l.deLast();
//           l.delanypost(1);
//           // l.reverse();
//           l.display();
//           l.getsize();
//      }
// }

// class Node{
//      Node link;
//      int data;
// }
// class Clink{
//      Node start,end;
//      Clink(){
//           start=end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                end.link=start;
//           }
//           else{
//                n.link=start;
//                start=n;
//                end.link=start;
//           }
//      }
//      public void addLast(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                end.link=start;
//           }
//           else{
//                end.link=n;
//                end=n;
//                end.link=start;
//           }
//      }
//      public void addanypos(int x,int pos){
//           Node n=new Node();
//           n.data=x;
//           Node temp=start;
//           int k=1;
//           if(pos<0){
//                System.out.println("The Position must Greater than 0");
//                return;
//           }
//           if(pos==0){
//                addFirst(x);
//                return;
//           }
//           while (temp!=null && k<pos){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Can not add");
//                return;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link==null){
//                end=n;
//           }
//      }
//      public void deFirst(){
//           if(start==null){
//                System.out.println("The C link is Empty");
//           }
//           else if(start==null){
//                start=end=null;
//           }
//           else{
//                start=start.link;
//                end.link=start;
//           }
//      }
//      public void deLast(){
//           if(start==null){
//                System.out.println("The C link is Empty");
//           }
//           else if(start==null){
//                start=end=null;
//           }
//           else{
//                Node temp=start;
//                while (temp.link!=end){
//                     temp=temp.link;
//                }
//                temp.link=start;
//                temp=end;
//           }
//      }
//      public void display(){
//           Node n=start;
//           do{
//                System.out.println(n.data);
//                n=n.link;
//           }while(n!=start);
//      }
//      public static void main(String[] args) {
//           Clink c=new Clink();
//           c.addFirst(1);
//           c.addLast(2);
//           c.addanypos(3,1);
//           c.deLast();
//           c.display();
//      }
// }

// Linked list in Queue
// class Node{
//      int data;
//      Node link;
// }
// class Queue{
//      Node front,rear;
//      Queue(){
//           rear=front=null;
//      }
//      public void Enqueue(int x){
//           Node n=new Node();
//           n.data=x;
//           if(rear==null){
//                rear=front=n;
//           }
//           rear.link=n;
//           rear=n;
//      }
//      public void dequeue(){
//           if(front==null){
//                System.out.println("The Queue is Empty");
//           }
//           if(front==rear){
//                front=rear=null;
//           }
//           front=front.link;
//      }
//      public void display(){
//           Node n=front;
//           if(n==null){
//                System.out.println("The Queue is Empty");
//           }
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.link;
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue();
//           q.Enqueue(1);
//           q.Enqueue(2);
//           q.Enqueue(3);
//           q.dequeue();
//           q.display();
//      }
// }



// inorder tranversal
// public class cat{
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
//           public static  Node buildtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node n=new Node(nodes[index]);
//                n.left=buildtree(nodes);
//                n.right=buildtree(nodes);
//                return n;
//           }
//      }
//      public static void preorder(Node root){
//           if(root==null){
//                return;
//           }
//           System.out.println(root.data);
//           preorder(root.left);
//           preorder(root.right);
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildtree(nodes);
//           preorder(root);
//      }
// }

// public class cat {
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=left;
//                this.right=right;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public Node buildtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node n=new Node(nodes[index]);
//                n.left=buildtree(nodes);
//                n.right=buildtree(nodes);
//                return n;
//           }
//      }
//      public static void preorder(Node root){
//           if(root==null){
//                return;
//           }
//           System.out.print(root.data);
//           preorder(root.left);
//           preorder(root.right);
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildtree(nodes);
//           preorder(root);
//      }
// }

// public class cat {
//      static class Node{
//           int data;
//           Node right;
//           Node left;
//           Node(int data){
//                this.data=data;
//                this.right=this.left=null;
//           }
//      }

//      static class Binarytree{
//           static int index=-1;
//           public Node bulidtree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node n=new Node(nodes[index]);
//                n.left=bulidtree(nodes);
//                n.right=bulidtree(nodes);
//                return n;
//           }
//      }
//      public static void preorder(Node root){
//           if(root==null){
//                return;
//           }
//           System.out.println(root.data);
//           preorder(root.right);
//           preorder(root.left);
//      }
//      public static int  Count(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=Count(root.left);
//           int rightnode=Count(root.right);
//           return leftnode+rightnode+1;
//      }
//      public static int Sum(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=Sum(root.left);
//           int rightnode=Sum(root.right);
//           return leftnode+rightnode+root.data;
//      }
//      public static int Height(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=Height(root.left);
//           int rightnode=Height(root.right);
//           if(leftnode>rightnode){
//                return leftnode+1;
//           }
//           else{
//                return rightnode+1;
//           }
//      }
//      public static void main(String[] args) {
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree t=new Binarytree();
//           Node root=t.bulidtree(nodes);
//           preorder(root);
//           System.out.println("The Count is:"+Count(root));
//           System.out.println("The Sum of Nodes is:"+Sum(root));
//           System.out.println("The Height is: "+Height(root));
//      }
// }

// class Node {
//      int data;
//      Node left, right;
//      Node(int data) {
//          this.data = data;
//          left = null;
//          right = null;
//      }
//  }
 
//  class Tree {
//      public void insert(Node n, int data) {
//          if (data < n.data) {
//              if (n.left != null) {
//                  insert(n.left, data);
//              } else {
//                  n.left = new Node(data);
//              }
//          } else if (data > n.data) {
//              if (n.right != null) {
//                  insert(n.right, data);
//              } else {
//                  n.right = new Node(data);
//              }
//          }
//      }
//      public Node searching(Node root, int search_data) {
//          if (root == null) {
//              return null;
//          }
//          if (search_data == root.data) {
//              return root;
//          } else if (search_data < root.data) {
//              return searching(root.left, search_data);
//          } else {
//              return searching(root.right, search_data);
//          }
//      }
//      public void display(Node root) {
//           if (root != null) {
//               display(root.left); 
//               System.out.print(root.data + " ");
//               display(root.right); 
//           }
//      }
 
//      public static void main(String[] args) {
//          Tree tree = new Tree();
//          Node root = new Node(10);
//          tree.insert(root, 5);
//          tree.insert(root, 15);
//          tree.insert(root, 3);
//          tree.insert(root, 7);
//          tree.insert(root, 12);
//          tree.insert(root, 18);
//          tree.display(root);
//      //     Node result = tree.searching(root, 7);
//      //     if (result != null) {
//      //         System.out.println("Node found: " + result.data);
//      //     } else {
//      //         System.out.println("Node not found.");
//      //     }
//      }
//  }
 