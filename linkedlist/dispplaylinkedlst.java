public class dispplaylinkedlst {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val)
        {
            this.val = val;
        }
    }
     
public static void display(Node random){
          while(random.prev!=null){
            random = random.prev;
          }

          while(random!=null){
             System.out.println(random.val);
             random = random.next;
          }
}

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev  = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        display(c);

    }
}
