//@author wycliffe
package safaricomcodility;

import java.util.ArrayDeque;
import java.util.Deque;


public class BalancedParentheses {
    // function to check if paranthesis are balanced 
    static boolean checkifBalanced(String expr) 
    { 
        // Using ArrayDeque is faster than using Stack class 
        Deque<Character> stack = new ArrayDeque<>(); 
  
        // Traversing the Expression 
        for (int i = 0; i < expr.length(); i++) { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{') { 
                // Push the element in the stack 
                stack.push(x); 
                continue; 
            } 
  
            //Check if the stack is empty initially 
            if (stack.isEmpty()) 
                return false; 
  
            switch (x) { 
            case ')': 
                stack.pop(); 
                if (x == '{' || x == '[') 
                    return false; 
                break; 
  
            case '}': 
                stack.pop(); 
                if (x == '(' || x == '[') 
                    return false; 
                break; 
  
            case ']': 
                stack.pop(); 
                if (x == '(' || x == '{') 
                    return false; 
                break; 
            } 
        } 
  
        // Check Empty Stack 
        return (stack.isEmpty()); 
    }  
    /*Mainmethod to test */
    public static void main(String[] args) 
    { 
        String expr = "{[)(]}"; 
        if (checkifBalanced(expr)) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
    }
}
