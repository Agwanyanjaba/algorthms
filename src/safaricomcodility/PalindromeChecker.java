
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
        if(str==null){
            return false;
        }
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1;
        while (i < j) { //O(n)
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            // Increment first pointer and 
            // decrement the other pointer
            i++;
            j--;
        }
        // Given string is a palindrome 
        return true;
    }

    // Driver code 
    public static void main(String[] args) {
        String str = "";
        if (isPalindrome(str)) {
            System.out.print("Yes\n");
        } else {
            System.out.print("No\n");
        }
    }
}
