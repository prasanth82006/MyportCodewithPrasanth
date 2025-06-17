import java.util.*;
// class Movie extends Thread {
//     int seat;
//     String name;
//     static int sumofseats = 10;

//     Movie(int seat, String name) {
//         this.seat = seat;
//         this.name = name;
//     }

//     public void run() {
//         synchronized (Movie.class) {
//             if (sumofseats >= seat) {
//                 System.out.println("Available seats: " + sumofseats);
//                 System.out.println(seat + " Seat reserved for " + name);
//                 sumofseats -= seat;
//                 System.out.println("Available Seats: " + sumofseats);
//                 try {
//                     sleep(100);
//                 } catch (Exception e) {
//                     System.out.println(e);
//                 }
//             } else {
//                 System.out.println("Sorry! No seats are available for " + name);
//             }
//         }
//     }
// }

// public class thread{
//     public static void main(String[] args) {
//         Movie m1 = new Movie(10, "ppk");
//         Movie m2 = new Movie(1, "thanu");
//         m1.start();
//         m2.start();
//     }
// }

// class SumCalculator {
//     private int sum = 0;
//     private boolean isCalculated = false;

//     public synchronized void calculateSum() {
//         for (int i = 1; i <= 100; i++) {
//             sum += i;
//         }
//         isCalculated = true;
//         notify();
//     }

//     public synchronized int getSum() {
//         while (!isCalculated) {
//             try {
//                 wait();
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted: " + e.getMessage());
//             }
//         }
//         return sum;
//     }
// }

// class SumThread extends Thread {
//     private SumCalculator calculator;

//     SumThread(SumCalculator calculator) {
//         this.calculator = calculator;
//     }

//     @Override
//     public void run() {
//         calculator.calculateSum();
//     }
// }

// public class thread{
//     public static void main(String[] args) {
//         SumCalculator calculator = new SumCalculator();
//         SumThread sumThread = new SumThread(calculator);
//         sumThread.start();

//         int result = calculator.getSum();
//         System.out.println("Sum of numbers from 1 to 100 is: " + result);
//     }
// }


// class t1 extends Thread{
//     public synchronized void run(){
//         for(int i=1;i<10;i+=2){
//             System.out.println("Thread A:"+i);
//         }
//         try{
//             sleep(200);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class t2 extends Thread{
//     public synchronized void run(){
//         for(int i=2;i<10;i+=2){
//             System.out.println("Thread B:"+i);
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         t1 a=new t1();
//         t2 b =new t2();
//         a.start();
//         try{
//             a.sleep(200);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         b.start();
//     }
// }

// class myThreds extends Thread{
//     String threadname;
//     public myThreds(String threadname){
//         this.threadname=threadname;
//     }
//     public synchronized void run(){
//         for(int i=0;i<5;i++){
//             System.out.println(threadname+" "+i);
//             try{
//                 Thread.sleep(100);
//             }
//             catch(InterruptedException e){
//                 System.out.println("Interrupted "+threadname);
//             }
//         }
//         System.out.println("Exciting....");
//     }
// }
// public class thread{
//     public static void main(String[] args) {
//         myThreds obj=new myThreds("thread_1");
//         myThreds obj2=new myThreds("thread_2");
//         obj.start();
//         obj2.start();
//     }
// }

// class chat extends Thread{
//     String s;
//     chat(String s){
//         this.s=s;
//     }
//     public synchronized void run(){
//         System.out.println(s);
//         try{
//             Thread.sleep(1000);
//             System.out.println("chat is paused");
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("chat is ended");
//     }
// }
// class videocall extends Thread{
//     String s;
//     videocall(String s){
//         this.s=s;
//     }
//     public synchronized void run(){
//         System.out.println(s);
//         try{
//             Thread.sleep(1000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class payment extends Thread{
//     String s;
//     payment(String s){
//         this.s=s;
//     }
//     public synchronized void run(){
//         System.out.println(s);
//         try{
//             Thread.sleep(1000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }
// class voicecall extends Thread{
//     String s;
//     voicecall(String s){
//         this.s=s;
//     }
//     public synchronized void run(){
//         System.out.println(s);
//         try{
//             Thread.sleep(1000);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         chat c1=new chat("My Chatting is Done");
//         videocall v1=new videocall("My VideoCall is Done");
//         payment p1=new payment("My Payments is Done");
//         voicecall v2=new voicecall("My VoiceCall is Done");
//         c1.start();
//         v1.start();
//         try {
//             Thread.sleep(3000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         p1.start();
//         v2.start();
//     }
// }



// class TypeException extends Exception{
//     TypeException(String s){
//         super(s);
//     }
// }

// class practice1{
//     public static void main(String[] args) throws TypeException{
//         Scanner sc = new Scanner(System.in);
//         ArrayList <Integer> A1= new ArrayList<>();
//         LinkedList<Integer> L1= new LinkedList<>();
//         HashSet<Integer> H1 = new HashSet<>();
//         System.out.println("continue ?? ! ,enter yes or no : ");

//         String a=sc.nextLine();
//         while((a.toLowerCase()).equals("yes")){
//             System.out.println("1.for insert ");
//             System.out.println("2.for display");
//             System.out.println("3.for delete");
//             System.out.println("4.for modify");

//             System.out.println("enter your options : ");

//             int b=sc.nextInt();
//             switch (b) {
//                 case 1:
//                 for(int i=0;i<10;i++){
//                     System.out.println("enter "+(i+1)+" element :");
//                     try{
//                         int c=sc.nextInt();
//                         A1.add(c);
//                         L1.add(c);
//                         H1.add(c);
//                     }catch(Exception e){
//                         System.out.println("An error occur ! :enter String value to proceed");
//                     }

//                 }
//                 break;
//                 case 2:
//                 System.out.println(A1);
//                 System.out.println(L1);
//                 System.out.println(H1);
//                 break;
//                 case 3:
//                 System.out.println("enter element to delete : ");
//                 try{int d=sc.nextInt();
//                     for(int i=0;i<A1.size();i++){
//                         if(A1.get(i)==d){
//                             A1.remove(i);
//                             L1.remove(i);
//                         }
//                     }
                
//                 H1.remove(d);}
//                 catch(Exception f){
//                     System.out.println("An error occur ! :enter String value to proceed");
//                 }
                
//                 break;
//                 case 4:
//                 System.out.println("enter to modify elment : ");
//                 try{
//                     int e = sc.nextInt();
//                     System.out.println("enter new elment");
//                     int g = sc.nextInt();
//                     for(int j=0;j<A1.size();j++){
//                         if(A1.get(j)==e){
//                             A1.set(j,g);
//                             L1.set(j, g);
//                         }
//                         if(H1.contains(e)){
//                             H1.remove(e);
//                             H1.add(g);
//                         }
//                     }
//                     if(H1.contains(e)){
//                         H1.remove(e);
//                         H1.add(g);
//                     }
//                 }
//                 catch(Exception x){
//                     System.out.println("An error occur ! :enter String value to proceed");
//                 }
//                 break;
            
//                 default:
//                 System.out.println("enter the value shown above : ");
//                     break;
//             }
//             System.out.println("continue ?? ! Enter yes or no : ");
//             a=sc.next();
//         } 
//         System.out.println("exited successfully !");
//     }
// }


// class animal{
//     String color;
//     String sound;

// }
// class Dog extends animal{
//     public void display(){
//         color="brown";
//         sound="ewwwwh";
//         System.out.println("the sound are"+" "+sound+" "+color);
//     }
// }
// class Cat extends animal{
//     public void display1(){
//         String color="white";
//         String sound="meee";
//         System.out.println("the sound are"+" "+sound+" "+color);
//     }
// }
// class Horse extends animal{
//     public void display2(){
//         color="black";
//         sound="boooo";
//         System.out.println("the sound are"+" "+sound+" "+color);
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         Dog d1=new Dog();
//         Cat c1=new Cat();
//         Horse h1=new Horse();
//         d1.display();
//         c1.display1();
//         h1.display2();

//     }
// }

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
//     public static void showDetails(Map<Integer,Book> book){
//         for(Map.Entry<Integer,Book> m:book.entrySet()){
//             Book p=m.getValue();
//             System.out.println("ID: " + p.id + ", Book Name: " + p.bookname+ ", Author: " + p.author + ", Publisher: " + p.publisher);
//         }
//     }
// }
// public class thread {
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
//             bookto.author="updateauthor";
//             book.put(2,bookto);
//         }
//         b1.showDetails(book);
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         if(a.equals("hema")){
//             System.out.println("he is "+a);
//         }
//         switch (a) {
//             case "pras":
//                 System.out.println("the Prasanth is allowed");
//                 break;
//             case "subbu":
//                 System.out.println("the subbu is allowed");
//                 break;
//             case "santhu":
//                 System.out.println("the santhu is allowed");
//                 break;
//             default:
//                 System.out.println("re enter the text");
//                 break;
//         }
//     }
// }

// class Box<T>{
//     T content;
//     public void additem(T content){
//         this.content=content;
//     }
//     public void printe(){
//         System.out.println(" the content is:"+content);
//     }
// }
// public class thread {
//     public static void main(String[] args) {
//         Box<Integer> b1=new Box<>();
//         b1.additem(1); 
//         b1.printe();  
//         b1.additem(2);  
//         b1.printe(); 
//         b1.additem(3);
//         b1.printe();
//         Box<String> b2=new Box<>();
//         b2.additem("prasanth");
//         b2.printe();
//         b2.additem("hema");
//         b2.printe();
//         b2.additem("thanu");
//         b2.printe();
//     }
// }

// interface Result<Regno, Mark> {
//   public abstract Mark result(Regno regno, Mark mark);
// }

// class MCQ implements Result<String, String> {
//   @Override
//   public String result(String regno, String mark) {
//     ArrayList<String> keys = new ArrayList<>();
//     for (int i = 0; i < 10; i++) {
//       keys.add("b");
//     }

//     int score = 0;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your roll number: ");
//     regno = sc.nextLine();

//     for (int i = 1; i <= 10; i++) {
//       System.out.println("Enter your answer for question " + i + ": ");
//       String ans = sc.nextLine();
//       if (ans.equals(keys.get(i - 1))) {
//         score++;
//       }
//     }

//     System.out.println("Your score: " + score);
//     double percentage = (score * 100.0) / 10;
//     System.out.println("Percentage: " + percentage + "%");
//     return regno + " " + score;
//   }
// }

// public class thread{
//   public static void main(String[] args) {
//     MCQ mcq = new MCQ();
//     mcq.result("", "");
//   }
// }

// class array<t>{
//     t arr[];
//     t ar[];
//     int count=0;
//     int c=5;
//     public void check(){
//         int arr[]={1,2,3,4,5};
//         int ar[]={1,2,3,4,5};
//         for(int i=0;i<c;i++){
//             if(ar[i]==arr[i]){
//                 count+=1;
//             }
//         }
//         if(count==c){
//             System.out.println("the same");
//         }
//         else{
//             System.out.println("NOT");
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args){
//         array<Integer> a1=new array();
//         a1.check();
//     }
// }

// class m{
//     int a[];
//     public void ch(int a[]){
//         System.out.println(Arrays.toString(a));
//     }
// }
// public class thread {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         m m1=new m();
//         m1.ch(a);
//     }
// }

// class ge<T>{
//     T arr[];
//     ge(T arr[]){
//         this.arr=arr;
//     }
//     public void printe(){
//         int sum=0;
//         for(int i=0;i<=arr.length;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }
// public class thread {
//     public static void main(String[] args) {
//         Integer arr[]={1,2,3,4,5};
//         ge<Integer> g=new ge<>(arr);
//         g.printe();
//     }
// }