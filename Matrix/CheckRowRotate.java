/******************************************************************************

Check all rows of the form of rotational array....

Input: 3
    1 2 3
    3 1 2
    2 3 1
Output:  Yes


Input: 3
    1 2 3
    3 2 1
    1 3 2
Output:  No


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
	int[] b=new int[n];
	System.out.print(check(a,b));
	}
	
	public static String check(int[][] a,int[] b){
	int n=b.length;
	for(int j=0;j<n;j++) b[j]=a[0][j];
	rotate(b);
	for(int i=1;i<n;i++){
	    for(int j=0;j<n;j++)
	    if(a[i][j]!=b[j]) return "No";
	    rotate(b);
	}
	return "Yes";
	}
	
	public static void rotate(int[] b){
	    int t=b[b.length-1];
	    for(int i=b.length-1;i>0;i--) b[i]=b[i-1];
	    b[0]=t;
	}
}
