import java.util.*;
// Bubble sort
// public class sort {
//      public static void main(String[] args) {
//           int a[]={7,8,3,1,2};
//           for(int i=0;i<a.length-1;i++){
//                for(int j=0;j<a.length-i-1;j++){
//                     if(a[j+1]<a[j]){
//                          int temp=a[j+1];
//                          a[j+1]=a[j];
//                          a[j]=temp;
//                     }
//                }
//           }
//           System.out.println(Arrays.toString(a));
//      }
// }

import harry.savingsaccount;

// selection Sort
// time complexity=O(n^2);
// public class sort {
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
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
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Insertion Sort
// public class sort {
//      public static void main(String[] args) {
//           int a[]={7,8,2,1,3};
//           for(int i=1;i<a.length;i++){
//                int current=a[i];
//                int j=i-1;
//                while (j>=0 && current>a[j]){
//                     a[j+1]=a[j];
//                     j--;
//                }
//                a[j+1]=current;
//           }
//           System.out.println(Arrays.toString(a));
//      }
// }

// merge sort
// public class sort{
//      public static void conquer(int[] arr, int f, int mid, int e) {
//           int merged[]=new int[e-f+1];
//           int i1=f;
//           int i2=mid+1;
//           int x=0;
//           while (i1<=mid && i2<=e){
//                if(arr[i1]<=arr[i2]){
//                     merged[x++]=arr[i1++];
//                }
//                else{
//                     merged[x++]=arr[i2++];
//                }
//           }
//           while (i1<=mid){
//                merged[x++]=arr[i1++];
//           }
//           while (i2<=e){
//                merged[x++]=arr[i2++];
//           }

//           for(int i=0,j=f;i<merged.length;i++,j++){
//                arr[j]=merged[i];
//           }
//      } 
//      public static void divide(int arr[],int f,int e){
//           if(f>=e){
//                return;
//           }
//           int mid=f+(e-f)/2;  
//           divide(arr, f, mid);
//           divide(arr, mid+1, e);
//           conquer(arr,f,mid,e);
//      }   
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length;
//           divide(arr,0,n-1);
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Quick Sort
// public class sort{
//      public static void QuickSort(int arr[],int f,int e){
//           if(f<e){
//                int p=partition(arr,f,e);
//                QuickSort(arr,f,p-1);
//                QuickSort(arr,p+1,e);
//           }
//      }
//      public static int partition(int arr[],int f,int e){
//           int p=arr[e];
//           int i=f-1;
//           for(int j=f;j<e;j++){
//                if(arr[j]>p){
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
//           QuickSort(arr, 0, n-1);
//           System.out.println(Arrays.toString(arr));
//      }
// }

// selection sort
// public class sort {
//      public static void main(String[] args) {
//           int arr[]={7,8,3,1,2};
//           int n=arr.length-1;
//           for(int i=0;i<arr.length;i++){
//                int smaller=i;
//                for(int j=i+1;j<arr.length;j++){
//                     if(arr[smaller]<arr[j]){
//                          smaller=j;
//                     }
//                }
//                int temp=arr[i];
//                arr[i]=arr[smaller];
//                arr[smaller]=temp;
//           }
//           System.out.println(Arrays.toString(arr));
//      }
// }

// Heap sort
// public class sort{
//      public void Heap(int arr[]){
//           int n=arr.length;
//           for(int i=n/2-1;i>=0;i--){
//                heapify(arr,n,i);
//           }
//           for(int i=n-1;i>=0;i--){
//                int temp=arr[0];
//                arr[0]=arr[i];
//                arr[i]=temp;
//                heapify(arr,i,0);
//           }
//      }
//      public void heapify(int arr[],int n,int i){
//           int largest=i;
//           int l=2*i+1;
//           int r=2*i+2;
//           if(l<n && arr[l]>arr[largest]){
//                largest=l;
//           }
//           if(r<n && arr[r]>arr[largest]){
//                largest=r;
//           }
//           if(largest!=i){
//                int swap=arr[i];
//                arr[i]=arr[largest];
//                arr[largest]=swap;
//                heapify(arr, n, largest);
//           }
//      }
//      public static void main(String args[])
//     {
//         int arr[] = { 12, 11, 13, 5, 6, 7 };
//         int n = arr.length;
//         sort ob = new sort();
//         ob.Heap(arr);
//         System.out.println("Sorted array is");
//         System.out.println(Arrays.toString(arr));
//     }
// }


// public class sort {
//      public void Heap(int arr[]){
//           int n=arr.length;
//           for(int i=n/2-1;i>=0;i--){
//                heapify(arr,n,i);
//           }
//           for(int i=n-1;i>=0;i--){
//                int temp=arr[0];
//                arr[0]=arr[i];
//                arr[i]=temp;
//                heapify(arr,i,0);
//           }
//      }
//      public void heapify(int arr[],int n,int i){
//           int largest=i;
//           int l=2*i+1;
//           int e=2*i+2;
//           if(l<n && arr[l]>arr[largest]){
//                largest=l;
//           }
//           if(e<n && arr[i]>arr[largest]){
//                largest=e;
//           }
//           if(largest!=i){
//                int temp=arr[i];
//                arr[i]=arr[largest];
//                arr[largest]=temp;
//                heapify(arr, n, largest);
//           }
//      }
//      public static void main(String[] args) {
//           sort s=new sort();
//           int arr[]={7,8,3,1,2};
//           s.Heap(arr);
//           System.out.println(Arrays.toString(arr));          
//      }
// }

// Priority Queue
// class maxpriority{
//      int arr[];
//      int size;
//      int c;
//      public maxpriority(int c){
//           this.c=c;
//           this.arr=new int[c];
//           this.size=0;
//      }
//      public void insert(int data){
//           if(size==c){
//                System.out.println("The Queue is Full");
//           }
//           arr[size]=data;
//           size++;
//           sort();
//      }
//      public int removeMax(){
//           if(size==0){
//                System.out.println("Queue is Empty");
//                return -1;
//           }
//           int max=arr[0];
//           for(int i=1;i<size;i++){
//                arr[i-1]=arr[i];
//           }
//           size--;
//           return max;
//      }
//      public void display(){
//           for(int i=0;i<size;i++){
//                System.out.println(arr[i]);
//           }
//      }
//      public void sort(){
//           Arrays.sort(arr,0,size);
//           reverse(arr,0,size);
//      }
//      public void reverse(int[] arr, int start, int end) {
//           for (int i = start, j = end - 1; i < j; i++, j--) {
//               int temp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = temp;
//           }
//       }
//      public static void main(String[] args) {
//           maxpriority m=new maxpriority(5);
//           m.insert(10);
//           m.insert(20);
//           m.insert(30);
//           m.insert(40);
//           m.removeMax();
//           m.display();
//      }
// }

// class minpriority{
//      int arr[];
//      int size;
//      int c;
//      minpriority(int c){
//           this.c=c;
//           this.arr=new int[c];
//           this.size=0;
//      }
//      public void insert(int data){
//           if(size==c){
//                System.out.println("The Queue is Full");
//                return;
//           }
//           arr[size]=data;
//           size++;
//           sort();
//      }
//      public void sort(){
//           Arrays.sort(arr,0,size);
//      }
//      public int remove(){
//           if(size==0){
//                System.out.println("The Queue is Empty");
//                return -1;
//           }
//           int max=arr[0];
//           for(int i=1;i<arr.length;i++){
//                arr[i-1]=arr[i];
//           }
//           size--;
//           return max;
//      }
//      public void display(){
//           if (size == 0) {
//                System.out.println("Priority Queue is empty!");
//                return;
//           }
//           for(int i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//           }
//      }
//      public static void main(String[] args) {
//           minpriority m=new minpriority(5);
//           m.insert(10);
//           m.insert(20);
//           m.insert(30);
//           m.insert(40);
//           m.insert(50);
//           m.remove();
//           m.display();
//      }
// }

// public class MinHeapPriorityQueue {
//      private int[] heap;
//      private int size;
//      private int capacity;
 
//      // Constructor to initialize the priority queue
//      public MinHeapPriorityQueue(int capacity) {
//          this.capacity = capacity;
//          this.size = 0;
//          this.heap = new int[capacity];
//      }
 
//      // Get the index of the parent node
//      private int parent(int i) {
//          return (i - 1) / 2;
//      }
 
//      // Get the index of the left child node
//      private int leftChild(int i) {
//          return 2 * i + 1;
//      }
 
//      // Get the index of the right child node
//      private int rightChild(int i) {
//          return 2 * i + 2;
//      }
 
//      // Insert a new element into the priority queue
//      public void insert(int value) {
//          if (size == capacity) {
//              System.out.println("Priority Queue is full!");
//              return;
//          }
//          heap[size] = value;
//          size++;
//          heapifyUp(size - 1);  // Maintain the heap property after insertion
//      }
 
//      // Heapify up to maintain min-heap property after insertion
//      private void heapifyUp(int i) {
//          int temp = heap[i];
//          while (i > 0 && temp > heap[parent(i)]) {
//              heap[i] = heap[parent(i)];  // Move parent down
//              i = parent(i);              // Move up the tree
//          }
//          heap[i] = temp;
//      }
 
//      // Remove and return the element with the highest priority (min element)
//      public int removeMin() {
//          if (size == 0) {
//              System.out.println("Priority Queue is empty!");
//              return -1;
//          }
//          int min = heap[0];  // The root is the minimum element
//          heap[0] = heap[size - 1];  // Replace root with the last element
//          size--;
//          heapifyDown(0);  // Maintain the heap property after removal
//          return min;
//      }
 
//      // Heapify down to maintain min-heap property after removing the min element
//      private void heapifyDown(int i) {
//          int smallest = i;
//          int left = leftChild(i);
//          int right = rightChild(i);
 
//          if (left < size && heap[left] < heap[smallest]) {
//              smallest = left;
//          }
 
//          if (right < size && heap[right] < heap[smallest]) {
//              smallest = right;
//          }
 
//          if (smallest != i) {
//              swap(i, smallest);
//              heapifyDown(smallest);
//          }
//      }public int peekMin() {
//          if (size == 0) {
//              System.out.println("Priority Queue is empty!");
//              return -1;
//          }
//          return heap[0]; 
//      }
 
//      // Swap two elements in the heap
//      private void swap(int i, int j) {
//          int temp = heap[i];
//          heap[i] = heap[j];
//          heap[j] = temp;
//      }
 
//      // Display the priority queue using a for loop
//      public void display() {
//          if (size == 0) {
//              System.out.println("Priority Queue is empty!");
//              return;
//          }
         
//          System.out.print("Priority Queue (Min-Heap): ");
//          for (int i = 0; i < size; i++) {
//              System.out.print(heap[i] + " ");  // Display each element in the heap
//          }
//          System.out.println();  // New line after printing all elements
//      }
//      public static void main(String[] args) {
//          MinHeapPriorityQueue pq = new MinHeapPriorityQueue(7);
//          pq.insert(40);
//          pq.insert(10);
//          pq.insert(30);
//          pq.insert(50);
//          pq.insert(20); 
//          pq.display();// Should show: Priority Queue (Min-Heap): 5 20 30 50 40
//      }
//  }


// public class sort {
//      public void Quick(int arr[],int f,int e){
//           if(f<e){
//                int p=partition(arr,f,e);
//                Quick(arr, f, p-1);
//                Quick(arr, p+1, e);
//           }
//      }
//      public int partition(int arr[],int f,int e){
//           int p=arr[e];
//           int i=f-1;
//           for(int j=f;j<e;j++){
//                if(arr[j]>p){
//                     i++;
//                     int temp=arr[j];
//                     arr[j]=arr[i];
//                     arr[i]=temp;
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
//           sort s=new sort();
//           s.Quick(arr,0,n-1);
//           System.out.println(Arrays.toString(arr));     
//      }
// }

