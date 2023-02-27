/******************************************************************************

Check whether the matrix is diagonal or not....


Input: 4 4
       4 0 0 0
       0 5 0 0
       0 0 2 0
       0 0 0 1
Output: Yes

Input: 4 4
       6 10 12 0
       0 5 0 0
       0 0 9 0
       0 0 0 1
Output: No

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) a[i][j]=x.nextInt();
	for(int i=0;i<r;i++)
	    for(int j=0;j<c;j++){
	        if( (i==j && a[i][j]==0)|| ( i!=j && a[i][j]!=0) ){
	            System.out.print("No");
	            return;
	        }
	    }
	System.out.print("Yes");
	}
}
