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
            node temps = head;
            while(temps.next!=null){
                temps=temps.next;
            }
            temps.next=temp;
            temp=tail;
            
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

        ll.insertatthebeginning(10);
        ll.insertatthebeginning(20);
        ll.insertattheend(30);
        ll.printlinkedlist();
        
    }
}
