class Solution {
    public void createSubset(int nums[], int index, List<Integer> result, List<List<Integer>> list){
        if(index == nums.length){
            if(!list.contains(result))
            list.add(new ArrayList(result));
            return;
        }
        result.add(nums[index]);
        createSubset(nums, index+1, result, list);
        result.remove(new Integer(nums[index]));
        createSubset(nums, index+1, result, list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        java.util.Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        createSubset(nums, 0, new ArrayList(), list);
        return list;
    }
}
