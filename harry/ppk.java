// import java.util.*;
// interface course{
//     void displayDetails();
// }
// class coreSubject implements course{
//     Scanner sc=new Scanner(System.in);
//     String corename[]=new String[5];
//     String corecode[]=new String[5];
//     int corecredits[]=new int[5];
//     public void take(){
//         for(int i=0;i<5;i++){
//             corename[i]=sc.next();
//             corecode[i]=sc.next();
//             corecredits[i]=sc.nextInt();
//         }
//     }
//     public void displayDetails(){
//         for(int i=0;i<5;i++){
//             System.out.println(corename[i]+" "+corecode[i]+" "+corecredits[i]);
//         }
//     }
// }
// class elective implements course{
//     Scanner sc=new Scanner(System.in);
//     String corename1[]=new String[5];
//     String corecode1[]=new String[5];
//     int corecredits1[]=new int[5];
//     public void take1(){
//         for(int i=0;i<5;i++){
//             corename1[i]=sc.next();
//             corecode1[i]=sc.next();
//             corecredits1[i]=sc.nextInt();
//         }
//     }

//     public void displayDetails(){
//         for(int i=0;i<5;i++){
//             System.out.println(corename1[i]+" "+corecode1[i]+" "+corecredits1[i]);
//         }
//     }
// }

// public class ppk{
//     public static void main(String[] args) {
//         coreSubject c1=new coreSubject();
//         c1.take();
//         c1.displayDetails();
//         elective e1=new elective();
//         e1.take1();
//         e1.displayDetails();
        
//     }
// }