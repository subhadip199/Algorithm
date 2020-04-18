import java.util.*;
public class Main
{
    public static int[][] t;
    static int max(int a, int b) { return (a > b)? a : b; }
    public static int knapsack(int[] wt,int[] pr,int w,int n)
    {
        if(n==0||w==0)
        {
            return 0;
            
        }
        if(t[n][w]!=-1)
        {
            return t[n][w];
        }
       else if(wt[n-1]>w)
        {
            return  t[n][w]=knapsack(wt,pr,w,n-1);
        }
        else{
            return t[n][w]=Math.max((pr[n-1]+ knapsack(wt,pr,w-wt[n-1],n-1)),knapsack(wt,pr,w,n-1));
        }
    }
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] wt=new int[n];
		int[] pr=new int[n];

		t= new int[n+1][w+1];
		
          for(int i=0;i<=n;i++)
		{
		    for(int j=0;j<=w;j++)
		        t[i][j]=-1;
		} 
		for(int i=0;i<n;i++)
		{
		    wt[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    pr[i]=sc.nextInt();
		}
		
		System.out.println(knapsack(wt,pr,w,n));
	}
}
