/*
Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
*/

class Solution {
    public static int maxValue(java.util.List<Integer> list)
    {
        int max=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
                max=list.get(i);
        }
        return max;
    }
    public int maxPower(String s) {
        int count=1;
        java.util.List<Integer> list=new java.util.ArrayList<Integer>();
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                count++;
            else 
            {
                list.add(count);
                count=1;
            }
            if((i+1)==s.length()-1)
            {
                list.add(count);
            }
        }
        if(list.size()==0)
            return 1;
        return maxValue(list);
    }
}
