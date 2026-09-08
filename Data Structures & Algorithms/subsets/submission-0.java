class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(0, subset, nums, ans);
        return ans;
    }

    private void backtrack(int ind, List<Integer> subset, int[] nums, List<List<Integer>> ans) {
        if(ind >= nums.length) {
            ans.add(new ArrayList<>(subset));
            return ;
        }

        subset.add(nums[ind]);
        backtrack(ind + 1, subset, nums, ans);

        subset.remove(subset.size() - 1);
        
        backtrack(ind + 1, subset, nums, ans);
    }
}
