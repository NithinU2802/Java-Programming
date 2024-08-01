/***********************************************************

    Strink the array with pairing the elements 

Input:
1 2 3 4

Output:
1 2 3 4
3 7
10


**********************************************************/

import java.util.*;

public class StrinkArray
{
	public static void getPattern(int[] a,int n){
	    Arrays.sort(a);
	    while(n>1){
	        for(int i=0;i<n;i++)
	            System.out.print(a[i]+" ");
	        System.out.println();
	        if(n%2==0){
	            int k=0;
	            for(int i=0;i<n;i+=2)
	                a[k++]=a[i]+a[i+1];
	            n/=2;
	        }else{
	            int k=0;
	            for(int i=0;i<n-1;i+=2)
	                a[k++]=a[i]+a[i+1];
	            a[k]=a[n-1];
	            n=(n/2)+1;
	        }
	    }
	    System.out.println(a[0]);
	}
	
	public static void main(String[] arg){
	    int[] a={1,2,3,4};
	    getPattern(a,4);
	}
	
}
