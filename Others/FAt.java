import java.util.*;
// class Book{
//     int id;
//     String bookname;
//     String author;
//     String publisher;
//     Book(int id,String bookname,String author,String publisher){
//         this.id=id;
//         this.bookname=bookname;
//         this.author=author;
//         this.publisher=publisher;
//     }
//     public  void showDetails(Map<Integer,Book> book){
//         for(Map.Entry<Integer,Book> m:book.entrySet()){
//             Book p=m.getValue();
//             System.out.println("ID: " + p.id + ", Book Name: " + p.bookname+ ", Author: " + p.author + ", Publisher: " + p.publisher);
//         }
//     }
// }
// public class FAt{
//     public static void main(String[] args) {
//         HashMap<Integer, Book> book = new HashMap<>();
//         Book b1=new Book(1, "money", "ppk","hema");
//         Book b2=new Book(2, "mon", "pp","hem");
//         Book b3=new Book(3, "mo", "p","he");
//         book.put(b1.id,b1);
//         book.put(b2.id,b2);
//         book.put(b3.id,b3);
//         b1.showDetails(book);
//         if(book.containsKey(2)){
//             Book bookto=book.get(2);
//             bookto.author="updatenmae";
//             book.put(2, bookto);

//         }
//         b1.showDetails(book);
//     }
// }

// class Book{
//     int id;
//     String name;
//     String author;
//     String publisher;
//     Book(int id,String name,String author,String publisher){
//         this.id=id;
//         this.name=name;
//         this.author=author;
//         this.publisher=publisher;
//     }

//     public void display(HashMap<Integer,Book> book){
//         for(Map.Entry<Integer,Book> m:book.entrySet()){
//             Book p=m.getValue();
//             System.out.println("id:"+p.id+" "+p.name+" "+p.author+" "+p.publisher+" ");
//         }
//     }
// }

// public class FAt {
//     public static void main(String[] args){
//         HashMap<Integer,Book> book=new HashMap<>();
//         Book b1=new Book(9742,"ppk", "Prasanth", "subbu");
//         Book b2=new Book(9716,"hema", "Hemanth", "santhu");
//         book.put(b1.id,b1);
//         book.put(b2.id,b2);
//         b1.display(book);
        
//     }
// }

// class client extends Thread{
//     Scanner sc=new Scanner(System.in);
//     int count=10;
//     public synchronized void run(){
//         try{
//             for(int i=1;i<count;i++){
//                 System.out.println("the Sent packet with ID:"+i);
//                 wait(100);
//             }
//             Thread.sleep(100);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class servant extends Thread{
//     Scanner sc=new Scanner(System.in);
//     int count=10;
//     public synchronized void run(){
//         try{
//             for(int i=1;i<count;i++){
//                 System.out.println("the Recevied packet with ID:"+i);
//                 wait(100);
//             }
//             Thread.sleep(100);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// public class FAt {
//     public static void main(String[] args) {
//         client c1=new client();
//         servant s1=new servant();
//         c1.start();
//         try{
//             Thread.sleep(100);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         s1.start();
//     }
// }


// class ThreadSample implements Runnable{
//     private String name;
//     private int priority;
  
//     public ThreadSample(String name, int priority) {
//       this.name = name;
//       this.priority = priority;
//     }
  
//     public void run() {
//       try {
//         Thread.sleep(20);
//         System.out.println("Thread " + name + " after sleep with priority " + priority);
//       } catch (InterruptedException e) {
//         System.out.println(e);
//       }
//     }
//   }
  
//   public class FAt{
//     public static void main(String[] args) {
//       ThreadSample threadA = new ThreadSample("Thread_A", Thread.MAX_PRIORITY);
//       ThreadSample threadB = new ThreadSample("Thread_B", Thread.NORM_PRIORITY);
//       ThreadSample threadC = new ThreadSample("Thread_C", Thread.MIN_PRIORITY);
//       Thread threadAObj = new Thread(threadA);
//       Thread threadBObj = new Thread(threadB);
//       Thread threadCObj = new Thread(threadC);
  
//       threadAObj.start();
//       threadBObj.start();
//       threadCObj.start();
//     }
//   }
  

// class patient{
//     int id;
//     String name;
//     int age;
//     String gender;
//     patient(int id,String name,int age,String gender){
//         this.id=id;
//         this.gender=gender;
//         this.name=name;
//         this.age=age;
//     }
//     public static void  display(HashMap<Integer,patient> p){
//         for(Map.Entry<Integer,patient> m:p.entrySet()){
//             patient mp=m.getValue();
//             System.out.println(mp.id+" "+mp.name+" "+mp.age+" "+mp.gender);
//         }
//     }
//     public static void main(String[] args) {
//         HashMap<Integer,patient> p= new HashMap<>();
//         patient p1=new patient(1,"Prasanth",12,"Male");
//         patient p2=new patient(2,"Hema",10,"Female");
//         p.put(p1.id,p1);
//         p.put(p2.id,p2);
//         display(p);
//         if(p.containsKey(1)){
//             patient p3=p.get(1);
//             p3.gender="Female";
//             p.put(1, p3);
//         }
//         System.out.println("the remove and replace of 1 index");
//         p.remove(2);
//         display(p);    
//     }
// }

// class Task extends Thread {
//     private int id;

//     public Task(int id, String name, int priority) {
//         this.id = id;
//         this.setName(name);
//         this.setPriority(priority);
//     }

//     @Override
//     public void run() {
//         System.out.println("Thread " + getName() + " started with priority " + getPriority());
//         try {
//             Thread.sleep(10000);
//             System.out.println("Thread " + getName() + " after sleep with priority " + getPriority());
//         } catch (InterruptedException e) {
//             System.out.println("Thread " + getName() + " was interrupted. " + e.getMessage());
//         }
//     }
// }

// public class FAt{
//     public static void main(String[] args) {
//         Task t1 = new Task(1, "t1", 9);
//         Task t2 = new Task(2, "t2", 5);
//         Task t3 = new Task(3, "t3", 7);
//         Task t4 = new Task(4, "t4", 4);
//         Task t5 = new Task(5, "t5", 8);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
//         try {
//             Thread.sleep(2000);
//             t4.interrupt();
//             throw new InterruptedException("Interrupted by t5");
//         } catch (InterruptedException e) {
//             System.out.println("Thread " + t5.getName() + " caused an interrupt. " + e.getMessage());
//         }
//         displayThreadInfo(t1);
//         displayThreadInfo(t2);
//         displayThreadInfo(t3);
//         displayThreadInfo(t4);
//         displayThreadInfo(t5);
//     }

//     public static void displayThreadInfo(Task thread) {
//         System.out.println("Thread Name: " + thread.getName() + ", Priority: " + thread.getPriority() +  ", State: " + thread.getState());
//     }
// }

// class Customer extends Thread{
//     int totalSeats=10;
//     int seatNumber;
//     HashSet<Integer> bookedSeats=new HashSet<>();
//     Customer(int seatNumber){
//         this.seatNumber=seatNumber;
//     }
//     public synchronized boolean bookSeat(int seatNumber) {
//         if (seatNumber > totalSeats || seatNumber < 1) {
//             System.out.println("Seat number " + seatNumber + " is invalid.");
//             return false;
//         }
//         if (bookedSeats.contains(seatNumber)) {
//             System.out.println("Seat number " + seatNumber + " is already booked.");
//             return false;
//         } else {
//             bookedSeats.add(seatNumber);
//             System.out.println("Seat number " + seatNumber + " successfully booked.");
//             return true;
//         }
//     }
//     public void run(){
//         try{
//             bookSeat(seatNumber);
//         }
//         catch(Exception e ){
//             System.out.println(e);
//         }
//     }

// }
// public class FAt {
//     public static void main(String[] args) {
//         Customer c1=new Customer(1);
//         Customer c3=new Customer(2);
//         Customer c2=new Customer(3);
//         Customer c4=new Customer(11);
//         c1.start();
//         c2.start();
//         c3.start();
//         c4.start();
//     }
// }


// class Product {
//     int id;
//     String name;
//     String date;
//     String available_details;
//     int rate;

//     Product(int id, String name, String date, String available_details, int rate) {
//         this.id = id;
//         this.name = name;
//         this.date = date;
//         this.available_details = available_details;
//         this.rate = rate;
//     }

//     @Override
//     public String toString() {
//         return "Product{id=" + id + 
//                 ", name='" + name + '\'' +
//                 ", date='" + date + '\'' +
//                 ", available_details='" + available_details + '\'' +
//                 ", rate=" + rate + '}';
//     }

//     public void showDetails(HashSet<Product> p) {
//         for (Product product : p) {
//             System.out.println(product);
//         }
//     }
//     public void show(HashSet<Product> p) {
//         for (Product product : p) {
//             if(product.rate<5){
//                 System.out.println(product.name);
//             }
//         }
//     }
    
// }

// public class FAt {
//     public static void main(String[] args) {
//         HashSet<Product> p = new HashSet<>();
//         Product p1 = new Product(1, "Prasanth", "25-08-1990", "yes", 10);
//         Product p2 = new Product(2, "hema", "25-08-1990", "yes", 4);
//         p.add(p1);
//         p.add(p2);
//         p1.showDetails(p);
//         p1.show(p);
//     }
// }

// class MidValueNotFoundException extends Exception {
//     public MidValueNotFoundException(String message) {
//         super(message);
//     }
// }

// class MaxThread extends Thread {
//     ArrayList<Integer> arr;

//     MaxThread(ArrayList<Integer> arr) {
//         this.arr = arr;
//     }

//     public void maxelement() {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.size(); i++) {
//             if (arr.get(i) > max) {
//                 max = arr.get(i);
//             }
//         }
//         System.out.println("Maximum value is: " + max);
//     }

//     @Override
//     public void run() {
//         maxelement();
//     }
// }


// public class FAt {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);
//         MaxThread m1 = new MaxThread(arr);
//         m1.start();
//     }
// }

// class evenp extends Thread{
//     ArrayList<Integer> arr;
//     evenp(ArrayList<Integer> arr){
//         this.arr=arr;
//     }
//     public void power(){
//         for(int i=0;i<arr.size();i++){
//             if((arr.get(i)%2)==0){
//                 System.out.println(Math.pow(arr.get(i), 2));
//             }
//         }
//     }
//     public void run(){
//         power();
//     }
// }
// class oddp extends Thread{
//     ArrayList<Integer> arr;
//     oddp(ArrayList<Integer> arr){
//         this.arr=arr;
//     }
//     public void powerp(){
//         for(int i=0;i<arr.size();i++){
//             if((arr.get(i)%2)!=0){
//                 System.out.println(Math.pow(arr.get(i), 2));
//             }
//         }
//     }
//     public void run(){
//         powerp();
//     }
// }

// public class FAt {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);
//         arr.add(5);
//         evenp t1=new evenp(arr);
//         oddp t2=new oddp(arr);
//         System.out.println("Power of even elements");
//         t1.start();
//         try{
//             Thread.sleep(100);

//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("Powers of odd elements");
//         t2.start();
//     }
// }


// class Book {
//   int bookId;
//   String title;
//   String author;

//   public Book(int bookId, String title, String author) {
//     this.bookId = bookId;
//     this.title = title;
//     this.author = author;
//   }

//   @Override
//   public String toString(){
//     return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
//   }
// }

// class Library {
//   private HashSet<Book> books;

//   public Library() {
//     this.books = new HashSet<>();
//   }

//   public void addBook(Book book) {
//     books.add(book);
//   }

//   public void removeBook(int bookId) {
//     Book bookToRemove = null;
//     for (Book book : books) {
//       if (book.bookId == bookId) {
//         bookToRemove = book;
//         break;
//       }
//     }
//     if (bookToRemove != null) {
//       books.remove(bookToRemove);
//       System.out.println("Book removed successfully!");
//     } else {
//       System.out.println("Book not found!");
//     }
//   }

//   public void displayBooks() {
//     if (books.isEmpty()) {
//       System.out.println("There are no books in the library.");
//     } else {
//       System.out.println("List of Books:");
//       for (Book book : books) {
//         System.out.println(book);
//       }
//     }
//   }
// }

// public class FAt{

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     Library library = new Library();

//     int choice;
//     do {
//       System.out.println("\nLibrary Management System");
//       System.out.println("1. Add Book");
//       System.out.println("2. Remove Book");
//       System.out.println("3. Display Books");
//       System.out.println("4. Exit");
//       System.out.print("Enter your choice: ");
//       choice = scanner.nextInt();

//       switch (choice) {
//         case 1:
//           System.out.print("Enter book ID: ");
//           int bookId = scanner.nextInt();
//           scanner.nextLine(); // Consume newline character
//           System.out.print("Enter book title: ");
//           String title = scanner.nextLine();
//           System.out.print("Enter book author: ");
//           String author = scanner.nextLine();
//           library.addBook(new Book(bookId, title, author));
//           System.out.println("Book added successfully!");
//           break;
//         case 2:
//           System.out.print("Enter book ID to remove: ");
//           int removeId = scanner.nextInt();
//           library.removeBook(removeId);
//           break;
//         case 3:
//           library.displayBooks();
//           break;
//         case 4:
//           System.out.println("Exiting Library Management System.");
//           break;
//         default:
//           System.out.println("Invalid choice!");
//       }
//     } while (choice != 4);

//     scanner.close();
//   }
// }


// class evenp extends Thread{
//     int count=10;
//     public void evenp(){
//         try{
//             for(int i=0;i<count;i++){
//                 if(i%2==0){
//                     System.out.println(" "+i);
//                 }
//                 Thread.sleep(100);
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
//     public void run(){
//         evenp();
//     }
// }
// class odd extends Thread{
//     int count=10;
//     public void odd(){
//         try{
//             for(int i=0;i<count;i++){
//                 if(i%2!=0){
//                     System.out.println(" "+i);
//                 }
//                 Thread.sleep(100);
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
//     public void run(){
//         odd();
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         evenp p1=new evenp();
//         odd o1=new odd();
//         p1.start();
//         try{
//             Thread.sleep(100);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         o1.start();

        
//     }
// }

// class Main{
//     // Private fields to store the name and age of the person
//     private String name;
//     private int age;

//     // Public getter method for name
//     public String getName() {
//         return name;
//     }

//     // Public setter method for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Public getter method for age
//     public int getAge() {
//         return age;
//     }

//     // Public setter method for age
//     public void setAge(int age) {
//         // Adding some validation to the setter method
//         if (age > 0) {
//             this.age = age;
//         } else {
//             System.out.println("Age must be positive.");
//         }
//     }
// }

// // Main class to test the Person class
// public class Person{
//     public static void main(String[] args) {
//         // Create a new Person object
//         Main person = new Main();
//         person.setName("John Doe");
//         person.setAge(30);
//         System.out.println(person.getAge());
//     }
// }
// import java.util.ArrayList;
// class Person{
//     public static void main(String[] args) {
        
    
//     ArrayList<String> names=new ArrayList<>();
//     names.add("pari");
//     names.add("chethan");
//     names.add("rocky");
//     names.remove("chethan");
//     names.remove(1);
//     for(int i=0;i<names.size();i++){
//         String s=names.get(i);
//         System.out.println(s);
//     }
// }
// }


// class Single{
//     void display(){
//         synchronized(this){
//             Thread g=Thread.currentThread();
//             try{
//                 for(int i=0;i<5;i++){
//                     Thread.sleep(1000);
//                     System.out.println(g.getName()+":"+i);
//                 }
//                 wait(1000);
//                 notify();
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//    }
// }
// class sin extends Thread{
//     Single s;
//     sin(Single s){
//         this.s=s;
//     }
//     public  void run(){
//         s.display();
//     }
// }

// public class FAt {
//     public static void main(String[] args) {
//         Single ex=new Single();
//         sin se=new sin(ex);
//         sin se1=new sin(ex);
//         se.start();
//         se1.start();
//     }
// }

// class single extends Thread{
//     public void run(){
//         synchronized(this){
//             Thread g=Thread.currentThread();
//         for(int i=0;i<5;i++){
//             System.out.println(g.getName()+":"+i);
//         }
//         // notify();
//         }

//     }
// }
// public class FAt {
//     public static void main(String[] args) throws InterruptedException{
//         single s=new single();
//         single s1=new single();
//         s.start();
//         s.join();
//         s1.start();
//     }
// }

// public class FAt {
//     public static void main(String[] args) {
//         int a[]=new int[5];
//     }
// }


// class single<T>{
//     T a;
//     T b;
//     single(T a,T b){
//         this.a=a;
//         this.b=b;
//     }
//     public T display(){
//         return (T) (a+" "+b);
//     }
// }

// public class FAt {

//     public static void main(String[] args) {
//         single<String> s=new single<String>("Prasanth","shiva");
//         System.out.println(s.display());
//     }
// }

// class length1 extends Thread{
//     int b;
//     Scanner sc=new Scanner(System.in);
//     public void run(){
//         synchronized(this){
//                 System.out.println("enter a name");
//                 String a=sc.next();
//                 b=a.length();
//                 notify();
//             }
//         }
//     public int getlength(){
//         return b;
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         length1 l=new length1();
//         synchronized(l){
//             try{
//                 l.start();
//                 l.wait(1000);
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//         System.out.println("the length"+l.getlength());
//     }
// }

// class single extends Thread{
//     public void run(){
//         synchronized(this){
//             Thread g=Thread.currentThread();
//             for(int i=1;i<=10;i++){
//                 if(i%2!=0){
//                     System.out.println(g.getName()+":"+i);
//                 }
//             }
//         }
//     }
// }
// class even extends Thread{
//     public void run(){
//         synchronized(this){
//             Thread g=Thread.currentThread();
//             for(int i=1;i<=10;i++){
//                 if(i%2==0){
//                     System.out.println(g.getName()+":"+i);
//                 }
//             }
//         }
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         single s=new single();
//         even e=new even();
//         synchronized (s) {
//             s.start();
//             try {
//                 s.wait();
//             } catch (InterruptedException ex) {
//                 System.out.println(ex);
//             }
//         }

//         synchronized (e) {
//             e.start();
//             try {
//                 e.wait();
//             } catch (InterruptedException ex) {
//                 System.out.println(ex);
//             }
//         }
//     }
// }

// class InvalidFUelcapException extends Exception{
//     InvalidFUelcapException(String s){
//         super(s);
//     }
// }
// abstract class vechile{
//     int reg;
//     String brand;
//     String year;
//     vechile(int reg,String brand,String year){
//         this.year=year;
//         this.reg=reg;
//         this.brand=brand;
//     }
//     abstract public void calculateMileage();
// }
// class Car extends vechile{
//     int fuelcap;
//     Car(int reg,String brand,String year,int fuelcap){
//         super(reg,brand,year);
//         this.fuelcap=fuelcap;
//     }
//     public void calculateMileage(){
//         Scanner sc=new Scanner(System.in);
//         int distance=sc.nextInt();
//         double m;
//         try{
//             if(fuelcap==0){
//                 throw new InvalidFUelcapException("invalid fuel value");
//             }
//             else if(fuelcap<0){
//                 throw new InvalidFUelcapException("negative is not allowed");
//             }
//             else{
//                 m=distance/fuelcap;
//                 System.out.println(m);
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         Car c=new Car(9742, "BMW","2024", 0);
//         Car c1=new Car(9742, "BMW","2024", -1);
//         Car c2=new Car(9742, "BMW","2024", 200);
//         c.calculateMileage();
//         c1.calculateMileage();
//         c2.calculateMileage();
//     }
// }

// class Student {
//     private String name;
//     private int age;

//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
// }
// class StudentPair<T extends Student> {
//     private T firstStudent;
//     private T secondStudent;

//     public StudentPair(T firstStudent, T secondStudent) {
//         this.firstStudent = firstStudent;
//         this.secondStudent = secondStudent;
//     }

//     public T getFirstStudent() {
//         return firstStudent;
//     }

//     public void setFirstStudent(T firstStudent) {
//         this.firstStudent = firstStudent;
//     }

//     public T getSecondStudent() {
//         return secondStudent;
//     }

//     public void setSecondStudent(T secondStudent) {
//         this.secondStudent = secondStudent;
//     }
// }
// public class FAt{
//     public static void main(String[] args) {
//         // Creating student instances
//         Student student1 = new Student("Alice", 20);
//         Student student2 = new Student("Bob", 22);
//         Student student3 = new Student("Carol", 19);
//         Student student4 = new Student("Dave", 21);

//         // Creating two instances of StudentPair
//         StudentPair<Student> pair1 = new StudentPair<>(student1, student2);
//         StudentPair<Student> pair2 = new StudentPair<>(student3, student4);

//         // Displaying the names and ages of both students in each pair
//         System.out.println("Students in pair1:");
//         System.out.println("First Student: " + pair1.getFirstStudent().getName() + ", Age: " + pair1.getFirstStudent().getAge());
//         System.out.println("Second Student: " + pair1.getSecondStudent().getName() + ", Age: " + pair1.getSecondStudent().getAge());

//         System.out.println("Students in pair2:");
//         System.out.println("First Student: " + pair2.getFirstStudent().getName() + ", Age: " + pair2.getFirstStudent().getAge());
//         System.out.println("Second Student: " + pair2.getSecondStudent().getName() + ", Age: " + pair2.getSecondStudent().getAge());

//         // Updating the values of the students in pair1
//         Student student5 = new Student("Eve", 23);
//         Student student6 = new Student("Frank", 24);
//         pair1.setFirstStudent(student5);
//         pair1.setSecondStudent(student6);

//         // Displaying the updated names and ages of the students in pair1
//         System.out.println("Updated students in pair1:");
//         System.out.println("First Student: " + pair1.getFirstStudent().getName() + ", Age: " + pair1.getFirstStudent().getAge());
//         System.out.println("Second Student: " + pair1.getSecondStudent().getName() + ", Age: " + pair1.getSecondStudent().getAge());
//     }
// }



// class A extends Thread{
//     public void run(){
//         synchronized(this){
//             for(int i=0;i<3;i++){
//                 System.out.println(Thread.currentThread().getName()+" "+i);
//             }
//         }
        
//     }
// }
// class practice1{
//     public static void main(String[] args) {
//         A t1= new A();
//         A t2= new A();
//         A t3= new A();
//         try{
//             t1.start();   
//             t1.join();
//             t2.start();   
//             t2.join();
//             t3.start();   
//             t3.join();
//         }   
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// class Box<T>{
//     ArrayList<T> a=new ArrayList<>();
//     T item;
//     public void additem(T item){
//         a.add(item);
//     }
//     public void printcontent(){
//         System.out.println(a);
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         Box<Integer> b=new Box();
//         b.additem(2);
//         b.additem(1);
//         b.additem(3);
//         b.printcontent();
//         Box<String> c=new Box();
//         c.additem("Prasanht");
//         c.additem("subbu");
//         c.printcontent();

//     }
// }

// class Fact extends Thread{
//     int n;
//     Fact(int n){
//         this.n=n;
//     }
//     public void run(){
//         int fact=1;
//         if(n==0){
//             System.out.println("the fact is:"+1);

//         }
//         else{
//             for(int i=1;i<=n;i++){
//                 fact*=i;
//             }
//             System.out.println("fact of"+n+":"+fact);
        
//         }
//     }
// }
// class sum extends Thread{
//     int n;
//     sum(int n){
//         this.n=n;
//     }
//     public void run(){
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum+=i;
//         }
//         System.out.println("sum of numbers"+sum);
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         Fact f=new Fact(5);
//         f.start();
//         sum s=new sum(5);
//         s.start();
//     }
// }


// class Room {
//     int roomId;
//     boolean isOccupied;
//     Student allocatedTo;

//     public Room(int roomId) {
//         this.roomId = roomId;
//         this.isOccupied = false;
//         this.allocatedTo = null;
//     }
// }

// class Hostel {
//     private ArrayList<Room> rooms;

//     public Hostel(int numRooms) {
//         this.rooms = new ArrayList<>();
//         for (int i = 0; i < numRooms; i++) {
//             rooms.add(new Room(i + 1));
//         }
//     }

//     public synchronized boolean allocateRoom(Student student) {
//         for (Room room : rooms) {
//             if (!room.isOccupied) {
//                 room.isOccupied = true;
//                 room.allocatedTo = student;
//                 System.out.println("Room " + room.roomId + " allocated to " + student.name);
//                 student.roomAllocated = true;
//                 return true;
//             }
//         }
//         System.out.println("No rooms available for " + student.name);
//         return false;
//     }

//     public synchronized void checkRoomAvailability() {
//         System.out.println("Room Availability Status:");
//         for (Room room : rooms) {
//             System.out.println("Room " + room.roomId + ": " + (room.isOccupied ? "Occupied by " + room.allocatedTo.name : "Available"));
//         }
//     }
// }

// class Student extends Thread{
//     String name;
//     Hostel hostel;
//     boolean roomAllocated;

//     public Student(String name, Hostel hostel) {
//         this.name = name;
//         this.hostel = hostel;
//         this.roomAllocated = false;
//     }

//     @Override
//     public void run() {
//         hostel.allocateRoom(this);
//     }
// }

// public class FAt{

//     public static void main(String[] args) {
//         int numRooms = 4;
//         Hostel hostel = new Hostel(numRooms);

//         Student student1 = new Student("Student 1", hostel);
//         Student student2 = new Student("Student 2", hostel);
//         Student student3 = new Student("Student 3", hostel);
//         Student student4 = new Student("Student 4", hostel);
//         Student student5 = new Student("Student 5", hostel);
//         student1.start();
//         student2.start();
//         student3.start();
//         student4.start();
//         student5.start();

//         try {
//             student1.join();
//             student2.join();
//             student3.join();
//             student4.join();
//             student5.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         hostel.checkRoomAvailability();
//     }
// }


// class Seat {
//     int seatId;
//     boolean isBooked;

//     public Seat(int seatId) {
//         this.seatId = seatId;
//         this.isBooked = false;
//     }
// }

// class RailwayBookingSystem {
//     private ArrayList<Seat> seats;
//     private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//     private Lock readLock = lock.readLock();
//     private Lock writeLock = lock.writeLock();

//     public RailwayBookingSystem(int numSeats) {
//         seats = new ArrayList<>();
//         for (int i = 0; i < numSeats; i++) {
//             seats.add(new Seat(i + 1));
//         }
//     }

//     public boolean bookSeat(int seatId) {
//         writeLock.lock();
//         try {
//             if (seatId > seats.size() || seatId <= 0) {
//                 System.out.println("Invalid seat number.");
//                 return false;
//             }
//             Seat seat = seats.get(seatId - 1);
//             if (!seat.isBooked) {
//                 seat.isBooked = true;
//                 System.out.println("Seat " + seat.seatId + " booked successfully.");
//                 return true;
//             } else {
//                 System.out.println("Seat " + seat.seatId + " is already booked.");
//                 return false;
//             }
//         } finally {
//             writeLock.unlock();
//         }
//     }

//     public boolean cancelSeat(int seatId) {
//         writeLock.lock();
//         try {
//             if (seatId > seats.size() || seatId <= 0) {
//                 System.out.println("Invalid seat number.");
//                 return false;
//             }
//             Seat seat = seats.get(seatId - 1);
//             if (seat.isBooked) {
//                 seat.isBooked = false;
//                 System.out.println("Seat " + seat.seatId + " cancelled successfully.");
//                 return true;
//             } else {
//                 System.out.println("Seat " + seat.seatId + " is not booked.");
//                 return false;
//             }
//         } finally {
//             writeLock.unlock();
//         }
//     }

//     public void checkAvailability() {
//         readLock.lock();
//         try {
//             System.out.println("Seat Availability Status:");
//             for (Seat seat : seats) {
//                 System.out.println("Seat " + seat.seatId + ": " + (seat.isBooked ? "Booked" : "Available"));
//             }
//         } finally {
//             readLock.unlock();
//         }
//     }
// }

// class User implements Runnable {
//     private String action;
//     private int seatId;
//     private RailwayBookingSystem bookingSystem;

//     public User(String action, int seatId, RailwayBookingSystem bookingSystem) {
//         this.action = action;
//         this.seatId = seatId;
//         this.bookingSystem = bookingSystem;
//     }

//     @Override
//     public void run() {
//         switch (action) {
//             case "book":
//                 bookingSystem.bookSeat(seatId);
//                 break;
//             case "cancel":
//                 bookingSystem.cancelSeat(seatId);
//                 break;
//             case "check":
//                 bookingSystem.checkAvailability();
//                 break;
//             default:
//                 System.out.println("Invalid action.");
//         }
//     }
// }

// public class FAt{
//     public static void main(String[] args) {
//         int numSeats = 10;
//         RailwayBookingSystem bookingSystem = new RailwayBookingSystem(numSeats);

//         // Create users with different actions
//         Thread user1 = new Thread(new User("book", 1, bookingSystem));
//         Thread user2 = new Thread(new User("book", 1, bookingSystem));
//         Thread user3 = new Thread(new User("cancel", 1, bookingSystem));
//         Thread user4 = new Thread(new User("check", 0, bookingSystem));
//         Thread user5 = new Thread(new User("book", 2, bookingSystem));
//         Thread user6 = new Thread(new User("check", 0, bookingSystem));

//         // Start the user threads
//         user1.start();
//         user2.start();
//         user3.start();
//         user4.start();
//         user5.start();
//         user6.start();

//         // Join the user threads
//         try {
//             user1.join();
//             user2.join();
//             user3.join();
//             user4.join();
//             user5.join();
//             user6.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }


// class Book{
//     int id,quantity;
//     String title,author;
//     public Book(int id, int quantity, String title, String author) {
//         this.id = id;
//         this.quantity = quantity;
//         this.title = title;
//         this.author = author;
//     }
    
//     public int getBookId() {
//         return id;
//     }
//     public String toString() {
//         return "Book{" +"bookId=" + id +", title='" + title + '\'' +", author='" + author + '\'' +", quantity=" + quantity +'}';
//     }
// }
// class library{
//     HashSet<Book> b1= new HashSet<>();
//     void add(Book book){
//         if(!b1.contains(book)){
//             b1.add(book);
//         }
//         else{
//             System.out.println("book alredy available : ");
//         }
//     }
//     public void removeBook(int bookId) {
//         Book bookToRemove = null;
//         for (Book book : b1) {
//             if (book.getBookId() == bookId) {
//                 bookToRemove = book;
//                 break;
//             }
//         }
//         if (bookToRemove != null) {
//             b1.remove(bookToRemove);
//             System.out.println("Book removed: " + bookToRemove);
//         } else {
//             System.out.println("No book found with ID " + bookId);
//         }
//     }

//     void display(){
//         for(Book i:b1){
//             System.out.println("id "+i.id+" title "+i.title+" author "+i.author+ " quantity "+i.quantity);
//         }
//     }
// }
// class practice1{
//     public static void main(String[] args) {
//         Book obj=new Book(1, 2, "subb", "hem");
//         Book obj1= new Book(2, 3, "siva", "bindu");
//         library obj2= new library();
//         obj2.add(obj);
//         obj2.removeBook(1);
//     }
// }


// class BookingSystem {
//     private List<String> transactions = new ArrayList<>();
    
//     public void book(String name, int num) {
//         if (!transactions.contains(name)) {
//             System.out.println("Ticket booked successfully for: " + name + " " + Thread.currentThread().getName());
//             transactions.add(name);
//         } else {
//             System.out.println("Ticket is already booked");
//         }
//     }
    
//     public  void cancel(String name, int num) {
//         if (transactions.contains(name)) {
//             System.out.println("Ticket cancelled successfully for: " + name + " " + Thread.currentThread().getName());
//             transactions.remove(name);
//         } else {
//             System.out.println("Ticket is not cancelled");
//         }
//     }
    
//     public int getSize() {
//         return transactions.size();
//     }
// }

// class BookThread extends Thread {
//     private BookingSystem bs;
//     private String name;
//     private int num;
    
//     public BookThread(BookingSystem bs, String name, int num) {
//         this.bs = bs;
//         this.name = name;
//         this.num = num;
//     }
    
//     public void run() {
//         bs.book(name, num);
//     }
// }

// class CancelThread extends Thread {
//     private BookingSystem bs;
//     private String name;
//     private int num;
    
//     public CancelThread(BookingSystem bs, String name, int num) {
//         this.bs = bs;
//         this.name = name;
//         this.num = num;
//     }
    
//     public void run() {
//         bs.cancel(name, num);
//     }
// }

// public class FAt {
//     public static void main(String args[]) throws InterruptedException {
//         BookingSystem b1 = new BookingSystem();
//         BookThread a1 = new BookThread(b1, "siva", 45);
//         BookThread a3 = new BookThread(b1, "siva", 45);
//         CancelThread b2 = new CancelThread(b1, "hemanth", 43);
//         a1.start();
//         a3.start();
//         b2.start();
//         a1.join();
//         a3.join();
//         b2.join();
        
//         System.out.println(b1.getSize());
//     }
// }


// class Student {
//     String name;
//     String roomno;

//     public Student(String name, String roomno) {
//         this.name = name;
//         this.roomno = roomno;
//     }
// }

// class Allot {
//     Student obj;
//     ArrayList<String> rooms = new ArrayList<>(10);
//     ArrayList<Student> stu = new ArrayList<>();

//     void allotRoom(Student obj) {
//         this.obj = obj;
//         if (rooms.contains(obj.roomno)) {
//             System.out.println("Room is already booked: " + obj.roomno);
//         } else {
//             rooms.add(obj.roomno);
//             System.out.println("Room booked successfully: " + obj.roomno);
//         }
//         stu.add(obj);
//     }

//     void checkRooms() {
//         System.out.println("Available rooms: " + (10 - rooms.size()));
//     }

//     void details() {
//         for (Student s : stu) {
//             System.out.println("Name: " + s.name + ", Allotted room: " + s.roomno);
//         }
//     }
// }

// class Check extends Thread {
//     Student s;
//     Allot a;

//     Check(Allot a, Student s) {
//         this.a = a;
//         this.s = s;
//     }

//     public void run(){
//         a.allotRoom(s);
//     }
// }

// public class FAt {
//     public static void main(String[] args) {
//         Allot allotment = new Allot();
//         Student student1 = new Student("John", "101");
//         Student student2 = new Student("Alice", "102");

//         Check check1 = new Check(allotment, student1);
//         Check check2 = new Check(allotment, student2);

//         check1.start();
//         check2.start();

//         try {
//             check1.join();
//             check2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         allotment.checkRooms();
//         allotment.details();
//     }
// }

// class empty extends Exception{
//     empty(String s){
//         super(s);
//     }
// }
// class invalid extends Exception{
//     invalid(String s){
//         super(s);
//     }
// }
// class Single{
//     Scanner sc=new Scanner(System.in);
//     public void check() throws empty,invalid{
//         String a=sc.nextLine();
//         if(a.isEmpty()){
//             throw new empty("enter a item");
//         }
//         int b=Integer.parseInt(a);
//         if(b<0){
//             throw new invalid("enter positive number");
//         }
//         else{
//             System.out.println("the number is:"+b);
//         }
//     }
// }
// public class FAt {
//     public static void main(String[] args) {
//         Single s=new Single();
//         try{
//             s.check();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// class practice1{
//     public static void main(String[] args) {
//         String a="hello world";
//         String b="ll";
//         int c=a.length();
//         int d=b.length();
//         int e=c+1;
//         int f=e-d;
//         System.out.println(c+" "+d+" "+f);
//         for(int j=0;j<f;j++){
//             String g="";
//             g=a.substring(j, j+d);
//             if(g.equals(b)){
//                 System.out.println("match found in word : "+a);
//             }
//         }
//     }
// }

// class practice1{
//     public static void main(String[] args) {
//         String a[]={"helloworld","hello","world"};
//         String b="ll";
//         int d=b.length();
//         for(int i=0;i<a.length;i++){
//         int c=a[i].length();
//         int e=c+1;
//         int f=e-d;
//         boolean ar;
//         System.out.println(c+" "+d+" "+f);
//             for(int j=0;j<f;j++){
//                 String g="";
//                 g=a[i].substring(j, j+d);
//                 System.out.println(g);
//                 if(b.equals(g)){
//                     System.out.println("match found");
//                 }
//                 else{
//                     System.out.println("not found : ");
//                 }
//             }
//         }
//     }
// }
