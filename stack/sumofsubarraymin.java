
import java.util.*;
public class sumofsubarraymin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int mins = Integer.MAX_VALUE; 

         int sum = 0;
       
         boolean ismin = false;
         Stack<Integer> st = new Stack<>();
     
         for(int i=0;i<n;i++)
         {    
           
            sum+=arr[i];
             if(st.size()>0 && st.peek()>arr[i]){
                sum+=arr[i];
                ismin = true;
                if(arr[i]<mins) mins = arr[i];
             }
            

            
             st.push(arr[i]);

              if(st.size()>0){
             if(ismin){
                sum+=((st.size()-2)*mins);
             }
             else{
                sum+=((st.size()-1)*mins);
             }
              
            }

             


         }

         System.out.println(sum);

    }
}
