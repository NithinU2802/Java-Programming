/******************************************************************************

 Reverse Words in a sentence using String buffer 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	String[] a=x.nextLine().split(" ");
	for(int i=a.length-1;i>=0;i--) sb.append(a[i]+" ");
	System.out.println(sb);
	}
}
