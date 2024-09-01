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

