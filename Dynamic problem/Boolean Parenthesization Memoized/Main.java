import java.util.*;

public class Main
{
    public static HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
    
    public static int solu(char chr[],int i, int j,boolean ist)
    {
        int  ans=0;
        if(i>j)
        {
            return 0;
        }
        if(i==j)
        {
            if(ist==true)
            {

                return (chr[i]=='T')?1:0;
            }
            else{
              
                return (chr[i]=='F')?1:0;
            }
        }
        String str=i+" "+j+" "+ist;
        if(hm.containsKey(str))
        {
            return hm.get(str);
        }
        
        else{
              
        for(int k=i+1;k<j;k=k+2)
        {
           
            int lt=solu(chr,i,k-1,true);
            // System.out.println(lt+"Ltrue");
            int lf=solu(chr,i,k-1,false);
            // System.out.println(lf+"Lfalse");
            int rt=solu(chr,k+1,j,true);
            // System.out.println(rt+"Rtrue");
            int rf=solu(chr,k+1,j,false);
            // System.out.println(rf+"Rfalse");
            if(chr[k]=='&')
            {
                
                if(ist==true)
                {
                    ans=ans+(lt*rt);

                }
                else{
                    ans=ans+(lf*rf)+(lf*rt)+(lt*rf);

                }
            }
            if(chr[k]=='|')
            {
                if(ist==true)
                {
                    ans=ans+(lt*rt)+(lf*rt)+(lt*rf);
                }
                else{
                    ans=ans+(lf*rf);
                }
            }
            if(chr[k]=='^')
            {
                if(ist==true)
                {
                    ans=ans+(lf*rt)+(lt*rf);
                }
                else{
                    ans=ans+(lf*rf)+(lt*rt);
                }
            }
        }
      }
      
        hm.put(str,ans); 
        return ans;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st= sc.next();
		char[] chr=st.toCharArray();
		System.out.println(solu(chr,0,chr.length-1,true));
	}
}