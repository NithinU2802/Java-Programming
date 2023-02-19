/******************************************************************************

Quick sort ....

Input: 2 8 4 2 1 5

Output: 1 2 2 4 5 8

Input: 9 3 5 1 2 3 8

Output: 1 2 3 3 5 8 9

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static void swap(int[] a,int s,int e){
        int t=a[s];
        a[s]=a[e];
        a[e]=t;
    }
    
    public static void QuickSort(int[] a,int l,int h){
        if(l<h){
            int p=partition(a,l,h);
            QuickSort(a,l,p-1);
            QuickSort(a,p+1,h);
        }
    }
    
    public static int partition(int[] a,int l,int h){
        int p=a[h];
        int lw=l-1;
        for(int j=l;j<h;j++){
            if(a[j]<p){
            lw++;
            swap(a,lw,j);
            }
        }
        swap(a,lw+1,h);
        return lw+1;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] a=x.nextLine().split(" ");
	int[] b=new int[a.length];
	int n=0;
	for(String i:a) b[n++]=Integer.parseInt(i);
	QuickSort(b,0,n-1);
	for(int i=0;i<n;i++) System.out.print(b[i]+" ");
	}
}
