// public class forloop {
//     public static void main(String[] args) {
//         for ( int i=0;i<11;i++){
//             System.out.print(i+" ");
//         }
//     }
// }

// public class forloop{
//     public static void main(String[] args) {
//         int i=0;
//         while(i<11){
//             System.out.print(i);
//             i+=1;
//             System.out.print(" ");
//         }
//     }
// }


// public class forloop{
//     public static void main(String[] args) {
//         int i=0;
//         do{
//             System.out.println(i);
//             i+=1;
//         }while(i<=10);   
//     }
// }


// import java.util.Scanner;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a num: ");
//         int n=sc.nextInt();
//         int sum=0;
//         int i=0;
//         while(i<n){
//             sum+=i;
//             i+=1;
//         }
//         System.out.println(sum);
//     }
// }



// import java.util.Scanner;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter num of the table");
//         int a=sc.nextInt();
//         for (int i=1;i<=10;i++){
//             System.out.println(a+"*"+i+"="+a*i);
            
//         }
//     }
// }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice = 1;

//         while (choice != 0) {
//             System.out.println("Menu:");
//             System.out.println("1. Enter marks");
//             System.out.println("0. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();

//             if (choice == 1) {
//                 System.out.print("Enter student's marks (out of 100): ");
//                 int marks = scanner.nextInt();
//                 evaluateMarks(marks);
//             } else if (choice == 0) {
//                 System.out.println("Exiting...");
//             } else {
//                 System.out.println("Invalid choice. Please enter 1 or 0.");
//             }
//         }
//         scanner.close();
//     }
// }



// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number");
//         int A=sc.nextInt();
//         System.out.print(A);

        
//     }
// }



// has operator is used to check whether type is given type or not
// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number");
//         boolean A=sc.hasNextInt();
//         System.out.print(A);

        
//     }
// }


// Question

// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         System.out.println("Prasanth average MArks");
//         System.out.print("enter number of subject:");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("total number of subject:"+n);
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             System.out.print("enter subject "+i+":");
//             float a=sc.nextInt();
//             sum+=a;
//         }
//         float Avg=sum/n;
//         System.out.println(Avg);
//     }
// }


// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter your name");
//         String name=sc.next();
//         System.out.println("Hello "+name+" have a good day");
//     }
// }

// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a km's");
//         float km=sc.nextFloat();
//         sc.close();
//         double M=0.621;
//         double miles=M*km;
//         System.out.println("km in miles is:"+miles);
//     }
// }

// import java.util.Scanner;
// class kmtomiles{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a km's");
//         float km=sc.nextFloat();
//         sc.close();
//         double M=0.621;
//         double miles=M*km;
//         System.out.println("km in miles is:"+miles);
//     }
// }


// import java.util.Scanner;
// class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a number");
//         boolean B=sc.hasNextInt();
//         System.out.print("tell the int type or not:");
//         System.out.println(B);
//     }
// }

// class forloop{
//     public static void main(String[] args) {
        // int b= 60/5+12-30*2;
//         int b= 60/5+12;
//         System.out.println(b);
//     }
// }

// class forloop{
//     public static void main(String[] args) {
//         float a=7/4.0f*9/2.0f;
//         System.out.println(a);
//     }
// }


// class forloop{
//     public static void main(String[] args) {
//         String P="Prasanth                 ";
//         int b=P.length();
//         System.out.println(b);
//         String lower=P.toLowerCase();
//         System.out.println(lower);
//         System.out.println(P.toUpperCase());
//         System.out.println(P.trim());
//         System.out.println(P.substring(5));
//         System.out.println(P.substring(2,4));
//         int C=P.indexOf('r');
//         System.out.println(P.charAt(C));
//         System.out.println(P.lastIndexOf('h'));
//     }
// }

// import java.util.Scanner;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a name");
//         String var=sc.nextLine();
//         System.out.println("Dear"+var+"Thanks a lots");
//         String nam=var.replace(var,"Prasanth");
//         System.out.println("Dear"+nam+"Thanks a lots");
//     }
// }


// public class forloop{
//     public static void main(String[] args) {
//         String name="   ____Prasanth  ";
//         int b=name.length();
//         String N=name.replace("_", " ");
//         System.out.println(N.length());
//         System.out.println(N);
//         System.out.println(b);
//         String A=N.trim();
//         System.out.println(A.length());
//     }
// }


// import java.util.Scanner;
// import java.util.Arrays;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a range:");
//         int a=sc.nextInt();
//         int[] list=new int[a];
//         for(int i=0;i<a;i++){
//             list[i]=sc.nextInt();
            // System.out.print(Arrays.toString(list));
        // }
        // System.out.print(Arrays.toString(list));
        // int[] arr={7,2,6,4,5};
        // System.out.println(Arrays.toString(arr));
     
        // int[] list=new int[4];
        // list[1]=1;
        // list[2]=4;
        // list[0]=2;
        // list[3]=9;
        // System.out.println(Arrays.toString(list));

       
//     }
// }




// import java.util.Scanner;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a name:");
//         String A=sc.nextLine();
//         int b=A.length();
//         for(int i=0;i<b;i++){
//             System.out.println(A.charAt(i));
//         }
       
//     }
// }




// public class forloop {
//     public static void main(String[] args) {
//         String name = "john doe";
//         String capitalized = capitalizeName(name);
//         System.out.println(capitalized); // Output: John Doe
//     }
    
//     public static String capitalizeName(String name) {
//         StringBuilder result = new StringBuilder();
//         String[] words = name.split("\\s");
//         // for (String word : words) {
//         //     String firstLetter = word.substring(0, 1).toUpperCase();
//         //     String restOfWord = word.substring(1).toLowerCase();
//         //     result.append(firstLetter).append(restOfWord).append(" ");
//         // }
        
//         return result.toString().trim();
//     }
// }

// import java.util.Scanner;
// class forloop{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.println("enter subject marks");
//                 float m1=sc.nextInt();
//                 float m2=sc.nextInt();
//                 float m3=sc.nextInt();
//                 float PT=((m1+m2+m3)/300)*100;
//                 if(m1>33&&m2>33&&m3>33&&PT>40){
//                         System.out.println("Congrats he is Pass");
//                 }else{
//                         System.out.println("he is Fail");
//                 }
//         }
// }

// class conditions{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             if(i==5){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }

// class conditions{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             if(i==5){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;
// class conditions{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("enter the range of n even numbers");
//                 int n=sc.nextInt();
//                 for(int i=0;i<n;i++){
//                         if (i%2==0){
//                                 System.out.println(i);
//                         }
//                 }
//         }
// }


// import java.util.Scanner;
// class forloop{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("enter the num");
//                 int n=sc.nextInt();
//                 int fact=1;
//                 for(int i=1;i<=n;i++){
//                         fact*=i;
//                 }
//                 System.out.println(fact);
//         }
// }

// import java.util.Scanner;
// class conditions{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("enter the num");
//                 int n=sc.nextInt();
//                 int fact=1;
//                 int i=1;
//                 while(i<=n){
//                         fact*=i;
//                         i+=1;
//                 }
//                 System.out.println(fact);
//                 sc.close();
//         }
// }


// class forloop{
//         public static void main(String[] args) {
//                 int[] arr=new int[3];
//                 arr[0]=12;
//                 arr[1]=3;
//                 arr[2]=2;
//                 for(int i=0;i<3;i++){
//                         System.out.println(arr[i]);
//                 }

//         }
// }

// import java.util.Scanner;
// class forloop{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("enter size");
//                 int length=sc.nextInt();
//                 int number[]=new int[length];
//                 for(int i=0;i<length;i++){
//                         System.out.print("enter{i}");
//                         int name=sc.nextInt();
//                         number[i]=name;

//                 }
//                 sc.close();
//                 for(int j=0;j<length;j++){
//                         System.out.println(number[j]);
//                 }
//         }
// }

// public class forloop{
//         public static void main(String[] args) {
//                 int list[]={12,2,3,45,67};
//                 int max=list[0];
//                 int mini=list[0];
//                 int A=list.length;
//                 for(int i=0;i<A;i++){
//                         if(max<=list[i]){
//                                 max=list[i];
//                         }
//                 }
//                 for(int i=0;i<A;i++){
//                         if(mini>=list[i]){
//                                 mini=list[i];
//                         }
//                 }
//                 System.out.println(max);
//                 System.out.println(mini);
//         }
// }


// import java.util.Scanner;
// public class forloop{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 System.out.print("enter a no of rows");
//                 int r=sc.nextInt();
//                 System.out.print("enter a no of columns");
//                 int col=sc.nextInt();
//                 int matrix[][]=new int[r][col];
//                 for(int i=0;i<r;i++){
//                         for(int j=0;j<col;j++){
//                                 matrix[i][j]=sc.nextInt();
//                         }
//                 }
        
//                 for (int i=0;i<r;i++){
//                         for(int j=0;j<col;j++){
//                                 System.out.print(matrix[i][j]);
//                         }
//                         System.out.println();
//                 }
//         }
// }

// import java.util.Scanner;
// public class forloop{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();


//         int matrix[][] = new int[n][m];
//         for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//         }


//         System.out.println("The Spiral Order Matrix is : ");
//         int rowStart = 0;
//         int rowEnd = n-1;
//         int colStart = 0;
//         int colEnd = m-1;
//         while(rowStart <= rowEnd && colStart <= colEnd) {
//         for(int col=colStart; col<=colEnd; col++) {
//                 System.out.print(matrix[rowStart][col] + " ");
//         }
//         rowStart++;


//           //2
//         for(int row=rowStart; row<=rowEnd; row++) {
//               System.out.print(matrix[row][colEnd] +" ");
//         }
//         colEnd--;


//           //3
//         for(int col=colEnd; col>=colStart; col--) {
//               System.out.print(matrix[rowEnd][col] + " ");
//         }
//         rowEnd--;


//           //4
//         for(int row=rowEnd; row>=rowStart; row--) {
//               System.out.print(matrix[row][colStart] + " ");
//         }
//         colStart++;
//         System.out.println();
//       }

        
//     } 
// }

// Transpose of the matrix


// import java.util.Scanner;
// class forloop{
//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 int m=sc.nextInt();
//                 int matrix[][]=new int[n][m];
//                 for(int i=0;i<n;i++){
//                         for(int j=0;j<m;j++){
//                                 matrix[i][j]=sc.nextInt();;
//                         }
//                }
//                System.out.println("the transpose of the matrix");
//                for(int j=0;j<m;j++){
//                         for(int i=0;i<n;i++){
//                                 System.out.print(matrix[i][j]);

//                 }
//                 System.out.println();
//                }
//         }

// }

// public class forloop{
//         public static void main(String[] args) {
//                 int number[]={6,2,3,4,4,5,5,4,4,5};
//                 for(int i=0;i<number.length-1;i++){
//                         for(int j=0;j<number.length-i-1;j++){
//                                 if(number[j]>number[j+1]){
//                                         int temp=number[j];
//                                         number[j]=number[j+1];
//                                         number[j+1]=temp;
//                                 }
//                         }
//                 }
//                 for(int i=0;i<number.length;i++){
//                         System.out.print(number[i]+" ");
//                 }

//         }
// }


// import java.util.Scanner;
// public class forloop{
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
//         for(int i=1;i<num/2;i++){
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
// public class forloop{

//         // Method to check if a number is prime
//         public static boolean isPrime(int n) {
//             if (n <= 1) {
//                 return false;
//             } else {
//                 for (int i = 2; i <= Math.sqrt(n); i++) {
//                     if (n % i == 0) {
//                         return false;
//                     }
//                 }
//                 return true;
//             }
//         }
    
//         public static void main(String[] args) {
//             System.out.println("Prime numbers from 1 to 100:");
    
//             // Loop through numbers from 1 to 100 and check for prime
//             for (int num = 2; num <= 100; num++) {
//                 if (isPrime()) {
//                     System.out.print(num + " ");
//                 }
//             }
//         }
//     }
    


// class pen{
//         String color;
//         String type;
//         public void write(){
//                 System.out.println("write sonething");
//         }
//         public void color(){
//                 System.out.print(this.color);
//         }
// }

// public class forloop{
//         public static void main(String[] args) {
//                 pen pen1=new pen();
//                 pen1.color="bule";
//                 pen1.type="gel";
//                 pen1.write();
//                 pen1.color();
//                 pen pen2=new pen();
//                 pen2.write();
                
//         }
// }


// import java.util.*;
// class mar9{
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         int n=arr.length;
//         int [] arr1= new int[n+1];
//         int [] arr2=new int[n-1];
//         for(int i=0;i<n;i++){
            
//             arr1[i]=arr[i];
//             arr1[n]=6;
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.toString(arr1));
//         for(int i=0;i<n-1;i++){
//             arr2[i]=arr[i];
//         }
//         System.out.println(Arrays.toString(arr2));
//     }
// }














