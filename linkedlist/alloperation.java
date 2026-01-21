public class alloperation {
    class Linkedlist {

        public static class node {
            int val;
            node next;

            node(int val) {
                this.val = val;
                
            }
        }

        node head = null;
        node tail = null;
        public void insertatthebeginning(int val) {
            node temp = new node(val);
            temp.next = head;
            head=temp;
        }
        

        public void insertattheend(int val)
        {
            node temp = new node(val);
            if(head==null)
            {
                head = temp;
                return;
            }
            node temps = head;

            while(temps.next!=null){
                temps=temps.next;
            }
            temps.next=temp;
            temp=tail;
            
        }
         
        public void reverselinkedlist(){
            node curr = head;
            node prev = null;
            while(curr!=null)
            {
                node agla = curr.next;
                curr.next = prev;
                prev = curr;
                curr=agla;
            }
            head = prev;
        }

      public void reverseInPart(int left, int right) {
         if (head == null || left == right) return;

    node dummy = new node(0);
    dummy.next = head;

    node prev = dummy;


    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    node curr = prev.next;

   
    for (int i = 0; i < right - left; i++) {
        node agla  = curr.next;
        curr.next = prev;
        prev  = curr;
        curr = agla;
    }
         node leftnode = prev.next;
         prev.next = prev;
         

    head = dummy.next;
}

        public void printlinkedlist() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        alloperation obj = new alloperation();
        Linkedlist ll = obj.new Linkedlist();

        ll.insertattheend(10);
        ll.insertattheend(20);
        ll.insertattheend(30);
        ll.insertattheend(40);
        ll.insertattheend(50);
        ll.reverseInPart(2, 4);
      
           ll.printlinkedlist();
           
   
    
        
    }
}
