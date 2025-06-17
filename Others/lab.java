// public class lab {
//     public static void main(String[] args) {
//         int regno=9742;
//         String name="Prasanth";
//         long phonenumber=9398071698l;
//         System.out.println(regno);
//         System.out.println(name);
//         System.out.println(phonenumber);

//     }
    
// }

// import java.util.*;
// public class lab {
//     public static void main(String[] args) {
//         int a[][]=new int[3][3];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 a[i][j]=sc.nextInt();

//             }
//         }
//         System.out.print(Arrays.deepToString(a));

//     }

    
// }

// import java.util.*;
// public class lab {

//     public static void main(String[] args) {
//         float a[]=new float[5];
//         Scanner sc =new Scanner(System.in);
//         for(int i=0;i<5;i++){
//             a[i]=sc.nextInt();
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }

// import java.util.*;
// public class lab {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a[]={1,7,8,5,4,3};

//         float count=0;
//         for(int i=0;i<a.length;i++){
//             count+=a[i];
//         }
//         float avg=count/a.length;
//         System.out.println(avg);
//     }

// }

// import java.util.*;
// public class lab {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter r:");
//         int r=sc.nextInt();
//         System.out.print("enter col:");
//         int col=sc.nextInt();
//         int a[][]=new int[r][col];
//         int b[][]=new int[r][col];
//         int product[][]=new int[r][col];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<col;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("matrix 1");
//         System.out.println(Arrays.deepToString(a));
//         for(int i=0;i<r;i++){
//             for(int j=0;j<col;j++){
//                 b[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("martrix 2");
//         System.out.println(Arrays.deepToString(b));
//         int sum[][]=new int[r][col];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<col;j++){
//                 sum[i][j]=a[i][j]+b[i][j];
//             }
//         }
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<b[0].length;j++){
//                 for(int k=0;k<b.length;k++){
//                     product[i][j]+=a[i][k]*b[k][j];
//                 }
//             }
//         }
//         System.out.println(Arrays.deepToString(product));

//     }
// }

// import java.util.*;
// public class lab {
//     public static void main(String[] args) {
//         int a[]={2,3,4,5,6,1};
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length-i-1;j++){
//             int temp=a[j];
//             a[j]=a[(a.length-1)-j];
//             a[(a.length-1)-j]=temp;
//         }

//     }
//     System.out.print(Arrays.toString(a));
//     }
//     }

// class cylinder{
//     private double  radius;
//     private int heigth;
//     cylinder(){
//     System.out.println("enter the radius and the height");
//     }
//     public void setradius(double a){
//         radius=a;
//     }
//     public double getradius(){
//         return radius;
//     }
//     public void setheigth(int b){
//         heigth=b;
//     }
//     public double getheigth(){
//         return heigth;
//     }
//     public double surfacevoulme(){
//         double surfacevolume=2*Math.PI*radius*(radius+heigth);
//         double volumne=Math.PI*Math.PI*radius*heigth;
//         return volumne;
//         //return surfacevolume;
//     }
// }
// public class lab {

//     public static void main(String[] args) {
//         cylinder c1=new cylinder();
//         c1.setradius(5);
//         c1.setheigth(10);
//         System.out.println(c1.getradius());
//         System.out.println(c1.getheigth());
//         System.out.println(c1.surfacevoulme());
//     }
// }

// import java.util.Scanner;

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter length");
//         int b=sc.nextInt();
//         int a[]=new int[b];
//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }
//         int max=a[0];
//         for(int i=0;i<a.length;i++){
//             if (a[i]>=max){
//                 max=a[i];
//             }
//         }
//         System.out.println(max);
        
//     }
// }

// import java.util.*;
// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=1;i<=a;i++){
//             if(i%2==0){
//                 System.out.println("even:"+i*i*i);
//             }
//             else{
//                 System.out.println("Odd:"+i*i*i);
//             }
//         }
//     }
    
// }


// public class lab {
//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         int n=5;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=0;i<=5;i++){
//             int c=a+b;
//             a=b;
//             b=c;
//             System.out.println(c);
//         }
//     }
// }

// import java.util.Scanner;

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter length");
//         int b=sc.nextInt();
//         int sum=0;
//         int a[]=new int[b];
//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//             sum+=a[i];
//         }
//         System.out.println(sum);
        
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         for(int i=2;i<=a;i++){
//             int count=0;
//             for(int j=1;j<=i;j++){
//                 if(i%j==0){
//                    count+=1;
//                 }
//             }
//             if(count==2){
//                 System.out.println(i+"prime");
//             }
//             else{
//                 System.out.println(i+"NOT");
//             }
//         }
        
        
//     }
// }

// import java.util.Arrays;
// public class lab {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,3,4,4,6,6,6};
//         int max=arr[0];
//         int maxi=0;
//         int mini=arr[0];
//         int Secondmini=0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 maxi = max;
//                 max = arr[i];
//             } else if (arr[i] > maxi && arr[i] != max) {
//                 maxi = arr[i];
//             }
//             if (arr[i] < mini) {
//                 Secondmini=mini;
//                 mini= arr[i];
//             } else if (arr[i] < Secondmini && arr[i] != mini) {
//                 Secondmini= arr[i];
//             }
            
//         }
       
//         System.out.println(Secondmini);
//         System.out.println(maxi);
//         System.out.println(Arrays.toString(arr));

//     }
// }

// import java.util.Arrays;
// public class lab{
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 3, 4, 4, 6, 6, 6};
//         int max = Integer.MIN_VALUE;
//         int maxi = Integer.MIN_VALUE;
//         int mini = Integer.MAX_VALUE;
//         int secondMini = Integer.MAX_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 maxi = max;
//                 max = arr[i];
//             } else if (arr[i] > maxi && arr[i] != max) {
//                 maxi = arr[i];
//             }

//             if (arr[i] < mini) {
//                 secondMini = mini;
//                 mini = arr[i];
//             } else if (arr[i] < secondMini && arr[i] != mini) {
//                 secondMini = arr[i];
//             }
//         }

//         System.out.println("Second minimum: " + secondMini);
//         System.out.println("Maximum: " + max);
//         System.out.println("Second maximum: " + maxi);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// import java.util.Arrays;
// public class lab {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,3,4,4,6,6,6};
//         int max=arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             } 
//         }
//         System.out.println(max);

//     }
// }


// import java.util.Scanner;
// public class lab {
//     public static boolean isprime(int n){
//         if(n<=1){
//             return false;
//         }else{
//             for(int i=2;i<n;i++){
//                 if(n%i==0){
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }
//     public static boolean isSumOfTwoPrimes(int num){
//         for(int i=2;i<num/2;i++){
//             if(isprime(i)&& isprime(num-i)){
//                 System.out.println(i+" "+(num-i));
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number:");
//         int a=sc.nextInt();
//         if(isSumOfTwoPrimes(a)){
//             System.out.println(a+"is the sum of the two prime");
//         }
//         else{
//             System.out.println(a+"NOT prime");
//         }
//     }
// }


// public class lab {
//     public static void main(String[] args) {
//         int n=1634;
//         int length=4;
//         int a=n;
//         int sum=0;
//         for(int i=0;i<length;i++){
//             int p=n%10;
//             sum+=Math.pow(p, length);
//             n=n/10;
//         }
//         System.out.println(sum);
//         if(sum==a){
//             System.out.println("Is a Armstrong number");
//         }else{
//             System.out.println("NOT a Armstrong number");
//         }
//     }
// }

// import java.util.Scanner;
// public class lab {
//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=0;i<n-2;i++){
//             int c=a+b;
//             a=b;
//             b=c;
//             System.out.println(c);
//         }    
//     }
// }




// import java.util.Scanner;

// public class lab{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
        
//         int greatestDigit = Integer.MIN_VALUE;
//         int smallestDigit = Integer.MAX_VALUE;

//         // Convert number to string to iterate over its digits
//         String numberString = Integer.toString(number);
//         for (int i = 0; i < numberString.length(); i++) {
//             int digit = Character.getNumericValue(numberString.charAt(i));
//             System.out.println(digit);
//             greatestDigit = Math.max(greatestDigit, digit);
//             smallestDigit = Math.min(smallestDigit, digit);
//         }
        

//         int difference = greatestDigit - smallestDigit;
        
//         System.out.println("Greatest Digit: " + greatestDigit);
//         System.out.println("Smallest Digit: " + smallestDigit);
//         System.out.println("Difference Between Greatest and Smallest Digit: " + difference);
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         int b=1124;
//         int c=b;
//         int d;
//         int length=4;
//         int sum=0;
//         int prod=1;
//         for(int i=0;i<length;i++){
//             d=b%10;
//             sum+=d;
//             prod*=d;
//             b=b/10;
//         }
//         System.out.println(sum+"the sum of the number");
//         System.out.println(prod+"the prod of the number");
//         if(prod==sum){
//             System.out.println("spy number");
//         }
//         else{
//             System.out.println("Not a spy number");
//         }
        
//     }
// }

// import java.util.Scanner;
// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter number to search:");
//         int b=sc.nextInt();
//         int c=0;
//         int a[]={1,23,45,67,8,9};
//         for(int i=0;i<a.length;i++){
//             if(b==a[i]){
//                 c+=1;
//             }
//         }
//         if (c==1) {
//             System.out.println("found");
            
//         }
//         else{
//             System.out.println("Not found");
//         }
        
//     }
// }

// import java.util.Arrays;
// public class lab {
//     public static void main(String[] args) {
//         int a[]={1,23,45,65,2,34};
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }

// import java.util.Arrays;
// public class lab{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,3,4,4,6,6,6};
//         int max=arr[0];
//         int maxi=0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 maxi = max;
//                 max = arr[i];
//             } else if (arr[i] > maxi && arr[i] != max) {
//                 maxi = arr[i];
//             }
//         }
//         System.out.println(maxi);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// import java.util.Arrays;
// public class lab {
//     public static void main(String[] args) {
//         int a[]={1,23,45,65,2,34};
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length-i-1;j++){
//                 if(a[j]>a[j+1]){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(a));
//         int maxiproduct=a[a.length-1]*a[a.length-2];
//         System.out.println("Pair is ("+a[a.length-1]+","+ a[a.length-2]+")"+", Maximum Product:"+ maxiproduct);
//     }
// }


// the volumne of cube/cuboid
// class volumne{
//     int length;
//     int breadth;
//     int height;
//     int volumne1;
//     int volumne2;
//     int side;
//     volumne(int a){
//         side=a;
//         volumne1=side*side*side;
//         System.out.println("the volumne of a cube:"+volumne1);
//     }
//     volumne(int a,int b,int c){
//         length=a;
//         breadth=b;
//         height=c;
//         volumne2=length*breadth*height;
//         System.out.println("the volumne of a cuboid:"+volumne2);
//     }


// }
// public class lab {
//     public static void main(String[] args) {
//         volumne v1=new volumne(10);
//         volumne v2=new volumne(10, 8, 6);
//     }
// }

// labs program.

// import java.util.Scanner;
// public class lab {
//     public static void main(String[] args) {
//         int vowel=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter name:");
//         String name=sc.next().toLowerCase();
//         for(int i=0;i<name.length();i++){
//              char ch=name.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 vowel+=1;
//             }
            
//         }
//         if(vowel==0){
//             System.out.println("vowel is  not present");
//         }
//         else{
//             System.out.println("vowel in present");
//         }
//     }
// }

// import java.util.*;
// public class lab{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter number:");
//         int a =sc.nextInt();
//         for(int i=0;i<a;i++){
//             System.out.println(fibanooci(i)+" ");
//         }
//     }
//     public static int fibanooci(int n){
//         if(n<=1){
//             return n;
//         }
//         else{
//             return fibanooci(n-1)+fibanooci(n-2);
//         }
//     }
// }



// import java.util.*;
// public class lab {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter:");
//         String a=sc.next();
//         int p=0;
//         int n=a.length();
//         for(int i=0;i<n/2;i++){
//             if(a.charAt(i)==a.charAt(n-i-1)){
//                 p+=1;
//             }
//         }
//         if((n/2)==p){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }

//     }
// }


// public class lab {
//     public static void main(String[] args) {
//         String a="p ra s a n t h    k umar";
//         String result = a.replaceAll(" ", "");
//         System.out.println("the String after removing spaces:"+result);
        
//     }
// }


// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         String b=sc.next();         // using indexof we can find
//         if(a.contains(b)){
//             System.out.println("subString is found");
//         }
//         else{
//             System.out.println("NOT found");
//         }
//     }
// }


// public class lab{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         String b=sc.next();
//         if(a.contains(b)){
//             System.out.println("found");
//         }
//         else{
//             System.out.println("Not found");
//         }  
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter:");
//         String b=sc.nextLine();
//         System.out.print("the upper or lower:");
//         String c=sc.next();
//         if(c.equals("upper")){
//             System.out.print(b.toUpperCase());
//         }
//         else if(c.equals("lower"))
//         {
//             System.out.println(b.toLowerCase());
//         }
//         else{
//             System.out.println(b);
//         }
//     }
// }


// public class lab{
//     public static void main(String[] args) {
//         String[] names = {"Alice", "Bob","Alice", "David", "Bob"};
//         String[] duplicateNames = new String[names.length]; 
        
//         int duplicateCount = 0;

//         for (int i = 0; i < names.length - 1; i++) {
//             for (int j = i + 1; j < names.length; j++) {
//                 if (names[i].equals(names[j])) {
//                     int k;
//                     for (k = 0; k < duplicateCount; k++) {
//                         if (names[i].equals(duplicateNames[k])) {
//                             break;
//                         }
//                     }
//                     if (k == duplicateCount) {
//                         duplicateNames[duplicateCount++] = names[i];
//                     }
//                     break;
//                 }
//             }
//         }

//         System.out.print("Duplicate names: ");
//         for (int i = 0; i < duplicateCount; i++) {
//             System.out.print(duplicateNames[i] + " ");
//         }
//     }
// }

// import java.lang.Math;
// class Shape {
//      public double calculateArea() {
//         return 0.0;
//     }
//     double radius;
//     double length;
//     double breadth;
//     public double calculatePerimeter() {
//         return 0.0;
//     }
// }
// class Circle extends Shape {
//     public Circle(double radius) {
//         this.radius=radius;
//     }
//     @Override
//     public double calculateArea() {
//         return Math.PI * radius* radius;
//     }@Override
//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }
// class Rectangle extends Shape { public Rectangle(double length, double breadth) {
//         this.length=length;
//         this.breadth=breadth;
//         }
//         @Override
//     public double calculateArea() {
//         return length * breadth;
//     }@Override
//     public double calculatePerimeter() {
//         return 2 * (length + breadth);
//     }
// }
// public class lab{
//     public static void main(String[] args) {
//         Circle circle = new Circle(5);
//         Rectangle rectangle = new Rectangle(4, 6);
//         System.out.println("Circle:");
//         System.out.println("Area: " + circle.calculateArea());
//         System.out.println("Perimeter: " + circle.calculatePerimeter());

//         System.out.println("\nRectangle:");
//         System.out.println("Area: " + rectangle.calculateArea());
//         System.out.println("Perimeter: " + rectangle.calculatePerimeter());
//     }
// }

// 2Q)
// import java.util.*;
//  class employee{
//     String name;
//     int year;
//     int salary;
//     String Address;
//     int a;
  

// }
// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         String b[]=new String[a];
//         int c[]=new int[a];
//         int d[]=new int[a];
//         String e[]=new String[a];
//         for(int i=0;i<a;i++){
//             b[i]=sc.next();
//         }
//         for(int i=0;i<a;i++){
//             c[i]=sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             d[i]=sc.nextInt();
//         }
//         for(int i=0;i<a;i++){
//             e[i]=sc.next();
//         }
//         System.out.println("name"+" "+"year"+" "+"salary"+"k"+" "+"Address");
//         for(int i=0;i<a;i++){
//             System.out.println(b[i]+" "+c[i]+" "+d[i]+" "+e[i]);
//         }
//     }    
// }

// 2Q)
// class Employee {
//     String name;
//     int yearOfJoining;
//     String salary;
//     String address;
//     public Employee(String name, int yearOfJoining, String salary, String address) {
//         this.name = name;
//         this.yearOfJoining = yearOfJoining;
//         this.salary = salary;
//         this.address = address;
//     }
//     public void display() {
//         System.out.println( name+ yearOfJoining+ salary+address);
//     }
// }

// public class lab{
//     public static void main(String[] args) {
//         Employee employee1 = new Employee("Robert", 1994, "100K", "Chennai");
//         Employee employee2 = new Employee("Sam", 2000, "80K", "Hyderabad");
//         Employee employee3 = new Employee("John", 1999, "70K", "Mumbai");
//         System.out.println("Name+Yearofjoining+Salary+Address");
//         employee1.display();
//         employee2.display();
//         employee3.display();
//     }
// }

// 3Q)

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
//     public String getName() {
//         return name;
//     }
//     public String getCourse() {
//         return course;
//     }
//     public int getYear() {
//         return year;
//     }
//     public void  display(){
//         System.out.println("Roll Number: " + rollno);
//         System.out.println("Name: " + name);
//         System.out.println("Course: " + course);
//         System.out.println("Year of Study: " + year);
//         System.out.println();
 //   }


//}
// public class lab {
//     public static void main(String[] args) {
//         student[] s1=new student[2];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<2;i++){
//             String na=sc.next();
//             String co=sc.next();
//             int ro=sc.nextInt();
//             s1[i]= new student(na,co,ro);
//         }
//         for(student s2:s1){
//             s2.display();
//         }
//     }
// }


// 4Q)
// import java.util.Scanner;
// class book{
//     String title;
//     String author;
//     int year;
//     public static int isbn=10;
//     book(String title,String author,int year){
//         this.title=title;
//         this.year=year;
//         this.author=author;
//     }
//     public String getTitle() {
//         return title;
//     }
//     public String getAuthor() {
//         return author;
//     }
//     public int getYear() {
//         return year;
//     }
//     public void display() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Publication Year: " + year);
//         System.out.println("ISBN: " + isbn);
//         System.out.println();
//     }
// }
// public class lab {
//     public static void main(String[] args) {
//         book[] b1=new book[2];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<2;i++){
//             System.out.println("Enter details for book " + (i + 1) + ":");
//             System.out.print("Title: ");
//             String title = sc.nextLine();
//             System.out.print("Author: ");
//             String author = sc.nextLine();
//             System.out.print("Publication Year: ");
//             int publicationYear = sc.nextInt();
//             sc.nextLine();
//             b1[i] = new book(title, author, publicationYear);
//         }
//         System.out.println("\nBook details:");
//         for (book b2: b1) {
//             b2.display();
//         }
//     }
// }


// class employee{
//     String name;
//     int id;
//     String department;
//     int salary;
//     employee(String name,int id,String department,int salary){
//         this.name=name;
//         this.id=id;
//         this.department=department;
//         this.salary=salary;
//     }
//     employee(String name, int id, String department) {
//         this.name=name;
//         this.id=id;
//         this.department=department;
//         this.salary=0;
//     }
//     employee(String name, int id) {
//         this.name=name;
//         this.id=id;
//         this.department="unknown";
//     }
//     public void display(){
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee ID: " + id);
//         System.out.println("Department: " + department);
//         System.out.println("Salary: Rs " + salary);
//         System.out.println();
//     }

// }
// public class lab {
//     public static void main(String[] args) {
//         employee e1=new employee("ppk",23,"cse",12000);
//         employee e2=new employee("subbu",23,"ece");
//         employee e3=new employee("thanu",45);
//         e1.display();
//         e2.display();
//         e3.display();
//     }
// }

// class student {
//     static int a = 100;
//     String name;

//     student(String name) {
//         this.name = name;
//     }

//     public void display() {
//         System.out.println("name: " + name + " " + a);
//     }

//     public static void change() {
//         a = 123;
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         student s1 = new student("ppk");
//         student s2 = new student("subbu");
//         s1.display(); 
        
//         student.change(); 
//         s2.display();
//     }
// }

// import java.util.*;

// public class lab {

//     public static void main(String[] args) {
//         int a[]={1,34,56,78,9,4};
//         int sum=0;
//         for(int i=0;i<a.length;i++){
//             sum+=a[i];
//         }
//         System.out.println("sum:"+sum);
//     }
// }

// public class lab {

//     public static void main(String[] args) {
//         int a[]={1,34,56,78,9,4};
//         int max=a[0];
//         for(int i=0;i<a.length;i++){
//             if(a[i]>=max){
//                 max=a[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a[][]=new int[2][2];
//         int b[][]=new int[2][2];
//         int prod[][]=new int[2][2];
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 b[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 for(int k=0;k<2;k++){
//                     prod[i][j]+=a[i][k]*b[k][j];
//                 }
//             }
//         }
//         System.out.println(Arrays.deepToString(prod));
//     }
// }

// public class lab {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a[][]=new int[3][3];
//         int b[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 b[i][j]=a[j][i];
//             }
//         }
//         System.out.println(Arrays.deepToString(a));
//         System.out.println(Arrays.deepToString(b));

//     }
// }

