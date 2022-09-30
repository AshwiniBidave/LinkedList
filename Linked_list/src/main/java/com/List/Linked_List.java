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
        	Node  firstHead = this.head;
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
            firstHead.next = head;
            head = firstHead;


          if (position != 1)
          System.out.println("Position out of range...");
          }
          
          return head;
      }
      public Node Search(int value)
      {
          while (this.head != null)
          {
              if (this.head.data == value)
              {
                  return this.head;
              }
              this.head = this.head.next;
          }
          return null;
      }
      public int findPoistion(int value)
      {
          int position = 0;
          while (this.head != null)
          {
              position++;
              if (this.head.data == value)
              {
                  return position;
              }
              this.head = this.head.next;
          }
          return position;
      }
      public void deleteNode(int value)
      {

          // Store head node 
    	  Node temp = head,prev=null;

          if (temp != null && temp.data == value)
          {
              // Changed head
        	 
              head= temp.next;
             
              return;
          }

          while (temp != null && temp.data != value)
          { 
             prev=temp;
              temp=temp.next;
            
           }

          if (temp == null)
              return;

          head.next = temp.next;
         
      }
      public int count()
      {
          Node temp = head;
          int count = 0;
          while (temp != null)
          {
              count++;
              temp = temp.next;
          }
          return count;
      }
        	   

 }
            