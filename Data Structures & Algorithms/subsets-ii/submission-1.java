class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<<List<Integer>> res = new ArrayList<>(); 
        List<Integer> cur = new ArrayList<>();

        generate(nums, 0, cur, res);

        return res;
    }

    private void generate(int[] nums, int index, List<Integer> cur, List<List<Integer>> res) {
        res.add(new ArrayList<>(cur));

        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }

            cur.add(nums[i]);

            generate(nums, i + 1, cur, res);

            cur.remove(cur.size() - 1);
        }
    }
}
