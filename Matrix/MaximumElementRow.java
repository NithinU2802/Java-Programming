/******************************************************************************

Maximum element of row in a matrix....

Input :  3 3
         [1, 2, 3]
         [1, 4, 9]
         [76, 34, 21]

Output :
3
9
76

Input : 3 4
        [1, 2, 3, 21]
        [12, 1, 65, 9]
        [1, 56, 34, 2]
Output :
21
65
56

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
	for(int i=0;i<r;i++){
	int m=a[i][0];
	for(int j=1;j<c;j++)
	    if(m<a[i][j]) m=a[i][j];
	System.out.println(m);
	}
	}
}
