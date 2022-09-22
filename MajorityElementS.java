/*
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

class Solution {
    public int majorityElement(int[] nums) {
       java.util.Map<Integer,Integer> mapValues=new java.util.LinkedHashMap<>();
        for(int i:nums)
        {
            if(mapValues.containsKey(i)==false)
            {
                mapValues.put(i,1);
            }
            else 
            {
                mapValues.put(i,mapValues.get(i)+1);
            }
        }
        int temp=0,majority=0;
        for(java.util.Map.Entry set : mapValues.entrySet())
        {
            if(temp<(int)set.getValue())
            {
                temp=(int)set.getValue();
                majority=(int)set.getKey();
            }
        }
        return majority;
    }
}
