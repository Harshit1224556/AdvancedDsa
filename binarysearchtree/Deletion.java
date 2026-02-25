import java.util.LinkedList;
import java.util.Queue;

public class Deletion {

    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    

    public static void display(Node root){

       Queue<Node> qt = new LinkedList<>();
       qt.add(root);

       while(!qt.isEmpty())
       {
        Node peek = qt.peek();
        if(peek!=null){
            System.out.print(peek.val + " ");
        }

        if(peek.left!=null) qt.add(peek.left);
        if(peek.right!=null) qt.add(peek.right);

        qt.remove();
       }
    }

    public static void deleteochildwithnochild(Node root,int target){
         if(root==null) return;
         
        else if(root.val>target){

            if(root.left.val==target) root.left = null;
           deleteochildwithnochild(root.left, target);
        } 
        else{
            if(root.right.val==target) root.right = null;
            deleteochildwithnochild(root.right, target);
        }
    }

    public static void deletewithonechild(Node root,int target)
    {
       if(root==null) return;

       if(root.val>target){
          if(root.left.val==target){
               if(root.left.right==null){
                root.left = root.left.left;
               }
               else{
                root.right = root.left.left;
               }
          }
          else deletewithonechild(root.left,target);
       }
       else{
           deletewithonechild(root.right,target);

       }
    }
    public static void main(String[] args) {
        
      Node root = new Node(50);
      Node b = new Node(20);
      Node c = new Node(60);
      root.left = b;
      root.right = c;

      Node d = new Node(17);
      Node e = new Node(39);
      b.left=d;
      b.right = e;

      Node f = new Node(28);
      Node g = new Node(15);
      d.left = g;
      e.left = f;
     System.out.println("Before Deletion: ");
      display(root);
    //   deleteochildwithnochild(root, 17);
    //   System.out.println("After Deletion ");
    //   display(root);
    System.out.println("After deletion code: ");
     deletewithonechild(root,17);
     display(root);






    }
}
