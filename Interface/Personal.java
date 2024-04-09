/******************************************************************************

    Working Interface 

*******************************************************************************/

import java.io.*;


interface Interface {
    final int a = 71;
    void name();
    void dept();
}

class Personal implements Interface {
  
    public void name(){ 
      System.out.println("Nithin U"); 
    }
    
    public void dept(){ 
      System.out.println("CSE"); 
    }

    public static void main(String[] args){
        Main t = new Main();
        t.name();
        t.dept();
        System.out.println(a);
    }
}

