class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None
    def insert(self,data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
        else:
            n = self.head
            while n.next != None:
                n = n.next
            n.next = newNode
    def traverse(self):
        n = self.head
        while n != None:
            print(n.data,end = " ")
            n = n.next
            
my_list = LinkedList()
my_list.insert(3)
my_list.insert(2)
my_list.insert(31)
my_list.insert(39)
my_list.traverse()

