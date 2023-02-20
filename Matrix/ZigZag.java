/******************************************************************************

traverse a matrix in zigzag order.....

Input: 
1 2 3
4 5 6
7 8 9

Output: 
1 2 4 7 5 3 6 8 9

*******************************************************************************/

import java.util.*;

public class Main{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int r=x.nextInt(),c=x.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++) a[i][j]=x.nextInt();
	int i=0,j=0,f=0,co=0;
	System.out.println();
	while(i!=j || i==0 && j==0){
	   if(f==0){
	       int k=i,l=j;
	       while(l>=0 && k<=j){
	           if(k<c && l<r)
	           System.out.print(a[l][k]+" ");
	           k++;
	           l--;
	       }
	       f=1;
	   }else{
	       int k=i,l=j;
	       while(k<=j && l>=0){
	           if(k<r && l<c)
	           System.out.print(a[k][l]+" ");
	           l--;
	           k++;
	       }
	       f=0;
	   }
	   if(j<c-1) j++;
	   else i++;
	}
	if(i<r && j<c)
	System.out.print(a[i][j]);
	
	
	}
}
