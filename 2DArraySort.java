/******************************************************************************

 Sorting 2-Dimensional Array...!
 
Input:
4
2 3 6 1
4 5 10 11
14 16 7 9
8 12 15 13


Output:
1 2 3 4 
5 6 7 8
9 10 11 12
13 14 15 16

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in); 
	int n=x.nextInt();
	
	int[][] mat=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	mat[i][j]=x.nextInt();
	
	// Flating the elements ans sorted..
	int[] flat=Arrays.stream(mat).flatMapToInt(Arrays::stream).toArray();
	Arrays.sort(flat);
	
	int k=0;
	for(int i=0;i<n;i++)
	    for(int j=0;j<n;j++)
	        mat[i][j]=flat[k++];
	
	System.out.println();
	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++)
	    System.out.print(mat[i][j]+" ");
	    System.out.println();
	}
	
	}
}
