package com.List;

public class Linked_List {
	Node head;
    public void Add(int data)
    {
        Node new_node = new Node(data);
        if (this.head == null)
        {
            this.head = new_node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    void Display()
    {
        Node temp = this.head;
        if (temp == null)
        {
            System.out.println("LinkedList is empty.");
            return;
        }
        while (temp != null)
        {
        	System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
