/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
/*
1.Initailize the list as myLinkedList
2. Add first/last an item to the list
3. Remove last or first item to the list
4. Get first or last item on the list
*/
import java.util.LinkedList;
public class LinkedListTest {
    static LinkedList<String> myList = new LinkedList<>();
   
    public void addItems(){
        myList.add("Volvo");       
        myList.add("Nissan");
        myList.add("BMW");
        myList.add("BMW");
        myList.add("Toyota");
        myList.add("Porshe");

    }
    public static void main(String args[]){
        LinkedListTest obj = new LinkedListTest();
        obj.addItems();
        
        myList.addLast("Testla");
        
        System.out.print(myList);
        System.out.print(myList.getLast());
    }
   
    
}
