/*
Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]
*/

class Solution {
    public int[] singleNumber(int[] nums) {
        java.util.Map<Integer,Integer> map=new java.util.LinkedHashMap<Integer,Integer>();
        int num[]=new int[0];
        for(int i:nums)
            if(map.containsKey(i)==true)
                map.put(i,map.get(i)+1);
            else 
                map.put(i,1);
        for(java.util.Map.Entry entry:map.entrySet())
            if((int)entry.getValue()==1)
            {
                num=java.util.Arrays.copyOf(num,num.length+1);
                num[num.length-1]=(int)entry.getKey();
            }
        return num;
    }
}
