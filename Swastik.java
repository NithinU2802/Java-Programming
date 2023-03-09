/******************************************************************************

Swastika pattern printing.....

Input: 5
 
Output:

5 * 3 2 1
4 * 2 * *
3 2 1 2 3
* * 2 * 4
5 4 3 * 5

Input: 7

Output:

7 * * 4 5 6 7
6 * * 3 * * *
5 * * 2 * * *
4 3 2 1 2 3 4
* * * 2 * * 5
* * * 3 * * 6
7 6 5 4 * * 7

*******************************************************************************/

import java.util.*;

class Main{
public static void main(String[] arg){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int m=n/2,s=n,a=n;
System.out.print(m);
char[][] r=new char[n][n];
for(int i=0;i<n;i++){
    if(i<m){
   // r[i][0]=(char)((a--)+'0');
    for(int j=0;j<m;j++){
        if(j==0) r[i][j]=(char)((a--)+'0');
        else r[i][j]='*';
    }
    for(int j=n-1;j>=m;j--){
        if(i==0 || j==m) r[i][j]=(char)((s--)+'0');
        else r[i][j]='*';
    }

    }else if(i==m){
        for(int j=0;j<m;j++) r[i][j]=(char)((a--)+'0');
        r[i][m]=(char)((a++)+'0');
        for(int j=m+1;j<n;j++) r[i][j]=(char)((a++)+'0');
    }else{
        for(int j=m;j>=0;j--){
            if(j==m || i==n-1) r[i][j]=(char)((++s)+'0');
            else r[i][j]='*';
        }
        for(int j=m+1;j<n;j++){
            if(j==n-1) r[i][j]=(char)((a++)+'0');
            else r[i][j]='*';
        }
    }
}
System.out.println();
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++) System.out.print(r[i][j]+" ");
    System.out.println();
}

}

}
