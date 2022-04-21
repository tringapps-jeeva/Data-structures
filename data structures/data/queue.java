package data;
import java.util.*;
public class queue
{
Scanner s=new Scanner(System.in);
public
 int que[]=new int[3];
public
 int front=-1;
int rear=-1;
public void enqueue(int item)
 {  
    if(front==-1)
     front=0;
    rear++;
    que[rear]=item;
 }
 public void  dequeue()
  {
   int p=0;
    if(front==-1||rear<0)
     System.out.println("queue is empty");
   else
    {
      p=que[front];
      front++;
   System.out.println("Deleted element is:"+p);  
}
  }
public void display()
{
       int i; 
                    if(front==-1||rear<0)
                       System.out.println("Queue is empty");
else
{
                       System.out.println("Display");
                     for(i=front;i<=rear;i++)
                     {
                       System.out.print(que[i]+ " ");
                     }
                     System.out.println();
}
}
public void callqueue()
{
int ch=0;
 do
    {
      System.out.println("Enter 1.ENQUEUE 2.DEQUEUE 3.DISPLAY 4.EXIT");
      System.out.println("Enter your choice:");
      ch=s.nextInt();
      switch(ch)
      {
        case 1:
        if(rear==2)
        System.out.println("queue is full");
        else
        {
                  System.out.println("Enter a element:");
                  int m=s.nextInt();
                  enqueue(m);
        }
                  break;
        case 2:
               dequeue();
        break;
        case 3:
           display();
                     break;
      case 4:
	return;
         default:
                   System.out.println("Invalid choice");
//System.exit(0);
                   break;
               }
              }while(ch<=3);
}
}
