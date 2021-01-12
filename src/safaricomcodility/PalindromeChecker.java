<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safaricomcodility;

/**
 *
 * @author wycliffe
 */
public class PalindromeChecker {

    static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1;
       char [] arr =  str.toCharArray(); //
       for(int k=0; k<arr.length;k++){
           System.out.println(">>>>"+arr[k]);
       }
        
       
        // Loop to compare compare characters
        System.out.println("Word Length" + j);
        while (i < j) { //O(n)
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // Increment first pointer and 
            // decrement the other 
            i++;
            j--;
        }
        // Given string is a palindrome 
        return true;
    }

    // Driver code 
    public static void main(String[] args) {
        String str = "Jane";
        if (isPalindrome(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safaricomcodility;
/**
 *
 * @author wycliffe
 */
public class PalindromeChecker {
    static boolean isPalindrome(String str) {
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length()-1;
        // Loop to compare compare characters
        System.out.println("Word Length"+j);
        while (i < j) {
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // Increment first pointer and 
            // decrement the other 
            i++;
            j--;
        }
        // Given string is a palindrome 
        return true;
        
    }
    // Driver code 
    public static void main(String[] args) {
        String str = "n"; 
        //String sub = str.substring(1, 5);
        
        //System.out.println(sub);
        if (isPalindrome(str)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
>>>>>>> 1a519d20a0236472d114bc9e45f313354e950fbd
