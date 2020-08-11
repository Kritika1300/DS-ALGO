import java.util.*;
class Stack {
    
    int top;
    int stack[];
    int size;
    public  Stack(int n)
    {  
        size = n;
        stack = new int[size];
        top = -1;
    }
    public void push(int data)
    {
        if(!isFull())
        {
            stack[++top] = data;
        }
        
    }
    public int pop()
    {
        if(!isEmpty())
        {
           return  stack[top--];
        }
           return -1;
           
    }
    public int  peek()
    {
        if(!isEmpty())
        {
           return  stack[top];
        }
           return -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size - 1;
    }
}
public class Main {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack(n);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(3000);
        s.push(1233);
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    
    }
    
}
