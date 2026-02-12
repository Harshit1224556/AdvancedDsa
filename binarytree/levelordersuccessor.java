import java.util.LinkedList;
import java.util.Queue;

public class levelordersuccessor {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static int  succersor(Node root,int key){
         
        if(root==null) return 0;
         
        Queue<Node> qt = new LinkedList<>();
          
        if(root!=null) qt.add(root);

        while(!qt.isEmpty())
        {
           
            Node temp = qt.peek();
            if(temp.data==key){
                qt.remove();
                return qt.peek().data;
            }

            if(temp.left!=null) qt.add(temp.left);
            if(temp.right!=null) qt.add(temp.right);

            qt.remove();
        }
         return -1;
    }

    public static void main(String[] args) {
        
         Node root = new Node(20);
         Node a = new Node(10);
         Node b = new Node(26);

         root.left=a;
         root.right=b;

         Node c = new Node(4);
         Node d = new Node(18);
         a.left = c;
         a.right = d;

         Node e = new Node(24);
         Node f = new Node(27);
         b.left = e;
         b.right = f;

         int key = 24;
        System.out.println(succersor(root, key));
         
         

    }
}



//     27