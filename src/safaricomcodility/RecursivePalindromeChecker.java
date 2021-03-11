//@author wycliffe
package safaricomcodility;

public class RecursivePalindromeChecker {

    //Do recursive call method
    static boolean isPalindrome(String str) {
        if (str.length() <= 1) {//base case 1
            return true;
        }
        else{
            return isPalindrome(str.substring(1, str.length()-1));
        }
    }

    //Driver class

    public static void main(String[] args) {
        String string = "moon";
        System.out.println("Word is palindrome"+isPalindrome(string));
    }
}
