/******************************************************************************

convert matrix into sorted order ....

Input:
5 4 7 
1 3 8 
2 9 6 

Output:
1 2 3 
4 5 6 
7 8 9
*******************************************************************************/

import java.util.*;

public class Main
{
    public static void sort(int[][] a){
    int[] r=new int[a.length*a[0].length];
    int k=0;
    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++) r[k++]=a[i][j];
    for(int i=0;i<k-1;i++)
    if(r[i]>r[i+1]){
        int t=r[i];
        r[i]=r[i+1];
        r[i+1]=t;
        i=-1;
    }
    k=0;
    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++) a[i][j]=r[k++];
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) a[i][j]=x.nextInt();
	sort(a);
	System.out.println();
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++) System.out.print(a[i][j]+" ");
	    System.out.println();
	}
	}
}
