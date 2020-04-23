import java.util.*;
public class Main
{
    public static int[][] t;
    public static int MCM(int arr[],int i, int j)
    {
        int min=99999;
        if(i>=j)
        {
            return 0;
        }
        if(t[i][j]!=-1)
        {
            return t[i][j];
        }
        else{
            for(int k=i;k<j;k++)
            {
                int temp=(MCM(arr,i,k)+MCM(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]));
                if(temp<min)
                {
                    min=temp;
                }
            }
            
        }
        return t[i][j]=min;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		t= new int[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
		    for(int j=0;j<=n;j++)
		    {
		        t[i][j]=-1;
		    }
		}
		System.out.println(MCM(arr,1,n-1));
	}
}
