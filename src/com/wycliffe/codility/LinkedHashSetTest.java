//@author wycliffe
package com.wycliffe.codility;
import java.util.LinkedHashSet;
public class LinkedHashSetTest {
    static LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    public static Object returnList(){
        lhs.add(4);
        lhs.add(4);
        lhs.add(45);
        lhs.add(41);
        lhs.add(4);
        return lhs;
    }
    public static void main(String[] args) {
       System.out.println("Numbers"+returnList());
        
    }
}
