/*
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
*/


class Solution {


    public void createSubset(int num[], int index, List<Integer> res, List<List<Integer>> list)
    {
        if(index == num.length){
            list.add(new ArrayList(res));
            return;
        }
            res.add(num[index]);
            createSubset(num, index+1, res,list);
            res.remove(new Integer(num[index]));
            createSubset(num, index+1, res, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        createSubset(nums, 0, new ArrayList(),list);
        return list;
    }
}
