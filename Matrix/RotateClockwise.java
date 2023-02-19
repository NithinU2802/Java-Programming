/******************************************************************************

Rotate matrix in clockwise direction....

Input
3 3
1    2    3
4    5    6
7    8    9

Output:
4    1    2
7    5    3
8    9    6

Input:
4 4
1    2    3    4    
5    6    7    8
9    10   11   12
13   14   15   16

Output:
5    1    2    3
9    10   6    4
13   11   7    8
14   15   16   12

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static void clockwise(int[][] a,int m,int n){
    int r=0,c=0,v,p;
    while(r<m && c<n){
        if(r+1==m || c+1==n) break;
        p=a[r+1][c];
        for(int j=c;j<n;j++){
            v=a[r][j];
            a[r][j]=p;
            p=v;
        }
        r++;
        for(int i=r;i<m;i++){
            v=a[i][n-1];
            a[i][n-1]=p;
            p=v;
        }
        n--;
        if(r<m){
            for(int j=n-1;j>=c;j--){
                v=a[m-1][j];
                a[m-1][j]=p;
                p=v;
            }
        }
        m--;
        if(c<n){
            for(int i=m-1;i>=r;i--){
                v=a[i][c];
                a[i][c]=p;
                p=v;
            }
        }
        c++;
    }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int m=x.nextInt(),n=x.nextInt();
	int[][] a=new int[m][n];
	for(int i=0;i<m;i++)
	for(int j=0;j<n;j++) a[i][j]=x.nextInt();
	clockwise(a,m,n);
	System.out.println();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++) System.out.print(a[i][j]+" ");
	    System.out.println();
	}
	}
}
