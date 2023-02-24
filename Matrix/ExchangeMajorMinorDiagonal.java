/******************************************************************************

Swap major and minor diagonals of the given matrix....

major - top left to bottom right
minor - top right to bottom left

Input : 3
        0 1 2
        3 4 5
        6 7 8

Output : 2 1 0
         3 4 5
         8 7 6


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
	int r=0,c=n-1;
	for(int i=0;i<n;i++){
	int t=a[i][i];
	a[i][i]=a[r][c];
	a[r][c]=t;
	r++;
	c--;
	}
	System.out.println();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++) System.out.print(a[i][j]+" ");
	    System.out.println();
	}
	}
}
