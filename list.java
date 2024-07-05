import java.util.*;
// public class list {
//     public static void main(String[] args) {
//         ArrayList<Integer> l1=new ArrayList<>();
//         ArrayList<Integer> l2=new ArrayList<>(2);
//         l1.add(3);
//         l1.add(9);
//         l1.add(8);
//         l1.add(7);
//         l1.add(6);
//         l1.add(5);
//         l1.add(4);
//         l2.add(65);
//         // l1.add(65);
//         // l1.add(45);
//         l2.add(45);

//         // System.out.println(l1.subList(1, 3));
//         System.out.println(l1);
//         System.out.println(l1.removeAll(l2));
//         // l1.addAll(l2);
//         // System.out.println(l1.contains(100));
//         // System.out.println(l1.indexOf(45));
//         // System.out.println(l1.lastIndexOf(45));
//         // l1.set(2,1000);
//         // System.out.println(l1);
//         // System.out.println(l1.isEmpty());
//         // l1.remove(2);
//         // l1.removeAll(l1);
//         // System.out.println(l1);
//         // System.out.println(l1);
//         // for(int i=0;i<l1.size();i++){
//         //     System.out.println(l1.get(i));
//         // }

//     }
// } 

// linked list

// public class list {
//     public static void main(String[] args) {
//         LinkedList<Integer> l1=new LinkedList<>();
//         LinkedList<Integer> l2=new LinkedList<>();
//         l1.add(3);
//         l1.add(9);
//         l1.add(8);
//         l1.add(7);
//         l1.add(6);
//         l1.add(5);
//         l1.add(4);
//         l2.add(65);
//         l1.addAll(l2);
//         l2.add(45);
//         l1.addLast(34);
//         l1.addFirst(334);
//         System.out.println(l1);
//         System.out.println(l1.removeAll(l2));
//     }
// } 

// Array Deques

// public class list {
//     public static void main(String[] args) {
//         ArrayDeque<Integer> ah1=new ArrayDeque<>();
//         ArrayDeque<Integer> ah=new ArrayDeque<>();
//         ah1.add(23);
//         ah1.add(34);
//         ArrayList<Integer> list=new ArrayList<>(ah1);
//         System.out.println(ah1);
//         System.out.println(ah1.getFirst());
//         System.out.println(ah1.getLast());
//         System.out.println(list.get(0));
//     }
// }

// Hashing technique

// Hash set

// public class list { 
//     public static void main(String[] args) {
//         HashSet <Integer> my=new HashSet<>(7,0.6f);
//         my.add(3);
//         my.add(4);
//         my.add(5);
//         my.add(6);
//         my.add(7);
//         my.add(8);
//         System.out.println(my);
//     }
// }

// Practice 

// 1)
// public class list{
//     public static void main(String[] args) {
        
//         ArrayList<String> name=new ArrayList<>(10);
//         Scanner sc=new Scanner(System.in);
//         for(int i=1;i<10;i++){
//             String a=sc.next();
//             name.add(a);
//         }
        
//         for(int i=0;i<name.size();i++){
//             System.out.println("Name is :"+" "+i+" "+name.get(i));
//         }

//     }
// }

// 2)
// public class list {
//     public static void main(String[] args) {
//         HashSet<Integer> hash=new HashSet<>();
//         hash.add(3);
//         hash.add(6);
//         hash.add(3);
//         hash.add(5);
//         hash.add(4);
//         System.out.println(hash);
//     }
// }

// library design
// class Book {
//     String name;
//     String author;
//     String issuedto;
//     String issuedon;

//     Book(String name, String author, String issuedto, String issuedon) {
//         this.name = name;
//         this.author = author;
//         this.issuedto = issuedto;
//         this.issuedon = issuedon;
//     }

//     @Override
//     public String toString(){
//         return "Book{name='" + name + "', author='" + author + "', issuedto='" + issuedto + "', issuedon='" + issuedon + "'}";
//     }
// }

// class MYlibrary {
//     Scanner sc = new Scanner(System.in);
//     ArrayList<Book> books;

//     MYlibrary(ArrayList<Book> books) {
//         this.books = books;
//     }

//     public void addbook() {
//         System.out.println("Enter book name:");
//         String a = sc.next();
//         System.out.println("Enter author name:");
//         String f = sc.next();
//         System.out.println("Enter issued to:");
//         String c = sc.next();
//         System.out.println("Enter issued on:");
//         String d = sc.next();
//         Book book = new Book(a, f, c, d);

//         books.add(book);
//         System.out.println("The book is added successfully.");
//     }

//     public void returnbook() {
//         System.out.println("Enter book name:");
//         String a = sc.next();
//         System.out.println("Enter author name:");
//         String f = sc.next();
//         System.out.println("Enter issued to:");
//         String c = sc.next();
//         System.out.println("Enter issued on:");
//         String d = sc.next();
//         Book b = new Book(a, f, c, d);
//         System.out.println("The book is returned.");
//         books.add(b);
//     }

//     public void issuedbook() {
//         System.out.println("Enter book name:");
//         String a = sc.next();
//         System.out.println("Enter author name:");
//         String f = sc.next();
//         System.out.println("Enter issued to:");
//         String c = sc.next();
//         System.out.println("Enter issued on:");
//         String d = sc.next();
//         Book e = new Book(a, f, c, d);
//         books.remove(e);
//         System.out.println("The book is issued.");
//     }

//     public void displayAll() {
//         for (Book bo : books) {
//             System.out.println(bo);
//         }
//     }
// }

// public class list {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Book> initialBooks = new ArrayList<>();
//         initialBooks.add(new Book("1984", "George Orwell", "", ""));
//         initialBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "", ""));
//         MYlibrary library = new MYlibrary(initialBooks);

//         while (true) {
//             System.out.println("Enter 1 for adding book");
//             System.out.println("Enter 2 for returning book");
//             System.out.println("Enter 3 for issuing book");
//             System.out.println("Enter 4 for displaying books");
//             System.out.println("Enter 0 to exit");
//             int a = sc.nextInt();
//             sc.nextLine(); // Consume newline
//             System.out.println("You entered: " + a);

//             switch (a) {
//                 case 0:
//                     System.out.println("Exiting the program.");
//                     sc.close();
//                     return;
//                 case 1:
//                     library.addbook();
//                     break;
//                 case 2:
//                     library.returnbook();
//                     break;
//                 case 3:
//                     library.issuedbook();
//                     break;
//                 case 4:
//                     library.displayAll();
//                     break;
//                 default:
//                     System.out.println("Re-enter the number.");
//                     break;
//             }
//         }
//     }
// }

// public class list {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         int b[]={1,2,5};
//         // String b[]={"Prasanth","thanu"};
//         int c[]={1,2,3,4,5}+{1,2,5};
//     }
// }

import java.util.*;
// public class list {
//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         Scanner sc=new Scanner(System.in);
//         String c=sc.next();
//         System.out.println((c.equals("+")) ? a+b:(c.equals("-")) ? a-b: a+" "+b);
//     }
// }


// public class list {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         System.out.println((a%2==0) ? "the number is even:"+a: "the number is odd:"+a);

//     }
// }

// public class list {
//     public static void main(String[] args) {
//         prin(1);
//     }
//     public static void prin(int num){
//         if(num<=100){
//             System.out.println(num);
//             prin(num+1);
//         }
//     }
// }



// binary search
// public class list {
//     public static void main(String[] args) {
//         int num[]={1,2,3,4,5};
//         int result=binarysearch(num, 10);
//         if(result!=-1){
//             System.out.println("The element index is:"+result);
//         }
//         else{
//             System.out.println("The element not found");
//         }
//     }
//     public static int binarysearch(int number[],int a){
//         int low=0;
//         int high=4;
//         while(low<=high){
//             int m=(high+low)/2;
//             int p=number[m];
//             if(a==p){
//                 return m;
//             }
//             if(a<p){
//                 high=m-1;
//             }
//             else{
//                 low=m+1;
//                 // System.out.println(low);
//                 // System.out.println(high);
//             }
//         }
//         return -1;
        
//     }
// }


