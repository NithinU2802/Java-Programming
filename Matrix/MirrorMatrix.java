/******************************************************************************

Display the Mirror of the given matrix....


Input : 3
        1 2 4
        5 9 0
        3 1 7
Output :  1 5 3 
          2 9 1
          4 0 7

Input : 4
        1  2  3  4 
        5  6  7  8 
        9  10 11 12
        13 14 15 16
Output : 1 5 9 13 
         2 6 10 14  
         3 7 11 15 
         4 8 12 16 
         
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
	int[][] r=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++) r[i][j]=a[j][i];
	System.out.printn();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++) System.out.print(r[i][j]+" ");
	    System.out.println();
	}
	}
}
