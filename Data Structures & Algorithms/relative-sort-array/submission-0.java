class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int index = 0;
        int[] remaining = new int[arr1.length];
        int rem_index = 0;

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    result[index++] = arr1[j];
                }
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                remaining[rem_index++] = arr1[i];
            }
        }

        for(int i = 0; i < rem_index; i++) {
            for(int j = 0; j < rem_index - i - 1; j++) {
                if(remaining[j] > remaining[j + 1]) {
                    int temp = remaining[j];
                    remaining[j] = remaining[j + 1];
                    remaining[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < rem_index; i++) {
            result[index++] = remaining[i];
        }

        return result;
    }
}