/******************************************************************************

Print Identity Matrix for the given Integer....


Input  : 2
Output : 1 0
         0 1

Input :  4
Output : 1 0 0 0
         0 1 0 0
         0 0 1 0
         0 0 0 1

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        if(i==j) System.out.print("1 ");
	        else System.out.print("0 ");
	    }
	    System.out.println();
	}
	}
}
