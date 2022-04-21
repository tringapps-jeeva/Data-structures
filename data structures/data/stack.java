package data;
import java.util.*;
public class stack
{
Scanner s=new Scanner(System.in);
public
int stk[]=new int[3];
public
int tos=-1;
/*public stack()
{
tos=-1;
}*/
public void push(int item)
{
tos++;
stk[tos]=item;
}
public void pop()
{
if(tos<0)
{
System.out.println("stack is empty");
}
else
{
int p=stk[tos];
tos--;
System.out.println("the popped element is :"+p);
}
}
public void display()
{
if(tos<0)
{
System.out.println("stack is empty");
}
else
{
System.out.print("display:");
for(int i=tos; i>=0; i--)
System.out.print(stk[i]+" ");
}
System.out.println();

}
public void callstack()
{
int ch=0;
do
{
System.out.println("1.PUSH 2.POP 3.DISPLAY 4.EXIT");
System.out.print("enter your choice:");
ch=s.nextInt();
switch(ch)
{
case 1:
if(tos==2)
System.out.println("STACK IS FULL");
else
{
System.out.print("enter data:");
int m=s.nextInt();
push(m);
}
break;
case 2:
pop();
break;
case 3:
display();
break;
case 4:
return;
default:
System.out.println("invalid choice");
//System.exit(0);
break;
}
}while(ch<=3);

}
}