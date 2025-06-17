// import java.util.*;
// class thanu {
//     public static void main(String[] args) {
//         int[] a={1,2,5,8,6,7};
//         Arrays.sort(a);
//         System.out.println(Arrays.toString(a));
//     }
// }
// import java.util.*;
// class thanu{
//     public static void main(String[] args) {
//         String s1="Hello Guys How Are You";
//         String words[]=s1.split(" ");
//         String newwords[]=new String[words.length];
        
//         System.out.println(Arrays.toString(words));
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
//         String nnnn=String.join(" ",newwords);
//         System.out.println(Arrays.toString(newwords));
//         System.out.println(nnnn);
//     }
// }

// class Employee{
//     String name;
//     int year;
//     double salary;
//     String address;
//     Employee(String name,int year,double salary,String address){
//         this.year=year;
//         this.name=name;
//         this.salary=salary;
//         this.address=address;
//     }
//     public void display(){
//         System.out.println(name+"  "+year+"  "+salary+"  "+address);
//     }
// }

// public class thanu {
//     public static void main(String[] args) {
//         System.out.println("name"+"   "+"year"+"   "+"salry"+"    "+"address"+"   ");
//         Employee e1=new Employee("prasanth", 2024, 10000, "nellore");
//         Employee e2=new Employee("subbu", 2021, 1000, "lfiifi");
//         e1.display();
//         e2.display();
//     }
// }

// import java.util.Scanner;
// class student{
//     private static int rollno=1000;
//     private String name;
//     private String course;
//     private int year;
//     student(String name,String course,int year){
//         this.name=name;
//         this.course=course;
//         this.year=year;
//     }
//     public void display(){
//         System.out.println(rollno);
//         System.out.println(name);
//         System.out.println(year);
//         System.out.println(course);
//         System.out.println();
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         student []s1=new student[2];
//         for(int i=0;i<2;i++){
//             String  na=sc.next();
//             int  ye=sc.nextInt();
//             String  ad=sc.next();
//             s1[i]=new student(na,ad,ye);
//         }
//         for(student s2:s1){
//             s2.display();
//         } 
//     }
// }

// class UserdefinedException extends Exception{
//     public UserdefinedException(String s){
//         super(s);
//     }
// }
// public class thanu {
//     public static void main(String[] args) throws UserdefinedException{
//         try{
//             int age=-1;
//             if(age<0){
//                 throw new UserdefinedException("age can not be negative");
//             }
//         }
//         catch(UserdefinedException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// public class thanu {
//     public static void main(String[] args) {
//         try{
//             int a[]={1,2,3,4,5};
//             String s=null;
            
//             System.out.println(s.length());
//             System.out.println(a[5]);
//         }
//         catch(NullPointerException ex){
//             System.out.println(ex.getMessage());
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e.getMessage());
//         }
//         catch(Exception ep){
//             System.out.println(ep.getMessage());
//         }
//     }
// }

// abstract class Vehicle{
//     String make;
//     String model;
//     abstract public void display();
// }
// class car extends Vehicle{
//     car(String make,String model){
//         this.make=make;
//         this.model=model;
//     }
//     public void display(){
//         System.out.println(make+" "+model);
//     }

// }
// class motorcycle extends Vehicle{
//     motorcycle(String make,String model){
//         this.make=make;
//         this.model=model;
//     }
//     public void display(){
//         System.out.println(make+" "+model);
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         car c1=new car("Toyota", "Camry");
//         motorcycle m1=new motorcycle("Honda", "CBR500R");
//         c1.display();
//         m1.display();
//     }
// }

// interface Person{
//     String name="";
//     int age=0;
//     public void details();
//     public void hobbies();
// }
// interface Employee{
//     String eid = "";
//     String designation = "";
//     public void show();
// }

// class Manager implements Person,Employee{
//     String name;
//     int age;
//     String eid;
//     String designation;

//     public Manager(String name, int age, String eid, String designation) {
//         this.name = name;
//         this.age = age;
//         this.eid = eid;
//         this.designation = designation;
//     }

//     @Override
//     public void details() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     @Override
//     public void hobbies() {
//         System.out.println(name + "'s Hobbies: Reading, Traveling");
//     }

//     @Override
//     public void show() {
//         System.out.println("Employee ID: " + eid);
//         System.out.println("Designation: " + designation);
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         Manager m1=new Manager("John", 35, "EMP001", "Senior Manager");
//         System.out.println("Manager Details:");
//         m1.details();
//         m1.hobbies();
//         System.out.println("Employees details");
//         m1.show();
//     }
// }

// abstract class Element{
//     String symbol;
//     int atomicNumber;
//     double atomicWeight;

//     public Element(String symbol, int atomicNumber, double atomicWeight) {
//         this.symbol = symbol;
//         this.atomicNumber = atomicNumber;
//         this.atomicWeight = atomicWeight;
//     }

//     public String getSymbol() {
//         return symbol;
//     }

//     public int getAtomicNumber() {
//         return atomicNumber;
//     }

//     public double getAtomicWeight() {
//         return atomicWeight;
//     }

//     public abstract void describeElement();
// }
// class MetalElement extends Element{
//     public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
//         super(symbol, atomicNumber, atomicWeight);
//     }

//     @Override
//     public void describeElement() {
//         System.out.println("Metal Element:");
//         System.out.println("Symbol: " + getSymbol());
//         System.out.println("Atomic Number: " + getAtomicNumber());
//         System.out.println("Atomic Weight: " + getAtomicWeight());
//         System.out.println("Metals are good conductors of electricity.");
//     }
// }
// class NonMetalElement extends Element{
//     public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
//         super(symbol, atomicNumber, atomicWeight);
//     }

//     @Override
//     public void describeElement() {
//         System.out.println("Non-Metal Element:");
//         System.out.println("Symbol: " + getSymbol());
//         System.out.println("Atomic Number: " + getAtomicNumber());
//         System.out.println("Atomic Weight: " + getAtomicWeight());
//         System.out.println("Non-metals are poor conductors of electricity.");
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         Element[] elements = new Element[4];
//         elements[0] = new MetalElement("Fe", 26, 55.845);
//         elements[1] = new MetalElement("Cu", 29, 63.546);
//         elements[2] = new NonMetalElement("O", 8, 15.999);
//         elements[3] = new NonMetalElement("N", 7, 14.007);
//         for (Element element : elements) {
//             element.describeElement();
//             System.out.println();
//         }
        
//     }
// }

// abstract class Division{
//     String name;
//     String accountnumber;
//     abstract public void display();
//     public Division(String name, String accountnumber) {
//         this.name = name;
//         this.accountnumber=accountnumber;
//     }
// }
// class InternationalDivision extends Division{
//     String country;
//     String languageSpoken;

//     public InternationalDivision(String name,String accountnumber, String country, String languageSpoken) {
//         super(name,accountnumber);
//         this.country = country;
//         this.languageSpoken = languageSpoken;
//     }

//     @Override
//     public void display() {
//         System.out.println("International Division:");
//         System.out.println("Division Name: " +name);
//         System.out.println("Account Number: " +accountnumber);
//         System.out.println("Country: " + country);
//         System.out.println("Language Spoken: " + languageSpoken);
//     }
// }
// class DomesticDivision extends Division{
//     String state;

//     public DomesticDivision(String name, String accountnumber, String state) {
//         super(name, accountnumber);
//         this.state = state;
//     }

//     @Override
//     public void display() {
//         System.out.println("Domestic Division:");
//         System.out.println("Division Name: " + name);
//         System.out.println("Account Number: " + accountnumber);
//         System.out.println("State: " + state);
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         InternationalDivision internationalDivision = new InternationalDivision("IntlDiv1", "INTL001", "Japan", "Japanese");
//         DomesticDivision domesticDivision = new DomesticDivision("DomDiv1", "DOM001", "California");
//         internationalDivision.display();
//         System.out.println();
//         domesticDivision.display();
//     }
// }

// import java.util.Scanner;
// abstract class Marks{
//     abstract public double percentage();
// }
// class A{
//     public double percentage(){
//         Scanner sc=new Scanner (System.in);
//         double sum=0;
//         for(int i=0;i<=2;i++){
//             double a=sc.nextDouble();
//             sum+=a;
//         }
//         return sum/3.0;
//     }
// }
// class B{
//     public double percentage(){
//         Scanner sc=new Scanner (System.in);
//         double sum=0;
//         for(int i=0;i<=2;i++){
//             double a=sc.nextDouble();
//             sum+=a;
//         }
//         return sum/3.0;
//     }
// }
// public class thanu {
//     public static void main(String[] args) {
//         A a1=new A();
//         B a2=new B();
//         System.out.println(a1.percentage());
//         System.out.println(a2.percentage());

//     }
// }

// interface Shape{
//     public void periTriangle();
//     public void perirectangle();
// }

// class Perimeter implements Shape{
//     double side1;
//     double side2;
//     double side3;
//     Perimeter(double side1,double side2,double side3){
//         this.side1=side1;
//         this.side2=side2;
//         this.side3=side3;
//     }
//     public void periTriangle(){
//         double perimeter=side1+side2+side3;
//         System.out.println("the perimeter of triangle:"+perimeter);
//     }
//     public void perirectangle(){
//         double perimeter=2*(side1+side2);
//         System.out.println("the perimeter of rectangle:"+perimeter);
//     }
// }
// public class thanu{
//     public static void main(String[] args) {
//         Perimeter p1=new Perimeter(3, 4, 5);
//         p1.periTriangle();
//         p1.perirectangle();
        
//     }
// }

// import java.lang.Math;
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class thanu {
//     double radius;
//     public void calcArea(){
//         Scanner sc=new Scanner(System.in);
//         boolean a=false;
//         int i=0;
//         while(!a && i<2){
//             try{
//                 radius=sc.nextDouble();
//                 a=true;
//                 double area=Math.PI*Math.pow(radius,2);
//                 System.out.println(area);

//             }
//             catch(InputMismatchException e){
//                 System.out.println("please enter a numeric type");
//                 sc.nextLine();
//                 i++;
//                 if(i==2){
//                     System.out.println(e);
//                 }
//             }
//          }
        
//     }
//     public static void main(String[] args) {
//         thanu t1=new thanu();
//         t1.calcArea();
        
//     }
// }

// import java.lang.Math;
// class NegativeNumberException extends Exception {
//     public NegativeNumberException(String message) {
//         super(message);
//     }
// }

// public class thanu{
//     public double  longpower(int n, int p) throws NegativeNumberException{
//         if (n < 0 || p < 0) {
//             throw new NegativeNumberException("Both n and p must be non-negative integers");
//         } else {
//             return Math.pow(n, p);
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             thanu t1=new thanu();
//             System.out.println(t1.longpower(2, -3));
//         } catch (NegativeNumberException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// class PrimeNumberException extends Exception {
//     public PrimeNumberException(String message) {
//         super(message);
//     }
// }

// public class thanu{
//     public static void main(String[] args) {
//         try {
//             int N = 1;
//             checkPrime(N);
//             System.out.println(N + " is a Prime Number");
//         } catch (PrimeNumberException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }

//     public static void checkPrime(int N) throws PrimeNumberException {
//         if (N <= 1) {
//             throw new PrimeNumberException("not a prime number");
//         }

//         for (int i = 2; i <= Math.sqrt(N); i++) {
//             if (N % i == 0) {
//                 throw new PrimeNumberException(N + " is not a prime Number");
//             }
//         }
//     }
// }

/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(Math.abs(arr[0]));
    }
}