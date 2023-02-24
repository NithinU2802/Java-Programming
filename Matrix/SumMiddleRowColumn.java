/******************************************************************************

Sum of middle elements of a ratrix row and columns............


Input : 3
         2 5 7
         3 7 2
         5 6 9
Output : 12
         18

Input :  5
         1 3 5 6 7
         3 5 3 2 1
         1 2 3 4 5
         7 9 2 1 6
         9 1 5 3 2
Output : 15
         18


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
	int r=0,c=0;
	for(int j=0;j<n;j++) r+=a[n/2][j];
	if(n%2==0)
	for(int j=0;j<n;j++) r+=a[(n/2)-1][j];
	for(int i=0;i<n;i++) c+=a[i][n/2];
	if(n%2==0)
	for(int i=0;i<n;i++) c+=a[i][(n/2)-1];
	System.out.println();
	System.out.println(r);
	System.out.println(c);
	}
}
