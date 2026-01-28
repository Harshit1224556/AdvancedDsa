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



    return nsr;

  }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        

        
    } 
}
