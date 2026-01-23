import java.util.Stack;

public class intro{
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       Stack<Integer> st2 = new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       
       while(st.size()>0)
       {
        int top = st.pop();
        System.out.println(top);
        st2.push(top);

       }
      
    }
}