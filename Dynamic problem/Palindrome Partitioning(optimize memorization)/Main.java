import java.util.*;
public class Main
{
    public static int[][] t;
    public static boolean ispalindrome(char ch[],int i,int j)
    {
    String rev="";  
    String rev1="";
    for(int k=i;k<=j;k++)
    {
        rev1+=ch[k];
    }
    for(int k=j;k>=i;k--){  
        rev+=ch[k];  
    }  
    // System.out.println(rev+" "+rev1.equals(rev));
    return rev1.equals(rev);
    }
    public static int PPR(char chr[],int i, int j)
    {
        int min=99999;
        if(i>=j)
        {
            return 0;
        }
        if(ispalindrome(chr,i,j))
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
                int left=0;
                int right=0;
                if(t[i][k]!=-1)
                {
                    left=t[i][k];
                }
                else{
                   left= PPR(chr,i,k);
                }
                if(t[k+1][j]!=-1)
                {
                    right=t[k+1][j];
                }
                else{
                   right= PPR(chr,k+1,j);
                }
                
                int temp=(left+right+1);
                
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
		String st= sc.next();
		char[] chr=st.toCharArray();
		t= new int [chr.length+1][chr.length+1];
		for(int i=0;i<=chr.length;i++)
		{
		    for(int j=0;j<=chr.length;j++)
		    {
		        t[i][j]=-1;
		        
		    }
		}
		System.out.println(PPR(chr,0,chr.length-1));
	}
}
