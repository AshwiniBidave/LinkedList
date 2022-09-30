package com.List;

public class Linked_List{
	Node head;
	public void Add(int data)
    {
        Node node = new Node(data);
        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
          Node temp = head;
          while (temp.next != null)
        {
           temp = temp.next;
        }
            temp.next = node;
        }
    }
   
      public void Display()
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
      public void SortedList(int data)
      {
          Node newNode = new Node(data);
          Node Current;
          if (head == null || head.data >= newNode.data)
          {
              newNode.next = head;
              head = newNode;
          }
          else
          {
              Current = head;
              while (Current.next != null && Current.next.data < newNode.data)
                  Current = Current.next;

              newNode.next = Current.next;
              Current.next = newNode;
          }
      }
        	   

 }
            