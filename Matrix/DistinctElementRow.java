/******************************************************************************

Find distinct elements of the rows in a matrix.....

Input : mat[][] = {  {2, 1, 4, 3},
                     {1, 2, 3, 2},  
                     {3, 6, 2, 3},  
                     {5, 2, 5, 3}  }
Output : 2 3

Input : mat[][] = {  {12, 1, 14, 3, 16},
                     {14, 2, 1, 3, 35},  
                     {14, 1, 14, 3, 11},  
                     {14, 25, 3, 2, 1},
                     {1, 18, 3, 21, 14}  }
Output : 1 3 14

*******************************************************************************/

import java.util.*;

public class Main{
    
    public static void sort(int[] a,int k){
        for(int i=0;i<k-1;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) a[i][j]=x.nextInt();
	int[] rs=new int[a[0].length];
	int k=0;
	for(int n:a[0]){
	    int co=0;
	    for(int i=0;i<r;i++)
	    for(int j: a[i]) if(n==j){ co++; break; }
	    if(co==r) rs[k++]=n;
	}
	sort(rs,k);
	for(int i=0;i<k;i++) System.out.print(rs[i]+" ");
	
	}
}
