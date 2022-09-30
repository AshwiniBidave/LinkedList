package com.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void GivenValue_When30_ThenSearchTheNode()
    {
        Linked_List linkedList = new Linked_List();
        linkedList.Add(56);
        linkedList.Add(30);
        linkedList.Add(70);
        Node node = linkedList.Search(30);
        assertEquals(30, node.data);
    }
    @Test
    public void FindPosition_ofElement_ThenAdd40ToAfter30()
    {
        Linked_List list = new Linked_List();
        int position = 3;
        list.Add(56);
        list.Add(30);
        list.Add(70);
        list.InserAtParticularPosition(position, 40);
        Node result = list.Search(40);
        assertEquals(40, result.data);
}}