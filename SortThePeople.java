/*
Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
*/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[i]<heights[j])
                {
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String value=names[i];
                    names[i]=names[j];
                    names[j]=value;
                }
            }
        }   
        return names;
    }
}
