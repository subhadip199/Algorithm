import java.util.*;
public class Main
{

  public static StringBuffer LCS (char x[], char y[], int n, int m)
  {
    int[][] t = new int[n + 1][m + 1];
    StringBuffer sb = new StringBuffer ("");
    for (int i = 0; i <= n; i++)
      {

	for (int j = 0; j <= m; j++)
	  {

	    if (i == 0 || j == 0)
	      {
		t[i][j] = 0;
	      }
	    else if (x[i - 1] == y[j - 1])
	      {
		t[i][j] = 1 + t[i - 1][j - 1];
	      }
	    else
	      {
		t[i][j] = Math.max (t[i - 1][j], t[i][j - 1]);
	      }
	  }
      }
    int i = n, j = m;
    while (i > 0 && j > 0)
      {
	if (x[i - 1] == y[j - 1])
	  {
	    sb.append (x[i - 1]);
	    i--;
	    j--;
	  }
	else
	  {
	    if (t[i][j - 1] > t[i - 1][j])
	      {
		j--;
	      }
	    else
	      {
		i--;
	      }
	  }
      }

    return sb.reverse ();
  }
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
    String s1=sc.next ();
    StringBuffer st = new StringBuffer(s1);
    st.reverse();
    String s2=st.toString();
    char[] ch1 = s1.toCharArray ();
    char[] ch2 = s2.toCharArray ();
    System.out.println (LCS (ch1, ch2, ch1.length, ch2.length));
  }
}
