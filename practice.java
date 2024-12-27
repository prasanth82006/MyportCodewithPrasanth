import java.util.*;
// class fact{
//      public static int factorial(int c){
//           if(c<=0){
//                return 1;
//           }
//           else{
//                return c*factorial(c-1);
//           }
//      }
//      public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           int n=sc.nextInt();
//           int result=factorial(n);
//           System.out.println("The factorial of "+n +"is:"+ result);
//      }
// }

import harry.f1.f2.rectangle;

// class Stack{
//      int arr[]=new int[5];
//      int top=-1;
//      public void push(int a){
//           if(top>=5){
//                System.out.println("The Stack is Full");
//           }
//           else{
//                top++;
//                arr[top]=a;
//           }
//      }
//      public void pop(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                top=top-1;
//           }
//      }
//      public int peek(){
//           if(top==-1){
//                return -1;
//           }
//           else{
//                return arr[top];
//           }
//      }
//      public void display(){
//           for(int i=0;i<=top;i++){
//                System.out.println(arr[i]);
//           }
//      }
//      public static void main(String[] args) {
//           Stack s=new Stack();
//           s.push(1);
//           s.push(2);
//           s.push(3);
//           s.push(4);
//           s.pop();
//           s.display();
//      }
// }

// class Queue{
//      int arr[]=new int[5];
//      int front,rear;
//      Queue(){
//           front=rear=-1;
//      }
//      public void Enqueue(int a){
//           if(rear>=5){
//                System.out.println("The Queue is Full");
//           }
//           else{
//                rear++;
//                arr[rear]=a;
//                if(rear==0){
//                     front=0;
//                }
//           }
//      }
//      public void dequeue(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else{
//                front+=1;
//           }
//      }
//      public void peek(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else{
//                System.out.println(arr[front]);
//           }
//      }
//      public void display(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else{
//                for(int i=front;i<=rear;i++){
//                     System.out.println(arr[i]);
//                }
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

// class CQueue{
//      int arr[]=new int[5];
//      int front=-1;
//      int rear=-1;
//      public void insert(int a){
//           if(rear==-1){
//                rear=0;
//                front=0;
//                arr[rear]=a;
//           }
//           else{
//                int next=(rear+1)%5;
//                if(next==rear){
//                     System.out.println("The Cqueue is Full");
//                }
//                else{
//                     rear=next;
//                     arr[rear]=a;
//                }
//           }
//      }
//      public void pop(){
//           if(front==-1){
//                System.out.println("The Cqueue is Empty");
//           }
//           else{
//                if(front==rear){
//                     front=rear=-1;
//                }
//                else{
//                     front=(front+1)%5;
//                }
//           }
//      }
//      public void display(){
//           int t=front;
//           while(t!=rear){
//                System.out.println(arr[t]);
//                t=(t+1)%5;
//           }
//           System.out.println(arr[rear]);
//      }
//      public static void main(String[] args) {
//           CQueue q=new CQueue();
//           q.insert(1);
//           q.insert(2);
//           q.insert(3);
//           q.insert(4);
//           q.insert(5);
//           q.pop();
//           q.display();
//      }
// }

// class Node{
//      int data;
//      Node link;
// }
// class List{
//      Node start,end;
//      List(){
//           start=end=null;
//      }
//      public void addFirst(int a){
//           Node n=new Node();
//           n.data=a;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.link=start;
//                start=n;
//           }
//      }
//      public void addLast(int a){
//           Node n=new Node();
//           n.data=a;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.link=n;
//                end=n;
//           }
//      }
//      public void addpostion(int x,int p){
//           Node n=new Node();
//           n.data=x;
//           Node temp=start;
//           int k=1;
//           if(p<0){
//                System.out.println("The Greater than 0");
//                return;
//           }
//           if(p==0){
//                addFirst(k);
//                return;
//           }
//           while (temp!=null && k<p){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("Not Found");
//                return;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link!=null){
//                end=n;
//           }
//      }
//      public void display(){
//           if(start==null){
//                System.out.println("The List is Empty");
//           }
//           else{
//                Node t=start;
//                while (t!=null){
//                     System.out.println(t.data);
//                     t=t.link;
//                }
//           }
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The List is Empty");
//           }
//           else{
//                start=start.link;
//           }
//      }
//      public void delEnd(){
//           Node temp=start;
//           while (temp.link.link!=null){
//                temp=temp.link;
//           }
//           temp.link=null;
//      }
//      public void delPosition(int p){
//           if(p<0){
//                System.out.println("Must be >0");
//                return;
//           }
//           if(p==0){
//                delFirst();
//                return;
//           }
//           int k=0;
//           Node temp=start;
//           Node prev=null;
//           while (temp!=null && k<p){
//                prev=temp;
//                temp=temp.link;
//                k++;
//           }
//           prev.link=temp.link;
//           if(temp.link==null){
//                end=prev;
//           }

//      }
//      public static void main(String[] args) {
//           List l=new List();
//           l.addFirst(1);
//           l.addLast(2);
//           l.addLast(3);
//           l.addLast(4);
//           l.addpostion(123, 2);
//           // l.delEnd();
//           l.delPosition( 3);
//           l.display();
//      }
// }

// class Node{
//      int data;
//      Node Rlink;
//      Node Llink;
// }
// class Dlist{
//      Node start,end;
//      Dlist(){
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
//                start.Llink=n;
//                start=n;
//           }
//      }
//      public void addLast(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.Rlink=n;
//                n.Llink=end;
//                end=n;
//           }
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("Empty");
//           }
//           if(start==end){
//                start=end=null;
//           }
//           else{
//                start=start.Rlink;
//                start.Llink=null;
//           }
//      }
//      public void delEnd(){
//           if(start==null){
//                System.out.println("Empty");
//           }
//           else{
//                end=end.Llink;
//                end.Rlink=null;
//           }
//      }
//      public void addany(int x,int pos){
//           Node temp;
//           Node n=new Node();
//           n.data=x;
//           temp=start;
//           if(pos==0){
//                addFirst(x);
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

//      public void displayf(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.Rlink;
//           }
//      }
//      public void displayb(){
//           Node n=end;
//           while (n!=start){
//                System.out.println(n.data);
//                n=n.Llink;
//           }
//      }
//      public static void main(String[] args) {
//           Dlist d=new Dlist();
//           d.addFirst(1);
//           d.addLast(2);
//           d.addLast(3);
//           d.addLast(4);
//           d.delFirst();
//           d.delEnd();
//           d.addany(23, 1);
//           d.displayf();
//      }
// }


// class ItoP{
//      public int precedence(char ch){
//           if(ch=='+'||ch=='-'){
//                return 1;
//           }
//           else if(ch=='*'||ch=='/'){
//                return 2;
//           }
//           else if(ch=='^'){
//                return 3;
//           }
//           else{
//                return -1;
//           }
//      }
//      String Itp(String Expression){
//           String prefix="";
//           Stack<String> stack=new Stack<>();
//           int length=Expression.length();
//           for(int i=length-1;i>=0;i--){
//                char ch=Expression.charAt(i);
//                if((ch>='a' && ch<='z')||(ch>='0' && ch<='9')||(ch>='A' && ch<='Z')){
//                     prefix=ch+prefix;
//                }
//                else if(ch==')'){
//                     stack.push(ch+"");
//                }
//                else if(ch=='('){
//                     while (!stack.isEmpty() && !stack.peek().equals(')')) {
//                          prefix=stack.pop()+prefix;
//                     }
//                     if(!stack.isEmpty()){
//                          stack.pop()
//                     }
//                }
//           }
//      }
//      public static void main(String[] args) {
          
//      }
// }

//Bubblesort
// class sort{
//      public static void bubblesort(int arr[]){
//           for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr.length-i-1;j++){
//                     if(arr[j+1]>arr[j]){
//                          int temp=arr[j];
//                          arr[j]=arr[j+1];
//                          arr[j+1]=temp;
//                     }
//                }
//           }
//      }
//      public static void main(String[] args) {
     //     int arr[]={7,8,1,2,3};
     //     bubblesort(arr); 
     //     System.out.println(Arrays.toString(arr)); 
//      }
// }

// Selection sort

// class sort{
//      public static void selectionsort(int arr[]){
//           for(int i=0;i<arr.length-1;i++){
//                int smaller=i;
//                for(int j=i+1;j<arr.length;j++){
//                     if(arr[smaller]<arr[j]){
//                          smaller=j;
//                     }
//                }
//                int temp=arr[smaller];
//                arr[smaller]=arr[i];
//                arr[i]=temp;
//           }
//      }
//      public static void main(String[] args) {
//           int arr[]={7,8,1,2,3};
//           selectionsort(arr); 
//           System.out.println(Arrays.toString(arr)); 
//      }
// }


// class sort{
//      public static void selectionsort(int arr[]){
//           for(int i=0;i<arr.length-1;i++){
//                int smaller=i;
//                for(int j=i+1;j<arr.length;j++){
//                     if(arr[smaller]>arr[j]){
//                          smaller=j;
//                     }
//                }
//                int temp=arr[smaller];
//                arr[smaller]=arr[i];
//                arr[i]=temp;
//           }
//      }
//      public static void main(String[] args) {
//           int arr[]={7,8,1,2,3};
//           selectionsort(arr); 
//           System.out.println(Arrays.toString(arr)); 
//      }
// }

// class sort{
//      public static void Insertionsort(int arr[]){
//           for(int i=1;i<arr.length;i++){
//                int current=arr[i];
//                int j=i-1;
//                while (j>=0 && arr[j]>current){
//                     arr[j+1]=arr[j];
//                     j--;
//                }
//                arr[j+1]=current;
//           }
//      }
//      public static void main(String[] args) {
//           int arr[]={7,8,1,2,3};
//           Insertionsort(arr); 
//           System.out.println(Arrays.toString(arr)); 
//      }
// }


// class ItF{
//      public static int precedence(char ch){
//           if(ch=='+'||ch=='-'){
//                return 1;
//           }
//           else if(ch=='*'||ch=='/'){
//                return 2;
//           }
//           else if(ch=='^'){
//                return 3;
//           }
//           else{
//                return -1;
//           }
//      }

//      public static String itf(String Expression){
//           String prefix="";
//           Stack<String> stack=new Stack<>();
//           int n=Expression.length();
//           for(int i=n-1;i>=0;i--){
//                char ch=Expression.charAt(i);
//                if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')) {
//                     prefix = ch + prefix;
//                }
//                else if(ch==')'){
//                     stack.push(ch+"");
//                } 
//                else if(ch=='('){
//                     while (!stack.isEmpty() && !stack.peek().equals(')')) {
//                          prefix=stack.pop()+prefix;
//                     }
//                     if(!stack.isEmpty()){
//                          stack.pop();
//                     }
//                }
//                else{
//                     while (!stack.isEmpty() && precedence(ch)<=precedence(stack.peek().charAt(0))){
//                          prefix=stack.pop()+prefix;
//                     }
//                     stack.push(ch+"");
//                }
//           }
//           while (!stack.isEmpty()){
//                prefix=stack.pop()+prefix;
//           }
//           return prefix;
//      }
//      public static void main(String[] args) {
//           String str = "2+3-5/6+6-2*3";
//           System.out.println("The prefix Expression is: ");
//           System.out.println(itf(str));
//       }
// }


// class ITF{
//      public static int precedence(char ch){
//           if(ch=='+'||ch=='-'){
//                return 1;
//           }
//           else if(ch=='*'||ch=='/'){
//                return 2;
//           }
//           else if(ch=='^'){
//                return 3;
//           }
//           else{
//                return -1;
//           }
//      }
//      public static String itf(String Expression){
//           String prefix="";
//           Stack<String> stack=new Stack<>();
//           int n=Expression.length();
//           for(int i=n-1;i>=0;i--){
//                char ch=Expression.charAt(i);
//                if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')||(ch>='A' && ch<='Z')){
//                     prefix=ch+prefix;
//                }
//                else if(ch==')'){
//                     stack.push(ch+"");
//                }
//                else if(ch=='('){
//                     while (!stack.isEmpty() && !stack.peek().equals(")")){
//                          prefix=stack.pop()+prefix;
//                     }
//                     if(!stack.isEmpty()){
//                          stack.pop();
//                     }
//                }
//                else{
//                     while (!stack.isEmpty() && precedence(ch)<=precedence(stack.peek().charAt(0))){
//                          prefix=stack.pop()+prefix;
//                     }
//                     stack.push(ch+"");
//                }
//           }
//           while (!stack.isEmpty()){
//                prefix=stack.pop()+prefix;
//           }
//           return prefix;
//      }
//      public static void main(String[] args) {
          // String str = "2+3-5/6+6-2*3";
          // System.out.println("The prefix Expression is: ");
          // System.out.println(itf(str));
//      }
// }

// class ITP{
//      public static int precedence(char ch){
//                if(ch=='+'||ch=='-'){
//                     return 1;
//                }
//                else if(ch=='*'||ch=='/'){
//                     return 2;
//                }
//                else if(ch=='^'){
//                     return 3;
//                }
//                else{
//                     return -1;
//                }
//      }
//      public static String itp(String Expression){
//           String postfix="";
//           Stack<String> stack=new Stack<>();
//           int n=Expression.length();
//           for(int i=0;i<n;i++){
//                char ch=Expression.charAt(i);
//                if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
//                     postfix+=ch;
//                 }
//                 else if(ch=='('){
//                     stack.push(ch+"");
//                 }
//                 else if(ch==')'){
//                     while(!stack.isEmpty() && !(stack.peek().equals("("))){
//                         postfix = postfix+stack.pop();
//                     }
//                     if(!stack.isEmpty()){
//                         stack.pop();
//                     }
//                 }
//                 else {
//                     while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek().charAt(0))){
//                         postfix = postfix+stack.pop();
//                     }
//                     stack.push(ch+"");
//                 }
                
//             }
//             while(!stack.isEmpty()){
//                 postfix=postfix+stack.pop();
//             }
//             return postfix;
//         }    
//      public static void main(String[] args) {
     //      String str = "1+2-3*5";
     //    System.out.println(itp(str));
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
//           tree.delete(root, 12);
//           tree.inorder(root);
//           // System.out.println("Enter the element to search: ");
//           // int search_name=sc.nextInt();
//           // System.out.println(tree.search(root,search_name));
//      }
// }

// class Node{
//      int data;
//      Node right;
//      Node left;
//      Node(int data){
//           this.data=data;
//           this.right=this.left=null;
//      }
// }
// class Bst{
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
//      public Node inorderSuccessor(Node root){
//           if(root.right!=null){
//               root=root.right;
//           }
//           return root;
//       }
//       public Node delete(Node root, int data){
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
//               }
//               Node min = inorderSuccessor(root.right);
//               root.right = delete(root.right, min.data);
//           }
//           return root;
//       }
//       public Node search(Node root,int data){
//           if(root.data==data){
//                return root;
//           }
//           else if(root.data<data){
//                return search(root.right, data);
//           }
//           else if(root.data>data){
//                return search(root.left, data);
//           }
//           return null;
//       }
//      public void display(Node root){
//           if(root!=null){
//                System.out.println(root.data);
//                display(root.left);
//                display(root.right);
//           }
//      }
//      public static void main(String[] args) {
//           Bst b=new Bst();
//           Node root =new Node(10);
//           b.insert(root, 12);
//           b.insert(root, 23);
//           b.insert(root, 2);
//           b.insert(root, 1);
//           b.delete(root, 2);
//           b.display(root);
//           if(b.search(root, 12)!=null){
//                System.out.println("Found");
//           }
//           else{
//                System.out.println("Not Found");
//           }
//      }
// }

// class Node{
//      int data;
//      Node right;
//      Node left;
//      Node(int data){
//           this.data=data;
//           this.right=this.left=null;
//      }
// }
// class BinaryTree{
//      public Node CreateBinary(){
//           System.out.println("Enter a Node value (input -1 is null)");
//           Scanner sc=new Scanner(System.in);
//           int data=sc.nextInt();
//           if(data==-1){
//                return null;
//           }
//           Node current =new Node(data);
//           System.out.println("Enter the Left Node of "+data+": ");
//           current.left=CreateBinary();
//           System.out.println("Enter the right Node of "+data+": ");
//           current.right=CreateBinary();
//           return current;
//      }
//      public boolean search(Node root,int data){
//           if(root==null){
//                return false;
//           }
//           else if(root.data==data){
//                return true;
//           }
//           else{
//                return search(root.left, data)||search(root.right, data);
//           }
//      }
//      public Node delete(Node root,int data){
//           if(root==null){
//                return null;
//           }
//           if(root.data==data){
//                if(root.right==null && root.left==null){
//                     return null;
//                }
//                if(root.left==null){
//                     return root.right;
//                }
//                if(root.right==null){
//                     return root.left;
//                }
//                Node min=inorderSuccessor(root.right);
//                root.right=delete(root.right, min.data);
//           }
//           else{
//                root.left=delete(root.left, data);
//                root.right=delete(root.right, data);
//           }
//           return root;
//      }
//      public Node inorderSuccessor(Node root){
//           while (root.right!=null){
//                root=root.right;
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
//           BinaryTree tree=new BinaryTree();
//           Node root=tree.CreateBinary();
//           tree.delete(root,12);
//           tree.display(root);
//      }
// }

// class sort{
//      static void swap(int arr[],int i,int j){
//           int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//      }
//      static int partition(int arr[],int low,int high){
//           int pr=arr[high];
//           int i=low-1;
//           for(int j=low;j<=high-1;j++){
//                if(arr[j]<pr){
//                     i++;
//                     swap(arr, i, j);
//                }
//           }
//           swap(arr, i+1, high);
//           return i+1;
//      }
//      public static void Quick(int arr[],int low,int high){
//           if(low<high){
//                int p=partition(arr, low, high);
//                Quick(arr, low, p-1);
//                Quick(arr, p+1, high);
//           }
//      }
//      public static void main(String[] args) {
     //      int arr[]={7,8,3,1,2};
     //      int n=arr.length;
     //      Quick(arr,0,n-1);
     //      System.out.println(Arrays.toString(arr));
     // }
// }

// class sort{
//      static void swap(int arr[],int i,int j){
//           int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//      }
//      static int partition(int arr[],int low,int high){
//           int pr=arr[high];
//           int i=low-1;
//           for(int j=low;j<=high-1;j++){
//                if(arr[j]<pr){
//                     i++;
//                     swap(arr, i, j);
//                }  
//           }
//           swap(arr, i+1, high);
//           return i+1;
//      }
//      static void Quick(int arr[],int low,int high){
//           if(low<high){
//                int p=partition(arr, low, high);
//                Quick(arr, low, p-1);
//                Quick(arr, p+1, high);
//           }
//      }
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length;
//           Quick(arr,0,n-1);
//           System.out.println(Arrays.toString(arr));
//      }
// }

// class Node{
//      int data;
//      Node link;
// }
// class List{
//      Node start,end;
//      List(){
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
//                end.link=start;
//           }
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
//                end.link=start;
//           }
//      }
     // public void addpostion(int x,int p){
     //      if(p<0){
     //           System.out.println("The");
     //      }
     // }
     // public void delFirst(){
     //      if(start==null){
     //           System.out.println("The List is Empty");
     //      }
     //      else{
     //           start=start.link;
     //           end.link=start;
     //      }
     // }
     // public void delEnd(){
     //      if(start==null){
     //           System.out.println("The List is Empty");
     //      }
     //      else{
     //           Node temp=start;
     //           while (temp.link.link!=null){
     //                temp=temp.link;
     //           }
     //           temp.link=null;
     //      }
     // }
//      public void display(){
//           // Node n=end;
//           // while (n!=null){
//           //      System.out.println(n.data);
//           //      n=n.link;
//           // }
//           Node n=start;
//           do{
//                System.out.println(n.data);
//                n=n.link;
//           }while(n!=start);
//      }
//      public static void main(String[] args) {
//           List l=new List();
//           l.addFirst(1);
//           l.addFirst(2);
//           l.addFirst(23);
//           l.addLast(5);
//           l.delFirst();
//           // l.delEnd();
//           l.display();
//      }
// }

// class Node{
//      int data;
//      Node Rlink;
//      Node Llink;
// }

// class Dlist{
//      Node start,end;
//      Dlist(){
//           start=end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                return;
//           }
//           n.Rlink=start;
//           start.Llink=n;
//           start=n;
//      }
//      public void addEnd(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//                return;
//           }
//           end.Rlink=n;
//           n.Llink=end;
//           end=n;
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           else if(start==end){
//                start=end=null;
//           }
//           else{
//                start=start.Rlink;
//                start.Llink=start;
//           }
//      }
//      public void displayf(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.Rlink;
//           }
//      }
//      public void displayb() {
//           Node n = end;
//           System.out.println("Backward traversal:");
//           while (n != null) {
//               System.out.print(n.data + " ");
//               n = n.Llink;
//           }
//           System.out.println();
//       }
//      public static void main(String[] args) {
//           Dlist d=new Dlist();
//           d.addEnd(1);
//           d.addEnd(2);
//           d.addEnd(3);
//           d.addEnd(5);
//           d.addEnd(4);
//           //d.displayf();
//           d.displayb();
//      }
// }

// class practice {
//      public static int precedence(char ch){
//           if(ch=='+' || ch=='-'){
//                return 1;
//           }
//           else if(ch=='*'||ch=='/'){
//                return 2;
//           }
//           else if(ch=='^'){
//                return 3;
//           }
//           else{
//                return -1;
//           }
//      }
//      public static String itp(String Expression){
//           int n=Expression.length();
//           String prefix="";
//           Stack<String> stack =new Stack<>();
//           for(int i=n-1;i>=0;i--){
//                char ch=Expression.charAt(i);
//                if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0' && ch<='9')){
//                     prefix = ch + prefix;
//                }
//                else if(ch==')'){
//                     stack.push(ch+"");
//                }
//                else if(ch=='('){
//                     if(!stack.isEmpty() && !stack.peek().equals(')')){
//                          prefix = stack.pop() + prefix;
//                     }
//                     else if(!stack.isEmpty()){
//                          stack.pop();
//                     }
//                }
//                else{
//                     if(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek().charAt(0))){
//                          prefix = stack.pop() + prefix;
//                     }
//                     stack.push(ch+"");
//                }
//           }
//           while (!stack.isEmpty()){
//                prefix = stack.pop() + prefix;
//           }
//           return prefix;
//      }
//      public static void main(String[] args) {
//           String str = "2+3-5/6+6-2*3";
//           System.out.println("The prefix Expression is: ");
//           System.out.println(itp(str));
//      }
// }

