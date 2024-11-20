import java.util.*;
// class Stack{
//      static Scanner sc=new Scanner(System.in);
//      int c,top;
//      int arr[];
//      Stack(int c){
//           this.c=c;
//           arr=new int[c];
//           top=-1;
//      }
//      public void push(int x){
//           if(top>=c){
//                System.out.println("The Stack is Full");
//           }
//           else{
//                top++;
//                arr[top]=x;
//           }
//      }
//      public void pop(){
//           if(top==-1){
//                System.out.println("The array is Empty");
//           }
//           else{
//                top--;
//           }
//      }
//      public int peek(){
//           if(top==-1){
//                System.out.println("The array is Empty");
//           }
//           else{
//                return arr[top];
//           }
//           return -1;
//      }
//      public void display(){
//           if(top==-1){
//                System.out.println("The array is Empty");
//           }
//           else{
//                for(int i=0;i<=top;i++){
//                     System.out.println(arr[i]);
//                }
//           }
//      }
//      public static void main(String[] args) {
//           Stack s=new Stack(5);
//           s.push(1);    
//           s.push(2);    
//           s.push(3);    
//           s.push(4);
//           s.pop();
//           System.out.println("The peek element:"+s.peek());
//           s.display();   
//      }
// }

// class Queue{
//      int arr[];
//      int c;
//      int front=-1,rear=-1;
//      Queue(int c){
//           this.c=c;
//           arr=new int[c];
//      }
//      public void enqueue(int x){
//           if(rear==c){
//                System.out.println("The Queue is Full");
//           }
//           else{
//                rear++;
//                if(rear==0){
//                     front=0;
//                }
//                arr[rear]=x;
//           }
//      }
//      public void dequeue(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else if(front==rear){
//                front=rear=-1;
//           }
//           else{
//                front=front+1;
//           }
//      }
//      public int peek(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else{
//                return arr[rear];
//           }
//           return -1;
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
//           Queue q=new Queue(5);
//           q.enqueue(1);
//           q.enqueue(2);
//           q.enqueue(3);
//           q.enqueue(4);
//           q.dequeue();
//           System.out.println("The Peek value:"+q.peek());
//           q.display();
//      }
// }

// class CQueue{
//      int c;
//      int arr[];
//      int front=-1,rear=-1;
//      CQueue(int c){
//           this.c=c;
//           arr=new int[c];
//      }
//      public void push(int x){
//           if(rear==-1){
//                rear=0;
//                front=0;
//                arr[rear]=x;
//           }
//           else{
//                int next=(rear+1)%c;
//                if(next==rear){
//                     System.out.println("The CQueue is Full");
//                     return;
//                }
//                else{
//                     rear=next;
//                     arr[rear]=x;
//                }
//           }
//      }
//      public void pop(){
//           if(front==-1){
//                System.out.println("The CQueue is Empty");
//           }
//           else{
//                if(front==rear){
//                     front=rear=-1;
//                }
//                else{
//                     front=(front+1)%c;
//                }
//           }
//      }
//      public void display(){
//           int t=front;
//           while (t!=rear){
//                System.out.println(arr[t]);
//                t=(t+1)%c;
//           }
//           System.out.println(arr[rear]);
//      }
//      public static void main(String[] args) {
//           CQueue q=new CQueue(5);
//           q.push(1);
//           q.push(2);
//           q.push(3);
//           q.push(4);
//           q.push(5);
//           q.display();
//           System.out.println("The Queu after pop:");
//           q.pop();
//           q.push(7);
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
//           start=null;
//           end=null;
//      }
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                start.link=n;
//                n.link=start;
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
//           }
//      }
//      public void addpostion(int x,int p){
//           Node n=new Node();
//           n.data=x;
//           int k=1;
//           Node temp=start;
//           if(p<0){
//                System.out.println("The Position must be Greater than Or Equal to Zero");
//                return;
//           }
//           if(p==0){
//                addFirst(x);
//                return;
//           }
//           while (temp!=null && k<p){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("The Position out of Range");
//                return;                
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link==null){
//                end=n;
//           }
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Linked list is Empty");
//                return;
//           }
//           else{
//                start=start.link;
//           }
//      }
//      public void delLast(){
//           if(start==null){
//                System.out.println("The Linked List is Empty");
//            }
//            else{
//                Node temp=start;
//                while (temp.link.link!=null){
//                     temp=temp.link;
//                }
//                temp.link=null;
//            }
   
//      }
//      public void delposition(int p){
//           int k=0;
//           Node temp=start;
//           Node prev=null;
//           if(p<0){
//                System.out.println("The Position must be Greater than Or Equal to Zero");
//                return;
//           }
//           if(p==0){
//                delFirst();
//                return;
//           }
//           while (temp.link!=null && k<p){
//                prev=temp;
//                temp=temp.link;
//                k++;
//           }
//           prev.link=temp.link;
//      }
//      public void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.link;
//           }
//      }
//      public void reverse(){
//           Node current=start;
//           Node next=null;
//           Node prev=null;
//           while (current!=null){
//                next=current.link;
//                current.link=prev;
//                prev=current;
//                current=next;
//           }
//           start=prev;
//      }
//      public static void main(String[] args) {
//           List l=new List();
//           l.addFirst(1);
//           l.addLast(2);
//           l.addLast(3);
//           l.addLast(4);
//           l.addpostion(6, 4);
//           // l.reverse();
//           l.delposition(1);
//           l.display();
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
//           }
//      }
//      public void addPosition(int x,int p){
//           Node n=new Node();
//           n.data=x;
//           int k=1;
//           Node temp=start;
//           if(p<0){
//                System.out.println("The Position is must be greater than 0");
//                return;
//           }
//           if(p==0){
//                addFirst(0);
//                return;
//           }
//           while (temp!=null && k<p){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("The Element cannot be added");
//                return;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link==null){
//                end=n;
//           }
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The Linked list is Empty");
//                return;
//           }
//           else{
//                start=start.link;
//           }
//      }
//      public void delLast() {
//           if (start == null) { 
//               System.out.println("The Linked list is empty");
//               return;
//           } else if (start == end) {
//               start = null;
//               end = null;
//           } else {
//               Node temp = start;
//               while (temp.link != end) {
//                   temp = temp.link;
//               }
//               temp.link = start; 
//               end = temp;
//           }
//      }
//      public void delposition(int p){
//           if(p<0){
//                System.out.println("The Position is must be greater than 0");
//                return;
//           }
//           if(p==0){
//                delFirst();
//                return;
//           }
//           int k=0;
//           Node temp=start;
//           Node prev=null;
//           while (temp!=null && k<p) {
//                prev=temp;
//                temp=temp.link;
//                k++;
//           }
//           prev.link=temp.link;
//      }
//      public void reverse(){
//           Node current=start;
//           Node prev=null;
//           Node next=null;
//           while (current!=null){
//                next=current.link;
//                current.link=prev;
//                prev=current;
//                current=next;
//           }
//           start=prev;
//      }
//      public void display(){
//           if (start == null) {
//               System.out.println("The Linked list is empty");
//               return;
//           }
//           Node n = start;
//           do {
//               System.out.println(n.data);
//               n = n.link;
//           } while (n != start);
//      }
//      public static void main(String[] args) {
//           List l=new List();
//           l.addFirst(1);
//           l.addFirst(2);
//           l.addFirst(3);
//           // l.reverse();
//           l.addPosition(4, 2);
//           l.delFirst();
//           l.delposition(1);
//           l.delLast();
//           l.display();
//      }
// }

// class Node{
//      Node link;
//      int data;
// }
// class List{
//      Node start,end;
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
//      }
//      public void addPosition(int x,int p){
//           Node n=new Node();
//           n.data=x;
//           Node temp=start;
//           int k=1;
//           if(p==0){
//                addFirst(x);
//                return;
//           }
//           if(p<0){
//                System.out.println("The P must be Greater than 0");
//           }
//           while (temp!=null && k<p){
//                temp=temp.link;
//                k++;
//           }
//           if(temp==null){
//                System.out.println("The Position is Not Found");
//                return;
//           }
//           n.link=temp.link;
//           temp.link=n;
//           if(n.link!=null){
//                end=n;
//           }
//      }
//      public void delFirst(){
//           if(start==null){
//                System.out.println("The List is Empty");
//                return;
//           }
//           else{
//                start=start.link;
//           }
//      }
//      public void reverse(){
//           Node current=start;
//           Node prev=null;
//           Node next=null;
//           while (current!=null){
//                next=current.link;
//                current.link=prev;
//                prev=current;
//                current=next;
//           }
//           start=prev;
//      }
//      public void delEnd(){
//           if(start==null){
//                System.out.println("The List is Empty");
//                return;
//           }
//           else{
//                Node temp=start;
//                while (temp.link.link!=null){
//                     temp=temp.link;
//                }
//                temp.link=null;
//           }
//      }
//      public void delposition(int p){
//           if (p < 0) {
//                System.out.println("The position must be greater than or equal to 0.");
//                return;
//           }
//           if (p == 0) {
//                delFirst();
//                return;
//           }          
//           Node temp=start;
//           Node prev=null;
//           int k=0;
//           while (temp!=null && k<p){
//                prev=temp;
//                temp=temp.link;
//                k++;
//           }
//           prev.link=temp.link;
//           if(temp==null){
//                System.out.println("The Position is Not Found");
//                return;
//           }
//           if(temp.link==null){
//                end=prev;
//           }
//      }
//      public void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.link;
//           }
//      }
//      public static void main(String[] args) {
//           List l=new List();
//           l.addFirst(1);
//           l.addFirst(2);
//           l.addLast(3);
//           l.addPosition(6, 1);
//           // l.reverse();
//           // l.delFirst();
//           // l.delEnd();
//           l.delposition(3);
//           l.display();
//      }
// }

// Circular Linked list
// class Node {
//      int data;
//      Node link;
//  }
 
//  class Clist {
//      Node start, end;
 
//      public void addFirst(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//              end.link = start; // Circular link
//          } else {
//              n.link = start;
//              start = n;
//              end.link = start; // Update circular link
//          }
//      }
 
//      public void addLast(int x) {
//          Node n = new Node();
//          n.data = x;
//          if (start == null) {
//              start = end = n;
//              end.link = start; // Circular link
//          } else {
//              end.link = n;
//              end = n;
//              end.link = start; // Update circular link
//          }
//      }
 
//      public void addPosition(int x, int p) {
//          if (p < 0) {
//              System.out.println("Position must be greater than or equal to 0");
//              return;
//          }
//          if (p == 0) {
//              addFirst(x);
//              return;
//          }
//          Node n = new Node();
//          n.data = x;
//          Node temp = start;
//          int k = 1;
 
//          // Traverse to the (p-1)th position
//          while (temp.link != start && k < p) {
//              temp = temp.link;
//              k++;
//          }
//          if (k < p) {
//              System.out.println("Position not found");
//              return;
//          }
//          n.link = temp.link;
//          temp.link = n;
 
//          // Update `end` if the new node is added as the last node
//          if (temp == end) {
//              end = n;
//          }
//      }
 
//      public void delFirst() {
//          if (start == null) {
//              System.out.println("The list is empty");
//              return;
//          }
//          if (start == end) { // Single node case
//              start = end = null;
//          } else {
//              start = start.link; // Move start to the next node
//              end.link = start; // Maintain circular link
//          }
//      }
 
//      public void delLast() {
//          if (start == null) {
//              System.out.println("The list is empty");
//              return;
//          }
//          if (start == end) { // Single node case
//              start = end = null;
//          } else {
//              Node temp = start;
//              // Traverse to the second-to-last node
//              while (temp.link != end) {
//                  temp = temp.link;
//              }
//              temp.link = start; // Update circular link
//              end = temp; // Update end pointer
//          }
//      }
 
//      public void delanypositon(int pos) {
//          if (pos < 0) {
//              System.out.println("Position must be greater than or equal to 0");
//              return;
//          }
//          if (pos == 0) {
//              delFirst();
//              return;
//          }
//          Node temp = start, prev = null;
//          int k = 0;
 
//          // Traverse to the `pos`th position
//          while (temp.link != start && k < pos) {
//              prev = temp;
//              temp = temp.link;
//              k++;
//          }
//          if (k < pos) {
//              System.out.println("Index out of bounds");
//              return;
//          }
//          if (temp == end) { // If deleting the last node
//              delLast();
//              return;
//          }
//          prev.link = temp.link; // Bypass the node to be deleted
//      }
 
//      public void display() {
//          if (start == null) {
//              System.out.println("The list is empty");
//              return;
//          }
//          Node n = start;
//          do {
//              System.out.print(n.data + " ");
//              n = n.link;
//          } while (n != start);
//          System.out.println();
//      }
 
//      public static void main(String[] args) {
//          Clist c = new Clist();
//          c.addFirst(1);
//          c.addLast(2);
//          c.addLast(3);
//          c.addLast(4);
//          c.addLast(5);
//          c.addPosition(34, 2);
//          c.delFirst();
//          c.display();
//      }
//  }
 
// class Node{
//      Node Rlink,Llink;
//      int data;
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
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           else{
//                start=start.Rlink;
//           }
//      }
//      public void delEnd(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           else{
//                end=end.Llink;
//                end.Rlink=null;
//           }
//      }
//      void displayf(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           else{
//                Node n=start;
//                while (n!=null){
//                     System.out.println(n.data);
//                     n=n.Rlink;
//                }
//           }
//      }
//      void displayb(){
//           if(start==null){
//                System.out.println("The Dlist is Empty");
//                return;
//           }
//           else{
//                Node n=end;
//                while (n!=null){
//                     System.out.println(n.data);
//                     n=n.Llink;
//                }
//           }
//      }
//      public static void main(String[] args) {
//           Dlist d=new Dlist();
//           d.addFirst(1);    
//           d.addFirst(2);    
//           d.addFirst(3);
//           d.addLast(5);
//           d.delFirst();
//           d.displayf();    
//      }
// }

