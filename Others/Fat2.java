class Node {
     int data;
     Node Relink; // Right link
     Node Llink; // Left link
 
     // Constructor to initialize the node with data
     Node(int data) {
         this.data = data;
         this.Llink = null;
         this.Relink = null;
     }
 }
 
public class Fat2{
     Node start = null, end = null;
 
     // Method to add a node at the beginning of the doubly linked list
     public void addFirst(int x) {
         Node n = new Node(x); // Create a new node
         if (start == null) { // If the list is empty
             start = end = n;
         } else {
             n.Relink = start; // Point new node's Rlink to the current start
             start.Llink = n; // Point current start's Llink to the new node
             start = n; // Update start to the new node
         }
     }
 
     // Method to display the doubly linked list
     public void display() {
         Node n = start;
         while (n != null) {
             System.out.println(n.data); // Print data of current node
             n = n.Relink; // Move to the next node
         }
     }
 
     public static void main(String[] args) {
         Fat2 d = new Fat2();
         d.addFirst(1);
         d.addFirst(2);
         d.addFirst(3);
         d.addFirst(4);
         d.display();
     }
 }
 