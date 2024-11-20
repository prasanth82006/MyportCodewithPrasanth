// import java.util.Scanner;
// public class problem {
//      public int para(String type,String style,String we){
//           int usage=100;
//           if(type.equals("street")){
//                usage+=0.1;
//           }
//           else if(type.equals("open")){
//                usage-=0.05;
//           }
//           else if(type.equals("highway")){
//                usage+=0;
//           }
//           if(style.equals("aggressive")){
//                usage+=0.05;
//           }
//           else if(style.equals("conservative")){
//                usage-=0.05;
//           }
//           if(we.equals("hot")){
//                usage+=0.08;
//           }
//           else if(we.equals("cold")){
//                usage-=0.06;
//           }
//           else if(we.equals("normal")){
//                usage+=0;
//           }
//           return usage;
//      }
     // public static void main(String[] args) {
//           problem p=new problem();
//           Scanner sc=new Scanner(System.in);
//           int fuel=sc.nextInt();
//           String track=sc.next();
//           String drivingstyle=sc.next();
//           String weather=sc.next();
//           int reuslt=p.para(track, drivingstyle, weather);
//           if((reuslt-fuel)<0){
//                System.out.println(" pit stop is required");
//           }
//           else{
//                System.out.println("remaining fuel pecentage "+(reuslt-fuel)+"%");
//           }
//      }
// }
