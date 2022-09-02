/*
Example 1:

Input: nums = [2,2,3,1,1]
Output: 3
Example 2:

Input: nums = [2,1,5,1,2,5,99]
Output: 99
*/


class Solution {
    public int singleNumber(int[] nums) {
        java.util.Map<Integer,Integer> map=new java.util.LinkedHashMap<Integer,Integer>();
        int one=0;
        for(int i:nums)
            if(map.containsKey(i)==true)
                map.put(i,map.get(i)+1);
            else 
                map.put(i,1);
        for(java.util.Map.Entry entry:map.entrySet())
            if((int)entry.getValue()==1)
            {
                one=(int)entry.getKey();
                break;
            }
        return one;
    }
}
