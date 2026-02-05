import java.util.*;
public class basiccal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int number = 0;
        int result = 0;
        Stack<Integer> st = new Stack<>();
        int sign = 1;
        for(int i=0;i<s.length();i++)
        {
          
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number*10 + (ch-'0');
            }

            else if(ch=='+'){
                result+=(number)*sign;
                number = 0;
                sign=1;

            }
            else if(ch=='-'){
                result+=(number)*sign;
                number = 0;
                sign=-1;

            }

            else if(ch=='('){
                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
            }

            else if(ch==')'){
                  result+=number*sign;
                  number = 0;

                int lastsign = st.peek(); st.pop();
                int lastres = st.peek(); st.pop();
                 result*=lastsign;
                 result+=lastres;

                
            }

            
        }


        System.out.println(result+(number*sign));

    }
}
