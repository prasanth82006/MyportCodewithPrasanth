// import java.util.Random;
// import java.util.Scanner;

// class Game {
//     private int number;
//     private int inputNumber;
//     private int noOfGuesses = 0;

//     public int getNoOfGuesses() {
//         return noOfGuesses;
//     }

//     public void setNoOfGuesses(int noOfGuesses) {
//         this.noOfGuesses = noOfGuesses;
//     }

//     Game() {
//         Random rand = new Random();
//         this.number = rand.nextInt(100);
//     }

//     void takeUserInput() {
//         System.out.println("Guess the number:");
//         Scanner sc = new Scanner(System.in);
//         inputNumber = sc.nextInt();
//     }

//     boolean isCorrectNumber() {
//         noOfGuesses++;
//         if (inputNumber == number) {
//             System.out.format("Yes, you guessed it right! It was %d.\nYou guessed it in %d attempts.\n", number, noOfGuesses);
//             return true;
//         } else if (inputNumber < number) {
//             System.out.println("Too low...");
//         } else {
//             System.out.println("Too high...");
//         }
//         return false;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Game g = new Game();
//         boolean guessedCorrectly = false;

//         while (!guessedCorrectly) {
//             g.takeUserInput();
//             guessedCorrectly = g.isCorrectNumber();
//         }
//     }
// }


// public class game{

//     public static void main(String[] args) {
//         System.out.println();
//     }
// }

// import java.util.*;
// class libary{
//     int index;

//     String book[]={"richdadpoordad","thenigts","dreams","themoney"};
//     Scanner sc=new Scanner(System.in);

//     public void issuebook(String a){
//         for(int i=0;i<book.length;i++){
//             if(a==book[i]){
//                 System.out.println("available");
//                 index=i;
//                 System.out.println("enter yes to take or no to not");
//                 String b=sc.next();
//                 if(b.equals("yes")){
//                     System.out.println("book is successful is taken");
//                     this.book[i]=null;
//                 }
//             }
//         }
//     }

//     public void returnbook(String c){
//         book[index]=c;

//     }
//     public void showavalible(){
//         System.out.println("total book present is:");
//         for(String boo:this.book){
//            if(boo==null){
//                continue;
//            }
//             System.out.println("*"+boo);
//         }
//     }

// }
// public class game{
//     public static void main(String[] args) {
//         libary b1=new libary();
//         b1.issuebook("dreams");
//         b1.showavalible();
//         b1.returnbook("dreams");
//         b1.showavalible();
//     }
// }


// import java.util.ArrayList;
// import java.util.Scanner;

// class BankAccount {
//     private int accountNumber;
//     private String accountHolderName;
//     private String accountType;
//     private double balance;

//     public BankAccount(int accountNumber, String accountHolderName, String accountType, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.accountType = accountType;
//         this.balance = initialBalance;
//     }

//     public int getAccountNumber() {
//         return accountNumber;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposit successful. Current balance: " + balance);
//     }

//     public void withdraw(double amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             System.out.println("Withdrawal successful. Current balance: " + balance);
//         } else {
//             System.out.println("Insufficient funds. Withdrawal failed.");
//         }
//     }

//     public void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Account Type: " + accountType);
//         System.out.println("Current Balance: " + balance);
//     }
// }

// public class game{
//     private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
//     private static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         boolean running = true;
//         while (running) {
//             System.out.println("1. Create Account");
//             System.out.println("2. Deposit");
//             System.out.println("3. Withdraw");
//             System.out.println("4. Display Account Details");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();
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
//                     running = false;
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//         scanner.close();
//     }

//     private static void createAccount() {
//         System.out.print("Enter Account Number: ");
//         int accountNumber = scanner.nextInt();
//         scanner.nextLine(); // consume newline
//         System.out.print("Enter Account Holder Name: ");
//         String accountHolderName = scanner.nextLine();
//         System.out.print("Enter Account Type: ");
//         String accountType = scanner.nextLine();
//         System.out.print("Enter Initial Balance: ");
//         double initialBalance = scanner.nextDouble();
//         BankAccount account = new BankAccount(accountNumber, accountHolderName, accountType, initialBalance);
//         accounts.add(account);
//         System.out.println("Account created successfully.");
//     }

//     private static void deposit() {
//         System.out.print("Enter Account Number: ");
//         int accountNumber = scanner.nextInt();
//         System.out.print("Enter Amount to Deposit: ");
//         double amount = scanner.nextDouble();
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             account.deposit(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     private static void withdraw() {
//         System.out.print("Enter Account Number: ");
//         int accountNumber = scanner.nextInt();
//         System.out.print("Enter Amount to Withdraw: ");
//         double amount = scanner.nextDouble();
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             account.withdraw(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     private static void displayAccountDetails() {
//         System.out.print("Enter Account Number: ");
//         int accountNumber = scanner.nextInt();
//         BankAccount account = findAccount(accountNumber);
//         if (account != null) {
//             account.displayAccountDetails();
//         } else {
//             System.out.println("Account not found.");
//         }
//     }
//     private static BankAccount findAccount(int accountNumber) {
//         for (BankAccount account: accounts) {
//             if (account.getAccountNumber() == accountNumber) {
//                 return account;
//             }
//         }
//         return null;
//     }
// }

// import java.util.*;
// public class game {
//     public static void main(String[] args) {
//         ArrayList<Integer>list1=new ArrayList<Integer>();
//         list1.add(0);
//         list1.add(1);
//         list1.add(2);
//         System.out.println(list1);
//         System.out.println(list1.get(1));
//         list1.add(0,5);
//         System.out.println(list1);
//         list1.set(0,10);
//         System.out.println(list1);
//         list1.remove(2);
//         System.out.println(list1);
//         System.out.println(list1.size());

//         // sorting
//         Collections.sort(list1);
//         System.out.println(list1);

//     }
// }

// class BankAccount {
//     int accNo;
//     String name;
//     String type;
//     double balance;

//     public BankAccount(int accNo, String name, String type, double balance) {
//         this.accNo = accNo;
//         this.name = name;
//         this.type = type;
//         this.balance = balance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposit successful. New balance: " + balance);
//     }

//     public void withdraw(double amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             System.out.println("Withdrawal successful. New balance: " + balance);
//         } else {
//             System.out.println("Insufficient balance to withdraw.");
//         }
//     }
// }

// class SavingsAccount extends BankAccount {
//     public SavingsAccount(int accNo, String name, String type, double balance) {
//         super(accNo, name, type, balance);
//     }

//     @Override
//     public void withdraw(double amount) {
//         if (balance - amount >= 1000) {
//             balance -= amount;
//             System.out.println("Withdrawal successful. New balance: " + balance);
//         } else {
//             System.out.println("Minimum balance limit reached. Withdrawal not allowed.");
//         }
//     }
// }

// public class game{
//     public static void main(String[] args) {
//         BankAccount account1 = new SavingsAccount(123456, "John Doe", "Savings", 1500);
//         account1.deposit(500);
//         account1.withdraw(200);
//         account1.withdraw(1500);
//     }
// }

// import java.util.Scanner;
// import java.util.Arrays;

// public class game{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Arrays to store student details
//         String[] names = new String[80];
//         int[] marks = new int[80];
//         int[] ages = new int[80];

//         // Input student details
//         for (int i = 0; i < 80; i++) {
//             System.out.println("Enter name of student " + (i + 1) + ": ");
//             names[i] = scanner.nextLine();

//             System.out.println("Enter marks of student " + (i + 1) + ": ");
//             marks[i] = scanner.nextInt();

//             System.out.println("Enter age of student " + (i + 1) + ": ");
//             ages[i] = scanner.nextInt();

//             // Consume newline
//             scanner.nextLine();
//         }

//         // Sort students based on marks in ascending order
//         sortStudentsByMarks(names, marks, ages);

//         // Display details of top ten students
//         System.out.println("Top ten students:");
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Marks: " + marks[i]);
//         }

//         scanner.close();
//     }
//     public static void sortStudentsByMarks(String[] names, int[] marks, int[] ages) {
//         for (int i = 0; i < marks.length - 1; i++) {
//             for (int j = 0; j < marks.length - i - 1; j++) {
//                 if (marks[j] > marks[j + 1]) {
//                     // Swap marks
//                     int tempMark = marks[j];
//                     marks[j] = marks[j + 1];
//                     marks[j + 1] = tempMark;

//                     // Swap names
//                     String tempName = names[j];
//                     names[j] = names[j + 1];
//                     names[j + 1] = tempName;

//                     // Swap ages
//                     int tempAge = ages[j];
//                     ages[j] = ages[j + 1];
//                     ages[j + 1] = tempAge;
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// class Inventory {
//     String products[];
//     int quantitie[];

//     Inventory(String products[], int quantitie[]) {
//         this.products = products;
//         this.quantitie = quantitie;
//     }

//     public void addProduct(String productName, int count) {
//         String newProducts[] = new String[products.length + 1];
//         int newQuantities[] = new int[quantitie.length + 1];

//         for (int i = 0; i < products.length; i++) {
//             newProducts[i] = products[i];
//             newQuantities[i] = quantitie[i];
//         }

//         newProducts[products.length] = productName;
//         newQuantities[quantitie.length] = count;

//         products = newProducts;
//         quantitie = newQuantities;
//     }

//     public void update(String productName, int count) {
//         for (int i = 0; i < products.length; i++) {
//             if (products[i].equals(productName)) {
//                 quantitie[i] = count;
//                 break;
//             }
//         }
//     }

//     public void displayInventory() {
//         for (int i = 0; i < products.length; i++) {
//             System.out.println("Product Name: " + products[i] + ", Quantity: " + quantitie[i]);
//         }
//     }
// }

// public class game{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of products:");
//         int c = sc.nextInt();
//         String products[] = new String[c];
//         int quantities[] = new int[c];

//         System.out.println("Enter products and quantities:");
//         for (int i = 0; i < c; i++) {
//             products[i] = sc.next();
//             quantities[i] = sc.nextInt();
//         }

//         Inventory inventory = new Inventory(products, quantities);
//         System.out.println("Initial Inventory:");
//         inventory.displayInventory();

//         System.out.println("Adding a new product:");
//         inventory.addProduct("heamnth", 30);
//         inventory.displayInventory();

//         System.out.println("Updating a product:");
//         inventory.update("Prasanth", 9742);
//         inventory.displayInventory();

//         sc.close();
//     }
// }

// public class game {
//     public static void main(String[] args) {
//         int c;
//         Scanner sc=new Scanner(System.in);
//         c=sc.nextInt();
//         int a[]=new int[c];
//         int b[]=new int[c];
//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<a.length-1;i++){
//             b[i]=a[i]+a[i+1];
//         }
//         b[a.length-1]=a[a.length-1];
//         System.out.println(Arrays.toString(a));
//         System.out.println(Arrays.toString(b));
//         if(c%2==0){
//             int d=c/2;
//             System.out.println("the middle element is:"+b[d-1]);
//         }
//         else{
//             System.out.println("no middle number");
//         }
//         int sum=0;
//         for(int i=0;i<a.length;i++){
//             sum+=b[i];

//         }
//         System.out.println("the sum of the elements is:"+sum);
//     }
// }

// class BankAccount{
//     String name;
//     int accNo;
//     String type;
//     double balance;
//     BankAccount(String name,int accNO,String type){
//         this.name=name;
//         this.accNo=accNo;
//         this.type=type;
//         if(type.equals("savings")){
//             balance=2000;
//         }
//         else{
//             balance=10000;
//         }
//     }
//     public void withdraw(int amount){
//         if(balance>amount){
//             balance-=amount;
//         }
//         else{
//             System.out.println("the minimum balanced error");
//         }
//     } 
//     public void deposit(int amount){
//         balance+=amount;
//     }
//     public double getbalance(){
//         return balance;
//     }
// }

// public class game{

//     public static void main(String[] args) {
//         BankAccount b1=new BankAccount("Prasanth", 123, "savings");

//         b1.deposit(1000);
//         System.out.println(b1.getbalance());
//         b1.withdraw(2000);
//         System.out.println(b1.getbalance());
//     }
// }

// abstract class person{
//     abstract public void insert();
//     public void display(){
//         System.out.println("the enjoy the day");
//     }
// }
// class person1 extends person{
//     @Override
//     public void insert(){
//         System.out.println("the good");
//     }
// }
// class person2 extends person{
//     public void per(){
//         System.out.println("the function");
//     }
//     public void insert(){
//         System.out.println("the brrrr");
//     }
// }
// public class game {
//     public static void main(String[] args) {
//         person1 p1=new person1();
//         p1.insert();
//         p1.display();   
//     }
// }


// public class Main{

//     public static void main(String[] args) {
//         try {
//             String str = "ppk";
//             checkForVowels(str);
//             System.out.println("String contains vowels.");
//         } catch (NoVowelsException e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     public static void checkForVowels(String str) throws NoVowelsException {
//         boolean hasVowels = false;

//         for (char ch : str.toCharArray()) {
//             if (isVowel(ch)) {
//                 hasVowels = true;
//                 break;
//             }
//         }

//         if (!hasVowels) {
//             throw new NoVowelsException("String does not contain any vowels.");
//         }
//     }

//     public static boolean isVowel(char ch) {
//         return "aeiouAEIOU".indexOf(ch) != -1;
//     }
// }

// class NoVowelsException extends Exception {
//     public NoVowelsException(String message) {
//         super(message);
//     }
// }

// class Node{
//      int data;
//      Node link;
// }
// public class Main{
//      Node start=null,end=null;
//      public void addFirst(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                n.link=start;
//                start=n;
//           }
//      }
//      public void addLast(int x){
//           Node n=new Node();
//           n.data=x;
//           if(start==null){
//                start=end=n;
//           }
//           else{
//                end.link=n;
//                end=n;
//           }
//      }
//      // public void addPoistion(int x,int p){
//      //      int k=1;
//      //      Node n=new Node();
//      //      n.data=x;
//      //      if(p==0){
//      //           addFirst(x);
//      //           return;
//      //      }
//      //      Node temp=start;
//      //      while (temp!=null && k<p){
//      //           temp=temp.link;
//      //           k++;
//      //      }
//      //      if(temp==null){
//      //           System.out.println("The Element cannot be Inserted..");
//      //           return;
//      //      }
//      //      n.link=temp.link;
//      //      temp.link=n;
//      //      if(n.link!=null){
//      //           end=n;
//      //      }
//      // }
//      // public void delFirst(){
//      //      if(start==null){
//      //           System.out.println("The List is Empty");
//      //      }
//      //      else{
//      //           start=start.link;
//      //      }
//      // }
//      // public void delLast(){
//      //      if(start==null){
//      //           System.out.println("The List is Empty");
//      //      }
//      //      else{
//      //           Node temp=start;
//      //           while (temp.link.link!=null){
//      //                temp=temp.link;
//      //           }
//      //           temp.link=null;
//      //      }
//      // }
//      // public void delanypositon(int p){
//      //      if(p<0){
//      //           System.out.println("The Position must be Greater than Zero.");
//      //           return;
//      //      }
//      //      if(p==0){
//      //           delFirst();
//      //           return;
//      //      }
//      //      Node temp=start;
//      //      Node prev=null;
//      //      int k=0;
//      //      while (temp!=null && k<p){
//      //           prev=temp;
//      //           temp=temp.link;
//      //           k++;
//      //      }
//      //      prev.link=temp.link;
//      // }
//      // public void reverse(){
//      //      Node current=start;
//      //      Node prev=null,Next=null;
//      //      while (current!=null){
//      //           Next=current.link;
//      //           current.link=prev;
//      //           prev=current;
//      //           current=Next;
//      //      }
//      //      start=prev;
//      // }
//      // public void Concatenate(Main a){
//      //      if(start==null){
//      //           start=a.start;
//      //           end=a.end;
//      //      }
//      //      else{
//      //           end.link=a.start;
//      //           end=a.end;
//      //      }
//      // }
//      public void common(Node a, Node b) {
//           System.out.println("Common elements:");
//           while (a != null && b != null) {
//               if (a.data == b.data) {
//                   System.out.println(a.data);
//                   a = a.link;
//                   b = b.link;
//               } else if (a.data < b.data) {
//                   a = a.link;
//               } else {
//                   b = b.link;
//               }
//           }
//      }
//      public void display(){
//           Node n=start;
//           while (n!=null){
//                System.out.println(n.data);
//                n=n.link;
//           }
//      }
//      public static void main(String[] args) {
//           Main l=new Main();
//           l.addFirst(1);
//           l.addFirst(2);
//           l.addFirst(3);
//           l.addLast(4);
//           // l.delanypositon(0);
//           // l.reverse();
//           Main l2=new Main();
//           l2.addFirst(2);
//           l2.addLast(34);
//           l2.addLast(45);
//           // l.Concatenate(l2);
//           // l.display();
//           l.common(l.start, l2.start);
//      }
// }

