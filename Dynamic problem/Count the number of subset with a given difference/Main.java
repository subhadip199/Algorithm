import java.util.*;

public class Main
{
 public static int knapsack(int wt[] , int w, int n)
    {
        int[][] t = new  int[n+1][w+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
               
               
             if(i==0)
                {
                    
                    t[i][j]=0;
                    
                }
              else if(j==0 )
                {
                    t[0][0]=1;
                    t[i][j]=1;
                    
                    
                }
                else if(wt[i-1]<=j)
                {
                    t[i][j]=(t[i-1][j-wt[i-1]] + t[i-1][j]);
                    
                }
                else{
                    t[i][j]=t[i-1][j];
                    
                }
                
            }
            
           
        }
        
    
        
        return t[n][w];
    }
        
        
    
    
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int diff= sc.nextInt();
        int[] wt=new int[n];
        int sum=0;
        int s=0;
        for(int i=0;i<n;i++)
        {
           wt[i]=sc.nextInt();
           sum=sum+wt[i];
           
        }
        s=(diff+sum)/2;
        System.out.println();
        System.out.println(knapsack(wt,s,n));
    }
}