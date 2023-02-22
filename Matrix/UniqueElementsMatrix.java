/******************************************************************************

Finding unique elements in a matrix....

Input :  3 4
         20  15  30  2
         2   3   5   30
         6   7   6   8
Output : 3  20  5  7  8  15 

Input :  4 3
         1  2  3  
         5  6  2
         1  3  5
         6  2  2
Output : -1

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt(),m=0,f=0;
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++){ a[i][j]=x.nextInt();
	if(m<a[i][j]) m=a[i][j];
	}
	int[] res=new int[m+1];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) res[a[i][j]]++;
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) if(res[a[i][j]]==1){ System.out.print(a[i][j]+" "); f=1; }
	if(f==0) System.out.print("-1");
	}
}
