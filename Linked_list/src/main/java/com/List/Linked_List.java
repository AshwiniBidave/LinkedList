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
    public  Node InserAtParticularPosition(int position, int data)
    {
        Node newNode = new Node(data);
   
        if (position < 1)
        {
            System.out.println("Invlid position...");
        }
        if (position == 1)
        {
            newNode.next = this.head;
            head = newNode;
        }
        else
        {
          while (position-- != 0)
        {
           if (position == 1)
        {
           newNode.next = this.head.next;
           head.next = newNode;
           break;
        }
           head = head.next;
        }

        if (position != 1)
        System.out.println("Position out of range...");
        }
        
        return head;
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
      Node RemoveFirstNode()
      {
          if (this.head == null)
          {
              return null;
          }
          this.head = this.head.next;
          return this.head;
      } 
      Node RemoveLastNode()
      {
          if (head == null)
          {
              return null;
          }
          if (head.next == null)
          {
              return null;
          }
          Node NewNode = head;
          while (NewNode.next.next != null)
          {
              NewNode = NewNode.next;
          }
          NewNode.next = null;
          return head;
      }
        	   

 }
            