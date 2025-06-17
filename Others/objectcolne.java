// class demo{
//     String model;
//     int price;
//     String names(){
//         return model+" "+price;
//     }
// }


// public class objectcolne{
//     public static void main(String[] args) {
//         demo A= new demo();
//         A.model="macbook";
//         A.price=60000;
//         // System.out.println(A);
//         System.out.println(A.names());
        
//     }
    
// }

// class A{
//     int age;
//     public void main2(){
//         System.out.println("prasanth");
//     }

//     class B{                        // if you static to the inner class then
//         public void main(){
//             System.out.println("Hemanth");
//         }

//     }
// }
// public class objectcolne {
//     public static void main(String[] args) {
//         A obj=new A();
//         obj.main2();
//         A.B obj2=obj.new B();// A>B obj2= new A.B();
//         obj2.main();

//     }
    
// }

// import java.util.*;
// class movie{
//     private int price;
//     private String name;
//     private String director;
//     private String type;
//     movie(String name,String type,String director){
//         this.name=name;
//         this.director=director;
//         this.type=type;
//         if(type.equals("2D")){
//             this.price=120;
//         }else if (type.equals("3D")) {
//             this.price=150;
//         }else{
//             this.price=120;
//         }
//     }
//     public int getPrice() {
//         return price;
//     }
//     public String getName() {
//         return name;
//     }
//     public String getDirector() {
//         return director;
//     }
//     public String getType() {
//         return type;
//     }
// }

// class biling{
//     private double subtotal;
//     private double taxamount;
//     biling(){
//         subtotal=0;
//         taxamount=0;
//     }
//     public void addTicket(int ticketPrice) {
//         subtotal += ticketPrice;
//     }

//     // Method to calculate tax amount
//     public void calculateTax(String type) {
//         if (type.equals("2D")) {
//             taxamount = subtotal * 0.20;
//         } else if (type.equals("3D")) {
//             taxamount = subtotal*0.25;
//         }
//     }

//     // Method to calculate total bill
//     public double calculateTotal() {
//         return subtotal+taxamount;
//     }
// }

// public class objectcolne{
//     public static void main(String[] args) {
//         movie m1=new movie("RRR","3D","ppk");
//         movie m2=new movie("spy","2D","subbu");
//         biling b1=new biling();
//         biling b2=new biling();
//         b1.addTicket(m1.getPrice());
//         b2.addTicket(m2.getPrice());
//         b1.calculateTax(m1.getType());
//         b2.calculateTax(m2.getType());


//         System.out.println(b1.calculateTotal());        
//         System.out.println(b2.calculateTotal());        
//     }
// }


