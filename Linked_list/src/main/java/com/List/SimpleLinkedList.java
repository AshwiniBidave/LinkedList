package com.List;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class SimpleLinkedList 
{
    public static void main( String[] args )
    {
        System.out.println( "********Welcome to Linked_list********" );
        
		
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(56);
        LinkedList<Integer> list1=new LinkedList<Integer>();
       list1.add(30);
       list1.add(70);
       list.addAll(list1);
       System.out.println(list);
       

        
     
        
    }
}
