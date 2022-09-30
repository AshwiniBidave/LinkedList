package com.List;

/**
 * Hello world!
 *
 */
public class SimpleLinkedList 
{
    public static void main( String[] args )
    {
        System.out.println( "********Welcome to Linked_list********" );
        Linked_List list = new Linked_List();
       list.Add(56);
       list.Add(30);
       list.Add(40);
       list.Add(70);
       list.Display();
       System.out.println("Position of 30--> " + list.findPoistion(30));
       list.deleteNode(40);
       System.out.println("After Deleting Node");
       list.Display();
       System.out.println("Linkelist Size " + list.count());

		
        
        
     
        
    }
}
