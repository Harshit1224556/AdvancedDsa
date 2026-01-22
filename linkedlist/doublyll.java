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
       Node head = null;
       Node tail = null;
    public  void display(){
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

  public  void display2(){
       Node temp = tail;
       while(temp!=null)
       {
        System.out.println(temp.val);
        temp = temp.prev;
       }
    }

 public void insertathead(int val)
 {
    Node temp = new Node(val);
    if(head==null)
    {
        head = tail = temp;
    }
    else{
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
 }


 public void insertattail(int val)
 {      Node temp = new Node(val);
        if(head==null){
             head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail=temp;
        }
 }

  
    public static void main(String[] args) {
         
      doublyll ll = new doublyll();
      ll.insertathead(10);
      ll.insertathead(20);
      ll.insertathead(30);
      ll.insertathead(40);
      ll.insertattail(50);
      ll.display();
     
    }
}
