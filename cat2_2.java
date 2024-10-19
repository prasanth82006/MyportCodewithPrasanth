// All Sorting techinque
import java.util.*;
// bubble Sorting
// class sort{
//     public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           for(int i=0;i<arr.length;i++){
//                for(int j=0;j<arr.length-i-1;j++){
//                     if(arr[j+1]<arr[j]){           // arr[j+1]>arr[j] for  descending order 
//                          int temp=arr[j+1];
//                          arr[j+1]=arr[j];
//                          arr[j]=temp;
//                     }
//                }
//           }
//           System.out.println(Arrays.toString(arr));
//     } 
// }

import harry.f1.f2.rectangle;

// selection sort

// class sort{
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length;
//           for(int i=0;i<arr.length;i++){
//                int smaller=i;
//                for(int j=i+1;j<arr.length;j++){
//                     if(arr[smaller]<arr[j]){    //arr[smaller]>arr[i] for Ascending order
//                          smaller=j;
//                     }
//                }
//                int temp=arr[smaller];
//                arr[smaller]=arr[i];
//                arr[i]=temp;
//           }          
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Insertion Sort
// class sort{
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           for(int i=1;i<arr.length;i++){
//                int current=arr[i];
//                int j=i-1;
//                while (j>=0 && current<arr[j]){
//                     arr[j+1]=arr[j];
//                     j--;
//                }
//                arr[j+1]=current;
//           }
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Merge Sort
// class Sort{
     // public void conquer(int arr[],int f,int mid,int e){
     //      int merged[]=new int[e-f+1];
     //      int i1=f;
     //      int i2=mid+1;
     //      int x=0;
     //      while (i1<=mid && i2<=e){
     //           if(arr[i1]<=arr[i2]){
     //                merged[x++]=arr[i1++];
     //           }               
     //           else{
     //                merged[x++]=arr[i2++];
     //           }
     //      }
     //      while (i1<=mid){
     //           merged[x++]=arr[i1++];
     //      }
     //      while (i2<=e){
     //           merged[x++]=arr[i2++];
     //      }
     //      for(int i=0,j=f;i<merged.length;i++,j++){
     //           arr[j]=merged[i];
     //      }

     // }
     // public void divide(int arr[],int f,int e){
     //      if(f<e){
     //           int mid=f+(e-f)/2;
     //           divide(arr, f, mid);
     //           divide(arr, mid+1, e);
     //           conquer(arr,f,mid,e);
     //      }
//      // }
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length;
//           Sort s=new Sort();
//           s.divide(arr,0,n-1);
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Quick Sort
// class Quick{
//      public static void sort(int arr[],int f,int e){
//           if(f<e){
//                int p=partition(arr,f,e);
//                sort(arr, f, p-1);
//                sort(arr, p+1, e);
//           }
//      }
//      public static int partition(int arr[],int f,int e){
//           int p=arr[e];
//           int i=f-1;
//           for(int j=f;j<e;j++){
//                if(arr[j]>p){    //arr[j]<p for ascending order
//                     i++;
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                }
//           }
//           i++;
//           int temp=arr[i];
//           arr[i]=p;
//           arr[e]=temp;
//           return i;
//      }
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length;
//           Quick q=new Quick();
//           q.sort(arr,0,n-1);
//           System.out.println(Arrays.toString(arr));
//      }
// }


// class Queue{
//      int arr[]=new int[5];
//      int front=-1;
//      int rear=-1;
//      public void insert(int data){
//           if(rear==5){
//                System.out.println("The Queue is Full");
//           }
//           else{
//                rear++;
//                if(rear==0){
//                     front=0;
//                }
//                arr[rear]=data;
//           }
//      }
//      public void pop(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           else{
//                front=front+1;
//           }
//      }
//      public void peek(){
//           if(front==-1){
//                System.out.println("The Queue is Empty");
//           }
//           System.out.println(arr[front]);
//      }
//      public void display(){
//           for(int i=front;i<=rear;i++){
//                System.out.println(arr[i]);
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue();
//           q.insert(1);
//           q.insert(2);
//           q.insert(3);
//           q.insert(4);
//           q.pop();
//           q.display();
//           q.peek();
//      }
// }

// class Queue{
//      Stack<Integer> s1=new Stack<>();
//      Stack<Integer> s2=new Stack<>();
//      public boolean isEmpty(){
//           return s1.isEmpty();
//      }
//      public void insert(int data){
//           while (!s1.isEmpty()){
//                s2.push(s1.pop());
//           }
//           s1.push(data);
//           while (!s2.isEmpty()){
//                s1.push(s2.pop());
//           }
//      }
//      public void pop(){
//           if(isEmpty()){
//                System.out.println("The Queue is Empty");
//           }
//           s1.pop();
//      }
//      public void peek(){

//      }
//      public static void main(String[] args) {
//           Queue q=new Queue();
//           q.insert(1);     
//           q.insert(2);     
//           q.insert(3);     
//           q.insert(4);     
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
// class Queue{
//      Node rear,front;
//      public void insert(int data){
//           Node n=new Node(data);
//           Node temp=rear;
//           if(temp==null){
//                front=rear=n;
//           }
//           rear.link=n;
//           rear=n;
//      }
//      public void pop(){
//           Node temp=front;
//           if(front==null){
//                System.out.println("Queue is Empty");
//           }
//           if(front==rear){
//                front=rear=null;
//           }
//           front=front.link;
//      }
//      public void display(){
//           Node temp=front;
//           while(temp!=null){
//               System.out.println(temp.data);
//               temp=temp.link;
//           }
//      }
//      public static void main(String[] args) {
//           Queue q=new Queue();
//           q.insert(1);
//           q.insert(2);
//           q.insert(3);
//           q.insert(4);
//           q.pop();
//           q.display();
//      }
// }
 

// class PQ{
//      int arr[];
//      int front;
//      int rear;
//      int size;
//      PQ(int n){
//           arr=new int[n];
//           this.size=n;
//           front=rear=-1;
//      }
//      public void insert(int data){
//           if(rear==size-1){
//                System.out.println("The queue is Full");
//                return;
//           }
//           rear++;
//           arr[rear]=data;
//           if(rear==0){
//                front=0;
//           }
//      }
//      public void pop(){
//           int min=front;
//           for(int i=front;i<=rear;i++){
//                if(arr[i]<arr[min]){
//                     min=i;
//                }
//           }
//           int del=arr[min];
//           for(int i=min;i<rear;i++){
//                arr[i]=arr[i+1];
//           }
//           rear--;
//      }
//      public void display(){
//           for(int i=front;i<=rear;i++){
//                System.out.println(arr[i]);
//           }
//      }
//      public static void main(String[] args) {
//           PQ p=new PQ(5);
//           p.insert(10);
//           p.insert(3);
//           p.insert(4);
//           p.insert(2);
//           p.insert(5);
//           p.pop();
//           p.display();
//      }
// }
