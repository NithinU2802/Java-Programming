/******************************************************************************

	Bubble sort implementation...

Input:
4
1 4 3 9
Output:
1 3 4 9

Input:
8 
2 7 1 9 1 3 4 1
Output:
1 1 1 2 3 4 7 9

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-i-1;j++){
	        if(a[j]>a[j+1]){
	            int t=a[j];
	            a[j]=a[j+1];
	            a[j+1]=t;
	        }
	    }
	}
	
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	
	}
}
