/******************************************************************************

program to print integers in desired pattern which depends on the Output...

Input:
5

Output:
1 6 10 13 15
2 7 11 14
3 8 12 
4 9
5 

Input:
6

Output:
1 7 12 16 19 21
2 8 13 17 20
3 9 14 18
4 10 15
5 11
6

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=1;i<=n;i++){
	    System.out.print(i+" ");
	    int k=n,l=i+k;
	    for(int j=1;j<n-i+1;j++){
	        System.out.print(l+" ");
	        k--;
	        l+=k;
	    }
	    System.out.println();
	}
	}
}
