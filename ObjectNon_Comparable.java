import java.util.*;

class Node{
    int a,b;
    Node(int a,int b){
        this.a=a;
        this.b=b;
    }
}

public class ObjectNon_Comparable
{
	public static void main(String[] args) {
	HashMap<Node,Integer> map=new HashMap<Node,Integer>();
	Node m=new Node(8,9);
	Node n=new Node(8,9);
	map.put(m,1);
	map.put(n,map.get(n)+1);
	System.out.println(map.get(n));
	}
}
