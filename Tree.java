
// Trees
// preorder traversal

// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int preorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           System.out.print(root.data+" ");
//           preorder(root.left);
//           preorder(root.right);
//           return 0;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           preorder(root);
//      }
// }

// inorder Traversal
// left-- root--right
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int inorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           inorder(root.left);
//           System.out.println(root.data);
//           inorder(root.right);
//           return 0;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           inorder(root);
//      }
// }

// postorder Traversal
// left--right--root
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int postorder(Node root){
//           if(root==null){
//                return -1;
//           }
//           postorder(root.left);
//           postorder(root.right);
//           System.out.print(root.data+" ");
//           return 0;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           postorder(root);
//      }
// }

// level order Trasveral
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static void levelorder(Node root){
//           if(root==null){
//                return;
//           }
//           Queue<Node> q=new LinkedList<>();
//           q.add(root);
//           q.add(null);
//           while(!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                          break;
//                     }
//                     else{
//                          q.add(null);
//                     }
//                }else{
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left!=null){
//                          q.add(currNode.left);
//                     }
//                     if(currNode.right!=null){
//                          q.add(currNode.right);
//                     }
//                }
//           }
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           levelorder(root);
//      }
// }

// Question of Trees
// 1
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int count(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=count(root.left);
//           int rightnode=count(root.right);
//           return leftnode+rightnode+1;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(count(root));
//      }
// }
// 2 Sum of Nodes
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int sumoofNodes(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=sumoofNodes(root.left);
//           int rightnode=sumoofNodes(root.right);
//           return leftnode+rightnode+root.data;
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(sumoofNodes(root));
//      }
// }

// height of tree
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
     // public static int height(Node root){
     //      if(root==null){
     //           return 0;
     //      }
     //      int leftheight=height(root.left);
     //      int rightheight=height(root.right);
     //      if(leftheight>rightheight){
     //           return leftheight+1;
     //      }
     //      else{
     //           return rightheight+1;
     //      }
     // }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println(height(root));
//      }
// }

// Diameter of tree
// case1:- search the diameter through root
// case2:- search the diameter not throught root
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int height(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftheight=height(root.left);
//           int rightheight=height(root.right);
//           if(leftheight>rightheight){
//                return leftheight+1;
//           }
//           else{
//                return rightheight+1;
//           }
//      }
//      public static int diameter(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=diameter(root.left);
//           int rightnode=diameter(root.right);
//           int bothnode=height(root.left)+height(root.right)+1;
//           return Math.max(bothnode,Math.max(rightnode,leftnode));
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println("the max diameter is:"+" "+diameter(root));
//      }
// }
// other method
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static int height(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftheight=height(root.left);
//           int rightheight=height(root.right);
//           if(leftheight>rightheight){
//                return leftheight+1;
//           }
//           else{
//                return rightheight+1;
//           }
//      }
//      public static int diameter(Node root){
//           if(root==null){
//                return 0;
//           }
//           int leftnode=diameter(root.left);
//           int rightnode=diameter(root.right);
//           int bothnode=height(root.left)+height(root.right)+1;
//           return Math.max(bothnode,Math.max(rightnode,leftnode));
//      }
//      public static class Treeinfo{
//           int ht;
//           int da;
//           Treeinfo(int ht,int da){
//                this.ht=ht;
//                this.da=da;
//           }
//      }
//      public static Treeinfo diameter2(Node root){
//           if(root==null){
//                return new Treeinfo(0, 0);
//           }
//           Treeinfo left=diameter2(root.left);
//           Treeinfo right=diameter2(root.right);
//           int myht=Math.max(left.ht,right.ht)+1;
//           int dia=left.da;
//           int dia1=right.da;
//           int dia2=left.ht+right.ht+1;
//           int myda=Math.max(dia2,Math.max(dia,dia1));
//           Treeinfo myinfo=new Treeinfo(myht, myda);
//           return myinfo;

//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           System.out.println("the max diameter is:"+" "+diameter2(root).da);
//      }
// }

// sum of nodes kth level
// public class list{
//      static class Node{
//           int data;
//           Node left;
//           Node right;
//           Node(int data){
//                this.data=data;
//                this.left=null;
//                this.right=null;
//           }
//      }
//      static class Binarytree{
//           static int index=-1;
//           public static Node buildTree(int nodes[]){
//                index++;
//                if(nodes[index]==-1){
//                     return null;
//                }
//                Node newnode=new Node(nodes[index]);
//                newnode.left=buildTree(nodes);
//                newnode.right=buildTree(nodes);
//                return newnode;
//           }
//      }
//      public static void levelorder(Node root){
//           Scanner sc=new Scanner(System.in);
//           int k=sc.nextInt();
//           if(root==null){
//                return;
//           }
//           Queue<Node> q=new LinkedList<>();
//           q.add(root);
//           q.add(null);
//           int sum=0;
//           int currLevel=1;
//           while(!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                     if(currLevel==k){
//                          System.out.println(sum);
//                     }
//                     sum=0;
//                     currLevel++;
//                     if(q.isEmpty()){
//                          break;
//                     }
//                     else{
//                          q.add(null);
//                     }
//                }else{
//                     sum+=currNode.data;
//                     if(currNode.left!=null){
//                          q.add(currNode.left);
//                     }
//                     if(currNode.right!=null){
//                          q.add(currNode.right);
//                     }
//                }
//           }
//      }
//      public static void main(String[] args){
//           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//           Binarytree tree=new Binarytree();
//           Node root=tree.buildTree(nodes);
//           levelorder(root);
//      }
// }