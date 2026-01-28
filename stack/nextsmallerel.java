import java.util.*;
public class nextsmallerel {
   public static int [] nextsmallerleft(int arr[]){
       int n = arr.length;
       int nsl [] = new int[n];
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<n;i++){
        while(!st.empty() && st.peek()>arr[i]) st.pop();
        if(st.empty()){
            nsl[i] = -1;
        }
        else{
            nsl[i]=st.peek();
        }
        st.push(arr[i]);
    }
       return nsl;

    }
 
  public static int[] nextsmallerright(int arr[]){

    int n = arr.length;
    int nsr[] = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=n-1;i>=0;i--)
    {


        while(!st.empty() && st.peek()>arr[i]) st.pop();
        if(st.empty()){
            nsr[i]=n;
        }

        else{
            nsr[i] = st.peek();
        }
        st.push(arr[i]);
    }


    return nsr;

  }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int nsl[] = nextsmallerleft(arr);
        int nsr[] = nextsmallerright(arr);

 long  sum = 0;
int MOD = 1000000007;

        for(int i=0;i<n;i++){

            long lf = i-nsl[i];
            long  rf = nsr[i]-i;
             long  totalsub = (lf*rf)%MOD;
              long totalsum = (totalsub*arr[i])%MOD;
             sum=(sum+totalsum)%MOD;


        }

        System.out.println(sum);


        
    } 
}
