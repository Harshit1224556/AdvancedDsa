public class doublyll {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val)
        {
            this.val=val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

  public static void display2(Node tail){
       Node temp = tail;
       while(temp!=null)
       {
        System.out.println(temp.val);
        temp = temp.prev;
       }
    }

    public static void insertathead(int val)
    {
             
      }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);
        Node c =new Node(30);
        Node d =new Node(40);
        Node e =new Node(50);
        a.next=b;
        b.prev=a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev  = c;
        d.next  = e;
        e.prev = d;
        display(a);
        System.out.println("Displaying in reverse: ");
        display2(e);
    }
}
