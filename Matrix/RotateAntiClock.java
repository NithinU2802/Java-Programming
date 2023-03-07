/******************************************************************************

Rotate a matrix 90* in anti-clockwise....

Input:
 1  2  3
 4  5  6
 7  8  9
Output:
 3  6  9 
 2  5  8 
 1  4  7 


Input:
 1  2  3  4 
 5  6  7  8 
 9 10 11 12 
13 14 15 16 
Output:
 4  8 12 16 
 3  7 11 15 
 2  6 10 14 
 1  5  9 13


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
	for(int i=0;i<n;i++)
	    for(int j=i;j<n;j++){
	        int t=a[i][j];
	        a[i][j]=a[j][i];
	        a[j][i]=t;
	    }
	   System.out.println();
	for(int i=n-1;i>=0;i--){
	for(int j=0;j<n;j++) System.out.print(a[i][j]+" ");
	System.out.println();
	}
	}
}
