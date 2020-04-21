import java.util.*;
public class Main
{
    public static int LCS(char x[],char y[],int n,int m )
    {
        if(n==0|| m==0)
        {
            return 0;
        }
        if(x[n-1]==y[m-1])
        {
           return 1+LCS(x,y,n-1,m-1);
        }
        else{
            return Math.max(LCS(x,y,n-1,m),LCS(x,y,n,m-1));
        }
    }
	public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  String s1= sc.next();
	  String s2= sc.next();
	  char[] ch1=s1.toCharArray();
	  char[] ch2=s2.toCharArray();
	  System.out.println(LCS(ch1,ch2,ch1.length,ch2.length));
	}
}
