/******************************************************************************

Matrix multiplication......

Input: 
2 2
1 1 
2 2

2 2
1 1
2 2
Output:
3 3 
6 6

Input: 
3 2
1 1
2 2 
3 3

2 3
1 1 1
2 2 2
Output: 
3 3 3
6 6 6
9 9 9

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r1=x.nextInt(),c1=x.nextInt();
	int[][] a=new int[r1][c1];
	for(int i=0;i<r1;i++)
	for(int j=0;j<c1;j++) a[i][j]=x.nextInt();
	int r2=x.nextInt(),c2=x.nextInt();
	for(int i=0;i<r2;i++)
	for(int j=0;j<c2;j++) a[i][j]=x.nextInt()
	
	}
}
