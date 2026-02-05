public class basictree{

  public static class  Node{
     int val;
     Node left;
     Node right;
     Node(int val){
        this.val = val;
     }
  }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        root.left = b;
        root.right = c;

        Node d = new Node(4);
        Node e = new Node(5);
        b.left = d;
        b.right = e;


        Node f = new Node(6);
        Node g = new Node(7);
        c.left = f;
        c.right = g;
    


    }
}