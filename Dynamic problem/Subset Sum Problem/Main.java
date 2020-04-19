import java.util.*;

public class Main
{
 
    public static boolean knapsack(int wt[] , int w, int n)
    {
        boolean[][] t = new  boolean[n+1][w+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
               
             if(i==0)
                {
                    
                    t[i][j]=false;
                    
                }
              else if(j==0 )
                {
                    
                    t[i][j]=true;
                    
                }
                else if(wt[i-1]<=j)
                {
                    t[i][j]=(t[i-1][j-wt[i-1]] || t[i-1][j]);
                    
                }
                else{
                    t[i][j]=t[i-1][j];
                    
                }
                
            }
            
           
        }
        t[0][0]=true;
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
        int n= sc.nextInt();
        int w= sc.nextInt();
        int[] wt=new int[n];
        // int[] pr=new int[n];
        for(int i=0;i<n;i++)
        {
           wt[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //   pr[i]=sc.nextInt();
        // }
        System.out.println();
        System.out.println(knapsack(wt,w,n));
    }
}

