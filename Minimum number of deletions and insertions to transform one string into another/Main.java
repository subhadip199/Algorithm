import java.util.*;
public class Main
{
    public static int LCS(char x[],char y[],int n,int m )
    {
        int[][] t= new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            
            for(int j=0;j<=m;j++){
                
            if(i==0|| j==0)
            {
                t[i][j]= 0;
            }
            else if(x[i-1]==y[j-1])
            {
               t[i][j]= 1+t[i-1][j-1];
            }
            else{
                t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
            }
          }
        }
        return t[n][m];
    }
	public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  String s1= sc.next();
	  String s2= sc.next();
	  char[] ch1=s1.toCharArray();
	  char[] ch2=s2.toCharArray();
	  int com=LCS(ch1,ch2,ch1.length,ch2.length);
	  int delete=ch1.length-com;
	  int insert=ch2.length-com;
	  System.out.println("delete from s1 : "+delete);
	  System.out.println("insert from s2 : "+insert);
	}
}