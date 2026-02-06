public class basictree{

  public static class  Node{
     int val;
     Node left;
     Node right;
     Node(int val){
        this.val = val;
     }

    
  }
  
   public  static void display(Node root){

          if(root==null) return;
          System.out.print(root.val + " ");
          display(root.left);
          display(root.right);

          //this is the preorder root-left-right
          

     }

     public static void inorder(Node root){
       if(root==null) return;
       inorder(root.left);
       System.out.println(root.val);
       inorder(root.right);
     }

     public static int size(Node root){
         if(root==null) return 0;
         return 1 + size(root.left) + size(root.right);

     }

    

     public static int sum(Node root){
      if(root==null) return 0;
       return  root.val +sum(root.left) + sum(root.right);
     }

     public static int height(Node root){
       if(root==null) return 0;

       return 1 + Math.max(height(root.left),height(root.right));
     }

     public static int product(Node root){
       if(root==null) return 1;
       return root.val * product(root.left) *product(root.right);
     }

     public static int minval(Node root)
     {
        if(root.left==null) return Integer.MAX_VALUE;
         int leftmin = minval(root.left);
         int rightmin = minval(root.right);

         return Math.min(root.val,Math.min(leftmin,rightmin));

     }


     public static void nthlevel(Node root,int n){
       
        if(root==null) return;
        if(n==1) System.out.print(root.val + " ");
          
          nthlevel(root.left,n-1);
          nthlevel(root.right,n-1);
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
  
      // System.out.println(sum(root));
      // System.out.println(height(root));
      
      // System.out.println(product(root));
      // System.out.println(minval(root));

      // inorder(root);
      // nthlevel(root, 2);

      int level = height(root);

      for(int i=1;i<=level;i++){
         nthlevel(root, i);
         System.out.println();
      
      }
    }
}
