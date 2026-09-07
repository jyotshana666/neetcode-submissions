class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        int len = heights.length;

        for(int i = 0; i < len; i++) {
            boolean swapped = false;
            for(int j = 0; j < len - i - 1; j++) {
                if(expected[j] > expected[j + 1]) {
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        int count = 0;
        for(int i = 0; i < len; i++) {
            if(expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}