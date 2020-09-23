  import java.util.*;
class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next= null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
        
    }
     public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
     public void insertAtAnyPosition(int index,int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        for(int i=0;i<index-1;i++)
        {
         n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
     public void insertAtLast(int data)
    {
        Node node = new Node();
        node.data=data;

            Node n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        
        
    }
    public void insertBefore(int index,int data)
    {
        Node node = new Node();
        node.data=data;
        if(index == 0)
        {
           insertAtStart(data);
        }
        
        else
        {
            int count =0;
            Node n = head;
            if(head == null)
            {
                head = node;
                return;
            }
            int l=0;
            for(int i = 0; i<index-1; i++)
            {
                n=n.next;
                if(n.next != null)
                { count ++;}
                else{
                    l=count;
                    break;
                }
               
            }
            if(index>l)
            {
                
             insertAtLast(data);
              
            }
            else
            {node.next = n.next;
            n.next = node;}
        }
        
        
    }
      
    public void show()
    {
        Node n1 = head;
        while(n1.next!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
         System.out.println(n1.data);
    }
    
}

public class Main
{
	public static void main(String[] args) {
	   LinkedList l = new LinkedList();
	   l.insert(3);
	   l.insert(2);
	   l.insertBefore(0,27);
       l.show();
	}
}



