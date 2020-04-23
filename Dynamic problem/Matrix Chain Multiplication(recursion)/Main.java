import java.util.*;
public class Main
{
    public static int MCM(int arr[],int i, int j)
    {
        int min=99999;
        if(i>=j)
        {
            return 0;
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
        return min;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
	
		System.out.println(MCM(arr,1,n-1));
	}
}
