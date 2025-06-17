import java.util.*;
import java.lang.*;

// interface person{
//     int a=100;
//     void applybrake();
//     void speedup();
// }
// interface person2{
//     void stop();
//     void start();
// }
// class person1 implements person,person2{
//     public void run(){
//         System.out.println("pee peee peeeee");
//     }
//     public void applybrake(){
//         System.out.println("donot go very fast");
//     }
//     public void speedup(){
//         System.out.println("sppeed uo guys");
//     // }
//     public void stop(){
//         System.out.println("Stop when u reach and in risk time");
//     }
//     public void start(){
//         System.out.println("Start");
//     }
// }
// public class inter {
//     public static void main(String[] args) {
//         person1 p1=new person1();
//         p1.run();
//         p1.applybrake();
//         p1.speedup();
//     }
// }



// interface Shape{
//     void getArea();
// }
// class rectangle implements Shape{
//     double length;
//     double width;
//     public void insert(double length,double width){
//         this.length=length;
//         this.width=width;
//     }
//     public void getArea(){
//         double Area=length*width;
//         System.out.println(Area);
//     }
// }
// class Circle extends rectangle implements Shape{
//     double radius;
//     public void insert(double radius){
//         this.radius=radius;
//     }
//     public void getArea(){
//         double Area=Math.PI*radius*radius;
//         System.out.println(Area);
//     }
// }
// class triangle implements Shape{
//     double heigth;
//     double base;
//     public void insert(double base,double heigth){
//         this.base=base;
//         this.heigth=heigth;
//     }
//     public void getArea(){
//         double Area=0.5*heigth*base;
//         System.out.println(Area);
//     }
// }
// public class inter{
//     public static void main(String[] args) {
//         rectangle r1=new rectangle();
//         r1.insert(3, 4);
//         r1.getArea();
//         Circle c1=new Circle();
//         c1.insert(5);
//         c1.getArea();
//         triangle t1=new triangle();
//         t1.insert(5, 4);
//         t1.getArea();
//     }
// }

// interface Account {
//     public void deposit(double amount);
//     public void withdraw(double amount);
//     public double getBalance();
// }

// class SavingsAccount implements Account {
//     private double balance;
//     public double interestRate;

//     public SavingsAccount(double initialDeposit, double interestRate) {
//         this.balance = initialDeposit;
//         this.interestRate = interestRate;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//     }

//     public void withdraw(double amount) {
//         if (balance < amount) {
//             System.out.println("Minimum balance error");
//         } else {
//             balance -= amount;
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public double applyInterest() {
//         return balance += balance * (interestRate / 100);
//     }
// }
// class CurrentAccount implements Account {
//     private double balance;
//     private double overdraftLimit;
//     public CurrentAccount(double initialDeposit, double overdraftLimit) {
//         this.balance = initialDeposit;
//         this.overdraftLimit = overdraftLimit;
//     }
//     public void deposit(double amount) {
//         balance += amount;
//     }
//     public void withdraw(double amount) {
//         if (balance + overdraftLimit >= amount) {
//             balance -= amount;
//         }
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public void setOverdraftLimit(double overdraftLimit) {
//         this.overdraftLimit = overdraftLimit;
//     }
// }
// public class inter {
//     public static void main(String[] args) {
//     }
// }

// interface camera{
//     void takeSnap();
//     void recordvideo();
//     void record4Kvideo();
// }
// interface wifi{
//     String[] getnewtork();
//     void connnectNetwork(String network);
// }
// class Smartphone{
//     public void callnumber(int number){
//         System.out.println("Calling :"+number);
//     }
//     public void pickcall(int number){
//         System.out.println("picking the calling"+number);
//     }
// }
// class myphone extends Smartphone implements wifi,camera{
//     public void greet(){
//         System.out.println("Good morning");
//     }
//     public void takeSnap(){
//         System.out.println("taking Snap");
//     }
//     public void recordvideo(){
//         System.out.println("recording video in Smart phone");
//     }
//     public String[] getnewtork(){ 
//         System.out.println("Getting list of network");
//         String[] networklist={"Harrypotter","bigbossPrasanth","pathanjali5G"};
//         return networklist;
//     }
//     public void connnectNetwork(String network){
//         System.out.println("connecting to:"+network);
//     }
//     public void record4Kvideo(){
//         greet();
//         System.out.println("4K videorecording is started");
//     }
// }
// public class inter{
//     public static void main(String[] args) {
//         myphone sm=new myphone();
//         String arr[]=sm.getnewtork();
//         for(String item:arr){
//             System.out.println(item);
//         }
//         sm.record4Kvideo();
//         sm.recordvideo();
//         camera c=new myphone();
//         c.takeSnap();
//     }
// }

// import java.util.*;
// class thanu{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s1="Hello Guys How Are You";
//         String words[]=s1.split(" ");
//         String newwords[]=new String[words.length];
        
//         System.out.println(Arrays.toString(words));
//         int caseoption=sc.nextInt();
//         if(caseoption==1){
//         for(int i=0;i<words.length;i++){
//             String cw=words[i];
//             String newword="";
//             int ll=cw.length();
//             for(int j=ll-1;j>=0;j--){
//                 if(j==ll-1){
//                     newword+=Character.toUpperCase(cw.charAt(j));
//                 }
//                 if(j<ll-1 && j>0){
//                     newword+=cw.charAt(j);
//                 }
//                 if(j==0){
//                     newword+=Character.toLowerCase(cw.charAt(j));
//                 }
                
//             }
//             newwords[i]=newword;
//         }
//     }
//     else{
//         for(int i=0;i<words.length;i++){
//             String cw=words[i];
//             String newword="";
//             int ll=cw.length();
//             for(int j=ll-1;j>=0;j--){
//                 newword+=cw.charAt(j);
                
//             }
//             newwords[i]=newword;
//         }

//     }
//         String nnnn=String.join(" ",newwords);
//         System.out.println(Arrays.toString(newwords));
//         System.out.println(nnnn);
//     }
// }

// abstract class pen{
//     abstract void write();
//     abstract void refill();
// }
// class fountainpen extends pen{
//     void write(){
//         System.out.println("the bule pen is always blue");
//     }
//     void refill(){
//         System.out.println("refill it Broo");
//     }
//     void changenib(){
//         System.out.println("u have to chage the nib");
//     }
// }

// class game extends pen{
//     void write(){
//         System.out.println("the bule pen is always blue");
//     }
//     void refill(){
//         System.out.println("refill it Broo");
//     }

// }
// public class inter {
//     public static void main(String[] args) {
//         game g1=new game();
//         fountainpen p1=new fountainpen();
//         p1.changenib();
//         g1.write();
//         g1.refill();
        
//     }
// }

// interface BasicAnimal{
//     void eat();
//     void sleep();
// }
// class Monkey{
//     void jump(){
//         System.out.println("jump monkey jump!");
//     }
//     void bite(){
//         System.out.println("attack monkey attack!");
//     }
// }
// class human extends Monkey implements BasicAnimal{
//     public void eat(){
//         System.out.println("i eat bananna");
//     }
//     public void sleep(){
//         System.out.println("you sleep");
//     }

// }
// public class inter {
//     public static void main(String[] args) {
//         BasicAnimal a1=new human();
//         a1.eat();
//         a1.sleep();
//         Monkey m1=new Monkey();
//         m1.bite();
//         m1.jump();

//     }
// }

// interface tvremote{
//     void digits();
//     void epg();
// }
// interface smarttvremote extends tvremote{
//     void touchpanel();
//     void bluetooth();
// }
// class game implements smarttvremote{
//     public void digits(){
//         System.out.println("1233456789");
//     }
//     public void epg(){
//         System.out.println("to see other channel");
//     }
//     public void touchpanel(){
//         System.out.println("touch panel is avaiable");
//     }
//     public void bluetooth(){
//         System.out.println("earphone ");
//     }
// }
// public class inter {
//     public static void main(String[] args) {

        
//     }
// }

// class mythread extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("i am running");
//             System.out.println("i am happy");
//         }

//     }
// }
// class mythread2 extends Thread{
//     public void run(){
//         while(true){
//             System.out.println("thread 2 is good");
//             System.out.println("i am sad!");
//         }

//     }
// }
// public class inter {
//     public static void main(String[] args) {
//         mythread t1=new mythread();
//         mythread2 t2=new mythread2();
//         t1.start();
//         t2.start();
        
//     }
// }















