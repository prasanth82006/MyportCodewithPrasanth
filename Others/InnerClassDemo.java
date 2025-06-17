import java.util.*;
import java.lang.*;
//class InnerClassDemo{
//     int x=10;
//     static int y=20;
//     class Inner{
//     int x=100;
//     static void m2(){}
//     public void m1(){
//     int x=1000;
//     System.out.println("Inner class method:"+InnerClassDemo.this.x);
//      System.out.println("Inner class method:"+y);
//      class NetstedMethod{
//     void m2(){System.out.println("class inside method");}
    
//      }
//      NetstedMethod nm=new NetstedMethod();
//      nm.m2();
    
//      }
//     }
//     public static void main(String args[]){
//     System.out.println("The current version of JVMis:"+System.getProperty("java.version"));
//     InnerClassDemo id=new InnerClassDemo();
//     InnerClassDemo.Inner i2=id.new Inner();
//     i2.m1();
//     }
//     void temp(){
//     Inner i=new Inner();
//     i.m1();
//     }
//     }

// interface Person{
//     String name="santhosh";
//     int age=18;
//     public void details();
//     public void hobbies();
// }
// interface Employee{
//     int eid=101;
//     String designation="Manager";
//     public void show();
// }
// class Manager implements Person, Employee {
    
//     public void details() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public void hobbies() {
//         System.out.println("Hobbies: Reading, Traveling");
//     }

//     public void show() {
//         System.out.println("Employee ID: " + eid);
//         System.out.println("Designation: " + designation);
//     }

//     public void displayManagerDetails() {
//         System.out.println("Manager Details:");
//         details();
//         hobbies();
//         show();
//     }
// }
// public class InnerClassDemo{
//     public static void main(String[] args) {
//         Manager m1= new Manager();
//         m1.displayManagerDetails();
//     }
// }


// class A{
//     public void shoe(){
//         System.out.println("the A show");
//     }
//     static class B{
//         public void details(){
//             System.out.println("the B show");
//         }
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         A a=new A();
//         A.B b=new A.B();
//         a.shoe();
//         b.details();

//     }  
// }


// class Library {
//     static final int MAX_BOOKS = 100;
//     Book[] books;
//     int numBooks;

//     public Library() {
//         books = new Book[MAX_BOOKS];
//         numBooks = 0;
//     }

//     public void addBook(String title, String author, int publicationYear) {
//         if (numBooks < MAX_BOOKS) {
//             books[numBooks] = new Book(title, author, publicationYear);
//             numBooks++;
//             System.out.println("Book added successfully.");
//         } else {
//             System.out.println("Library is full, cannot add more books.");
//         }
//     }

//     public void displayBooks() {
//         if (numBooks == 0) {
//             System.out.println("The library is empty.");
//         } else {
//             System.out.println("Books in the library:");
//             for (int i = 0; i < numBooks; i++) {
//                 System.out.println(books[i]);
//             }
//         }
//     }

// class Book{
//         String title;
//         String author;
//         int publicationYear;

//         public Book(String title, String author, int publicationYear) {
//             this.title = title;
//             this.author = author;
//             this.publicationYear = publicationYear;
//         }

//         public String getTitle() {
//             return title;
//         }

//         public String getAuthor() {
//             return author;
//         }

//         public int getPublicationYear() {
//             return publicationYear;
//         }

//         @Override
//         public String toString() {
//             return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
//         }
//     }
// }

// public class InnerClassDemo{
//     public static void main(String[] args) {
//         Library library = new Library();
//         library.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
//         library.addBook("1984", "George Orwell", 1949);
//         library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
//         Library.Book b=library.new Book("To Kill a Mockingbird", "Harper Lee", 1960);
//         System.out.println(b.getAuthor());
//         library.displayBooks();
//     }
// }

// import harry.check;
// import harry.CheckEvenException;
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         check c1=new check();
//         try{
//         c1.checknum(5);
//         }
//         catch(CheckEvenException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// public class InnerClassDemo {
//     public static void main(String[] args) {
//         String name="Prasanth@#12345";
//         String special[]={"@","#","!","$"};
//         int count=0;
//         for(int i=0;i<name.length();i++){
//             for(int j=0;j<special.length;j++){
//                 if(name.charAt(i)==special[j].charAt(0)){
//                     count+=1;
//                 }
//             }
//         }
        
//     }
// }

// class AgenotwithinrangeException extends Exception{
//     public AgenotwithinrangeException(String s){
//         super(s);
//     }
// }
// class nameNOTvalidException extends Exception{
//     public nameNOTvalidException(String s){
//         super(s);
//     }
// }
// class check{
//     int rollNO;
//     String name;
//     int age;
//     String course;
//     check(int rollNO,String name,int age,String course){
//         this.rollNO=rollNO;
//         this.name=name;
//         this.age=age;
//         this.course=course;
//     }
//     public void checkage() throws AgenotwithinrangeException{
//         if(age>15 && age<21){
//             System.out.println("your are allowed in age");
//         }
//         else{
//             throw new AgenotwithinrangeException("your are below the age limit");
//         }
//     }
//     public void checkname() throws nameNOTvalidException{
//         int count=0;
//         String special[]={"@","#","!","$","&","*"};
//         for(int i=0;i<name.length();i++){
//             for(int j=0;j<special.length;j++){
//                 if(name.charAt(i)==special[j].charAt(0)){
//                     throw new nameNOTvalidException("Special character are found not allowed");
                    
//                 }
//             }
//         }
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         check c1=new check(123,"Prasanth@#",20,"CSE");
//         try{
//             c1.checkage();
//             c1.checkname();
//         }
//         catch(nameNOTvalidException e){
//             System.out.println(e.getMessage());
//         }
//         catch(AgenotwithinrangeException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Operation{
//     int x;
//     int y;
//     String str;

//     public float DivisionMethod(int x,int y){
//         this.x=x;
//         this.y=y;

//         return x/y;
//     }
//     public char CharAtMethode(String str,int x){
//         this.str=str;
//         this.x=x;
//         return str.charAt(x);
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         Operation o1=new Operation();
//         try{
//             o1.DivisionMethod(21, 6);
//             o1.CharAtMethode("Prasanth", 1000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class Math2{
//     int x;
//     int y;
//     int z;
//     public static int SQRT(int x){
//         int dou=2;
//         return (int) Math.pow(x,dou);
//     }
//     public static long power(int y,int z){
//         return (long) Math.pow(y, z);
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         Math2 m1=new Math2();
//         System.out.println(m1.SQRT(3));
//         System.out.println(m1.power(5, 3));
//     }
// }


// class House {
//     double cost;
//     House() {
//         this.cost= 0.0;
//     }

//     public void setCost(double cost) {
//         this.cost = cost;
//     }

//     public double getCost() {
//         return cost;
//     }

//     class Construction {
//         int sqFt;
//         String foundationType;
//         String roofType;

//         public Construction(int sqFt, String foundationType, String roofType) {
//             this.sqFt = sqFt;
//             this.foundationType = foundationType;
//             this.roofType = roofType;
//         }

//         public void calculateConstructionCost() {
//             cost+= sqFt*10;
//         }
//     }

//     public class InteriorDecoration {
//         String flooringType;
//         String wallColor;
//         String furnitureStyle;

//         public InteriorDecoration(String flooringType, String wallColor, String furnitureStyle) {
//             this.flooringType = flooringType;
//             this.wallColor = wallColor;
//             this.furnitureStyle = furnitureStyle;
//         }

//         public void calculateDecorationCost() {
//             cost+=5000;
//         }
//     }
//     public double calculateTotalCost() {
//         Construction construction = new Construction(1, "Concrete", "Tile");
//         construction.calculateConstructionCost();

//         InteriorDecoration decoration = new InteriorDecoration("Hardwood", "Beige", "Modern");
//         decoration.calculateDecorationCost();
//         return cost;
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         House house = new House();
//         System.out.println("Total cost of the house: $" + house.calculateTotalCost());
//     }
// }

// class ProjectIDException extends Exception {
//     public ProjectIDException(String s) {
//         super(s);
//     }
// }

// class IDisNotAvailableException extends Exception {
//     public IDisNotAvailableException(String s) {
//         super(s);
//     }
// }

// class ID {
//     Scanner sc = new Scanner(System.in);
//     int c;
//     long[] ma1;

//     public void insert(){
//         c = sc.nextInt();
//         ma1 = new long[c];
//         for (int i = 0; i < c; i++){
//             ma1[i] = sc.nextLong();
//         }
//     }

//     public void checkSize() throws ProjectIDException {
//         if (c <= 100) {
//             System.out.println("Correct size batch allowed");
//         } else {
//             throw new ProjectIDException("Limit exceeded");
//         }
//     }

//     public void checkId() throws IDisNotAvailableException {
//         for (int i = 0; i < c; i++) {
//             String id1 = String.valueOf(ma1[i]);
//             boolean found = false;
//             for (int j = 0; j <= id1.length() - 4; j++) {
//                 if (id1.substring(j, j + 4).equals("2021")) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 throw new IDisNotAvailableException("ID not available: " + ma1[i]);
//             }
//         }
//         System.out.println("All IDs are available");
//     }
// }

// public class InnerClassDemo {
//     public static void main(String[] args) {
//         ID id = new ID();
//         try {
//             id.insert();
//             id.checkSize();
//             id.checkId();
//         } catch (IDisNotAvailableException e) {
//             System.out.println(e.getMessage());
//         } catch (ProjectIDException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }



// class Address implements Cloneable{
//     String name;
//     int age;
//     String course;
//     Address(String name,int age,String course){
//         this.name=name;
//         this.age=age;
//         this.course=course;
//     }
//     public void display(){
//         System.out.println("name:"+name+" "+"age:"+age+" "+"course"+course);
//     }
//     public Object clone() throws CloneNotSupportedException{
//         return super.clone();
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) throws CloneNotSupportedException{
//         Address a=new Address("Prasanth", 23,"CSE");
//         a.display();
//         Address b=(Address) a.clone();
//         b.name="thanu";
//         b.course="NEXT wave";
//         b.display();
//     }
// }

// interface Mammals {
//     default void print() {
//         System.out.println("I am a mammal");
//     }

//     void display();
// }

// interface MarineAnimals {
//     default void print() {
//         System.out.println("I am a marine animal");
//     }

//     void display();
// }

// class BlueBeetle implements Mammals, MarineAnimals {
//     public void display() {
//         System.out.println("I belong to both");
//     }

//     @Override
//     public void print() {
//         Mammals.super.print();
//         MarineAnimals.super.print();
//     }
// }

// public class InnerClassDemo {
//     public static void main(String[] args) {
//         BlueBeetle b = new BlueBeetle();
//         b.display();
//         b.print();
//     }
// }

// class Customer {
//     String name;
//     String cid;
  
//     public Customer(String name, String cid) {
//       this.name = name;
//       this.cid = cid;
//     }

//     public class CommunicationAddress {
//       String street;
//       int zip;
  
//       public void insert(String street, int zip) {
//         this.street = street;
//         this.zip = zip;
//       }
//     }
//     public static class PermanentAddress {
//       String street;
//       int zip;
  
//       public void insert(String street, int zip) {
//         this.street = street;
//         this.zip = zip;
//       }
//     }
//   }
  
//   public class InnerClassDemo {
//     public static void main(String[] args) {
//       Customer c1 = new Customer("Prasanth", "hljnfwio");
//       Customer.CommunicationAddress commAddress =c1. new  CommunicationAddress();
//       commAddress.insert("456 Elm St", 12345);
//       Customer.PermanentAddress permAddress = new Customer.PermanentAddress();
//       permAddress.insert("123 Main St", 54321);
//     }
//   }


// interface BankingTransaction {
//     default void processTransaction(double amount) {
//         System.out.println("Processing transaction of amount: " + amount);
//     }
    
//     static void logTransaction(String message) {
//         System.out.println("Logging transaction: " + message);
//     }
    
//     double calculateFee(double amount);
// }

// class BankingSystem implements BankingTransaction {
//     public double calculateFee(double amount) {
//         return amount * 0.01;
//     }
    
//     public void makeTransaction(double amount) {
//         processTransaction(amount);
//         double fee = calculateFee(amount);
//         double finalAmount = amount - fee;
//         BankingTransaction.logTransaction("Transaction successful! Amount deducted: " + finalAmount);
//     }
// }

// public class InnerClassDemo {
//     public static void main(String[] args) {
//         BankingSystem bank = new BankingSystem();
//         bank.makeTransaction(1000.0);
//     }
// }

// class NullpointerException extends Exception{
//     NullpointerException(String s){
//         super(s);
//     }
// }

// class me{
//     String a="";
//     public void check() throws NullpointerException{
//         if(a.equals("")){
//             throw new NullpointerException("null pointer String");
//         }
//     }
// }


// public class InnerClassDemo {

//     public static void main(String[] args) {
//         me m1=new me();
//         try{
//             m1.check();
//         }
//         catch(NullpointerException e){
//             System.out.println(e);
//             System.out.println(e.getMessage());
//         }
//     }
// }

// interface Person {
//     String getName();
//     int getAge();
  
//     void details();
//     void hobbies();
//   }
// interface Employee{
//     int getEid();
//     String getDesignation();
  
//     void show();
//   }
//   class Manager implements Person, Employee {
//     private String name;
//     private int age;
//     private int eid;
//     private String designation;
//     public Manager(String name, int age, int eid, String designation) {
//       this.name = name;
//       this.age = age;
//       this.eid = eid;
//       this.designation = designation;
//     }
//     @Override
//     public String getName() {
//       return name;
//     }
//     @Override
//     public int getAge() {
//       return age;
//     }
//     @Override
//     public void details() {
//       System.out.println("Name: " + name + ", Age: " + age);
//     }
//     @Override
//     public void hobbies() {
//       System.out.println("Manager hobbies (implementation)");
//     }
//     @Override
//     public int getEid() {
//       return eid;
//     }
//     @Override
//     public String getDesignation() {
//       return designation;
//     }
//     @Override
//     public void show() {
//       System.out.println("Employee ID: " + eid + ", Designation: " + designation);
//     }
//   }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         Manager m1=new Manager("Prasanth", 12, 3234, "CEO");
//         m1.show();
//         m1.details();
//         m1.hobbies();
//     }
// }

// class NoVowelsException extends Exception {
//     public NoVowelsException(String message) {
//         super(message);
//     }
// }

// public class InnerClassDemo{

//     public static void main(String[] args) {
//         try {
//             String str = "Prasanth";
//             checkForVowels(str);
//             System.out.println("String contains vowels.");
//         } catch (NoVowelsException e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     public static void checkForVowels(String str) throws NoVowelsException {
//         int count=0;
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                     count+=1;
//                 break;
//             }
//         }
//         if (count==0) {
//             throw new NoVowelsException("The string does not contain any vowels.");
//         }
//     }
// }

// hash map
// hash set
// arraylist


// class may23 {
//    public static void main(String[] args) {
//        ArrayList< String> l1=new ArrayList<>();
//        l1.add("Thanu");
//        l1.add("bhav");
//        l1.add("hello");
//        System.out.println(l1);
//        System.out.println("Details");
//     //    for(String s:l1){
//     //        System.out.println(s);
//     //    }
//     for(int i=0;i<l1.size();i++){
//         System.out.println(l1.get(i));
//     }
//     //    l1.remove("hello");
//     l1.removeAll(l1);
//        System.out.println(l1);
//    }
// }


// public class InnerClassDemo {
//     public static void main(String[] args) {
//         HashSet <String> set=new HashSet<>();
//         set.add("Prasnth");
//         set.add("thanu");
//         set.add("subbu");
//         set.add("subbu");
//         System.out.println(set);
//         for(String s:set){
//             System.out.println(s);
//         }
//         HashMap <Integer,String> map=new HashMap<>();
//         map.put(1, "thanu");
//         map.put(2, "ppk");
//         map.put(3, "subbu");
//         System.out.println(map);
//         for(Map.Entry m:map.entrySet()){
//             System.out.println(m.getKey()+" "+m.getValue());
//         }
//     }import java.util.*;

// import java.util.HashMap;
// class Main {
// public static void main(String[] args) {
// HashMap<String, Integer> hmap = new HashMap<String, Integer>();
// hmap.put("David", 32);
// int value = hmap.
// ;
// System.out.println(value);
// }
// } 
// }


// class A extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("HI");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }

//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("HELLO");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         A a=new A();
//         B b=new B();

//         a.start();
//         b.start();
//     }
// }

// Synchronized
// class A extends Thread{
//     synchronized void printso(){
//         System.out.println("HI");
//         // try{                 
//         //     Thread.sleep(10);
//         // }
//         // catch(Exception e){
//         //      System.out.println(e);
//         // }
//     }
// }
// class B extends Thread{
//     synchronized void printso(){
//         System.out.println("HELLO");
//         // try{                 
//         //     Thread.sleep(10);
//         // }
//         // catch(Exception e){
//         //      System.out.println(e);
//         // }
//     }
// }
// public class InnerClassDemo {
//     public static void main(String[] args) {
//         A a=new A();
//         B b=new B();
//         for(int i=0;i<5;i++){
//             a.printso();
//             b.printso();
//         }
//     }
// }