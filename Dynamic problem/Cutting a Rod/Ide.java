import java.util.*;

public class Main
{
 
    public static int knapsack(int wt[] , int pr[], int w, int n)
    {
        int[][] t = new  int[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0||j==0)
                {
                    
                    t[i][j]=0;
                    
                }
                else if(wt[i-1]<=j)
                {
                    t[i][j]=Math.max(pr[i-1]+t[i][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
           
        }
        
        //  for(int i=0;i<=n;i++)
        // {
        //     for(int j=0;j<=w;j++)
        //     {
        //         System.out.print(t[i][j]+" ");
        //     }
            
        //   System.out.println();
        // }
        
        return t[n][w];
    }
    
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len= sc.nextInt();
        int[] length=new int[len];
        int[] price=new int[len];
        for(int i=0;i<len;i++)
        {
           length[i]=i+1;
        }
        for(int i=0;i<len;i++)
        {
           price[i]=sc.nextInt();
        }
        
        System.out.println(knapsack(length,price,len,len));
    }
}