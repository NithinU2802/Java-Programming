/******************************************************************************

shift columns of the Matrix for the given value..........

Input : 3
        1 2 3
        4 5 6
        7 8 9
        2
Output : 3 1 2
         6 4 5
         9 7 8

Input : 4
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
        2
Output :3 4 1 2
        7 8 5 6
        11 12 9 10
        15 16 13 14
                     
Note: Matrix should be a square matrix 

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
	int k=x.nextInt();
	int s=0;
	while(k>0){
	    for(int i=0;i<n;i++){
	    int t=a[i][0];
	    for(int j=1;j<n;j++) a[i][j-1]=a[i][j];
	    a[i][n-1]=t;
	    }
	    k--;
	}
	
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++) System.out.print(a[i][j]+" ");
	System.out.println();
	}
	
	}
}
