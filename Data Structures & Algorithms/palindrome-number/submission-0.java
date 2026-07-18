class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if(x != 0 && x % 10 == 0) return false;

        int num = x;
        int rev = 0;

        while(num > rev) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return num == rev || num == rev / 10;
    }
}