/******************************************************************************

Given a matrix of distinct values and a sum. The task is to find all the pairs in
a given matrix whose summation is equal to the given sum. Each element of a pair 
must be from different rows i.e; the pair must not lie in the same row.

Examples:  

Input : r=4 c=4 
1 3 2 4
5 8 7 6
9 10 13 11
12 0 14 15
s= 11
Output: (1, 10), (3, 8), (2, 9), (4, 7), (11, 0),

*******************************************************************************/

import java.util.*;

class Main{
    
    public static boolean contain(int k,int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==k) return true;
            }
        }
        return false;
    }
    
    public static boolean check(int[] a,int b){
        for(int i=0;i<a.length;i++)
        if(a[i]==b) return true;
        return false;
    }
    
    
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int r=x.nextInt(),c=x.nextInt();
    int[][] a=new int[r][c];
    for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    a[i][j]=x.nextInt();
    int s=x.nextInt();
    int[] r1=new int[r*c];
    int[] r2=new int[r*c];
    int k=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(contain(s-a[i][j],a)){
                if(check(r2,a[i][j]) && check(r1,s-a[i][j]))
                continue;
                int f=0;
                for(int l=0;l<c;l++)
                if(a[i][l]==s-a[i][j]){
                    f=1;
                    break;
                }
                if(f==1) continue;
                r1[k]=a[i][j];
                r2[k++]=s-a[i][j];
            }
        }
    }
    for(int i=0;i<k;i++)
    System.out.print("("+r1[i]+","+r2[i]+"),");
    
}
}
