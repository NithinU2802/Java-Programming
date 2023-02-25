/******************************************************************************

Check Matrix is indempotent Matrix or Not.....

Input : 2
        3 -6
        1 -2
Output : Idempotent

Input : 3
        2 -2 -4
        -1 3 4
        1 -2 -3
Output : Idempotent

Formula: n*n=n is indempotent....

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++) a[i][j]=x.nextInt();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
	        int s=0;
	        for(int k=0;k<n;k++) s+=(a[i][k]*a[k][j]);
	       if(s!=a[i][j]){ System.out.print("NOT Indempotent"); return; }
	    }
	}
	System.out.print("Indempotent");
	}
}
