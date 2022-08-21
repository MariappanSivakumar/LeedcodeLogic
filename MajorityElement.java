/*
Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
*/


class Solution {
    public static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static void valueStore(int num[]){
    for(int i = 0; i < num.length; i++)
        if(map.containsKey(num[i]))
            map.put(num[i], map.get(num[i]) + 1);
        else
            map.put(num[i], 1);
    }
    public static List<Integer> valuePop(double t)
    {
        java.util.List<Integer> list=new java.util.LinkedList<Integer>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
            if ((double)entry.getValue() > t)
                list.add(entry.getKey());
        map.clear();
        return list;
    }
    public List<Integer> majorityElement(int[] nums) {
        java.util.List<Integer> list=new java.util.LinkedList<Integer>();
        double value=nums.length/3;
        valueStore(nums);
        list=valuePop(value);
        return list;
    }
}
