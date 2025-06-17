// import java.util.Scanner;

// class BankAccount {
//     private int accountNumber;
//     private String accountHolder;
//     private String accountType;
//     private double balance;

//     public BankAccount(int accountNumber, String accountHolder, String accountType, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.accountType = accountType;
//         this.balance = balance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Amount deposited successfully.");
//     }

//     public void withdraw(double amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             System.out.println("Amount withdrawn successfully.");
//         } else {
//             System.out.println("Insufficient balance.");
//         }
//     }

//     public void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Account Type: " + accountType);
//         System.out.println("Balance: " + balance);
//     }

//     public int getAccountNumber() {
//         return accountNumber;
//     }
// }

// public class assign{
//     private static final int MAX_ACCOUNTS = 100;
//     private static BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
//     private static int numAccounts = 0;
//     private static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         boolean programRunning = true;
//         while (programRunning) {
//             System.out.println("1. Create Account");
//             System.out.println("2. Deposit");
//             System.out.println("3. Withdraw");
//             System.out.println("4. Display Account Details");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume newline

//             switch (choice) {
//                 case 1:
//                     createAccount();
//                     break;
//                 case 2:
//                     deposit();
//                     break;
//                 case 3:
//                     withdraw();
//                     break;
//                 case 4:
//                     displayAccountDetails();
//                     break;
//                 case 5:
//                     programRunning = false;
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//         scanner.close();
//     }

//     private static void createAccount() {
//         if (numAccounts < MAX_ACCOUNTS) {
//             System.out.print("Enter account number: ");
//             int accountNumber = scanner.nextInt();
//             scanner.nextLine(); // Consume newline
//             System.out.print("Enter account holder name: ");
//             String accountHolder = scanner.nextLine();
//             System.out.print("Enter account type: ");
//             String accountType = scanner.nextLine();
//             System.out.print("Enter initial balance: ");
//             double initialBalance = scanner.nextDouble();
//             scanner.nextLine(); // Consume newline

//             accounts[numAccounts++] = new BankAccount(accountNumber, accountHolder, accountType, initialBalance);
//             System.out.println("Account created successfully.");
//         } else {
//             System.out.println("Maximum accounts reached. Cannot create more accounts.");
//         }
//     }

//     private static void deposit() {
//         System.out.print("Enter account number: ");
//         int accountNumber = scanner.nextInt();
//         scanner.nextLine(); // Consume newline
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             System.out.print("Enter amount to deposit: ");
//             double amount = scanner.nextDouble();
//             scanner.nextLine(); // Consume newline
//             account.deposit(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     private static void withdraw() {
//         System.out.print("Enter account number: ");
//         int accountNumber = scanner.nextInt();
//         scanner.nextLine(); // Consume newline
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             System.out.print("Enter amount to withdraw: ");
//             double amount = scanner.nextDouble();
//             scanner.nextLine(); // Consume newline
//             account.withdraw(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     private static void displayAccountDetails() {
//         System.out.print("Enter account number: ");
//         int accountNumber = scanner.nextInt();
//         scanner.nextLine(); // Consume newline
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             account.displayAccountDetails();
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     private static BankAccount findAccount(int accountNumber) {
//         for (int i = 0; i < numAccounts; i++) {
//             if (accounts[i].getAccountNumber() == accountNumber) {
//                 return accounts[i];
//             }
//         }
//         return null;
//     }
// }


// import java.util.*;
// class student{
//     int regno;
//     String name;
//     int s1;
//     double s2;
//     int s3;
//     student(int s1,double s2,int s3){
//         this.s1=s1;
//         this.s2=s2;
//         this.s3=s3;
//         System.out.println("marks:"+s1+","+s2+","+s3);
//     }
//     student(double s2,int s3,int s1){
//         this.s2=s2;
//         this.s3=s3;
//         this.s1=s1;
//         System.out.println("marks:"+s1+","+s2+","+s3);
//     }
// }
// public class assign {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner((System.in));
//         int a=sc.nextInt();
//         double b=sc.nextDouble();
//         int c =sc.nextInt();
//         student obj=new student(b, a, c);
//         student onj=new student(a,b,c);
//     }
// }

// import java.util.*;
// class vechile{
//     String branch;
//     int speed;
//     void display(){

//     }
// }
// class toyato extends vechile{
//     String branch="toyato";
//     int speed=40;
//     @Override
//     void display(){
//         System.out.println("brand:"+branch);
//         System.out.println("speed:"+speed);
//     }
// }
// class bmw extends vechile{
//     String branch="bmw";
//     int speed=60;
//     @Override
//     void display(){
//         System.out.println("brand:"+branch);
//         System.out.println("speed:"+speed);
//     }
// }
// public class assign {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         if(a.equals("toyato")){
//             vechile a1=new toyato();
//             a1.display();
//         }
//         else{
//             vechile a1=new bmw();
//             a1.display();
//         }
//     }
// }


// import java.util.Scanner;
// abstract class Product {
//     int productId;
//     String name;
//     double price;
//     int quantity;

//     public Product(int productId, String name, double price, int quantity) {
//         this.productId = productId;
//         this.name = name;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public abstract void updatePrice(double newPrice);

//     public abstract void updateQuantity(int newQuantity);

//     public abstract void displayDetails();

//     public double calculateValue() {
//         return price * quantity;
//     }

//     public int getProductId() {
//         return productId;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getQuantity() {
//         return quantity;
//     }
// }

// class FoodProduct extends Product {
//     private String expiryDate;

//     public FoodProduct(int productId, String name, double price, int quantity, String expiryDate) {
//         super(productId, name, price, quantity);
//         this.expiryDate = expiryDate;
//     }

//     @Override
//     public void updatePrice(double newPrice) {
//         price = newPrice;
//     }

//     @Override
//     public void updateQuantity(int newQuantity) {
//         quantity = newQuantity;
//     }

//     @Override
//     public void displayDetails() {
//         System.out.println("Product ID: " + productId);
//         System.out.println("Name: " + name);
//         System.out.println("Price: " + price);
//         System.out.println("Quantity: " + quantity);
//         System.out.println("Expiry Date: " + expiryDate);
//     }
// }

// class BeverageProduct extends Product {
//     private String expirationDate;

//     public BeverageProduct(int productId, String name, double price, int quantity, String expirationDate) {
//         super(productId, name, price, quantity);
//         this.expirationDate = expirationDate;
//     }

//     @Override
//     public void updatePrice(double newPrice) {
//         price = newPrice;
//     }

//     @Override
//     public void updateQuantity(int newQuantity) {
//         quantity = newQuantity;
//     }

//     @Override
//     public void displayDetails() {
//         System.out.println("Product ID: " + productId);
//         System.out.println("Name: " + name);
//         System.out.println("Price: " + price);
//         System.out.println("Quantity: " + quantity);
//         System.out.println("Expiration Date: " + expirationDate);
//     }
// }

// public class assign{
//     static final int MAX_ACCOUNTS = 100;
//     static Product[] inventory = new Product[MAX_ACCOUNTS];
//     static int numAccounts = 0;
//      static Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.println("1. Add Product\n2. Update Product\n3. Display All Products\n4. Search Product\n5. Calculate Total Inventory Value\n6. Exit");
//         int choice;
        
//         do{
//             System.out.println("1. Add Product\n2. Update Product\n3. Display All Products\n4. Search Product\n5. Calculate Total Inventory Value\n6. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();
//             switch (choice) {
//                 case 1:
//                     addProduct();
//                     break;
//                 case 2:
//                     updateProduct();
//                     break;
//                 case 3:
//                     displayAllProducts();
//                     break;
//                 case 4:
//                     searchProduct();
//                     break;
//                 case 5:
//                     calculateTotalInventoryValue();
//                     break;
//                 case 6:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }while (choice != 6);

//         scanner.close();
//     }

//     private static void addProduct() {
//         System.out.print("Enter product type (1: Food, 2: Beverage): ");
//         int productType = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         System.out.print("Enter product ID: ");
//         int productId = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         System.out.print("Enter product name: ");
//         String name = scanner.nextLine();

//         System.out.print("Enter product price: ");
//         double price = scanner.nextDouble();

//         System.out.print("Enter product quantity: ");
//         int quantity = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         if (productType == 1) {
//             System.out.print("Enter expiry date: ");
//             String expiryDate = scanner.nextLine();
//             inventory[numAccounts++] = new FoodProduct(productId, name, price, quantity, expiryDate);
//         } else if (productType == 2) {
//             System.out.print("Enter expiration date: ");
//             String expirationDate = scanner.nextLine();
//             inventory[numAccounts++] = new BeverageProduct(productId, name, price, quantity, expirationDate);
//         } else {
//             System.out.println("Invalid product type.");
//         }
//     }

//     private static void updateProduct() {
//         System.out.print("Enter product ID to update: ");
//         int productId = scanner.nextInt();
//         scanner.nextLine(); // Consume newline

//         Product product = findProduct(productId);
//         if (product != null) {
//             System.out.print("Enter new price: ");
//             double newPrice = scanner.nextDouble();
//             product.updatePrice(newPrice);

//             System.out.print("Enter new quantity: ");
//             int newQuantity = scanner.nextInt();
//             product.updateQuantity(newQuantity);

//             System.out.println("Product updated successfully.");
//         } else {
//             System.out.println("Product not found.");
//         }
//     }

//     private static void displayAllProducts() {
//         for (Product product : inventory) {
//             if (product != null) {
//                 product.displayDetails();
//                 System.out.println();
//             }
//         }
//     }

//     private static void searchProduct() {
//         System.out.print("Enter product ID or name to search: ");
//         String searchKey = scanner.nextLine();

//         boolean found = false;
//         for (Product product : inventory) {
//             if (product != null && (String.valueOf(product.getProductId()).equals(searchKey) || product.getName().equalsIgnoreCase(searchKey))) {
//                 product.displayDetails();
//                 found = true;
//                 break;
//             }
//         }
//         if (!found) {
//             System.out.println("Product not found.");
//         }
//     }

//     private static Product findProduct(int productId) {
//         for (Product product : inventory) {
//             if (product != null && product.getProductId() == productId) {
//                 return product;
//             }
//         }
//         return null;
//     }

//     private static void calculateTotalInventoryValue() {
//         double totalValue = 0;
//         for (Product product : inventory) {
//             if (product != null) {
//                 totalValue += product.calculateValue();
//             }
//         }
//         System.out.println("Total Inventory Value: $" + totalValue);
//     }
// }





// class Person{
//     String name;
//     int age;
//     Person(int age,String name){
//         this.age=age;
//         this.name=name;
//     }
//     public void display(){
//         System.out.println("the name:"+name);
//         System.out.println("the age is :"+age);
//     }
// }
// class Employee extends Person{
//     double salary;
//     Employee(int age,String name,double salary){
//         super(age,name);
//         this.salary=salary;
//     }
//     public void display(){
//         super.display();
//         System.out.println("the salary:"+salary);

//     }
// } 
// class Manager extends Employee{
//     String department;
//     Manager(int age,String name,double salary,String department){
//         super(age,name,salary);
//         this.department=department;
//     }
//     public void display(){
//         super.display();
//         System.out.println("the dep:"+department);
//     }
// }
// public class assign {
//     public static void main(String[] args) {
//         Person person = new Person(30,"john");
//         System.out.println("Displaying Person Details:");
//         person.display();
//         System.out.println();

//         // Employee object
//         Employee employee = new Employee(20,"rjjwq",292091);
//         System.out.println("Displaying Employee Details:");
//         employee.display();
//         System.out.println();

//         // Manager object
//         Manager manager = new Manager(12,"rubwehkuds",21335456,"Manager");
//         System.out.println("Displaying Manager Details:");
//         manager.display();
        
//     }
// }

//write a java program to calculate the profit and loss statement per a stock investment , var such as price , quantity ,
// and cost , 2 methods named as calculate price and cal profit . find the profit and loss by using methodd overriding

// import java.util.*;
// class stock{
//     int quantity;
//     double price;
//     double profit;
//     public stock(int quantity,double price){
//         this.quantity=quantity;
//         this.price=price;
//     }
//     public void buyprice(){
//         System.out.println("price = "+(quantity*price));
//     }
//     public void profit(){
//         System.out.println("profit on buy price "+(quantity*price*0.1));
//     }
// }
// class mystock extends stock{
//     double cost;
//     public mystock(int quantity,double price ,double cost){
//         super(quantity,price);
//         this.cost=cost;
//     }
//     @Override
//     public void buyprice(){
//         System.out.println("total price"+price*quantity*1.1);
//     }
    
//     public void profit(){

//         System.out.println("profit 1 ="+(price-cost)*quantity);

//     }
// }
// class mar19{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter no of companies: ");
//         int n=sc.nextInt();
//         double profit=0;
//         double[] prices=new double[n];
//         int [] quantities=new int [n];
//         double [] costs=new double[n];
//         for(int i=0;i<n;i++){
//             System.out.print("enter the price of company "+(i+1)+":");
//             prices[i]=sc.nextDouble();
//             System.out.print("enter the quantity of company "+(i+1)+":");
//             quantities[i]=sc.nextInt();
//             System.out.print("enter the cost of company"+(i+1)+":");
//             costs[i]=sc.nextDouble();
//         }
//         for(int i=0;i<n;i++){
//             stock obj=new stock(quantities[i],prices[i]);
//             mystock obj1=new mystock(quantities[i],prices[i],costs[i]);
//             obj.buyprice();
//             obj.profit();
//             profit += (prices[i] * quantities[i] - costs[i] * quantities[i]);
//         }
//         System.out.println("profit"+profit);

//     }
// // }
// class Employee {
//     String name;
//     int employeeId;
//     double salary;
    
//     public Employee(String name, int employeeId, double salary) {
//         this.name = name;
//         this.employeeId = employeeId;
//         this.salary = salary;
//     }
    
//     public double getSalary() {
//         return salary;
//     }
// }

// class Manager extends Employee {
//     private String department;
//     private double bonus;
    
//     public Manager(String name, int employeeId, double salary, String department, double bonus) {
//         super(name, employeeId, salary);
//         this.department = department;
//         this.bonus = bonus;
//     }
    
//     @Override
//     public double getSalary() {
//         return super.getSalary() + bonus;
//     }
// }

// class Worker extends Employee {
//     private int hoursWorked;
//     private double hourlyRate;
    
//     public Worker(String name, int employeeId, double salary, int hoursWorked, double hourlyRate) {
//         super(name, employeeId, salary);
//         this.hoursWorked = hoursWorked;
//         this.hourlyRate = hourlyRate;
//     }
    
//     @Override
//     public double getSalary() {
//         return super.getSalary() + (hoursWorked * hourlyRate);
//     }
// }
// public class assign{
//     public static void main(String[] args) {
//         Manager manager = new Manager("John Doe", 1001, 50000, "Sales", 10000);
//         Worker worker = new Worker("Jane Smith", 2001, 20000, 160, 25);
        
//         System.out.println("Manager's total salary: $" + manager.getSalary());
//         System.out.println("Worker's total salary: $" + worker.getSalary());
//     }
// }

// import java.util.*;
// abstract class Shape{
//     abstract public void calculatearea();

// }
// class circle extends Shape{
//     double radius;
//     double area;
//     circle(double radius){
//         this.radius=radius;
//         area=Math.PI*radius*radius;
//     }
//     @Override
//     public void calculatearea(){
//         System.out.println("area is:"+area);

//     }

// }
// class rectangle extends Shape{
//     double length;
//     double breadth;
//     double area;
//     rectangle(double length,double breadth){
//         this.length=length;
//         this.breadth=breadth;
//         area=length*breadth;
        
//     }
//     @Override
//     public void calculatearea(){
//         System.out.println("area is:"+area);

//     }

    
// }
// class triangle extends Shape{
//     double area;
//     double base;
//     double heigth;
//     triangle(double base,double heigth){
//         this.base=base;
//         this.heigth=heigth;
//         area=(0.5)*base*heigth;
//     }
//     @Override
//     public void calculatearea(){
//         System.out.println("area is:"+area);

//     }

// }
// public class assign {
//     public static void main(String[] args) {
//         Shape c1=new circle(5);
//         Shape r1=new rectangle(5,4 );
//         Shape t1=new triangle(2,4);
//         c1.calculatearea();
//         r1.calculatearea();
//         t1.calculatearea();
        
//     }
// }

// class calculate {
//     double a;
//     double b;
//     double c;
//     double e;
//     double f;
//     double g;

//     public double compute(double a) {
//         this.a = a;
//         return a * a;
//     }

//     public double compute(double b, double c) {
//         this.b = b;
//         this.c = c;
//         return b * c;
//     }

//     public double compute(double e, double f, double g) {
//         this.e = e;
//         this.f = f;
//         this.g = g;
//         double Min;
//         if (e < f && e < g) {
//             Min = e;
//         } else if (f < e && f < g) {
//             Min = f;
//         } else {
//             Min = g;
//         }
//         return Min;
//     }
// }

// public class assign {
//     public static void main(String[] args) {
//         calculate c1 = new calculate();
//         System.out.println(c1.compute(4));
//         System.out.println(c1.compute(5, 6));
//         System.out.println(c1.compute(23, 2, 3));

//     }
// }

// class Shape {
//     public void draw() {
//         System.out.println("Drawing a shape");
//     }
    
//     public void draw(int sides) {
//         System.out.println("Drawing a shape with " + sides + " sides");
//     }
// }

// class Circle extends Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle extends Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// class Triangle extends Shape {
//     @Override
//     public void draw() {
//         System.out.println("Drawing a triangle");
//     }
// }

// public class assign{
//     public static void main(String[] args) {
//         Shape shape1 = new Shape();
//         Shape shape2 = new Circle();
//         Shape shape3 = new Rectangle();
//         Shape shape4 = new Triangle();
        
//         shape1.draw(); 
//         shape1.draw(4);
        
//         shape2.draw();
//         shape3.draw();  
//         shape4.draw(); 
//     }
// }


// import java.util.*;
// public class assign{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int marks[]=new int[3];
//         int age[]=new int[3];
//         String name[]=new String[3];
//         for(int i=0;i<3;i++){
//             System.out.println("enter marks:");
//             marks[i]=sc.nextInt();
//             System.out.println("the name:");
//             name[i]=sc.next();
//             System.out.println("age:");
//             age[i]=sc.nextInt();
//         }
//         for(int i=0;i<marks.length;i++){
//             int minindex=i;
//             for(int j=i+1;j<marks.length;j++){
        
//                 if(marks[j]<marks[minindex]){
//                     minindex=j;
//                 }
//             }
//             int temp=marks[minindex];
//             marks[minindex]=marks[i];
//             marks[i]=temp;

//             String temp1=name[minindex];
//             name[minindex]=name[i];
//            name[i]=temp1;

//             int temp2=age[minindex];
//             age[minindex]=age[i];
//             age[i]=temp2;
//         }
//         System.out.println(Arrays.toString(marks));
//     }
// }

// import java.util.*;
// public class assign {
//     public static void main(String[] args) {
//         int scorce1[]=new int [5];
//         int scorce2[]=new int [5];
//         int scorce3[]=new int [5];
//         String name[]=new String[5];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<5;i++){
//             name[i]=sc.next();
//             scorce1[i]=sc.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             name[i]=sc.next();
//             scorce2[i]=sc.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             name[i]=sc.next();
//             scorce3[i]=sc.nextInt();
//         }
//         System.out.println("score of each person");
//         double total[]=new double[5];
//         double Avg[]=new double[5];
//         for(int i=0;i<5;i++){
//             total[i]=scorce1[i]+scorce2[i]+scorce3[i];
//             Avg[i]=total[i]/3;
//         }
//         System.out.println(Arrays.toString(total));
//         System.out.println(Arrays.toString(Avg));
//     }
// }

// public class assign {

//     public static void main(String[] args) {
//         int a=6000;
//         int b=0;
//         // int c=a/b;
//         try{
//             int c=a/b;
//             System.out.println("the results is:"+c);
//         }
//         catch(Exception e){
//             System.out.println("we falied to run");
//             System.out.println(e);
//         }
//         System.out.println("the end of the program");
        
//     }
// }


// public class assign {
//     public static void main(String[] args) {
//         int a=10;
//         int b=0;
//         if(b==0){
//             throw new ArithmeticException("divi to 13");
//         }
//         else{
//             System.out.println(a/b);
//         }
//     }
// }

// import java.util.Scanner;
// class MyException extends Exception{
//     @Override
//     public String toString() {
//         return "I am toString()";
//     }

//     @Override
//     public String getMessage() {
//         return "I am getMessage()";
//     }
// }
// class MaxAgeException extends Exception{
//     @Override
//     public String toString() {
//         return "Age cannot be greater than 125";
//     }

//     @Override
//     public String getMessage() {
//         return "Make sure that the value of age entered is correct";
//     }
// }
// public class assign{
//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         if (a<9){
//             try{
//                 // throw new MyException();
//                 // throw new ArithmeticException("This is an exception");
//                 throw new MaxAgeException();
//             }
//             catch (Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 e.printStackTrace();
//                 System.out.println("Finished");
//             }
//             System.out.println("Yes Finished");
//         }
//     }
// }

// import harry.f1.Myclass;
// public class assign {

//     public static void main(String[] args) {
//         Myclass a=new Myclass();
//         a.myname("Prasanth");
        
//     }
// }

// class Vechile{
//     int maxSpeed;
//     double fuelConsumption;
//     int numWheels;

//     Vechile(int maxSpeed,double fuelConsumption,int numWheels){
//         this.maxSpeed = maxSpeed;
//         this.fuelConsumption = fuelConsumption;
//         this.numWheels = numWheels;
//     }
// }
// class Car extends Vechile{
//     String engineType;
//     String style;

//     Car(int maxSpeed, double fuelConsumption, int numWheels, String engineType, String style) {
//         super(maxSpeed, fuelConsumption, numWheels);
//         this.engineType = engineType;
//         this.style = style;
//     }
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+engineType+" "+style);
//     }
// }
// class truck extends Vechile{
//     double cargoCapacity;

//     truck(int maxSpeed, double fuelConsumption, int numWheels, double cargoCapacity) {
//         super(maxSpeed, fuelConsumption, numWheels);
//         this.cargoCapacity = cargoCapacity;
//     }
    
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+cargoCapacity);
//     }
// }

// class Motorcycle extends Vechile{
//     String style;
//     Motorcycle(int maxSpeed, double fuelConsumption, int numWheels,String style){
//         super(maxSpeed, fuelConsumption, numWheels);
//         this.style=style;
//     }
    
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+style);
//     }
// }

// class ElectricCar extends Car {
//     int chargeTime;

//     public ElectricCar(int maxSpeed, double fuelConsumption, int numWheels, String engineType, String style, int chargeTime) {
//         super(maxSpeed, fuelConsumption, numWheels, engineType, style);
//         this.chargeTime = chargeTime;
//     }

    
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+engineType+" "+style+" "+chargeTime);
//     }
// }

// class DieselTruck extends truck {
//     String emissionStandards;

//     public DieselTruck(int maxSpeed, double fuelConsumption, int numWheels, double cargoCapacity, String emissionStandards) {
//         super(maxSpeed, fuelConsumption, numWheels, cargoCapacity);
//         this.emissionStandards = emissionStandards;
//     }
    
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+cargoCapacity+" "+emissionStandards);
//     }
// }

// class SportsBike extends Motorcycle {
//     boolean stuntAbility;

//     public SportsBike(int maxSpeed, double fuelConsumption, int numWheels, String style, boolean stuntAbility) {
//         super(maxSpeed, fuelConsumption, numWheels, style);
//         this.stuntAbility = stuntAbility;
//     }
    
//     void display(){ 
//         System.out.println(maxSpeed+" "+fuelConsumption+" "+numWheels+" "+style+" "+stuntAbility);
//     }
// }


// public class assign {

//     public static void main(String[] args) {
        
//         SportsBike s1=new SportsBike(100, 210303, 2,"sports",true);
//         s1.display();
//     }
// }

// import java.util.Scanner;
// public class assign{
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the target sum: ");
//         int targetSum = sc.nextInt();
//         int minDifference = Integer.MAX_VALUE;
//         int count = 0;
//         int difference;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == targetSum) {
//                     count++;
//                     difference = Math.abs(arr[i] - arr[j]);
//                     System.out.println(arr[i] + " " + arr[j]);
//                     minDifference = Math.min(minDifference, difference);
//                 }
//             }
//         }

// public class assign{
//     public static void main(String[] args) {
//         shape obj=new circle("red", 7);
//         shape obj1=new rectangle("black", 4, 6);
//         System.out.println(obj.toString());
//         System.out.println(obj1.toString());
//     }
// }

//         if (count == 0) {
//             System.out.println("No pairs found with the target sum.");
//         } else {
//             System.out.println("Minimum absolute difference: " + minDifference);
//             System.out.println("Number of pairs with the target sum: " + count);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == targetSum && Math.abs(arr[i] - arr[j]) == minDifference) {
//                     System.out.println(arr[i] + " " + arr[j]);
//                 }
//             }
//         }
//     }
// }

// abstract class Shape{
//     abstract public double area();
//     abstract public double perimeter();
//     String color;
//     Shape(String color){
//         this.color=color;
//     }
//     abstract String tostring();
//     public String getcolor(){
//         return color;
//     }
// }
// class Circle extends Shape{
//     double radius;
//     Circle(String color,double radius){
//         super(color);
//         this.radius=radius;
//     }
//     public double area(){
//         return Math.PI*radius*radius;
//     }
//     public double perimeter(){
//         return 2*Math.PI*radius;
//     }
//     public String tostring(){
//         return super.getcolor() + area() + perimeter();
//     }
// }
// class rectangles extends Shape{
//     int length;
//     int width;
//     rectangles(String color,int length,int width){
//         super(color);
//         this.length=length;
//         this.width=width;
//     }
    
//     public double area(){
//         return length*width;
//     }
//     public double perimeter(){
//         return 2*(length+width);
//     }
//     public String tostring(){
//         return super.getcolor() + area() + perimeter();
//     }
// }
// public class assign{
//     public static void main(String[] args) {
//         Shape obj=new Circle("red", 7);
//         Shape obj1=new rectangles("black", 4, 6);
//          System.out.println(obj.tostring());
//          System.out.println(obj1.tostring());
        
//     }
// }

// import java.util.Arrays;
// public class assign {
//     public static void main(String[] args) {
//         int arr[]={3,4,5,1,2,342};
//         int n=arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             // Inner loop for comparisons and swaps
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // Swap arr[j] and arr[j+1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
        
//     }
// }

// class task{
//     int taskid;
//     String taskname;
//     String assignto;
//     String status="pending";
//     static int nexttaskid=1;
//     task(String taskname,String assignto,String status){
//         taskid=nexttaskid;
//         this.taskname=taskname;
//         this.assignto=assignto;
//         this.status=status;
//         nexttaskid++;
//     }

//     public void getvalue(){
//         System.out.println(taskid);
//         System.out.println(taskname);
//         System.out.println(assignto);
//         System.out.println(status);
//     }
// }
// public class assign {

//     public static void main(String[] args) {
//         task t1=new task("Design","rahul","pending");
//         task t2=new task("implement Backened","ram","pending");
//         t1.getvalue();
//         t2.getvalue();
        
//     }
// }


// class Vechile{
//     String model;
//     int year;
//     Vechile(String model,int year){
//         this.model=model;
//         this.year=year;
//     }
//     void display(){
//         System.out.println(model);
//         System.out.println(year);
//     }
// }
// class car extends Vechile{
//     int seatingcapcity;
//     car(String model,int year,int seatingcapcity){
//         super(model,year);
//         this.seatingcapcity=seatingcapcity;
//     }
    
//     void display(){
//         System.out.println(model);
//         System.out.println(year);
//         System.out.println(seatingcapcity);
//     }

// }
// class buses extends Vechile{
//     int speed;
//     buses(String model,int year,int speed){
//         super(model,year);
//         this.speed=speed;
//     }
    
//     void display(){
//         System.out.println(model);
//         System.out.println(year);
//         System.out.println(speed);
//     }
// }
// class truck extends Vechile{
//     double cargoCapacity;
//     truck(String model,int year,double cargoCapacity){
//         super(model,year);
//         this.cargoCapacity=cargoCapacity;
//     }
    
//     void display(){
//         System.out.println(model);
//         System.out.println(year);
//         System.out.println(cargoCapacity);
//     }
// }
// public class assign {
//     public static void main(String[] args) {
//         car c1=new car("hero",2014,5);
//         buses b1=new buses("orrff", 2005, 180);
//         truck t1=new truck("ggfjkjas",2000,1000.0);
//         c1.display();
//         b1.display();
//         t1.display();
//     }
// }


// import java.util.Scanner;
// class Product{
//     private int productId;
//     private String productName;
//     private int price;
//     private int quantity;
//     public int getProductId(){
//         return productId;
//     }
//     public void setProductId(int Id){
//         this.productId=Id;
//     }
//     public String getproductName(){
//         return productName;
//     }
//     public void setProductName(String name){
//         this.productName=name;
//     }
//     public int getprice(){
//         return price;
//     }
//     public void setprice(int newprice){
//         this.price=newprice;
//     }
//     public int getquantity(){
//         return quantity;
//     }
//     public void setquantity(int newQuantity){
//         this.quantity=newQuantity;
//     }
//     public void updateQuantity(){
//         System.out.println("product id:" + productId);
//         System.out.println("product name:" + productName);
//         System.out.println("price:" + price);
//         System.out.println("quantity:" + quantity);
//         System.out.println("enter a integer");
//         Scanner sc=new Scanner(System.in);
//         int add=sc.nextInt();
//         int totalquantity=quantity+add;
//         System.out.println("quantity:"  + totalquantity);        
//     }

// }
// public class assign {
//     public static void main(String[] args) {
//         Product p1=new Product();
//         p1.setProductId(23);
//         System.out.println(p1.getProductId());
//         p1.setProductName("laptop");
//         System.out.println(p1.getproductName());
//         p1.setprice(5000);
//         System.out.println(p1.getprice());
//         p1.setquantity(12);
//         System.out.println(p1.getquantity());
//         p1.updateQuantity();        
//     }
// }
// class vehicle{
//     String model;
//     int year;
//     public vehicle(String model,int year){
//         this.model=model;
//         this.year=year;
//     }
//     public void displayDetails(){
//         System.out.println(model);
//         System.out.println(year);
//     } 
// }

// public class assign {
//     public static void main(String[] args) {
//        try{
//         int a=8;
//         int b=0;
//         double c=a/b;
//        }
//        catch(ArithmeticException e){
//             System.out.println(e);
//             System.out.println("HAH");
//        }
//        catch(IllegalArgumentException e){
//         System.out.println(e);
//         System.out.println("Hello");
//        }

//        finally{
//         System.out.println("the end of the program");
//        }
//     }
// }

// import java.util.*;
// public class assign {
//     public static void main(String[] args) {
//         boolean flag=true;
//         int marks[]=new int[3];
//         marks[0]=1;
//         marks[1]=23;
//         marks[2]=34;
//         int i=0;
//         int index;
//         Scanner sc=new Scanner(System.in);
//         while(true && i<5){
//             try{
//                 index=sc.nextInt();
//                 System.out.println("the index of thr marks"+" "+marks[index]);  
//                 break; 
//             }
//             catch(Exception e){
//                 System.out.println("invalid index");
//                 i++;
//             }
//         }
//         if(i>=5){
//             System.out.println("Error");
//         }
//     }
// }

// class InvalidInputException extends Exception{
//     public String toString(){
//         return "cannot add";
//     }
//     public String getmessage(){
//         return "i am get message()";
//     }
// }
// class customercalculator{
//     double add(int a, int b) throws InvalidInputException{
//         if(a==9 || b==9){
//         throw new InvalidInputException();
//         }
//         return a+b;
//     }
//     double subtract(int a, int b){
//         return a-b;
//     }
//     double mutliple(int a, int b){
//         return a*b;
//     }
//     double division(int a, int b){
//         if(b==0){
//             throws Can
//         }
//         return a/b;
//     }

// }
// public class assign {

//     public static void main(String[] args) throws InvalidInputException {
//         customercalculator c=new customercalculator();
//         c.add(8,9);
//     }
// }


