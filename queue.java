import java.util.*;
// public class queue{
//      static class Queue{
//           static int arr[];
//           static int size;
//           // static int front=-1;
//           static int rear=-1;
//           Queue(int size){
//                arr=new int[size];
//                this.size=size;
//           }
//           public static boolean isEmpty(){
//                return rear==-1;
//           }
//           public static void add(int x){
//                if(rear==size-1){
//                     System.out.println("The Queue is Full");
//                     return;
//                }
//                else{
//                     rear++;
//                     arr[rear]=x;
//                }
//           }
//           public static int pop(){
//                if(rear==-1){
//                     System.out.println("The queue is Empty");
//                     return -1;
//                }
//                else{
//                     int top=arr[0];
//                     for(int i=0;i<rear;i++){
//                          arr[i]=arr[i+1];
//                     }
//                     return top;
//                }
//           }
          
//           public static int peek(){
//                if(rear==-1){
//                     System.out.println("The queue is Empty");
//                     return -1;
//                }
//                else{
//                     int top=arr[0];
//                     return top;
//                }
//           }
//           public static void display(){
//                for(int i=0;i<=rear;i++){
//                     System.out.println(arr[i]);
//                }
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue(5);
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           q.add(4);
//           q.pop();
//           // System.out.println("The peek:"+q.peek());
//           q.display();
//      }
// }

// Linked list
// class Node {
//      int data;
//      Node link;
//  }
 
//  class List {
//      Node start, end;
 
//      List() {
//          start = end = null;
//      }
 
//      public void create(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//          } else {
//              end.link = n;
//              end = n;
//          }
//      }
 
//      public void infront(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//          } else {
//              n.link = start;
//              start = n;
//          }
//      }
//      public void inpost(int x, int pos) {
//           Node n = new Node();
//           n.data = x;
//           if (pos <= 0) {
//               System.out.println("Position must be greater than 0");
//           }
//           if (pos == 1) {
//               infront(x);
//               return;
//           }      
//           Node temp = start;
//           int k = 1;
//           while (temp != null && k < pos - 1) {
//               temp = temp.link;
//               k++;
//           }
//           if (temp == null) {
//                System.out.println("Position out of range");
//           }
//           n.link = temp.link;
//           temp.link = n;
//           if (n.link == null){
//               end = n;
//           }
//       }
//      public void reverse() {
//          Node prev =null;;
//          Node current=start;
//          Node next=null;
//          while(current!=null){
//                next=current.link;
//                current.link=prev;
//                prev=current;
//                current=next;
//          }
//          start=prev;
//      }
//      public void indelete(){
//           if(start==null){
//                System.out.println("The empty Linked list");
//           }
//           else{
//                start=start.link;
//           }

//      }
//      public void endelete(){
//           if (start == null) {
//                System.out.println("The Linked list is empty.");
//                return;
//           }
//           if(start.link==null){
//                start=null;
//                return;
//           }
//           Node temp=start;
//           while (temp.link.link!=null) {
//                temp=temp.link;
//           }
//           temp.link=null;
//      }
//      public void anydelete(int pos){
//           if (start == null) {
//                System.out.println("The Linked list is empty.");
//                return;
//           }
//           if(pos==0){
//                indelete();
//                return;
//           }
//           Node temp=start;
//           Node prev=null;
//           int currentpo=0;
//           while (temp!=null && currentpo<pos){
//                prev=temp;
//                temp=temp.link;
//                currentpo++;
//           }
//           prev.link=temp.link;
//      }
//      public void searching(int element){
//           int k=0;
//           Node temp=start;
//           while (temp != null) {
//                if (temp.data == element) {
//                    System.out.println("Element " + element + " found at position " + k);
//                    return; 
//                }
//                temp = temp.link;
//                k++;
//            }
//            System.out.println("Element " + element+ " is not found in the list.");
//      }
//      public void swapNode(int val1, int val2){
//           Node temp1=start;
//           Node prev1=null;
//           while (temp1!=null && temp1.data!=val1){
//                prev1=temp1;
//                temp1=temp1.link;
//           }
//           Node temp2=start;
//           Node prev2=null;
//           while (temp2!=null && temp2.data!=val2){
//                prev2=temp2;
//                temp2=temp2.link;
//           }
//           if(temp1!=null && temp2!=null){
//                if(prev1!=null){
//                     prev1.link=temp2;
//                }
//                else{
//                     start=temp2;
//                }
//                if(prev2!=null){
//                     start=temp1;
//                }
//                else{
//                     start=temp1;
//                }
//           }
//           Node temp = temp1.link;
//           temp1.link = temp2.link;
//           temp2.link= temp;

//      }
  
//      public void display() {
//          Node n = start;
//          while (n != null) {
//              System.out.println(n.data);
//              n = n.link;
//          }
//      }
//      public static void main(String[] args) {
//          List l = new List();
//          l.create(1);
//          l.infront(3);
//          l.create(2);
//      //     l.searching(2);
//      //     l.inpost(5, 1);
//      //     l.reverse();
//      //      l.indelete();
//      //      l.endelete();
//      //      l.anydelete(0);
//          l.display();
//          l.swapNode(1, 3);
//          l.display();
//      }
//  }



// Double Linked list
// class Node{
//      int data;
//      Node Llink;
//      Node Rlink;
// }
// class Dlink{
//      Node start,end;
//      Dlink(){
//           start=end=null;
//      }
//      void create(int x){
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
//      void infront(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=null;
//           }
//           else{
//                n.Rlink=start;
//                start.Llink=n;
//                start=n;
//           }
//      }
//      void inrear(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=null;
//           }
//           else{
//                end.Rlink=n;
//                n.Llink=end;
//                end=n;
//           }
//      }
// }

// class Node{
//      Node link;
//      int data;
// }
// class clink{
//      Node start,end;
//      clink(){
//           start=end=null;
//      }
//      public void infront(int x){
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
//      public void inrear(int x){
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
//      public void insert(int x,int pos){
//           Node temp=start;
//           Node n=new Node();
//           n.data=x;
//           int k=1;
//           if(pos==1){
//                infront(x);
//                return;
//           }
//           while (temp!=null && k<pos){
//                temp=temp.link;
//                k++;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link==null){
//                end=n;
//           }
//      }
//      public void indelete(){
//           if(start==null){
//                System.out.println("The clink is isEmpty");
//           }
//           else if(start==end){
//                start=end=null;
//           }
//           else{
//                start=start.link;
//                end.link=start;
//           }
//      }
//      public void endelete(){
//           if(start==null){
//                System.out.println("The clink is isEmpty");
//           }
//           else{
//                Node temp=start;
//                while (temp.link!=end){
//                     temp=temp.link;
//                }
//                temp.link=start;
//                end=temp;
//           }
//      }
//      public void inanypos(int pos){
//           if (start == null) {
//                System.out.println("The Linked list is empty.");
//                return;
//           }
//           if(pos==0){
//                indelete();
//                return;
//           }
//           Node temp=start;
//           Node prev=null;
//           int currentpo=0;
//           while (temp!=null && currentpo<pos){
//                prev=temp;
//                temp=temp.link;
//                currentpo++;
//           }
//           prev.link=temp.link;

//      }
//      public void display(){
//           Node n=start;
//           do{
//                System.out.println(n.data);
//                n=n.link;
//           }while (n!=start);
//      }

//      public static void main(String[] args) {
//           clink c=new clink();
//           c.infront(1);
//           c.inrear(2); 
//           c.inrear(3);
//           c.insert(4, 3);
//           c.indelete();
//           c.inanypos(2);
//           c.display(); 
//      }
// }


// class myStack{
//      int arr[]=new int[5];
//      int top=-1;
//      public void push(int data){
//           if(top>=5){
//                System.out.println("The stack is Full");
//           }
//           else{
//                top++;
//                arr[top]=data;
//           }
//      }
//      public void pop(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                // int re=arr[top];
//                top--;//top=top-1;
//           }
//      }
//      public void peek(){
//           if(top==-1){
//                System.out.println("The Stack is Empty");
//           }
//           else{
//                int re=arr[top];
//                System.out.println(re);
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
//      public static void main(String[] args) {
//           myStack s=new myStack();
//           s.push(1);    
//           s.push(2);    
//           s.push(3);  
//           System.out.println("The peek is"+" ");
//           s.peek();
//           System.out.println("The Elements:");
//           s.display();
//      }
// }


// class Queue{
//      int arr[]=new int[5];
//      int front=-1;
//      int rear=-1;
//      public void enqueue(int x){
//           if(rear>=5){
//                System.out.println("The Queue is Full");
//           }
//           else{
//                rear++;
//                arr[rear]=x;
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
//                int re=arr[front];
//                if(rear==front){
//                     rear=front=-1;
//                }
//                else{
//                     front++;
//                }
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
//           q.enqueue(1);
//           q.enqueue(2);
//           q.enqueue(3);
//           q.dequeue();
//           q.display();
//      }
// }

// class Cqueue{
//      int arr[]=new int[5];
//      int front=-1;
//      int rear=-1;
//      public void Cequeue(int x){
//           if(rear==-1){
//                rear=0;
//                front=0;
//                arr[rear]=x;
//           }
//           else{
//                int next=(rear+1)%5;
//                if(next==rear){
//                     System.out.println("The Cqueue is Full");
//                }
//                else{
//                     rear=next;
//                     arr[rear]=x;
//                }
//           }
//      }
//      public void display(){
//           int t=front;
//           while (t!=rear){
//                System.out.println(arr[t]);
//                t=(t+1)%5;
//           }
//           System.out.println(arr[rear]);
//      }
//      public static void main(String[] args) {
//           Cqueue c=new Cqueue();
//           c.Cequeue(1);
//           c.Cequeue(2);
//           c.Cequeue(3);
//           c.Cequeue(4);
//           c.Cequeue(5);
//           c.Cequeue(6);
//           c.Cequeue(7);
//           c.display();
//      }
// }

// class Node{
//      int data;
//      Node link;
//      Node(int data){
//           this.data=data;
//           this.link=null;
//      }
// }
// class Stack{
//      Node top;
//      public void push(Node n){
//           Node temp=top;
//           if(top==null){
//                top=n;
//                return;
//           }
//           else{
//                top=n;
//                n.link=temp;
//           }
//      }
//      public void pop(){
//           if(top==null){
//                System.out.println("The Stack is Empty");
//           }
//           int val=top.data;
//           top=top.link;
//      }
//      public void display(){
//           if(top==null){
//                System.out.println("The Stack is Empty");
//           }
//           Node temp=top;
//           while (temp!=null){
//                System.out.println(temp.data);
//                temp=temp.link;
//           }
//      }
//      public static void main(String[] args) {
//           Stack s=new Stack();
//           Node n1=new Node(1);
//           Node n2=new Node(2);
//           s.push(n1);
//           s.push(n2);
//           s.pop();
//           s.display();
//      }
// }

public class queue {
     public static  int sum(int arr[],int k){
          int sum=0;
          for(int i=0;i<arr.length;i++){
               if(i-k>=0 && arr[i]<arr[i-k]){
                    sum+=0;
               }
               else if(i+k<arr.length && arr[i]<arr[i+k]){
                    sum+=0;
               }
               else{
                    sum+=arr[i];
               }

          }
          return sum;
     }
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int k=sc.nextInt();
          int arr[]=new int[n];
          for (int i = 0; i < n; i++) {
               arr[i]=sc.nextInt();
          }
          System.out.println(sum(arr,k));

     }
}
