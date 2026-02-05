import java.util.*;
public class nextgreaterelem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
           
            while(!st.empty() && st.peek()<=arr[i]) st.pop();


            if(st.empty()){
                res.add(-1);
            }
            else{
                res.add(st.peek());
            }

            st.push(arr[i]);

        }

        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i));
        }
    }
}
