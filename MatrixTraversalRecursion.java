/******************************************************************************

Print martix using Recursion....

Input:
4 4
3 2 5 7
1 3 2 7
7 8 3 4
3 5 2 0

Output: 3 2 5 7 1 3 2 7 7 8 3 4 3 5 2 0


*******************************************************************************/
import java.util.*;
public class Main
{
    static int n=0,m=0;
    public static void traverse(int[][] a,int r){
        if(r>=n) return;
        for(int i=0;i<m;i++) System.out.print(a[r][i]+" ");
        traverse(a,++r);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	n=x.nextInt();
	m=x.nextInt();
	int[][] a=new int[n][m];
	for(int i=0;i<n;i++)
	for(int j=0;j<m;j++)
	a[i][j]=x.nextInt();
	traverse(a,0);
	}
}
