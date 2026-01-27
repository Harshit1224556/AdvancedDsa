import java.util.*;
public class removeadjacentele {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.size()>0 && st.peek()==ch){
                 st.pop();
                 continue;
            }
            st.push(ch);
        }
      String res = "";
      for(int i=0;i<st.size();i++)
      {
        res+=st.get(i);
      }
      System.out.println(res);
      
    }
}
