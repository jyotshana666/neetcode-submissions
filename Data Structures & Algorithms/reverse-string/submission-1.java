class Solution {
    private void reverse(char[] s, int left, int right) {
        if(left >= right) return ;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left + 1, right - 1);
    }
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        reverse(s, left, right);
    }
}