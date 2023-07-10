/******************************************************************************

    First n fibonacci series of the given number.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int a=0,b=1;
	int s=a+b;
	for(int i=0;i<n;i++){
	    if(i==0)
	        System.out.print(a+" ");
	    else if(i==1)
	        System.out.print(b+" ");
	    else{
	        s=a+b;
	        a=b;
	        b=s;
	        System.out.print(s+" ");
	    }
	}
	}
}
