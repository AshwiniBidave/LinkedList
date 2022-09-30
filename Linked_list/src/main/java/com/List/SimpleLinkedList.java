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
        list.Add(70);
        list.Display();
        list.InserAtParticularPosition(2, 30);
        System.out.println("Display After insert 30 in position 2");
        list.Display();
        System.out.println("Dispaly list After Delete Last Node");
       list.RemoveLastNode();
       list.Display();
       
		
        
        
     
        
    }
}
