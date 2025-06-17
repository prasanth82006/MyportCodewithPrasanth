// class pen{
//     String color;
//     String type;
//     public void write(){
//             System.out.println("write sonething");
//     }
//     public void color(){
//             System.out.print(this.color);
//     }
// }

// public class oops{
//     public static void main(String[] args) {
//             pen pen1=new pen();
//             pen1.color="bule";
//             pen1.type="gel";
//             pen1.write();
//             pen1.color();
//             pen pen2=new pen();
//             pen2.write();
            
//     }
// }


// class Student
//     {String name;
//     int age;

//     public void printname(){
//         System.out.println(this.name);

//     }
//     public void ageprint(){
//         System.out.println(this.age);

//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Student n1=new Student();
//         Student n2=new Student();
//         Student A2=new Student();
//         Student A1=new Student();
//         A1.age=17;
//         A2.age=18;
//         n1.name="Prasanth";
//         n2.name="sahul";
//         A1.ageprint();
//         A2.ageprint();
//         n2.printname();
//         n1.printname();
//     }
// }

// class Student
//     {String name;
//     int age;

//     public void printname(){
//         System.out.println(this.name);
//         System.out.println(this.age);


//     }
//     Student(String name,int age){
//         this.name=name;
//         this.age=age;

//     }
// }
// public class oops{
//     public static void main(String[] args) {
//         Student n1=new Student("Prasanth",34);
//         Student n2=new Student("amen",12);
//         n1.printname();
//         n2.printname();
        
//     }
// }


// inhertiance

// class Shape{
//     String color;
// }
// class Triangle extends Shape{
//     public void print(){
//         System.out.println(this.color);

//     }

// }
// public class oops{
//     public static void main(String[] args) {
//         Triangle t1=new Triangle();
//         t1.color="Blue";
//         t1.print();
//     }
// }

// private and public

// class Account{
//     public String name;
//     public void print() {
//         System.out.println(this.name);
//         System.out.println(this.email);
//     }
//     public String email;
//     private String password;
//     // getters and setters
//     public String getpassword(){
//         return this.password;
//     }
//     public void setpassword(String pass){
//         this.password=pass;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         Account Account1=new Account();
//         Account1.name="Prasanth";
//         Account1.email="prasanth905241@email.com";
//         Account1.setpassword("abcd");
        
//         System.out.println(Account1.getpassword());
        
//     }
// }


// abstract class Animal{
//     abstract void walks();

// }

// class horse extends Animal{
//     public void walks(){
//         System.out.println("walks in 4 legs");
//     }
// }
// class octopus extends Animal{
//     public void walks(){
//         System.out.println("walks in 8 legs");
//     }
// }
// class chicken extends Animal{
//     public void walks(){
//         System.out.println("walks in 2 legs");
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         horse whiteHorse=new horse();
//         whiteHorse.walks();
//     }
// }



// class pen{
//     String color;
//     String type;// gel or ballpoint
//     public void printlo(){
//         System.out.println("writing something");
//     }
//     public void printcolor(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }


// class Student{
//     String name;
//     int age;
//     public void printname(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(Student s2){
//         this.name=s2.name;
//         this.age=s2.age;
// }
//     Student(){
// }

// }
// public class oops {
//     public static void main(String[] args) {
//         Student s2=new Student();
//         s2.name="amen";
//         s2.age=13;
//         Student s1=new Student(s2);
//         s2.printname();
//     }
// }


// class Pen {
//     String color;
//     String type;// ball or point
//     public void printcolor(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         pen pen1=new pen();
//         pen pen2=new pen();
//         pen1.color="blue";
//         pen1.type=
        
//     }
// }


// public class oops {
//     public static void main(String[] args) {
//         String name="Prasanth";
//         String A="";
//         for(int i=name.length()-1;i>=0;i--){
//             A=A+name.charAt(i);
//         }
//         System.out.println(A);
//     }
// }


// import java.util.*;
// public class oops {

//     public static void main(String[] args) {
//         int a[]={1,2,4,3,5};
//         int sum=0;
//         for(int i=0;i<a.length;i++){
//             sum+=a[i];
//         }
//         System.out.println(sum);
// }
// }

// import java.util.*;
// public class oops {

//     public static void main(String[] args) {
//         int n=6;
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=n;j++){
//                 System.out.print("-"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         int b[]={1,2,3,4,5};
//         int count=0;
//         int sum=0;
//         for(int i=0;i<b.length;i++){
//             sum+=b[i];
//             count+=1;
//         }
//         int avg=sum/count;
//         System.out.println(avg);
//     }
// }

// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         int b[]={1,2,3,4,5};
//         int k=6;
//         int o=4;
//         for(int i=0;i<b.length;i++){
//             if(k==b[i]){
//                 System.out.println("yes found");
//                 System.out.println("the index is "+i);

//             }
//     }
// }
// }


// import java.util.Arrays;
// public class oops {
 
//     public static void main(String[] args) {
//         int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//         System.out.println("Original Array : " + Arrays.toString(my_array));    
//         int removeIndex = 5;
//         for (int i = removeIndex; i < my_array.length - 1; i++) {
//             my_array[i] = my_array[i + 1];
//         }
//         System.out.println("After removing the second element: " + Arrays.toString(my_array));
//     }
// } 


// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         int b[]={1,2,3,4,5};
//         for(int i=0;i<b.length/2;i++){
//             int temp=b[i];
//             b[i]=b[b.length-i-1];
//             b[b.length-i-1]=temp;

//         }
//         System.out.println(Arrays.toString(b));
//     } 
// }

// public class oops {

//     public static void main(String[] args) {
//         int a[]={1,2,9,4,7};
//         for(int i=0;i<a.length;i++){
//             int fact=1;
//             for(int j=1;j<=a[i];j++){
//                 fact=fact*j;

//             }
//             System.out.println(fact);
//         }
//     }
// }

// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         int a[]={1,2,3,6,5};
//         int b=6;
//         for(int i=a[0];i<a[a.length];i++){
//             if(i==b){
//                 continue;
//             }
//             System.out.println(Arrays.toString(String i));
//         }
//     }
// }

// import java.util.*;
// public class oops {
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
// }
// }


// import java.util.Arrays;
// public class oops {
 
//     public static void main(String[] args) {
//         int[] my_array = {25, 14,15, 36, 56, 77, 18, 29, 49};
//         System.out.println("Original Array : " + Arrays.toString(my_array));    
//         int removeIndex = 0;
//         int remove=56;
//         for(int i=0;i<my_array.length;i++){
//             if(my_array[i]==remove){
//                 removeIndex+=i;
//             }
//         }
//         System.out.println(removeIndex);
//         for (int i = removeIndex; i < my_array.length - 1; i++) {
//             my_array[i] = my_array[i + 1];
//         }
//         System.out.println("After removing the second element: " +Arrays.toString( Arrays.copyOf(my_array,my_array.length-1)));
//     }
// } 

// import java.util.*;

// class HelloWorld {
//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 45, 7};
//         for (int i = 0; i < a.length - 1; i++) {
//             for(int j = 0; j < a.length - i - 1; j++) {
//                 if (a[j] < a[j + 1]) { // Change the comparison condition to sort in decreasing order
//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }
//         }

//         System.out.print(Arrays.toString(a));
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         int P=200;
//         int N=2;
//         int R=4;
//         float simpleInterest=(P*N*R)/100;
//         System.out.println(simpleInterest);
//     }
// }

// public class oops {
//     public static void main(String[] args) {
//         double radius=2;
//         double pi=3.14;
//         double a=4.0/3.0;
//         double volumne= a*Math.PI*Math.pow(radius,3);

//         System.out.println("the volumne of the sphere"+volumne);
//     }

 

// import java.util.*;

// public class oops {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int col=sc.nextInt();
//         int a[][]=new int[r][col];
//         int b[][]=new int [r][col];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print(i+"+"+j+":");
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println(Arrays.deepToString(a));
//         for(int i=0;i<r;i++){
//             for(int j=0;j<col;j++){
//                 b[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println(Arrays.deepToString(b));
//         int product[][]=new int[r][col];
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
// public class oops {
//     public static void main(String[] args) {
//         int a[][]={{1,2,3},
//                   {4,5,6},
//                   {7,8,9}};
//         int sum=0;
//         int sume=0;
//         int diadgonalsum=0;
//     for(int i=0;i<3;i++){
//         for(int j=0;j<3;j++){
//             if(i+j==2){
//                 diadgonalsum+=a[i][j];           // add diagonal
                
//             }
//             if(i==j){
//                 sume+=a[i][j];                   // add opposite diagonal
//             }

//             else{
//                 sum+=a[i][j];                    // add remain numbers
//             }

//         }
//     }
//     System.out.println(sum);
//     System.out.println(sume);
//     System.out.println(diadgonalsum);
    
//                 }
// }

// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         int a[][]={{1,2,3},
//                    {4,5,6},
//                    {7,8,9}};
//         int c[][]=new int[3][3];
        // for(int i=0;i<3;i++){                   //transpose
    //         for(int j=0;j<3;j++){
    //             c[i][j]=a[j][i];

    //         }
    //     }
    //     System.out.println(Arrays.deepToString(c));
        
    // }
// }



// class circle{
//     int radius;
//     public void insert(int r){
//         radius=r;
//     }
//     public void display(){
//         double area=Math.PI*radius*radius;
//         double circu=Math.PI*2*radius;
//         System.out.println(area);
//         System.out.println(circu);
//     }
// }
// public class oops {
//     public static void main(String[] args) {
        
//         circle c1=new circle();
//         circle c2=new circle();
//         c1.insert(10);
//         c2.insert(20);
//         c1.display();
//         c2.display();
//     }
// }


// class Circle{
//     int radius;
//     double area;
//     double c;
//     public void display(){
//         area=Math.PI*radius*radius;
//         c=Math.PI*2*radius;
        
//         System.out.println(this.area);
//         System.out.println(this.c);
//     }

// }
// public class oops {
//     public static void main(String[] args) {
        
//         Circle c1=new Circle();
//         Circle c2=new Circle();
//         c1.radius=10;
//         c2.radius=20;
//         c1.display();
//         c2.display();
//     }
// }

// public class oops {
//     int a;
//     String b;
//     public static void main(String[] args) {
//         oops s1=new oops();
//         s1.a=32;
//         s1.b="Prasanth";
//         System.out.println("ENTER");
//         System.out.println(s1.a);
//         System.out.println(s1.b);

//     }
// }

// class empolyee{
//     int salary;
//     String name;
//     public void display(){
//         System.out.println(salary);
//     }
//     public void insert(int a){
//         salary=a;
//     }
//     public void display1(){
//         System.out.println(name);
//     }
//     public void insert2(String b){
//         name=b;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         empolyee e1=new empolyee();
//         e1.insert(10000000);  
//         e1.display(); 
//         e1.insert2("prasanth"); 
//         e1.display1(); 
//     }  
// }

// public class oops {
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3},
//                         {4,5,6},
//                         {7,8,9}};
//         int determiant=0;
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 determiant+=matrix[i][j];

//             }
//         }
//         System.out.println(determiant);
//     }
// }

// private modifiers and getter and setter;

// class empolyee{
//     private int id;
//     private String name;
//     public void setname(String n){
//         name=n;
//     }
//     public void getname(){
//         System.out.println(name);

//     }
//     public void  setid(int b){
//         id=b;
//     }
//     public void getid(){
//         System.out.println(id);

//     }
// }
// public class oops {

//     public static void main(String[] args) {
//         empolyee harry=new empolyee();
//         harry.setname("ppk");
//         harry.setid(45);
//         harry.getid();
//         harry.getname();
        
//     }
// }

// class empolyee{
//     private int id;
//     private String name;
//     empolyee(){
//         System.out.println("hello your id please");
//         id=40;
//         name="ppk1";
//     }
//     public void setname(String n){
//         name=n;
//     }
//     public void getname(){
//         System.out.println(name);

//     }
//     public void  setid(int b){
//         id=b;
//     }
//     public void getid(){
//         System.out.println(id);

//     }
// }
// public class oops {

//     public static void main(String[] args) {
//         empolyee harry=new empolyee();
//         // harry.setname("ppk");
//         // harry.setid(45);
//         harry.getid();
//         harry.getname();
        
//     }
// }

// rock paper scissor;

// import java.util.*;
// public class oops {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter 0 for paper,1 for rock,2 for sciseoor");
//         int a =sc.nextInt();
//         Random random=new Random();
//         int ce=random.nextInt(3);
//         if(a==ce){
//             System.out.println("draw");
//         }else if(a==0&&ce==1||a==1 && ce==0|| a==2&&ce==0){
//             System.out.println("a is the win");

//         }else{
//             System.out.println("ce is the winner");
//         }
//         System.out.println(ce);
//     }
// }

// class person{
//     int age;
//     String name;
//     person(){
//         this.age=age;
//         this.name=name;
// }
//     public String getname(){
//         return name;
//     }
//     public int getage(){
//         return age;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         person p1=new person();
//         p1.name="Prasanth";
//         p1.age=12;
//         System.out.println(p1.getname());
//         System.out.println(p1.getage());
        
//     }
// }


// class dog{
//     private String name;
//     private String breed;
//     dog(String a,String b){
//         this.name=a;
//         this.breed=b;

//     }
//     public String getname(){
//         return name;
//     }
//     public void setname(String a){
//         this.name=a;
//     }
//     public String getbreed(){
//         return breed;
//     }
//     public void setbreed(String b){
//         this.breed=b;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         dog d1=new dog("siddu","bulldog");
//         System.out.println(d1.getname());
//         System.out.println(d1.getbreed());
//         d1.setname("subbu");
//         d1.setbreed("dalminate");
//         System.out.println(d1.getname()+d1.getbreed());

//     }
// }

// class rectangle{
//     double width;
//     double length;
//     public void insert(double a,double b){
//         width=a;
//         length=b;
//     }
//     public void display(){
//         double area=width*length;
//         double pertimeter=2*(width*length);
//         System.out.println(area);
//         System.out.println(pertimeter);
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         rectangle r1=new rectangle();
//         r1.insert(2,3);
//         r1.display();
//     }   
// }

// class empolyee{
//     private String name;
//     private String jobtitle;
//     private double salary;
//     empolyee(String a,String b,double c){
//         name=a;
//         jobtitle=b;
//         salary=c;
//     }
//     public String getname(){
//         return name;
//     }
//     public void setname(String ef){
//         name=ef;
//     }
//     public String getjobtitle(){
//         return jobtitle;
//     }
//     public void setjobtitle(String f){
//         jobtitle=f;
//     }
//     public double getsalary(){
//         return salary;
//     }
//     public void setsalary(double eF){
//        salary=eF;
//     }
//     public void setraisesalary(double F){
//         salary+=salary+(F/100);
//     }
//     public double getraisesalary(){
//         return salary;
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         empolyee e1=new empolyee("john","ff",400000 );
//         System.out.println(e1.getname()+" "+e1.getjobtitle()+" "+e1.getsalary());
//         e1.setraisesalary(2);
//         System.out.println(e1.getraisesalary());
//     }
// }

// class book{
//     private String title;
//     private String author;
//     private String ISBN;
//     book(String a,String b,String c){
//         title=a;
//         author=b;
//         ISBN=c;
//     }
//     public void settitle(String a){
//         title=a;
//     }
//     public String gettitle(){
//         return title;
//     }
//     public void setauthor(String b){
//         author=b;
//     }
//     public String getauthor(){
//         return author;
//     }
//     public void setISBN(String c){
//         ISBN=c;
//     }
//     public String getISBN(){
//         return ISBN;
//     }
// }
// public class oops {

//     public static void main(String[] args) {
//         book b1=new book("romance","Prasanth","123");
//         System.out.println(b1.getauthor()+" "+b1.getISBN()+" "+b1.gettitle());

        
//     }
// }


// class Trafficlight{
//     private String color;
//     private double duration;
//     Trafficlight(String a,double b){
//         color=a;
//         duration=b;
//     }
//     public void changecolor(String c){
//         color=c;
//     }
//     public boolean isred(){
//         return color.equals("red");
//     }
//     public boolean isgreen(){
//         return color.equals("green");
//     }
//     public void setduration(double d){
//         duration =d;
//     }
//     public double getduration(){
//         return duration;
//     }
// }
// public class oops {

//     public static void main(String[] args) {
//         Trafficlight t1=new Trafficlight("red", 2);
//         System.out.println("ligth is red"+" "+t1.isred());
//         System.out.println("ligth is Green"+" "+t1.isgreen());
//         t1.changecolor("green");
//         System.out.println("the changed ligth"+" "+t1.isgreen());
//         t1.setduration(30);
//         System.out.println(t1.getduration());
//     }
// }

// import java.time.LocalDate;
// import java.time.Period;
// import java.util.*;
// class empolyee{
//     private String name;
//     private double salary;
//     private LocalDate hiredate;
//     empolyee(String a,double b,LocalDate c){
//         name=a;
//         salary=b;
//         hiredate=c;
//     }
//     public void setname(String a){
//         name=a;
//     }
//     public String getname(){
//         return name;
//     }
//     public void setsalary(double b){
//         salary=b;
//     }
//     public double getsalary(){
//         return salary;
//     }
//     public void sethiredate(LocalDate c){
//         hiredate=c;
//     }
//     public LocalDate gethiredatae(){
//         return hiredate;
//     }
//     public int getyearsofservice(){
//         return Period.between(hiredate, LocalDate.now()).getYears();
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         empolyee e1=new empolyee("prasanth", 400000.00,LocalDate.parse("2006-01-08"));
//         empolyee e2=new empolyee("subbu", 10000000.00,LocalDate.parse("2005-06-12"));
//         System.out.println(e1.getyearsofservice());
//         System.out.println(e2.getyearsofservice());
        
//     }

    
// }

// import java.time.LocalTime;
// class Airplane {
//   private String flightNumber;
//   private String destination;
//   private LocalTime scheduledDeparture;
//   private int delayTime;

//   public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
//     this.flightNumber = flightNumber;
//     this.destination = destination;
//     this.scheduledDeparture = scheduledDeparture;
//     this.delayTime = 0;
//   }

//   public String getFlightNumber() {
//     return flightNumber;
//   }

//   public void setFlightNumber(String flightNumber) {
//     this.flightNumber = flightNumber;
//   }

//   public String getDestination() {
//     return destination;
//   }

//   public void setDestination(String destination) {
//     this.destination = destination;
//   }

//   public LocalTime getScheduledDeparture() {
//     return scheduledDeparture;
//   }

//   public void setScheduledDeparture(LocalTime scheduledDeparture) {
//     this.scheduledDeparture = scheduledDeparture;
//   }

//   public int getDelayTime() {
//     return delayTime;
//   }

//   public void delay(int minutes) {
//     this.delayTime = minutes;
//     this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
//   }

//   public void checkStatus() {
//     if (delayTime == 0) {
//       System.out.println("Flight " + flightNumber + " is on time.");
//     } else {
//       System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");
//     }
//   }
// }


// public class oops {
//   public static void main(String[] args) {
//     Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
//     Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
//     Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
//     System.out.println("Flight Status:");
//     flight1.checkStatus();
//     flight2.checkStatus();
//     flight3.checkStatus();
//     flight1.delay(0);
//     flight2.delay(110);
//     System.out.println("\nCurrent Flight Status:");
//     flight1.checkStatus();
//     flight2.checkStatus();
//     flight3.checkStatus();
//   }
// }

// class Animal{
//     int legs;
//     String skills;
// }
// class horse extends Animal{
//     public void setX(int a){
//         legs=a;
//     }
//     public int getx(){
//         return legs;
//     }
//     public void setY(String b){
//         skills=b;
//     }
//     public String getY(){
//         return skills;
//     }
// }
// public class oops {

//     public static void main(String[] args) {
//         horse a1=new horse();
//         a1.setX(4);
//         a1.setY("red");
//         System.out.println(a1.getx());
//         System.out.println(a1.getY());

        
//     }
// }

// import java.sql.Connection;
// import java.sql.DriverManager;

// public class oops {
//     public static void main(String[] args) throws Exception{
//         String url="";
//         String username="myportseges";
//         String password="0000";
//         Connection con=DriverManager.getConnection(url,username,password);
        
//     }
// }


// interface LabInCharge {
//     void install();
//     final String labname="Cse";
//     int roomNO=119;;
// }
// abstract class PhDScholar{
//     String scholarName;
//     String labConducted;
  
//     public abstract void help();
  
//     public String labsAssigned() {
//       return labConducted;
//     }
// }

// class Professor extends PhDScholar implements LabInCharge{
//     String subject;
//     String emp_id;
//     public void install(){
//         System.out.println("install java");
//     }
//     public void teaches() {
//       System.out.println("Professor teaches " + subject);
//     }
//     public void help(){
//         System.out.println("contact lab assistant");
//     }
// }
  
// class oops{
//     public static void main(String[] args) {
        
//         Professor p2= new Professor();
//         p2.scholarName = "Dr. A";
//         p2.labConducted = "Physics Lab";
//         p2.subject = "Chemistry";
//         p2.emp_id = "1234";
//         System.out.println(p2.labname);
//         System.out.println(p2.roomNO);
  
//       System.out.println("LabInCharge Details");
//       System.out.println("Scholar Name: " +p2.scholarName);
  
//       System.out.println("Professor Details");
//       System.out.println("Subject: " + p2.subject);
//       System.out.println("Employee Id: " +p2.emp_id);
  
//       System.out.println("PhDScholar Assigned Labs:"+p2.labsAssigned());

//     }
// }

// import java.util.Scanner;
// class Blacklog extends Exception{
//     String getmessage(){
//         return "you are not allowed for the workshop";

//     }
// }
// public class oops {
//     public static void main(String[] args) throws Blacklog{
//         Scanner sc=new Scanner(System.in);
//         Blacklog b1=new Blacklog();
//         int regno=sc.nextInt();
//         String workshop;
//         int noofbalacklog=sc.nextInt();
//         try{
//             if(noofbalacklog==0){
//                 if(regno%2==0){
//                     workshop="machine learning";
//                     System.out.println("welcome to workshop :"+workshop);
//                 }
//                 else{
//                     workshop="Blockchain";
//                     System.out.println("welcome to workshop :"+workshop);
//                 }
//             }
//             else{
//                 throw new Blacklog();
//             }
//         }
//         catch(Exception e){
//             System.out.println(b1.getmessage());
//             System.out.println(e);
//         }
        
//     }
// }


