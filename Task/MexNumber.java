import java.util.*;

public class MexNumber
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int n=x.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=x.nextInt();
	    boolean[] check=new boolean[91];
	    for(int i:a)
	        check[i]=true;
	    int mex=0;
	    while(check[mex])
	        mex++;
	    int[] fq=new int[mex+1];
	    for(int i:a)
	        if(i<mex)
	            fq[i]++;
	            
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < mex; i++)
            if (fq[i] == 0){
                System.out.println("-2");
                return;
            }else
                res=Math.min(res,fq[i]);
        System.out.println(res==Integer.MAX_VALUE?-2:res);
	}
}
