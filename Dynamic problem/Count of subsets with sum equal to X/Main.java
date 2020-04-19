import java.util.*;

public class Main
{
 
    public static int knapsack(int wt[] , int w, int n)
    {
        if(w==0&&n==0)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
            
        }
        if(w==0 )
        {
            return 1;
        }
     
       else if(wt[n-1]>w)
        {
            return  knapsack(wt,w,n-1);
        }
        else{
            return  knapsack(wt,w-wt[n-1],n-1)+knapsack(wt,w,n-1);
        }
    }
        
        
    
    
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int w= sc.nextInt();
        int[] wt=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
           wt[i]=sc.nextInt();
           
        }
      
        System.out.println();
        System.out.println(knapsack(wt,w,n));
    }
}