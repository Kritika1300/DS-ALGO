import java.util.*;
class Node{
    int data;
    Node next;
}
class Queue{
    Node front;
    Node rear;
    int size;
    Queue()
    {
      front = null;
      rear = null;
      int size = 0;
    }
    Node head;
     public void enqueue(int data)
    {
        Node n = new Node();
        n.data = data;
         size ++;
        if(front == null && rear == null)
        {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
        
       
    }
    public int dequeue()
    {
        if(front != null)
        {
         Node val = front;
         front = front.next;
            if(front == null)
            { rear = null; }
            size --;
         return val.data;
        }
        return -1;
    }
    public int getSize()
    {
        return size;
    }
   
}
public class Main
{
	public static void main(String[] args) {
	Queue q = new Queue();
	    q.enqueue(20);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
	    int s = q.getSize();
		for(int j =0 ; j<s ; j++)
		{ System.out.println(q.dequeue());}

}
}

