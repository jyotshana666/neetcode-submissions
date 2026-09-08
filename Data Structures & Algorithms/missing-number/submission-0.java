class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expected_sum = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            expected_sum += i;
            if(i < nums.length) {
                sum += nums[i];
            }
        }
        return expected_sum - sum;
    }
}
