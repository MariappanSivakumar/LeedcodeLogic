/*
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startPosition = -1, endPosition = -1;
       
        List<Integer> list = new ArrayList();
        for(int i: nums)
        {
            list.add(i);
        }
        startPosition = list.indexOf(new Integer(target));
        endPosition = list.lastIndexOf(new Integer(target));
        return new int[]{startPosition,endPosition};
    }
}
