import java.util.*;
public class Main
{
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
       else if(ispalindrome(chr,i,j))
       {
           return 0;
       }
        else{
            for(int k=i;k<j;k++)
            {
                int temp=(PPR(chr,i,k)+PPR(chr,k+1,j)+1);
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
		String st= sc.next();
		char[] chr=st.toCharArray();
		System.out.println(PPR(chr,0,chr.length-1));
	}
}
