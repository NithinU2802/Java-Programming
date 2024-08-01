/***********************************************************

    Spiral Traversal of an Matrix 
    
**********************************************************/

import java.util.*;

public class NonSqrSprial
{
	public static ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        int ss=0,se=matrix.length-1,es=0,ee=matrix[0].length-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(ss<=se && es<=ee){
            for(int j=es;j<=ee;j++)
                res.add(matrix[ss][j]);
            ss++;
            for(int i=ss;i<=se;i++)
                res.add(matrix[i][ee]);
            ee--;
            if(ss<=se){
                for(int j=ee;j>=es;j--)
                    res.add(matrix[se][j]);
                se--;
            }
            if(es<=ee){
                for(int i=se;i>=ss;i--)
                    res.add(matrix[i][es]);
                es++;
            }
        }
      
        return res;
    }
	
	public static void main(String[] arg){
	    int[][] a={{1,2,3,4},{3,4,5,6}};
	    for(int i:spirallyTraverse(a))
	        System.out.print(i+" ");
	}
	
}
