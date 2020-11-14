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
1. create hashmap as myHashMap
2. Add items to myHashmap using a method addCities()
3. Access the contemt of the HashMap
4. Display the accessed elements of the hashmap
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//import org.json.simple.JSONObject;
public class HashMapsTest {
    //Declare the Hashmap
    static HashMap<Integer,String> citiesMap = new HashMap<>();
    //define add cities method
    public Object addCities(){
       citiesMap.put(1, "Landon");
       citiesMap.put(2, "Nairobi");
       citiesMap.put(3, "Paris");
       citiesMap.put(6, "Paris"); //Hashmap automatically orders the values based on keys
       citiesMap.put(4, "Monrovia");
       citiesMap.put(5, "Kigali");
       citiesMap.put(7, "Abuja");
       
        return citiesMap;
    }
    
    public static void main(String args[]){
        //JSONObject jo = new JSONObject();
        HashMapsTest myHashObject = new HashMapsTest();
        System.out.println((myHashObject.addCities().toString()));
        
        for(Integer i:citiesMap.keySet()){
            System.out.println("Key:"+i+"Value:"+citiesMap.get(i));
        }
        
        
        Iterator<Entry<Integer,String>> iter = citiesMap.entrySet().iterator();
        while(iter.hasNext()){
           
        }
    }
    
}
