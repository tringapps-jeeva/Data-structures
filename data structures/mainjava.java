import data.*;
import java.util.*;
public class mainjava
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
do
{
System.out.println("1.STACK  2.QUEUE 3.LINKED LIST 4.EXIT");
System.out.print("enter your choice:");
int get=s.nextInt();
switch(get)
{
case 1:
stack st=new stack();
st.callstack();
break;
case 2:
queue q=new queue();
q.callqueue();
break;
case 3:
Linkedlist l= new Linkedlist();             
l.calllink();      
break;
case 4:
System.out.print("EXITING....");
System.exit(0);
default:
System.out.print("invalid choice");
System.exit(0);
break;
}
}while(true);
}
}