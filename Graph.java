// public class cat1{
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,6,8,9,11};
//         int sum=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]%2==0){
//                 sum+=a[i];
//             }
//         }
//         System.out.println(sum);
        
//     }
// }

// import java.util.*;
// class Movie {
//     private String name;
//     private String type; // 2D or 3D
//     private String director;
//     private double ticketPrice;

//     // Constructor
//     public Movie(String name, String type, String director) {
//         this.name = name;
//         this.type = type;
//         this.director = director;
//         // Set ticket price based on type
//         if (type.equals("2D")) {
//             this.ticketPrice = 120;
//         } else if (type.equals("3D")) {
//             this.ticketPrice = 150;
//         } else {
//             this.ticketPrice = 120;
//         }
//     }

//     // Getters
//     public String getName() {
//         return name;
//     }

//     public String getType() {
//         return type;
//     }

//     public String getDirector() {
//         return director;
//     }

//     public double getTicketPrice() {
//         return ticketPrice;
//     }
// }
// class Billing {
//     private double subtotal;
//     private double taxAmount;
//     public Billing() {
//         subtotal = 0;
//         taxAmount = 0;
//     }
//     public void addTicket(double ticketPrice) {
//         subtotal += ticketPrice;
//     }
//     public void calculateTax(String movieType) {
//         if (movieType.equalsIgnoreCase("2D")) {
//             taxAmount = subtotal * 0.20;
//         } else if (movieType.equalsIgnoreCase("3D")) {
//             taxAmount = subtotal * 0.25;
//         }
//     }
//     public double calculateTotal() {
//         return subtotal + taxAmount;
//     }
// }
// public class cat1{
//     public static void main(String[] args) {
//         // Create some movies
//         Movie movie1 = new Movie("Movie1", "2D", "Director1");
//         Movie movie2 = new Movie("Movie2", "3D", "Director2");
//         Billing billing = new Billing();
//         billing.addTicket(movie1.getTicketPrice());
//         billing.addTicket(movie2.getTicketPrice());
//         billing.calculateTax(movie1.getType());
//         billing.calculateTax(movie2.getType());
//         System.out.println("Subtotal: Rs." + billing.calculateTotal());
//     }
// }


// class cat1{
//     public static void main(String[] args) {
//         // char1912526 obj={'s','t','r','i','n','g'};
//         // char[] obj={'s','t','r','i','n','g'};
//         // String obj1=new String(obj);
//         // System.out.println(obj1);

//     }
// }

// import java.util.Scanner;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class employee{
//     int id;
//     String firstname;
//     String lastname;
//     int salary;
//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }
//     public String getFirstname() {
//         return firstname;
//     }
//     public void setFirstname(String firstname) {
//         this.firstname = firstname;
//     }
//     public String getLastname() {
//         return lastname;
//     }
//     public void setLastname(String lastname) {
//         this.lastname = lastname;
//     }
//     public int getSalary() {
//         return salary;
//     }
//     public void setSalary(int salary) {
//         this.salary = salary;
//     }
//     public void check(employee e1,employee e2){
//         if(e1.salary<e2.salary){
//             System.out.println("e2 is highest salary");
//         }
//         else if(e1.salary>e2.salary){
//             System.out.println("e1 is highest");
//         }
//         else{
//             System.out.println("both are equal");
//         }
//     }
//     public static boolean areDuplicates(employee emp1, employee emp2) {
//         return emp1.getFirstname().equals(emp2.getFirstname()) &&
//                emp1.getLastname().equals(emp2.getLastname());
//     }

// }
// public class cat1 {
//     public static void main(String[] args) {
//         employee e1=new employee();
//         employee e2=new employee();
//         e1.setId(1);
//         e2.setId(1);
//         e1.setFirstname("Prasanth");
//         e2.setFirstname("Prasanth");
//         e1.setLastname("kumar");
//         e2.setLastname("kumar");
//         e1.setSalary(20000);
//         e2.setSalary(100000);
//         e1.check(e1,e2);
//         System.out.println(e1.areDuplicates(e1,e2));
//     }
// }

// import java.util.Scanner;
// class ArithmeticAverage {
//     // Method to calculate average of an array of integers
//     public static double average(int[] arr) {
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//         }
//         return (double) sum / arr.length;
//     }

//     // Method to calculate average of an array of doubles
//     public static double average(double[] arr) {
//         double sum = 0.0;
//         for (double num : arr) {
//             sum += num;
//         }
//         return sum / arr.length;
//     }
// }

// public class cat1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         int[] intArray = new int[size];
//         System.out.println("Enter " + size + " integers:");
//         for (int i = 0; i < size; i++) {
//             intArray[i] = scanner.nextInt();
//         }
//         double intAverage = ArithmeticAverage.average(intArray);
//         System.out.println("Average of integers: " + intAverage);
//         double[] doubleArray = new double[size];
//         System.out.println("Enter " + size + " doubles:");
//         for (int i = 0; i < size; i++) {
//             doubleArray[i] = scanner.nextDouble();
//         }
//         double doubleAverage = ArithmeticAverage.average(doubleArray);
//         System.out.println("Average of doubles: " + doubleAverage);
//         scanner.close();
//     }
// }

// Base class
// class Company {
    // private String companyName;
    // private double baseValue;
    // private double returns;
    // public Company(String companyName, double baseValue, double returns) {
    //     this.companyName = companyName;
    //     this.baseValue = baseValue;
    //     this.returns = returns;
    // }
    // public void printCompany() {
    //     System.out.println("Company Name: " + companyName);
    //     System.out.println("Base Value: " + baseValue);
    //     System.out.println("Returns: " + returns);
    // }
// }
// class Branch extends Company {
//     public Branch(String companyName, double baseValue, double returns) {
//         super(companyName, baseValue, returns);
//     }
//     @Override
//     public void printCompany() {
//         System.out.println("Branch Details:");
//         super.printCompany();
//     }
// }
// public class cat1{
//     public static void main(String[] args) {
//         Branch b = new Branch("Branch A", 100000, 20000);
//         b.printCompany();
//     }
// }

// class pg{
//     private String companyName;
//     private double baseValue;
//     private double returns;
//     public pg(String companyName, double baseValue, double returns) {
//         this.companyName = companyName;
//         this.baseValue = baseValue;
//         this.returns = returns;
//     }
//     public void printCompany() {
//         System.out.println("Company Name: " + companyName);
//         System.out.println("Base Value: " + baseValue);
//         System.out.println("Returns: " + returns);
//     }
// }
// class ppk extends pg{
//     public ppk(String companyName, double baseValue, double returns){
//         super( companyName, baseValue,  returns);

//     }
//     public void printCompany() {
//         super.printCompany();
//     }
// }
// public class cat1 {
//     public static void main(String[] args) {
//         ppk b = new ppk("Branch A", 100000, 20000);
//         b.printCompany(); 
//     }
// }

// import java.util.*;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter m dimension");
//         int a=sc.nextInt();
//         System.out.println("enter n dimension");
//         int b=sc.nextInt();
//         int array1[][]=new int[a][b];
//         int array2[][]=new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 array1[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("arrys1");
//         System.out.println(Arrays.deepToString(array1));
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 array2[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("arrys2");
//         System.out.println(Arrays.deepToString(array2));
//         int sum[][]=new int[a][b];
//         int sub[][]=new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 sum[i][j]=array1[i][j]+array2[i][j];
//                 sub[i][j]=array1[i][j]-array2[i][j];
//             }
//         }
//         System.out.println(Arrays.deepToString(sum));
//         System.out.println(Arrays.deepToString(sub));
        
//     }
// }


// class Point {
//     private double x;
//     private double y;

//     public Point(double x, double y) {
//         this.x = x;
//         this.y = y;
//     }

//     public double getX() {
//         return x;
//     }

//     public double getY() {
//         return y;
//     }

//     public double distanceBetweenPoint(Point p) {
//         return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
//     }
// }
// class rectangle {
//     private Point p1;
//     private Point p2;
//     private Point p3;
//     private Point p4;

//     public rectangle(Point p1, Point p2, Point p3, Point p4) {
//         this.p1 = p1;
//         this.p2 = p2;
//         this.p3 = p3;
//         this.p4 = p4;
//     }

//     public double perimeter() {
//         return p1.distanceBetweenPoint(p2) + p2.distanceBetweenPoint(p3) +
//                p3.distanceBetweenPoint(p4) + p4.distanceBetweenPoint(p1);
//     }
// }
// public class cat1 {
//     public static void main(String[] args) {
//         Point p1=new Point(0,0);
//         Point p2=new Point(1,0);
//         Point p3=new Point(1,1);
//         Point p4=new Point(0,1);
//         rectangle r1=new rectangle(p1, p2, p3, p4);
//         System.out.println(r1.perimeter());
//     }
// }

// class object{
//     int number;
//     String name;
//     public int getNumber() {
//         return number;
//     }
//     public void setNumber(int number) {
//         this.number = number;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public boolean isequal(object a){
//         return this.name.equals(a.name) && this.number==a.number;
//     }
// }
// public class cat1 {
//     public static void main(String[] args) {
//         object o1=new object();
//         object o2=new object();
//         object o3=new object();
//         o1.setNumber(234);
//         o2.setNumber(24);
//         o1.setName("ppk");
//         o2.setName("subbu");
//         o1.name="thanu";
//         o1.number=123;
//         System.out.println(o1.getNumber());
//         System.out.println(o1.getName());
//         System.out.println(o1.isequal(o2));
//     }
// }


// import java.util.Scanner;
// public class cat1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first string: ");
//         String str1 = scanner.nextLine();

//         System.out.print("Enter the second string: ");
//         String str2 = scanner.nextLine();

//         System.out.println("The given strings are: " + str1 + " and " + str2);

//         String result = appendStrings(str1, str2);

//         System.out.println("The new string is: " + result);

//         scanner.close();
//     }
//     public static String appendStrings(String str1, String str2) {
//         int len1 = str1.length();
//         int len2 = str2.length();
//         if (len1 != len2) {
//             int diff = Math.abs(len1 - len2);
//             if (len1 > len2) {
//                 str1 = str1.substring(diff);
//             } else {
//                 str2 = str2.substring(diff);
//             }
//         }
//         return str1 + str2;
//     }
// }

// import java.util.*;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name1=sc.nextLine();
//         String name2=sc.nextLine();
//         String results=appendto(name1,name2);
//         System.out.println(results);
//     }
//     public  static String appendto(String name1,String name2){
//         int a=name1.length();
//         int b=name2.length();
//         if(a!=b){
//             int diff=Math.abs(a-b);
//             if(a>b){
//                 name1=name1.substring(diff);
//             }
//             else{
//                 name2=name2.substring(diff);
//             }
//         }
//         return name1+name2;
//     }
// }


// import java.util.*;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int arr[][]=new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int sum1=0;
//         int sum2=0;
//         int sum=0;
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 if(i==j){
//                     sum1+=arr[i][j];
//                 }
//                 else if(i+j==(a-1)){
//                     sum2+=arr[i][j];
//                 }
//                 else{
//                     sum+=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(Arrays.deepToString(arr));
//         System.out.println(sum);
//         System.out.println(sum1);
//         System.out.println(sum2);
        
//     }
// }

// import java.util.*;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter m dimension");
//         int a=sc.nextInt();
//         System.out.println("enter n dimension");
//         int b=sc.nextInt();
//         int array1[][]=new int[a][b];
//         int sum=0;
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 array1[i][j]=sc.nextInt();
//                 sum+=array1[i][j];
//             }
//         }
//         System.out.println("arrys1");
//         System.out.println("sum"+sum);
        
//     }
// }

// class ppk implements Cloneable {
//     int i;
//     int j;
//     @Override
//     public Object clone() throws CloneNotSupportedException{
//         return super.clone();
//     }
// }
// public class cat1 {
//     public static void main(String[] args) throws CloneNotSupportedException {
//         ppk p1 = new ppk();
//         p1.i = 12;
//         p1.j = 23;
//         ppk p2 = (ppk) p1.clone();
  
//         System.out.println("p1: i=" + p1.i + ", j=" + p1.j);
//         System.out.println("p2: i=" + p2.i + ", j=" + p2.j);
//     }
// }

// class Car implements Cloneable {
//     String brand;
//     String model;
//     double price;
//     String color;

//     public Car(String brand, String model, double price, String color) {
//         this.brand = brand;
//         this.model = model;
//         this.price = price;
//         this.color = color;
//     }

//     public String getModel() {
//         return model;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public String getColor() {
//         return color;
//     }

//     @Override
//     public Object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }
// }

// public class cat1{
//     public static void main(String[] args) {
//         try {
//             Car oldCar = new Car("Toyota", "Camry", 25000.0, "Blue");
//             Car newCar = (Car) oldCar.clone();

//             newCar.price = 28000.0;
//             newCar.color = "Red";

//             System.out.println("Old Car: Color = " + oldCar.getColor() + ", Price = $" + oldCar.getPrice());
//             System.out.println("New Car: Color = " + newCar.getColor() + ", Price = $" + newCar.getPrice());
//         } catch (CloneNotSupportedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// import java.util.Arrays;
// public class cat1 {
//     public static void main(String[] args) {
//         String a="prasanth is a boy";
//         String b[]=a.split(" ");
//         System.out.println(Arrays.toString(b));
//     }
// }

// Q)
// class person{
//     int age;
//     String name;
//     int number;
//     int salary;
//     public String getdetalis(){
//         return name+" "+age+" "+number;
//     }
//     public int getSalary() {
//         return salary;
//     } 
// }
// class employee extends person{
//     String specialization;
//     String department;
//     employee(String name,int age,int number,int salary){
//         System.out.println(name+" "+age+" "+number+" "+salary);
//     }

// }
// class manager extends person{
//     String specialization;
//     String department;
//     manager(String name,int age,int number,int salary){
//         System.out.println(name+" "+age+" "+number+" "+salary);
//     }
// }
// public class cat1 {
//     public static void main(String[] args) {
//         employee e1=new employee("hemanth",18 ,94398232 , 80000);
//         manager m1=new manager("ppk",34,939801698,20000);
        
//     }
// }


// class employee{
//     int id;
//     String name;
//     String department;
//     float salary;
//     public void insert(int a,String b,String c,float d){
//         id=a;
//         name=b;
//         department=c;
//         salary=d;
//     }
//     public void display(){
//         System.out.println("the id is:"+id);
//         System.out.println("name:"+name);
//         System.out.println("the department:"+department);
//         System.out.println("salary is:"+salary);
//     }

// }
// public class cat1 {
//     public static void main(String[] args) {
//         employee e1=new employee();
//         employee e2=new employee();
//         System.out.println("the details are:");
//         e1.insert(23,"ppk","cse",24000);
//         e2.insert(3,"subbu","ece",4000);
//         e1.display();        
//         e2.display();        

        
//     }
// }

// class iphone6{
//     public void makecalls(){
//         System.out.println("you have unlimited calls by iphone6");
//     }

// }
// class iphone10 extends iphone6{
//     public void unlockedphonebyfaceid(){
//         System.out.println("unlocked by face id");
//     }
// }
// class iphone12 extends iphone10{
//     public void supportfor5gnetwork(){
//         System.out.println("5G network support");
//     }
// }
// public class cat1{
//     public static void main(String[] args) {
//        iphone12 phone=new iphone12();
//        phone.makecalls();
//        phone.supportfor5gnetwork();
//        phone.unlockedphonebyfaceid();

        
//     }
// }

// final class Parent {
//     // Method marked as final cannot be overridden
//     public final void display() {
//         System.out.println("This method cannot be overridden.");
//     }
// }

// public class cat1{
//     public static void main(String[] args) {
//         Parent parent = new Parent();
//         parent.display();
//     }
// }

// class Animal{
//     public void eat() {
//         System.out.println("This animal is eating.");
//     }
//     public void sleep() {
//         System.out.println("This animal is sleeping.");
//     }
// }
// class Lion extends Animal {
//     public void roar() {
//         System.out.println("The lion is roaring.");
//     }
// }
// class Tiger extends Animal {
//     public void pounce() {
//         System.out.println("The tiger is pouncing.");
//     }
// }
// class Bear extends Animal {
//     public void hibernate() {
//         System.out.println("The bear is hibernating.");
//     }
// }
// public class cat1{
//     public static void feedAnimals(Animal[] animals) {
//         for (Animal animal : animals) {
//             animal.eat();
//         }
//     }
//     public static void main(String[] args) {
//         Lion lion = new Lion();
//         Tiger tiger = new Tiger();
//         Bear bear = new Bear();
//         Animal[] animals = {lion, tiger, bear};
//         feedAnimals(animals);
//     }

// }

// ADDDITION
// public class cat1 {
//     public static void main(String[] args) {
//         int a=2;
//         int b=3;
//         int c=a+b;
//         System.out.println("the results:"+c); 
//     }
// }
// output:-
// 5

// SUBTRACTION
// public class cat1 {
//     public static void main(String[] args) {
//         int a=123;
//         int b=34;
//         int c=a-b;
//         System.out.println(c);
        
//     }
// }
// output:-
// 89

// mutliplication
// public class cat1 {
//     public static void main(String[] args) {
//         int a=23;
//         int b=45;
//         int c=a*b;
//         System.out.println(c);
        
//     }
// }
// output:-
// 1035

// divsion
// public class cat1 {
//     public static void main(String[] args) {
//         float a=23;
//         float b=4;
//         float c=a/b;
//         System.out.println(c);
        
//     }
// }
// output:-
// 5.75

// MODULAR
// public class cat1 {
//     public static void main(String[] args) {
//         int a=34;
//         int b=68;
//         int c=b%a;
//         System.out.println("the results:"+c);
        
//     }
// }
// output:
// 0

// LEFT SHIFT
// public class cat1 {
//     public static void main(String[] args) {
//         int a=8;
//         int b=12;
//         int c=a<<b;
//         System.out.println("left left"+c);
//     }
// }
// output:
// 32768

// RIGHT SHIFT
// public class cat1 {
//     public static void main(String[] args) {
//         int a=24;
//         int b=4;
//         int c=a>>b;
//         System.out.println("right shift"+c);
//     }
// }
// output:
// 1

// // AND(%)
// public class cat1 {
//     public static void main(String[] args) {
//         int a=10;
//         int b=12;
//         int c=a&b;
//         System.out.println("And operator:"+c);        
//     }
// }
// output:-
// 8

// or(|)
// public class cat1 {
//     public static void main(String[] args) {
//         int a=3;
//         int b=34;
//         int c=a|b;
//         System.out.println("or operator:"+c);
//     }
// }
// output:-
// 35


// public class cat1 {
//     public static void main(String[] args) {
//         int a=23;
//         int b=34;
//         int c=a^b;
//         System.out.println("Nor operator:"+c);
        
//     }
// }
// output:-
// 53

// array
// public class cat1 {
//     public static void main(String[] args) {
//         int c=5;
//         int a[]=new int[c];
//         a[0]=2;
//         a[1]=4;
//         a[2]=6;
//         a[3]=8;
//         a[4]=10;
//         for(int i=0;i<c;i++){
//             System.out.println(a[i]);
//         }
        
//     }  
// }
// output:-
// 2 4 6 8 10

// LOOPS
// public class cat1 {
//     public static void main(String[] args) {
//         int c=8;
//         System.out.println("even");
//         for(int i=0;i<=8;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }
// output:-
// 0
// 2
// 4
// 6
// 8

// WHILE
// public class cat1 {
//     public static void main(String[] args) {
//         int a=10;
//         int i=0;
//         System.out.println("odd");
//         while(i<=10){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//             i+=1;
//         }
        
//     }
// }
// output:-
// 1
// 3
// 5
// 7
// 9

// MAKE ADDITION ARRAYS
// import java.util.Scanner;
// import java.util.Arrays;
// public class cat1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c=sc.nextInt();
//         int a[]=new int[c];
//         for(int i=0;i<c;i++){
//             a[i]=sc.nextInt();
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }
// output:
// [2,3,4,8,9]


// import java.util.*;
// public class cat1{
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         int b=2;
//         int index_position=0;
//         for(int j=0;j<a.length;j++){
//             if(a[j]==b){
//                 index_position=j;
//                 break;
//             }

//         }
//         System.out.println(index_position);
//         int n=a.length;
//         int m[]=new int[n-1];
//         for(int i=0;i<n;i++){
//             if(i==index_position){
//                 continue;
//             }
//             if(i<index_position){
//                 m[i]=a[i];
//             }
//             if(i>index_position){
//                 m[i-1]=a[i];
//             }
//         }
//         System.out.println(Arrays.toString(m));
//     }
// }

// import java.util.*;
// public class cat1{
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         int index_position=3;
//         int b=10;
//         int n=a.length;
//         int m[]=new int[n+1];
//         for(int i=0;i<=n;i++){
//             if(i==index_position){
//                 m[i]=b;
//             }
//             if(i<3){
//                 m[i]=a[i];
//             }
//             if(i>3){
//                 m[i]=a[i-1];
//             }
//         }
//         System.out.println(Arrays.toString(m));
//     }
// }

// import java.lang.Math;
// abstract class _3DShape {
//     protected double radius;
//     protected double height;
//     protected double slantHeight;

//     public _3DShape(double radius, double height, double slantHeight) {
//         this.radius = radius;
//         this.height = height;
//         this.slantHeight = slantHeight;
//     }

//     abstract public double volume();

//    abstract public double totalArea();
// }

// class Cylinder extends _3DShape {
//     public Cylinder(double radius, double height) {
//         super(radius, height, 0);
//     }

//     @Override
//     public double volume() {
//         return Math.PI * radius * radius * height;
//     }

//     @Override
//     public double totalArea() {
//         return 2 * Math.PI * radius * (radius + height);
//     }
// }

// class Cone extends _3DShape {
//     public Cone(double radius, double height, double slantHeight) {
//         super(radius, height, slantHeight);
//     }

//     @Override
//     public double volume() {
//         return (1.0 / 3) * Math.PI * radius * radius * height;
//     }

//     @Override
//     public double totalArea() {
//         double baseArea = Math.PI * radius * radius;
//         double lateralArea = Math.PI * radius * slantHeight;
//         return baseArea + lateralArea;
//     }
// }

// class Sphere extends _3DShape {
//     public Sphere(double radius) {
//         super(radius, 0, 0);
//     }

//     @Override
//     public double volume() {
//         return (4.0 / 3) * Math.PI * radius * radius * radius;
//     }

//     @Override
//     public double totalArea() {
//         return 4 * Math.PI * radius * radius;
//     }
// }

// public class cat1{
//     public static void main(String[] args) {
//         Cylinder cylinder = new Cylinder(3, 5);
//         System.out.println("Cylinder Volume: " + cylinder.volume());
//         System.out.println("Cylinder Total Surface Area: " + cylinder.totalArea());

//         Cone cone = new Cone(3, 5, 5.83);
//         System.out.println("Cone Volume: " + cone.volume());
//         System.out.println("Cone Total Surface Area: " + cone.totalArea());

//         Sphere sphere = new Sphere(3);
//         System.out.println("Sphere Volume: " + sphere.volume());
//         System.out.println("Sphere Total Surface Area: " + sphere.totalArea());
//     }
// }

// import java.util.Scanner;

// public class cat1{

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String[] names = new String[80];
//         int[] marks = new int[80];
//         int[] ages = new int[80];
//         for (int i = 0; i < 80; i++) {
//             System.out.println("Enter student " + (i + 1) + " details:");
//             System.out.print("Name: ");
//             names[i] = in.nextLine();
//             System.out.print("Marks: ");
//             marks[i] = in.nextInt();
//             System.out.print("Age: ");
//             ages[i] = in.nextInt();
//             in.nextLine(); 
//         }
//         for (int i = 0; i < marks.length - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < marks.length; j++) {
//                 if (marks[j] < marks[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             int tempMarks = marks[minIndex];
//             marks[minIndex] = marks[i];
//             marks[i] = tempMarks;

//             String tempName = names[minIndex];
//             names[minIndex] = names[i];
//             names[i] = tempName;

//             int tempAge = ages[minIndex];
//             ages[minIndex] = ages[i];
//             ages[i] = tempAge;
//         }
//         System.out.println("\nTop 10 Students:");
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Name: " + names[i]);
//             System.out.println("Age: " + ages[i]);
//             System.out.println("Marks: " + marks[i]);
//             System.out.println();
//         }
//     }
// }


// public class shoppingcart{
//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 4, 5, 6, 7};
//         int max = Integer.MIN_VALUE;
//         int secMax = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE; 
//         int secmin=Integer.MAX_VALUE;

//         for (int i = 0; i < a.length; i++) {
//             if (a[i] > max) {
//                 secMax = max;
//                 max = a[i]; 
//             } else if (a[i] > secMax && a[i] != max) {
//                 secMax = a[i];
//             }
//             if (a[i] < min) {
//                 min = a[i]; 
//             }
//             else if(a[i]<secmin && a[i]!=min){
//                 secmin=a[i];
//             }
//         }

//         System.out.println("Maximum: " + max);
//         System.out.println("Second Maximum: " + secMax);
//         System.out.println("Minimum: " + min+" "+secmin);
//     }
// }

// public class cat1 {
//     public static void main(String[] args) {
//         int a[]={1,-2,-3,-4,5};
//         int counte=0;
//         int countp=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]>0){
//                 counte+=1;
//             }
//             else{
//                 countp+=1;
//             }
//         }
//         if(countp>counte){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         } 
//     }
// }

// import java.util.Arrays;
// public class cat1 {
//     public static void main(String[] args) {
//         int a[]={1,2,0,3,4,0,6};
//         int b[]=new int[7];
//         Arrays.sort(a);
//         String c="";
//         for(int i=0;i<a.length;i++){
//             b[i]=a[a.length-i-1];
//         }
//         System.out.println(Arrays.toString(b));
//         for(int i=0;i<a.length;i++){
//             c+=b[i];
//         }
//         System.out.println(c);
//     }
// }

// // import java.util.Arrays;
// public class cat1 {
//     public static void main(String[] args) {
//         int a[]={2,3,1,7,9,5,11,3,5};
//         int maxi[]=new int[a.length];
//         for(int i=0;i<a.length;i++){
//             int maxdiff=0;
//             for(int j=0;j<a.length;j++){
//                int max=a[i]-a[j];
//                 if(maxdiff<max){
//                     maxdiff=max;
//                 }
//             }
//             maxi[i]=maxdiff;
//         }
//         System.out.println(Arrays.toString(maxi));
        
//     }
// }

import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int start, int end) {
        adjacencyList[start].add(end);
        adjacencyList[end].add(start);
    }

    public void displayGraph() {
        System.out.println("Graph representation (Adjacency List):");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : adjacencyList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (start and end vertices of each edge):");
        for (int i = 0; i < edges; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph.addEdge(start, end);
        }

        graph.displayGraph();

        scanner.close();  // Close the scanner after use
    }
}
