import java.util.*;
public class asteroidcollesion {
    
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
       arr[i] = sc.nextInt();
    }

    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> ar = new ArrayList<>();
         st.push(arr[0]);
         ar.add(arr[0]);
    for(int i=1;i<n;i++)
    {

        if(st.peek()*arr[i]>0){
            ar.add(arr[i]);
            st.push(arr[i]);
        }

        else{
            if(st.peek()==Math.abs(arr[i])) {
                st.pop();
                ar.removeLast();
            }
            else{
            int mins = Math.min(st.peek(),Math.abs(arr[i]));
            if(st.peek()==mins){
                st.pop();
                st.push(arr[i]);
                ar.removeLast();

            }
        }
        }

    }
    sc.close();
   if(ar.size()==0) System.out.println("[]");
    for(int i=0;i<ar.size();i++){
        System.out.println(ar.get(i));
    }
  }


}
