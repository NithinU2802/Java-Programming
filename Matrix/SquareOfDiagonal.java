/******************************************************************************

Square of matrix diagonals............


Input: 3
         1 2 3
         4 5 6
         7 8 9
Output :  Diagonal one: 1 25 81
         Diagonal two: 9 25 49
         
Inpu: 3 
         2 5 7  
         3 7 2
         5 6 9
Output :  Diagonal one : 4 49 81
         Diagonal two : 49 49 25


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
	System.out.println();
	for(int i=0;i<n;i++) System.out.print(a[i][i]*a[i][i]+" ");
	System.out.println();
	while(r<n)
	{
	System.out.print(a[r][c]*a[r][c]+" ");
	r++;
	c--;
	}
	
	}
}
