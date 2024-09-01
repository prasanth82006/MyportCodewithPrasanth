import java.util.*;
// Stack
// public class pract {
//      static class Node{
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
//           public static void push(int data){
//                Node newnode=new Node(data);
//                if(isEmpty()){
//                    head=newnode;
//                    return;
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
//      public static void pushAtBottom(int data,Stack<Integer> s){
//           if(s.isEmpty()){
//                s.push(data);
//                return;
//           }
//           int top=s.pop();
//           pushAtBottom(data, s);
//           s.push(top);
//      }
//      public static void reverse(Stack<Integer> s){
//           if(s.isEmpty()){
//                return;
//           }
//           int top=s.pop();
//           reverse(s);
//           pushAtBottom(top, s);

//      }
//      public static void main(String[] args) {
//           // stack s=new stack();
//           Stack<Integer> s=new Stack<>();
//           s.push(1);
//           s.push(3);
//           s.push(2);
//           // pushAtBottom(4,s);
//           reverse(s);
//           while (!s.isEmpty()){
//                System.out.println(s.peek());
//                s.pop();
               
//           }
//      }
// }
// }

// import java.util.Stack;
// public class pract{
//     public static String removeAdjacentDuplicates(String s){
//         Stack<Character> stack = new Stack<>();
//         for (char c : s.toCharArray()) {
//             if (!stack.isEmpty() && stack.peek() == c) {
//                 stack.pop();
//             } else {
//                 stack.push(c);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         while (!stack.isEmpty()) {
//             result.insert(0, stack.pop());
//         }
//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String originalString = "ababbac";
//         String result = removeAdjacentDuplicates(originalString);
//         System.out.println("Original String: " + originalString);
//         System.out.println("After removing duplicates: " + result);
//     }
// }

// adjacent element removing in stack
// public class pract {
//      public static String remove(String s){
//           Stack<Character> stack=new Stack<>();
//           for(char c:s.toCharArray()){
//                if(!stack.isEmpty() && stack.peek()==c){
//                     stack.pop();
//                }
//                else{
//                     stack.push(c);
//                }
//           }
//           StringBuilder result= new StringBuilder();
//           while (!stack.isEmpty()){
//                result.insert(0, stack.pop());
//           }
//           return result.toString();
//      }
//      public static void main(String[] args) {
//           String originalString = "ababbac";
//           String result = remove(originalString);
//           System.out.println("Original String: " + originalString);
//           System.out.println("After removing duplicates: " + result);
//      }
// }

// Queue
// public class pract {
//      static class Queue{
//           static int arr[];
//           static int size;
//           static int rear=-1;
//           Queue(int n){
//                arr=new int[n];
//                this.size=n;
//           }
          // public static boolean isEmpty(){
          //      return rear==-1;
          // }
//           // add
//           public static void add(int data){
//                if(rear==size){
//                     System.out.println("Full Queue");
//                     return;
//                }
//                rear++;
//                arr[rear]=data;
//           }
//           public static int remove(){
//                if(rear==size){
//                     return -1;
//                }
//                int front=arr[0];
               
//                for(int i=0;i<rear;i++){
//                     arr[i]=arr[i+1];
//                }
//                rear--;

//                return front;
//           }
//           public static int peek(){
//                if(rear==size){
//                     return -1;
//                }
//                int front=arr[0];
//                return front;
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue(5);
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           q.add(4);
//           q.add(5);
//           while (!q.isEmpty()){
//                System.out.println(q.peek());
//                q.remove();    
//           }
//      }
// }

//QUEUE BY  Linked List
// public class pract {
//      static class Node{
//           int data;
//           Node next;
//           Node(int data){
//                this.data=data;
//                this.next=null;
//           }
//      }
//      static class Queue{
//           static Node head=null;
//           static Node tail=null;
//           public static boolean isEmpty(){
//                return head==null & tail==null;
//           }
//           // add
//           public static void add(int data){
//                Node newnode=new Node(data);
//                if(tail==null){
//                     tail=head=newnode;
//                     return;
//                }
//                tail.next=newnode;
//                tail=newnode;
//           }
//           public static int remove(){
//                if(isEmpty()){
//                     System.out.println("empty queue");
//                     return -1;
//                }
//                if(head==tail){
//                     tail=null;
//                }
//                int front=head.data;
//                head=head.next;
//                return front;
//           }
//           public static int peek(){
//                if(isEmpty()){
//                     System.out.println("empty queue");
//                     return -1;
//                }
//                int front=head.data;
//                return front;
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue();
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           q.add(4);
//           q.add(5);
//           while (!q.isEmpty()){
//                System.out.println(q.peek());
//                q.remove();    
//           }
//      }
// }

// by uncle
// public class pract {
//      static class  Queue{
//           static int arr[];
//           static int size;
//           static int rear=-1;
//           static int front=-1;
//           Queue(int n){
//                arr=new int[n];
//                this.size=n;
//           }
//           public static void enqueue(int item){
//                if(rear==size-1){
//                     System.out.println("The queue is Full");
//                }
//                else{
//                     rear++;
//                     arr[rear]=item;
//                     if(rear==0){
//                          front=0;
//                     }
//                }
//           }
//           public static void dequeue(){
//                if(front==-1){
//                     System.out.println("The queue is Empty");
//                }
//                else{
//                     int re=arr[front];
//                     if(front==rear){
//                          front=rear=-1;
//                     }
//                     else{
//                          front+=1;
//                     }
//                }
//           }
//           public static void display(){
//                if(front==-1){
//                     System.out.println("The queue is Empty");
//                }
//                for(int i=front;i<=rear;i++){
//                     System.out.println(arr[i]);
//                }
//           }
//      }
//      public static void main(String[] args) {
//           Queue q= new Queue(5);
//           int c,I;
//           Scanner sc=new Scanner(System.in);
//           do{
//                System.out.println("Press 1 for add");
//                System.out.println("Press 2 for remove");
//                System.out.println("Press 3 for display");
//                System.out.println("Press 4 for Exist");
//                System.out.println("Enter a number:");
//                c=sc.nextInt();
//                switch (c) {
//                     case 1:
//                          System.out.println("Enter item to add");
//                          I=sc.nextInt();
//                          q.enqueue(I);
//                          break;
//                     case 2:
//                          System.out.println("The element is successfully removed");
//                          q.dequeue();
//                          break;
//                     case 3:
//                          System.out.println("The elements:");
//                          q.display();
//                }
//           }while(c<4);
//      }
// }

// class Node{
//      Node Rlink;
//      Node Llink;
//      int data;
// }
// class Dlist{
//      Node start,end;
//      Dlist(){
//           start=end=null;
//      }
//      public void create(int x){
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
//      public void infront(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                start.Llink=n;
//                n.Rlink=start;
//                start=n;
//           }
//      }
//      public void inrear(int x){
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
//      public void inanypos(int x,int pos){
//           Node n=new Node();
//           n.data=x;
//           Node temp,ptr;
//           int k=1;
//           ptr=start;
//           temp=ptr;
//           while (k<pos){
//                temp=ptr;
//                ptr=ptr.Rlink;
//                k++;
//           }
//           temp.Rlink=n;
//           n.Llink=temp;
//           n.Rlink=ptr;
//           ptr.Llink=n; 
//      }
//      public void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.Rlink;
//           }
//      }
//      public static void main(String[] args) {
//           Dlist dl=new Dlist();
//           dl.create(1);
//           dl.create(2);
//           dl.create(3);
//           dl.create(4);
//           dl.infront(2);
//           dl.display();
//      }
// }

// public class pract {
//      public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//           String s=sc.next();
//           for(int i=0;i<s.length();i++){
//                if(i==s.length()-1){
//                         System.out.println(s.charAt(i));
//                }
//                else{
//                     System.out.println(s.charAt(i)+"!");
//                }
//           }
//      }
// }

// 1.Postfix to infix?
// class Stack {
//     private int maxSize; 
//     private int top; 
//     private int[] stackArray; 
//     public Stack(int size) {
//         this.maxSize = size;
//         this.stackArray = new int[maxSize];
//         this.top = -1; 
//     }

//     public void push(int value) {
//         if (isFull()) {
//             System.out.println("Stack is full! Cannot push " + value);
//         } else {
//             stackArray[++top] = value;
//         }
//     }

//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty! Cannot pop");
//             return -1; 
//         } else {
//             return stackArray[top--]; 
//         }
//     }

//     public boolean isEmpty() {
//         return (top == -1);
//     }

    
//     public boolean isFull() {
//         return (top == maxSize - 1);
//     }

//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//         } else {
//             System.out.println("Stack elements:");
//             for (int i = 0; i <= top; i++) {
//                 System.out.print(stackArray[i] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public boolean operator(char c){
//         if(c=='+'||c=='-'||c=='*'||c=='/'){
//             return true;
//         }
//         return false;
//     }
//     public int posttoinfix(String post){
//      int infix=0;
//      for(int i=0;i<post.length();i++){
//          char c=post.charAt(i);
         
//          if(!operator(c)){
//              push(Character.getNumericValue(c));
//          }else{
//              int operand1=pop();
//              int operand2=pop();
//              switch(c){
//                  case '+':
//                      infix=operand2+operand1;
//                      break;
//                  case '-':
//                      infix=operand2-operand1;
//                      break;
//                  case '*':
//                      infix=operand2*operand1;
//                      break;
//                  case '/':
//                      infix=operand2/operand1;
//                      break;
//                  default :
//                      System.out.println("improper");
//              }
//              push(infix);
//          }
//      }
//      return pop();
//  }
//     public static void main(String[] args) {
//         Stack stack = new Stack(5);
//         System.out.println(stack.posttoinfix("23+56*/"));
        
//     }
// }
// 2.prefix to infix?
// class Stack {
//     private int maxSize; 
//     private int top;
//     private int[] stackArray; 

//     public Stack(int size) {
//         this.maxSize = size;
//         this.stackArray = new int[maxSize];
//         this.top = -1; 
//     }
//     public void push(int value) {
//         if (isFull()) {
//             System.out.println("Stack is full! Cannot push " + value);
//         } else {
//             stackArray[++top] = value; 
//         }
//     }

//     // Method to pop an element from the stack
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty! Cannot pop");
//             return -1; // return an invalid value
//         } else {
//             return stackArray[top--]; 
//         }
//     }

//     public boolean isEmpty() {
//         return (top == -1);
//     }
//     public boolean isFull() {
//         return (top == maxSize - 1);
//     }

//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//         } else {
//             System.out.println("Stack elements:");
//             for (int i = 0; i <= top; i++) {
//                 System.out.print(stackArray[i] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public boolean operator(char c){
//         if(c=='+'||c=='-'||c=='*'||c=='/'){
//             return true;
//         }
//         return false;
//     }
//     public int pretoinfix(String pre){
//         int infix=0;
//         for(int i=pre.length()-1;i>=0;i--){
//             char c=pre.charAt(i);
//             if(!operator(c)){
//                 push(Character.getNumericValue(c));
//             }else{
//                 int operand1=pop();
//                 int operand2=pop();
//                 switch(c){
//                     case '+':
//                         infix=operand1+operand2;
//                         break;
//                     case '-':
//                         infix=operand1-operand2;
//                         break;
//                     case '*':
//                         infix=operand1*operand2;
//                         break;
//                     case '/':
//                         infix=operand1/operand2;
//                         break;
//                     default :
//                         System.out.println("improper");
//                 }
//                 push(infix);
//             }
//         }
//         return pop();
//     }
//     public static void main(String[] args) {
//         Stack stack = new Stack(8);
//         System.out.println(stack.pretoinfix("/*89+56"));        
//     }
// }

// public class pract{
//     public static String removeAdjacentDuplicates(String s){
//         Stack<Character> stack = new Stack<>();
//         for (char c : s.toCharArray()) {
//             if (!stack.isEmpty() && stack.peek() == c) {
//                 stack.pop();
//             } else {
//                 stack.push(c);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         while (!stack.isEmpty()) {
//             result.insert(0, stack.pop());
//         }
//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String originalString = "ababbac";
//         String result = removeAdjacentDuplicates(originalString);
//         System.out.println("Original String: " + originalString);
//         System.out.println("After removing duplicates: " + result);
//     }
// }

// import java.util.Stack;

// public class pract {
//     static Stack<Character> stack = new Stack<>();

//     public static void remove(String s) {
//         for (int i = 0; i < s.length(); i++) {
//             if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
//                 stack.pop();
//             } else {
//                 stack.push(s.charAt(i));
//             }
//         }
//     }

//     public static void display() {
//         while (!stack.isEmpty()) {
//             System.out.print(stack.peek());
//             stack.pop();
//         }
//     }

//     public static void main(String[] args) {
//         pract p = new pract();
//         remove("ababbac");
//         display();
//     }
// }
