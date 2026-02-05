import java.util.*;
public class removekdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int r = sc.nextInt();
        Stack<Character> st = new Stack<>();
      
        
        for(int j=0;j<n.length();j++)
        {
           char k = n.charAt(j);
           
           while(st.size()>0 && r>0 && st.peek()>k){
            st.pop();
            r--;
           }
               st.push(k);
            
        }
        while(r > 0 && st.size() > 0){
    st.pop();
    r--;
}


for(int i=0;i<st.size();i++){
    System.out.println(st.get(i));
}


       
        sc.close();

    }
}
