import java.util.*;
import operation.*;

class Main {

public static void main(String[] args)
{

Scanner x=new Scanner(System.in);
Login log=new Login();
Register reg=new Register();

int ch,f=0;
String id,pass,name,con;

do{
do{
System.out.print("\nWELCOME TO MY PAGE");
System.out.println("\n1.Login\n2.Register\n");
System.out.println("Enter Your Choice: ");
ch=x.nextInt();
x.nextLine();
}while(ch>2 && ch<=0);

if(ch==1){
System.out.print("Enter Your ID: ");
id=x.nextLine().trim();
System.out.print("Enter Your Password: ");
pass=x.nextLine().trim();
if(log.check(id,pass)) f=1; 
else System.out.println("Invalid Credientials Please Try Again"); 
}else{

do{
do{
System.out.print("Enter Your Name :");
name=x.nextLine().trim();
System.out.print("Enter Your id : ");
id=x.nextLine();
System.out.print("Create your password: ");
pass=x.nextLine().trim();
System.out.print("Confirm Your Password: ");
con=x.nextLine().trim();
if(!pass.equals(con)) System.out.println("Renter the data as Password doesn't match.... ");
}while(!pass.equals(con));
}while(!reg.enter(name,id,pass));

System.out.println("Registered Successfully");
}
}while(f==0);

System.out.println(reg.getName(id)+" Congratulations You Are Logged in Successfully....");

}
}