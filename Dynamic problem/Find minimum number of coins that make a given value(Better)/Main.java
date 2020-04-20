import java.util.*;

public class Main
{
    public static int knapsack(int wt[], int w, int n)
    {
        int[][] t = new  int[n+1][w+1];
        
        for(int j = 0; j <= w; j++){
        
			  t[0][j] = j;
		  }	      
	    
		  for(int i = 1; i <= n; i++){
			  t[i][0] = 0;
		  }
		  
		 
		  
        for(int i=1;i<=n;i++)
        {
        
          
            for(int j=1;j<=w;j++)
            {
               
                if(wt[i-1]<=j)
                {
                    t[i][j]=Math.min(1+t[i][j-wt[i-1]],t[i-1][j]);
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
        
        int tc= sc.nextInt();
        
        int w= sc.nextInt();
        
        int[] price=new int[tc];
        
        for(int i=0;i<tc;i++)
        {
           price[i]=sc.nextInt();
        }
        
        System.out.println(knapsack(price,w,tc));
    }
}