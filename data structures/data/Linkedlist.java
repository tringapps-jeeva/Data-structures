package data;
import java.util.*;
public class Linkedlist 
{          
  public  class Node
{    
        int data;    
        Node next;             
        public Node(int data)
 {    
        this.data = data;    
         this.next = null;    
  }    
  }    
     
    public Node head = null;    
    public Node tail = null;         
       
    public void addNode(int data)
 {              
        Node newNode = new Node(data);    
                     
        if(head == null)
       {                
            head = newNode;    
            tail = newNode;    
        }    
        else
       {    
            tail.next = newNode;        
            tail = newNode;    
        }    
    }       
    public void display()
 {    
       Node current = head;    
      if(head == null)
     {    
            System.out.println("List is empty");    
            return;    
        }    
   else
        System.out.println("Nodes of singly linked list: ");    
        while(current != null)
      {        
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
public void calllink()
{
 Scanner s=new Scanner(System.in);
int ch=0;
do
{
       System.out.println("1.Push  2.Display 3.Exit");
       System.out.print("enter your choice:");
       ch=s.nextInt();
       switch(ch)
{
case 1:
System.out.print("enter data:");
int m=s.nextInt();
addNode(m);
break;
case 2:
display();
break;
case 3:
return;
default:
System.out.println("Invalid choice");
break;
}
}while(ch<=2);
     /*   addNode(1);    
        addNode(2);    
        addNode(3);    
        addNode(4);    
        display();*/  
}
}

       
