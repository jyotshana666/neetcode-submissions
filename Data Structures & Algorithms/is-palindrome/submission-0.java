class Solution {
    public boolean isPalindrome(String s) {
        // To Lowercase and then replace spl.characters with empty string.
        s= s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Intitalize pointers
        int left = 0, right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
