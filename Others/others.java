// bank using constructor
// import java.util.*;
// class bank{
//     int amount;
//     String name;
//     String company;
//     int options;
//     int tell;
//     int tell1;
//     bank(int amount,String name,String company){
//         this.amount=amount;
//         this.name=name;
//         this.company=company;
//         System.out.println("the"+company+"bank");
//         System.out.println("avaliable amount:"+amount);
//     }
//     public void side(){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter 0 for withdrawn and 1 for deposit");
//         int options=sc.nextInt();
//         if(options==1){
//             System.out.print("enter amount to deposit:");
//             int tell=sc.nextInt();
//             amount+=tell;
//             System.out.println("the avaliable balance"+amount);
//         }
//         else if(options==0){
//             System.out.print("enter amount to withdrawn:");
//             int tell1=sc.nextInt();
//             amount-=tell1;
//             System.out.println("the avaliable balance"+amount);
//         }

//     }
// }
// public class others{
//     public static void main(String[] args) {
//         bank b1=new bank(10000,"ppk","indian");
//         b1.side();
//     }
// }

// bank  not using constructor

// import java.util.Arrays;
// import java.util.Scanner;

// class bankaccount{
//     private  double amount;
//     private String name;
//     private String company;
//     private double deposit;
//     double withdraw;

//     public double getAmount() {
//         return amount;
//     }
//     public void setAmount(double g) {
//         this.amount = g;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getCompany() {
//         return company;
//     }
//     public void setCompany(String company) {
//         this.company = company;
//     }
//     public double getDeposit() {
//         return amount;
//     }
//     public void setDeposit(double deposit) {
//         amount+=deposit;
//     }
//     public void setWithdraw(double withdraw) {
//         if(amount>withdraw){
//             amount-=withdraw;
//             System.out.println("the avaliable balance:"+amount);
//         }
//         else{
//             System.out.println("insufficent balance");
//         }
//     }  
// }
// public class others {
//     public static void main(String[] args) {
//         bankaccount b1=new bankaccount();
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter no of transcrations: ");
//         int a=sc.nextInt();
//         // b1.setAmount(10000);
//         // b1.getAmount();
//         // b1.setName("ppk");
//         // System.out.println("the name is :"+b1.getName());
//         // b1.setCompany("indian");
//         // System.out.println("the company is:"+b1.getCompany());        // take 1 and more than 1 input 
//         // b1.setDeposit(200);
//         // System.out.println("the balance is:"+b1.getDeposit());
//         // b1.setWithdraw(900);
//         double balance[]=new double[a];
//         for(int i=0;i<a;i++){
//             balance[i]=sc.nextDouble();
//         }
//         System.out.println("enter names :");
//         int e=sc.nextInt();
//         String b[]=new String[e];
//         for(int i=0;i<e;i++){
//             b[i]=sc.next();
//         }
//         System.out.println("enter 0 for withdraw and 1 for desposit");
//         int c=sc.nextInt();
//         if(c==0){
//             for(int i=0;i<a;i++){
//                 System.out.println("enter withdrawn amount:");
                
//                 double g=balance[i];
//                 b1.setAmount(g);
//                 double withdraw=sc.nextDouble();
//                 b1.setWithdraw(withdraw);
//             }
//         }
//         else{
//             for(int i=0;i<a;i++){
//                 System.out.println("enter deposit amount:");
                
//                 double g=balance[i];
//                 b1.setAmount(g);
//                 double deposit=sc.nextDouble();
//                 b1.setDeposit(deposit);
//                 System.out.println(b1.getDeposit());
//             }

//         }

//     }
// }


// import java.util.*;
// public class others {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter a number");
//         String a=sc.nextLine();
//         System.out.println("name to be replaced:");
//         String b=sc.nextLine();
//         System.out.println("name to replaced:");
//         String c=sc.nextLine();
//         System.out.println(a.replace(b,c));

        
//     }
// }

// public class others{
//     public static void main(String[] args) {
//         String a = "Hello, World!";
//         String b = reverseString(a);
//         System.out.println("the given String:  " + a);
//         System.out.println("reversed String: " + b);
//     }
    
//     public static String reverseString(String str) {
//         char[] chars = str .toCharArray();
//         int i = 0;
//         int j = chars.length-1;
        
//         while(i<j){
//             char temp=chars[i];
//             chars[i]=chars[j];
//             chars[j]=temp;
//             i++;
//             j--;

//         }
//         String d=new String(chars);
//         return d;
//     }
// }

// overriding 

// class Animal{
//     void sound(){
//         System.out.println("tik tik tik");
//     }
// }
// class horse extends Animal{
//     void sound(){
//         System.out.println("heee heee heee");
//     }
// }
// public class others {
//     public static void main(String[] args) {
//         Animal a=new horse();
//         Animal b=new Animal();
//         a.sound();
//         b.sound();
        
//     }
// }

// import java.util.*;
// class playerecord{
//     private String name;
//     private int age;
//     private int salary;
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public int getSalary() {
//         return salary;
//     }
//     public void setSalary(int salary) {
//         this.salary = salary;
//     }
//     public String high(playerecord p1,playerecord p2,playerecord p3,playerecord p4){
//         int c1=p1.getSalary();
//         int c2=p2.getSalary();
//         int c3=p3.getSalary();
//         int c4=p4.getSalary();
//         int a[]={c1,c2,c3,c4};
//         Arrays.sort(a);
//         System.out.println(Arrays.toString(a));
//         if(a[a.length-1]==c1){
//             return p1.getName();
//         }
//         else if(a[a.length-1]==c2){
//             return p2.getName();
//         }
//         else if(a[a.length-1]==c2){
//             return p3.getName();
//         }
//         else{
//             return p4.getName();
//         }
//     }
    
// }
// public class others {
//     public static void main(String[] args) {
//        playerecord p1=new playerecord();
//        playerecord p2=new playerecord();
//        playerecord p3=new playerecord();
//        playerecord p4=new playerecord();
//        p1.setName("rohan");
//        p2.setName("antony");
//        p3.setName("jimmy");
//        p4.setName("rahul");
//        p1.setAge(22);
//        p2.setAge(23);
//        p3.setAge(24);
//        p4.setAge(25);
//        p1.setSalary(55000);
//        p2.setSalary(6500);
//        p3.setSalary(70000);
//        p4.setSalary(20000);
//        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getSalary());
//        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getSalary());
//        System.out.println(p3.getName()+" "+p3.getAge()+" "+p3.getSalary());
//        System.out.println(p4.getName()+" "+p4.getAge()+" "+p4.getSalary());
//        System.out.println("the highest paid palyer:"+p1.high(p1,p2,p3,p4));
        
        
//     }
// }

// class student{
//     String name;
//     int age;
//     String branch;
//     public void insert(String a,int b,String c){
//         name=a;
//         age=b;
//         branch=c;
//     }
//     public void display(){
//         System.out.println(name+" "+age+" "+branch);
//     }
// }

// public class others {
//     public static void main(String[] args) {
//         student s1=new student();
//         student s2=new student();
//         student s3=new student();
//         System.out.println("name"+" "+"age"+" "+"branch");
//         s1.insert("santhosh",23,"CSE");
//         s2.insert("ppk",2,"ME");
//         s3.insert("subbu",32,"ECE");
//         s1.display();
//         s2.display();
//         s3.display();
//     } 
// }

// import java.util.*;
// public class others {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter m dimension");
//         int a=sc.nextInt();
//         System.out.println("enter n:");
//         int b=sc.nextInt();
//         int c[][]=new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 c[i][j]=sc.nextInt();

//             }
//         }
//         System.out.println(Arrays.deepToString(c));

//     }
// }


// import java.util.Scanner;
// class Student{
//     private String name;
//     private int age;
//     Student(String name, int age) {
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
// public class others{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a=scanner.nextInt();
//         Student[] students = new Student[a];
//         for (int i = 0; i < students.length; i++) {
//             System.out.println("Enter student's name:");
//             String name = scanner.next();
//             System.out.println("Enter student's age:");
//             int age = scanner.nextInt();
//             students[i] = new Student(name, age);
//             // System.out.print("if you need tell 1 or 0");
//             // int d=scanner.nextInt();
//             // if(d==0){
        
//             //     break;
//             // }
//             // else{
//             //     a+=1;
//             // }
//         }
//         for (Student student : students) {
//             System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
//         }
//         scanner.close();
//     }
// }

// class Calculator
// {
//     public int add(int n1,int n2)
//     {
//         int r = n1+n2;
//         return r;
//     }
// }
// public class others
// {
//     public static void main(String[] args) {
        
//         Calculator calc = new Calculator();
//         int result =calc.add(7,8);
//         System.out.println(result);
//     }
// }

// import java.util.Scanner;

// class cal{
//     private String name;
//     private int age;
//     public cal(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     public String getName(){
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// public class others{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         cal sw[]=new cal[a];

//         for(int i=0;i<a;i++){
//             String name=sc.next();
//             int age=sc.nextInt();
//             sw[i]=new cal(name,age);
//         }
//         for(cal ab:sw){
//             System.out.println(ab.getName()+" "+ab.getAge());

//         }
//     }
// }

// import java.util.*;
// class subbu{
//     String name="";
//     String age="";
//     String c; // Player name
//     int d;    // Player age
//     Scanner sc = new Scanner(System.in);

//     public void players() {
//         System.out.println("Do you want to enter the players?");
//         String a = sc.next();
//         while (a.equals("yes")) {
//             System.out.println("Enter player name: ");
//             c = sc.next();  // Assigning the input to class-level variable
//             name=name+c+" ";
//             System.out.println("Enter the player age: ");
//             d = sc.nextInt();  // Assigning the input to class-level variable
//             age=age+d+" ";
//             System.out.println("Player added.");
//             System.out.println("Do you want to enter another player? (yes/no): ");
//             a = sc.next();
//         }
//         String def[]=name.split(" ");
//         String fu[]=age.split(" ");
//         for(int i=0;i<def.length;i++){
//             System.out.println(def[i]+" "+fu[i]);
//         }
//     }
// }

// public class others{
//     public static void main(String[] args) {
//         subbu obj = new subbu();
//         obj.players();
//     }
// }

// import java.util.Scanner;
// class cricketPlayer {
//     private int playerId;
//     private String name;
//     private int[] runsScored = new int[10];
//     private int[] wicketsTaken = new int[10];
//     private static int[] totalTeamScore = new int[10];

//     public int getPlayerId() {
//         return playerId;
//     }

//     public void setPlayerId(int playerId) {
//         this.playerId = playerId;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int[] getRunsScored() {
//         return runsScored;
//     }

//     public void setRunsScored(int[] runsScored) {
//         this.runsScored = runsScored;
//     }

//     public int[] getWicketsTaken() {
//         return wicketsTaken;
//     }

//     public void setWicketsTaken(int[] wicketsTaken) {
//         this.wicketsTaken = wicketsTaken;
//     }

//     public static int[] getTotalTeamScore() {
//         return totalTeamScore;
//     }

//     public static void setTotalTeamScore(int[] totalTeamScore) {
//         cricketPlayer.totalTeamScore = totalTeamScore;
//     }

//     public double calculateAverageRuns() {
//         int sum = 0;
//         for (int run : runsScored) {
//             sum += run;
//         }
//         return sum / 10.0;
//     }

//     public double calculateAverageWickets() {
//         int sum = 0;
//         for (int wicket : wicketsTaken) {
//             sum += wicket;
//         }
//         return sum / 10.0;
//     }
// }

// public class others{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         cricketPlayer[] players = new cricketPlayer[11];

//         for (int i = 0; i < 11; i++) {
//             players[i] = new cricketPlayer();

//             System.out.println("\nEnter details for Player " + (i + 1) + ":");
//             System.out.print("Player ID: ");
//             int playerId = scanner.nextInt();
//             players[i].setPlayerId(playerId);

//             System.out.print("Player Name: ");
//             String name = scanner.next();
//             players[i].setName(name);

//             int[] runsScored = new int[10];
//             System.out.print("Enter runs scored in last 10 matches: ");
//             for (int j = 0; j < 10; j++) {
//                 runsScored[j] = scanner.nextInt();
//             }
//             players[i].setRunsScored(runsScored);

//             int[] wicketsTaken = new int[10];
//             System.out.print("Enter wickets taken in last 10 matches: ");
//             for (int j = 0; j < 10; j++) {
//                 wicketsTaken[j] = scanner.nextInt();
//             }
//             players[i].setWicketsTaken(wicketsTaken);
//         }

//         for (cricketPlayer player : players) {
//             System.out.println("\nPlayer Name: " + player.getName());
//             System.out.println("Average Runs Scored: " + player.calculateAverageRuns());
//             System.out.println("Average Wickets Taken: " + player.calculateAverageWickets());
//         }

//         scanner.close();
//     }
// }

// class bank{
//     static int count=0;
//     double bal;
//     bank(double v){
//         bal=v;
//         count++;
//     }
//     public double getbal(){
//         return bal;
//     }
//     public static void showcount(){
//         System.out.println(count);
//     }
// }
// public class others {

//     public static void main(String[] args) {
//         bank b1=new bank(12000.0);
//         bank b2=new bank(120);
//         bank b3=new bank(1000.0);
//         System.out.println(b1.getbal());
//         System.out.println(b2.getbal());
//         System.out.println(b3.getbal());
//         bank.showcount();
        
//     }
// }

// import java.util.Scanner;

// class Employee{
//     int id;
//     String job;
//     double bsal;
//     double da;
//     double ta;
//     double hra;
//     double pf;
//     double gsal;
//     double nsal;

//     public void acceptDetails(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter id:");
//         id = sc.nextInt();
//         System.out.println("Enter job:");
//         job = sc.next();
//         System.out.println("Enter salary:");
//         bsal = sc.nextDouble();
//     }

//     public void calculateSalary() {
//         da = bsal * 10 / 100.0;
//         ta = bsal * 5 / 100.0;
//         hra = bsal * 20 / 100.0;
//         gsal = bsal + da + ta + hra;
//         pf = gsal * 12 / 100.0;
//         nsal = gsal - pf;
//     }

//     public void printPayslip() {
//         System.out.println("Employee ID: " + id);
//         System.out.println("Job: " + job);
//         System.out.println("Salary: " + bsal);
//         System.out.println("DA: " + da);
//         System.out.println("TA: " + ta);
//         System.out.println("HRA: " + hra);
//         System.out.println("Gross Salary: " + gsal);
//         System.out.println("PF: " + pf);
//         System.out.println("Net Salary: " + nsal);
//     }
// }

// public class others{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number of employees:");
//         int n = scanner.nextInt();
//         Employee[] employees = new Employee[n];

//         for (int i = 0; i < n; i++) {
//             employees[i] = new Employee();
//             employees[i].acceptDetails();
//             employees[i].calculateSalary();
//         }

//         for (Employee emp : employees) {
//             emp.printPayslip();
//         }
//     }
// }
// // 

// public class others {

//     public static void main(String[] args) {
        
//         for(int i=2;i<100;i++){
//             int c=0;
//             for(int j=2;j<=i;j++){
//                 if(i%j==0){
//                     c+=1;
//                 }
//             }
//             if(c==1){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// class vechile{
//     String model;
//     int year;
//     vechile(String model,int year){
//         this.model=model;
//         this.year=year;
//     }
//     public void display(){
//         System.out.println("model: "+model+",  "+"year:  "+year);
//     }

// }
// class car extends vechile{
//     int noofdoor;
//     String fuel;
//     car(int noofdoor,String fuel,String model,int year){
//         super(model,year);
//         this.noofdoor=noofdoor;
//         this.fuel=fuel;
//     }
//     public void display1(){
//         super.display();
//         System.out.println("no of doors:"+noofdoor);
//         System.out.println("fuel:"+fuel);
//     }

// }
// public class others{
//     public static void main(String[] args) {
//         car c1=new car(4,"petol","bmw",2024);
//         c1.display1();
//     }
// }

// import java.util.*;
// public class others {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int b=sc.nextInt();
//         int a[]=new int[b];
//         int add1[]=new int[b+1];
//        int remove2[]=new int[b-1];
//         int [] arr1= new int[b+1];
//         int [] arr2=new int[b-1];
//         int c[]=new int[b];
//         for(int i=0;i<b;i++){
//             a[i]=sc.nextInt();
//             System.out.print("enter no of quantities:");
//             c[i]=sc.nextInt();
//         }
//         System.out.print("enter A for add and R for remove");
//             String d=sc.next();
//         while(d.equals("A")|d.equals("R")){
//             if(d.equals("A")){
//                 System.out.println("enter how many quantities:");
//                 int F=sc.nextInt();
//                 System.out.println("enter id's:");
//                 int E=sc.nextInt();
//                 for(int i=0;i<b;i++){
//                     arr1[i]=a[i];
//                     arr1[b]=E;
//                     add1[i]=c[i];
//                     add1[b]=F;
                    
//                 }
//                 System.out.println(Arrays.toString(arr1));
//                 System.out.println(Arrays.toString(add1));
    
//             }
//             else if(d.equals("R")){
//                 for(int i=0;i<b-1;i++){
//                     arr2[i]=a[i];
//                     remove2[i]=c[i];
//                 }
//                 System.out.println(Arrays.toString(arr2));
//                 System.out.println(Arrays.toString(remove2));
//             }
//             System.out.print("enter A for add and R for remove");
//             d=sc.next();
//         }
       
//     }
// }



// import java.util.*;
// public class others {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int b=sc.nextInt();
//         double a[]=new double[b];
//         double sum=0.0;
//         int count=0;
//         for(int i=0;i<b;i++){
//             a[i]=sc.nextDouble();
//             sum+=a[i];
//             count+=1;
//         }
//         double avg=sum/count;
//         double  max=a[0];
//         double  min=a[0];
//         for(int i=0;i<b;i++){
//             if(a[i]>=max){
//                 max=a[i];
//             }
//         }
//         for(int i=0;i<b;i++){
//             if(a[i]<=min){
//                 min=a[i];
//             }
//         }
//         System.out.println(avg+" ,"+min+" ,"+max);
//     }
// }

/**
 * others
 */
// public class others {

//     public static void main(String[] args) {
//         int x=0;
//         int y=5;
//         while(x<y){
//             System.out.println("HEllo");
//             x++;
//         }
       
//     }
// }

