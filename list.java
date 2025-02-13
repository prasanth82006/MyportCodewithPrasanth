// import java.util.*;
// public class list {
// public static void main(String[] args) {
// ArrayList<Integer> l1=new ArrayList<>();
// ArrayList<Integer> l2=new ArrayList<>(2);
// l1.add(3);
// l1.add(9);
// l1.add(8);
// l1.add(7);
// l1.add(6);
// l1.add(5);
// l1.add(4);
// l2.add(65);
// // l1.add(65);
// // l1.add(45);
// l2.add(45);

// import org.w3c.dom.Node;

// // System.out.println(l1.subList(1, 3));
// System.out.println(l1);
// System.out.println(l1.removeAll(l2));
// // l1.addAll(l2);
// // System.out.println(l1.contains(100));
// // System.out.println(l1.indexOf(45));
// // System.out.println(l1.lastIndexOf(45));
// // l1.set(2,1000);
// // System.out.println(l1);
// // System.out.println(l1.isEmpty());
// // l1.remove(2);
// // l1.removeAll(l1);
// // System.out.println(l1);
// // System.out.println(l1);
// // for(int i=0;i<l1.size();i++){
// // System.out.println(l1.get(i));
// // }

// }
// }

// linked list

// public class list {
// public static void main(String[] args) {
// LinkedList<Integer> l1=new LinkedList<>();
// LinkedList<Integer> l2=new LinkedList<>();
// l1.add(3);
// l1.add(9);
// l1.add(8);
// l1.add(7);
// l1.add(6);
// l1.add(5);
// l1.add(4);
// l2.add(65);
// l1.addAll(l2);
// l2.add(45);
// l1.addLast(34);
// l1.addFirst(334);
// System.out.println(l1);
// System.out.println(l1.removeAll(l2));
// }
// }

// Array Deques

// public class list {
// public static void main(String[] args) {
// ArrayDeque<Integer> ah1=new ArrayDeque<>();
// ArrayDeque<Integer> ah=new ArrayDeque<>();
// ah1.add(23);
// ah1.add(34);
// ArrayList<Integer> list=new ArrayList<>(ah1);
// System.out.println(ah1);
// System.out.println(ah1.getFirst());
// System.out.println(ah1.getLast());
// System.out.println(list.get(0));
// }
// }

// Hashing technique

// Hash set

// public class list {
// public static void main(String[] args) {
// HashSet <Integer> my=new HashSet<>(7,0.6f);
// my.add(3);
// my.add(4);
// my.add(5);
// my.add(6);
// my.add(7);
// my.add(8);
// System.out.println(my);
// }
// }

// Practice

// 1)
// public class list{
// public static void main(String[] args) {

// ArrayList<String> name=new ArrayList<>(10);
// Scanner sc=new Scanner(System.in);
// for(int i=1;i<10;i++){
// String a=sc.next();
// name.add(a);
// }

// for(int i=0;i<name.size();i++){
// System.out.println("Name is :"+" "+i+" "+name.get(i));
// }

// }
// }

// 2)
// public class list {
// public static void main(String[] args) {
// HashSet<Integer> hash=new HashSet<>();
// hash.add(3);
// hash.add(6);
// hash.add(3);
// hash.add(5);
// hash.add(4);
// System.out.println(hash);
// }
// }

// library design
// class Book {
// String name;
// String author;
// String issuedto;
// String issuedon;

// Book(String name, String author, String issuedto, String issuedon) {
// this.name = name;
// this.author = author;
// this.issuedto = issuedto;
// this.issuedon = issuedon;
// }

// @Override
// public String toString(){
// return "Book{name='" + name + "', author='" + author + "', issuedto='" +
// issuedto + "', issuedon='" + issuedon + "'}";
// }
// }

// class MYlibrary {
// Scanner sc = new Scanner(System.in);
// ArrayList<Book> books;

// MYlibrary(ArrayList<Book> books) {
// this.books = books;
// }

// public void addbook() {
// System.out.println("Enter book name:");
// String a = sc.next();
// System.out.println("Enter author name:");
// String f = sc.next();
// System.out.println("Enter issued to:");
// String c = sc.next();
// System.out.println("Enter issued on:");
// String d = sc.next();
// Book book = new Book(a, f, c, d);

// books.add(book);
// System.out.println("The book is added successfully.");
// }

// public void returnbook() {
// System.out.println("Enter book name:");
// String a = sc.next();
// System.out.println("Enter author name:");
// String f = sc.next();
// System.out.println("Enter issued to:");
// String c = sc.next();
// System.out.println("Enter issued on:");
// String d = sc.next();
// Book b = new Book(a, f, c, d);
// System.out.println("The book is returned.");
// books.add(b);
// }

// public void issuedbook() {
// System.out.println("Enter book name:");
// String a = sc.next();
// System.out.println("Enter author name:");
// String f = sc.next();
// System.out.println("Enter issued to:");
// String c = sc.next();
// System.out.println("Enter issued on:");
// String d = sc.next();
// Book e = new Book(a, f, c, d);
// books.remove(e);
// System.out.println("The book is issued.");
// }

// public void displayAll() {
// for (Book bo : books) {
// System.out.println(bo);
// }
// }
// }

// public class list {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// ArrayList<Book> initialBooks = new ArrayList<>();
// initialBooks.add(new Book("1984", "George Orwell", "", ""));
// initialBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "", ""));
// MYlibrary library = new MYlibrary(initialBooks);

// while (true) {
// System.out.println("Enter 1 for adding book");
// System.out.println("Enter 2 for returning book");
// System.out.println("Enter 3 for issuing book");
// System.out.println("Enter 4 for displaying books");
// System.out.println("Enter 0 to exit");
// int a = sc.nextInt();
// sc.nextLine(); // Consume newline
// System.out.println("You entered: " + a);

// switch (a) {
// case 0:
// System.out.println("Exiting the program.");
// sc.close();
// return;
// case 1:
// library.addbook();
// break;
// case 2:
// library.returnbook();
// break;
// case 3:
// library.issuedbook();
// break;
// case 4:
// library.displayAll();
// break;
// default:
// System.out.println("Re-enter the number.");
// break;
// }
// }
// }
// }

// public class list {
// public static void main(String[] args) {
// int a[]={1,2,3,4,5};
// int b[]={1,2,5};
// // String b[]={"Prasanth","thanu"};
// int c[]={1,2,3,4,5}+{1,2,5};
// }
// }

import java.util.*;
// public class list {
// public static void main(String[] args) {
// int a=10;
// int b=20;
// Scanner sc=new Scanner(System.in);
// String c=sc.next();
// System.out.println((c.equals("+")) ? a+b:(c.equals("-")) ? a-b: a+" "+b);
// }
// }

// public class list {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int a= sc.nextInt();
// System.out.println((a%2==0) ? "the number is even:"+a: "the number is
// odd:"+a);

// }
// }

// public class list {
// public static void main(String[] args) {
// prin(1);
// }
// public static void prin(int num){
// if(num<=100){
// System.out.println(num);
// prin(num+1);
// }
// }
// }

// binary search
// public class list {
// public static void main(String[] args) {
// int num[]={1,2,3,4,5};
// int result=binarysearch(num, 10);
// if(result!=-1){
// System.out.println("The element index is:"+result);
// }
// else{
// System.out.println("The element not found");
// }
// }
// public static int binarysearch(int number[],int a){
// int low=0;
// int high=4;
// while(low<=high){
// int m=(high+low)/2;
// int p=number[m];
// if(a==p){
// return m;
// }
// if(a<p){
// high=m-1;
// }
// else{
// low=m+1;
// // System.out.println(low);
// // System.out.println(high);
// }
// }
// return -1;
// }
// }

// Sorting techinque

// Bubble sort

// public class list {
// public static void main(String[] args) {
// int a[]={2,3,1,0,9,34,7};
// System.out.println("The original array"+Arrays.toString(a));
// for(int i=0;i<a.length;i++){
// for(int j=i+1;j<a.length;j++){
// if(a[i]>a[j]){
// int temp=a[i];
// a[i]=a[j];
// a[j]=temp;
// }
// }
// System.out.println(Arrays.toString(a));
// }
// System.out.println("The sorted arrays"+Arrays.toString(a));
// }
// }

// Selection sort

// public class list {
// public static void main(String[] args) {
// int a[]={2,3,1,0,9,34,7};
// System.out.println("The original array"+Arrays.toString(a));
// int temp=0;
// int minindex=0;
// for(int i=0;i<a.length-1;i++){
// minindex=i;
// for(int j=i+1;j<a.length;j++){
// if(a[minindex]<a[j]){
// minindex=j;
// }
// }
// temp=a[minindex];
// a[minindex]=a[i];
// a[i]=temp;
// }
// // for(int i=0;i<a.length-1;i++){
// // minindex=i;
// // for(int j=i+1;j<a.length;j++){
// // if(a[minindex]>a[j]){
// // minindex=j;
// // }
// // }
// // temp=a[minindex];
// // a[minindex]=a[i];
// // a[i]=temp;
// // }
// System.out.println("The sorted arrays"+Arrays.toString(a));
// }
// }

// Insertion sort
// Shifting is done
// public class list {
// public static void main(String[] args) {
// int a[]={2,3,1,0,9,34,7};
// System.out.println("The original array"+Arrays.toString(a));
// for(int i=0;i<a.length;i++){
// int key=a[i];
// int temp=i-1;
// while(temp>=0 && a[temp] >key){
// a[temp+1]=a[temp];
// temp--;
// }
// a[temp+1]=key;
// }
// System.out.println("The sorted arrays"+Arrays.toString(a));
// }
// }

// Qucik sort

// public class list {
// public static void main(String[] args) {
// int a[] = {5, 6, 1, 3, 4, 2};
// System.out.println("The original array:");
// for (int num : a) {
// System.out.print(num + " ");
// }
// System.out.println();
// QuickSort(a, 0, a.length - 1);
// System.out.println("The sorted array:");
// for (int num : a) {
// System.out.print(num + " ");
// }
// }

// public static void QuickSort(int[] a, int low, int high) {
// if (low < high) {
// int pi = partition(a, low, high);
// QuickSort(a, low, pi - 1);
// QuickSort(a, pi + 1, high);
// }
// }

// public static int partition(int[] a, int low, int high) {
// int pivot = a[high];
// int i = low - 1;
// for (int j = low; j < high; j++) {
// if (a[j] < pivot) {
// i++;
// int temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// }
// }
// int temp = a[i + 1];
// a[i + 1] = a[high];
// a[high] = temp;
// return i + 1;
// }
// }

// import java.util.*;
// public class list {
// public static void main(String[] args) {
// // ArrayList<Integer> a=new ArrayList<>();
// // LinkedList<Integer> a=new LinkedList<>();
// // Scanner sc=new Scanner(System.in);
// // for(int i=0;i<5;i++){
// // int b=sc.nextInt();
// // a.add(b);
// // }
// // System.out.println(a);
// // a.set(0,2);
// // System.out.println(a);
// Stack<Integer> a=new Stack<>();
// a.push(2);
// a.push(5);
// a.push(4);
// a.push(3);
// System.out.println(a);
// System.out.println(a);
// }
// }

import java.util.*;
// public class list{
// // LinkedList
// // static class Node{
// // int data;
// // Node next;
// // public Node(int data){
// // this.data=data;
// // next=null;
// // }
// // }
// // static class stack{
// // public static Node head;
// // public static boolean isEmpty(){
// // return head==null;
// // }
// // public static void push(int data){
// // Node newdata=new Node(data);
// // newdata.next=head;
// // head=newdata;
// // }
// // public static int pop(){
// // if(isEmpty()){
// // return -1;
// // }
// // int top=head.data;
// // head=head.next;
// // return top;
// // }
// // public static int peek(){
// // if(isEmpty()){
// // return -1;
// // }
// // return head.data;
// // }
// // }

// // arrayList
// static class stack{
// static ArrayList<Integer> b= new ArrayList<>();
// public static boolean isEmpty(){
// return b.size()==0;
// }

// public static void push(int data){
// b.add(data);
// }
// public static int pop(){
// int top=b.get(b.size()-1);
// b.remove(b.size()-1);
// return top;
// }
// public static int peek(){
// if(isEmpty()){
// return -1;
// }
// return b.get(b.size()-1);
// }
// }
// public static void main(String[] args) {
// stack a=new stack();
// a.push(2);
// a.push(5);
// a.push(4);
// a.push(3);
// // a.printStack();
// while (!a.isEmpty()) {
// System.out.println(a.peek());
// a.pop();
// }
// }
// }

// public class list{
// public static void pushAtbottom(int data, Stack<Integer> b){
// if(b.isEmpty()){
// b.push(data);
// return;
// }
// int top=b.pop();
// pushAtbottom(data,b);
// b.push(top);
// }
// public static void reverse(Stack<Integer> b){
// if(b.isEmpty()){
// return;
// }
// int top=b.pop();
// reverse(b);
// pushAtbottom(top, b);
// }
// public static void main(String[] args) {
// Stack<Integer> b=new Stack<>();
// b.push(2);
// b.push(5);
// b.push(3);
// reverse(b);
// while (!b.isEmpty()) {
// System.out.println(b.peek());
// b.pop();
// }
// }
// }

// public class list {
// public static int size;
// list(){
// this.size=0;
// }
// static class Node{
// int data;
// Node next;
// public Node(int data){
// this.data=data;
// this.next=null;
// size++;
// }
// }
// static Node head;
// public static void addfirst(int data){
// Node newdata=new Node(data);
// if(head==null){
// head=newdata;
// return;
// }
// newdata.next=head;
// head=newdata;
// }
// public static void addlast(int data){
// Node newdata=new Node(data);
// if(head==null){
// head=newdata;
// return;
// }
// Node currNode=head;
// while(currNode.next!=null){
// currNode=currNode.next;
// }
// currNode.next=newdata;
// }
// public static void printlist(){
// if(head==null){
// System.out.println("List is empty");
// return;
// }
// Node currNode=head;
// while(currNode!=null){
// System.out.println(currNode.data+" -> ");
// currNode=currNode.next;
// }
// System.out.println("Null");
// }
// public static void delfirst(){
// if(head==null){
// System.out.println("The List is Empty");
// return;
// }
// size--;
// head=head.next;
// }
// public static void dellast(){
// if(head==null){
// System.out.println("The List is Empty");
// return;
// }
// size--;
// if(head.next==null){
// head=null;
// return;
// }
// Node secondlast=head;
// Node lastnode=head.next;
// while (lastnode.next!=null) {
// lastnode=lastnode.next;
// secondlast=secondlast.next;
// }
// secondlast.next=null;
// }
// public static int getsize(){
// return size;
// }
// public static void main(String[] args){
// list l=new list();
// l.addfirst(1);
// l.addlast(2);
// l.addlast(100);
// l.delfirst();
// l.dellast();
// // l.dellast();
// l.printlist();
// System.out.println(l.getsize());
// }
// }

// public class list {
// public static int size;
// public list(){
// this.size=0;
// }
// static class Node{
// int data;
// Node next;
// public Node(int data){
// this.data=data;
// this.next=null;
// size++;
// }
// }
// static Node head;
// public static void addFirst(int data){
// Node newdata=new Node(data);
// newdata.next=head;
// head=newdata;
// }

// public static void addLast(int data){
// Node newdata=new Node(data);
// Node currNode=new Node(data);
// while(currNode.next!=null){
// currNode=currNode.next;
// }
// currNode.next=newdata;
// }
// public static void printlist(){
// if(head==null){
// System.out.println("List is empty");
// return;
// }
// Node currNode=head;
// while(currNode!=null){
// System.out.println(currNode.data);
// currNode=currNode.next;
// }
// }
// public static int getsize(){
// return size;
// }

// public static void main(String[] args){
// list l=new list();
// l.addFirst(1);
// l.addFirst(2);
// l.printlist();
// System.out.println("The size of the list is:"+l.getsize());
// }
// }

// reverse linkedlist
// public class list {
// public static int size;
// public list(){
// this.size=0;
// }
// static class Node{
// int data;
// Node next;
// public Node(int data){
// this.data=data;
// this.next=null;
// size++;
// }
// }
// static Node head;
// public static void addFirst(int data){
// Node newdata=new Node(data);
// newdata.next=head;
// head=newdata;
// }

// public static void addLast(int data){
// Node newdata=new Node(data);
// Node currNode=new Node(data);
// while(currNode.next!=null){
// currNode=currNode.next;
// }
// currNode.next=newdata;
// }
// public static void printlist(){
// if(head==null){
// System.out.println("List is empty");
// return;
// }
// Node currNode=head;
// while(currNode!=null){
// System.out.println(currNode.data);
// currNode=currNode.next;
// }
// }
// public static int getsize(){
// return size;
// }
// public static void reverselist(){
// if(head==null|| head.next==null){
// return;
// }
// Node prevNode=head;
// Node curNode=head.next;
// while (curNode!=null){
// Node nextNode=curNode.next;
// curNode.next=prevNode;
// prevNode=curNode;
// curNode=nextNode;
// }
// head.next=null;
// head=prevNode;
// }
// public static Node reverseRecursion(Node head){
// if(head==null|| head.next==null){
// return head;
// }
// Node newhead=reverseRecursion(head.next);
// head.next.next=head;
// head.next=null;
// return newhead;
// }
// public static void main(String[] args){
// list l=new list();
// l.addFirst(1);
// l.addFirst(2);
// // l.printlist();
// System.out.println("The size of the list is:"+l.getsize());
// // l.reverselist();
// // l.printlist();
// // l.head=l.reverseRecursion(l.head);
// l.printlist();
// }
// }

// Queue
// operations are: Enque--> ADD|dequeue -->Remove|Front -->Peek
// using circular array
// public class list {
// static class Queue{
// static int arr[];
// static int size;
// static int rear=-1;
// static int front=-1;
// Queue(int size){
// arr=new int[size];
// this.size=size;
// }
// public static boolean isEmpty(){
// return rear==-1 && front==-1;
// }
// public static boolean isFull(){
// return (rear+1)%size==front;
// }
// public static void add(int data){
// if(isFull()){
// System.out.println("Full Queue");
// return;
// }
// if(front==-1){
// front=0;
// }
// rear=(rear+1)%size;
// arr[rear]=data;
// }
// public static int remove(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// int result=arr[front];
// if(rear==front){
// rear=front=-1;
// }
// else{
// front=(front+1)%size;
// }
// return front;
// }
// public static int peek(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// return arr[front];
// }
// }
// public static void main(String[] args) { //Front-->start Rear-->last
// Queue q=new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// System.out.println(q.remove());
// q.add(6);
// System.out.println(q.remove());
// q.add(7);
// q.add(8);
// while (!q.isEmpty()){
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// linkedList
// public class list {
// static class Node{
// int data;
// Node next;
// Node(int data){
// this.data=data;
// this.next=null;
// }
// }
// static class Queue{
// static Node head=null;
// static Node tail=null;
// public static boolean isEmpty(){
// return head ==null && tail==null;
// }

// public static void add(int data){
// Node newdata=new Node(data);
// if(tail==null){
// tail=head=newdata;
// return;
// }
// tail.next=newdata;
// tail=newdata;
// }
// public static int remove(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// int front=head.data;
// if(head==tail){
// tail=null;
// }
// head=head.next;
// return front;
// }
// public static int peek(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// return head.data;
// }
// }
// public static void main(String[] args) { //Front-->start Rear-->last
// Queue q=new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// System.out.println(q.remove());
// q.add(6);
// System.out.println(q.remove());
// q.add(7);
// q.add(8);
// while (!q.isEmpty()){
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// usingPackage
// public class list {
// public static void main(String[] args) {
// // Queue<Integer> q=new LinkedList<>();
// Queue<Integer> q=new ArrayDeque<>();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// System.out.println(q.remove());
// q.add(6);
// System.out.println(q.remove());
// q.add(7);
// q.add(8);
// while (!q.isEmpty()){
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// normal array
// public class list {
// static class Queue{
// static int arr[];
// static int size;
// static int rear=-1;
// Queue(int size){
// arr=new int[size];
// this.size=size;
// }
// public static boolean isEmpty(){
// return rear==-1;
// }
// public static void add(int data){
// if(rear==size-1){
// System.out.println("Full Queue");
// return;
// }
// rear++;
// arr[rear]=data;
// }
// public static int remove(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// int front=arr[0];
// for(int i=0;i<rear;i++){
// arr[i]=arr[i+1];
// }
// rear--;
// return front;
// }
// public static int peek(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// return arr[0];
// }
// }
// public static void main(String[] args) { //Front-->start Rear-->last
// Queue q=new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// while (!q.isEmpty()){
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// Problem
// public class list{
// static class Queue{
// static Stack<Integer> s1=new Stack<>();
// static Stack<Integer> s2=new Stack<>();
// public static boolean isEmpty(){
// return s1.isEmpty();
// }
// public static void add(int data){
// while(!s1.isEmpty()){
// s2.push(s1.pop());
// }
// s1.push(data);
// while(!s2.isEmpty()){
// s1.push(s2.pop());
// }
// }
// public static int remove(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// return s1.pop();
// }
// public static int peek(){
// if(isEmpty()){
// System.out.println("Empty Queue");
// return -1;
// }
// return s1.peek();
// }
// }
// public static void main(String[] args) {
// Queue q=new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// while (!q.isEmpty()){
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// Trees
// preorder traversal

// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int preorder(Node root){
// if(root==null){
// return -1;
// }
// System.out.print(root.data+" ");
// preorder(root.left);
// preorder(root.right);
// return 0;

// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// preorder(root);
// }
// }

// inorder Traversal
// left-- root--right
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int inorder(Node root){
// if(root==null){
// return -1;
// }
// inorder(root.left);
// System.out.println(root.data);
// inorder(root.right);
// return 0;
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// inorder(root);
// }
// }

// postorder Traversal
// left--right--root
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int postorder(Node root){
// if(root==null){
// return -1;
// }
// postorder(root.left);
// postorder(root.right);
// System.out.print(root.data+" ");
// return 0;

// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// postorder(root);
// }
// }

// level order Trasveral
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static void levelorder(Node root){
// if(root==null){
// return;
// }
// Queue<Node> q=new LinkedList<>();
// q.add(root);
// q.add(null);
// while(!q.isEmpty()){
// Node currNode=q.remove();
// if(currNode==null){
// System.out.println();
// if(q.isEmpty()){
// break;
// }
// else{
// q.add(null);
// }
// }else{
// System.out.print(currNode.data+" ");
// if(currNode.left!=null){
// q.add(currNode.left);
// }
// if(currNode.right!=null){
// q.add(currNode.right);
// }
// }
// }
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// levelorder(root);
// }
// }

// Question of Trees
// 1
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int count(Node root){
// if(root==null){
// return 0;
// }
// int leftnode=count(root.left);
// int rightnode=count(root.right);
// return leftnode+rightnode+1;
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// System.out.println(count(root));
// }
// }
// 2 Sum of Nodes
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int sumoofNodes(Node root){
// if(root==null){
// return 0;
// }
// int leftnode=sumoofNodes(root.left);
// int rightnode=sumoofNodes(root.right);
// return leftnode+rightnode+root.data;
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// System.out.println(sumoofNodes(root));
// }
// }

// height of tree
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int height(Node root){
// if(root==null){
// return 0;
// }
// int leftheight=height(root.left);
// int rightheight=height(root.right);
// if(leftheight>rightheight){
// return leftheight+1;
// }
// else{
// return rightheight+1;
// }
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// System.out.println(height(root));
// }
// }

// Diameter of tree
// case1:- search the diameter through root
// case2:- search the diameter not throught root
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int height(Node root){
// if(root==null){
// return 0;
// }
// int leftheight=height(root.left);
// int rightheight=height(root.right);
// if(leftheight>rightheight){
// return leftheight+1;
// }
// else{
// return rightheight+1;
// }
// }
// public static int diameter(Node root){
// if(root==null){
// return 0;
// }
// int leftnode=diameter(root.left);
// int rightnode=diameter(root.right);
// int bothnode=height(root.left)+height(root.right)+1;
// return Math.max(bothnode,Math.max(rightnode,leftnode));
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// System.out.println("the max diameter is:"+" "+diameter(root));
// }
// }
// other method
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static int height(Node root){
// if(root==null){
// return 0;
// }
// int leftheight=height(root.left);
// int rightheight=height(root.right);
// if(leftheight>rightheight){
// return leftheight+1;
// }
// else{
// return rightheight+1;
// }
// }
// public static int diameter(Node root){
// if(root==null){
// return 0;
// }
// int leftnode=diameter(root.left);
// int rightnode=diameter(root.right);
// int bothnode=height(root.left)+height(root.right)+1;
// return Math.max(bothnode,Math.max(rightnode,leftnode));
// }
// public static class Treeinfo{
// int ht;
// int da;
// Treeinfo(int ht,int da){
// this.ht=ht;
// this.da=da;
// }
// }
// public static Treeinfo diameter2(Node root){
// if(root==null){
// return new Treeinfo(0, 0);
// }
// Treeinfo left=diameter2(root.left);
// Treeinfo right=diameter2(root.right);
// int myht=Math.max(left.ht,right.ht)+1;
// int dia=left.da;
// int dia1=right.da;
// int dia2=left.ht+right.ht+1;
// int myda=Math.max(dia2,Math.max(dia,dia1));
// Treeinfo myinfo=new Treeinfo(myht, myda);
// return myinfo;

// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// System.out.println("the max diameter is:"+" "+diameter2(root).da);
// }
// }

// sum of nodes kth level
// public class list{
// static class Node{
// int data;
// Node left;
// Node right;
// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;
// }
// }
// static class Binarytree{
// static int index=-1;
// public static Node buildTree(int nodes[]){
// index++;
// if(nodes[index]==-1){
// return null;
// }
// Node newnode=new Node(nodes[index]);
// newnode.left=buildTree(nodes);
// newnode.right=buildTree(nodes);
// return newnode;
// }
// }
// public static void levelorder(Node root){
// Scanner sc=new Scanner(System.in);
// int k=sc.nextInt();
// if(root==null){
// return;
// }
// Queue<Node> q=new LinkedList<>();
// q.add(root);
// q.add(null);
// int sum=0;
// int currLevel=1;
// while(!q.isEmpty()){
// Node currNode=q.remove();
// if(currNode==null){
// if(currLevel==k){
// System.out.println(sum);
// }
// sum=0;
// currLevel++;
// if(q.isEmpty()){
// break;
// }
// else{
// q.add(null);
// }
// }else{
// sum+=currNode.data;
// if(currNode.left!=null){
// q.add(currNode.left);
// }
// if(currNode.right!=null){
// q.add(currNode.right);
// }
// }
// }
// }
// public static void main(String[] args){
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// Binarytree tree=new Binarytree();
// Node root=tree.buildTree(nodes);
// levelorder(root);
// }
// }

// import java.util.Arrays;

// class ProductArray {
// public static int[] productExceptSelf(int[] nums) {
// int n = nums.length;

// // Initialize the result array with ones
// int[] result = new int[n];
// Arrays.fill(result, 1);

// // Calculate prefix product for each index and store in result
// int prefixProduct = 1;
// for (int i = 0; i < n; i++) {
// result[i] = prefixProduct;
// prefixProduct *= nums[i];
// }

// // Calculate suffix product for each index and multiply with result
// int suffixProduct = 1;
// for (int i = n - 1; i >= 0; i--) {
// result[i] *= suffixProduct;
// suffixProduct *= nums[i];
// }

// return result;
// }

// public static void main(String[] args) {
// int[] array = {1, 2, 3, 4, 5};
// int[] result = productExceptSelf(array);

// System.out.println(Arrays.toString(result));
// }
// }
