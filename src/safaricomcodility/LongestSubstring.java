//@author wycliffe
package safaricomcodility;
public class LongestSubstring {
    public static int longestNonRepeatingSubstring(String str) {
        // Result 
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            // Note : Default values in visited are false 
            boolean[] visited = new boolean[256];

            for (int j = i; j < str.length(); j++) {
                // If current element is visited 
                // Break the loop 
                if (visited[str.charAt(j)] == true) {
                    break;
                } else {
                    result = Math.max(result, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            // unstuck the first character of previous 
            visited[str.charAt(i)] = false;
        }
        return result;
    }
// Main method code 
    public static void main(String[] args) {
        String str = "wycliiffee";
        int len = longestNonRepeatingSubstring(str); // call to method to check substring 
        System.out.println("The length of the longest substring is " + len);
    }
}
