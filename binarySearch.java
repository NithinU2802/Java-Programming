/******************************************************************************

Binary search....

Input: 4
1 2 3 4 t=9

Output: -1

Input: 4
2 3 5 9 t=3

Output: 1

*******************************************************************************/

import java.util.*;

public class Main
{
    public static int findElement(int[] arr,int target){
        int start=0,end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid;
            else start=mid+1;
        }
        return -1;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.print("Binary Search Input should be in sorted order...\n");
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) a[i]=x.nextInt();
	int t=x.nextInt();
	System.out.print(findElement(a,t));
	}
}
