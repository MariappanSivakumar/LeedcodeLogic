/*
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        java.util.ArrayList<Integer> li=new java.util.ArrayList<>();
        li.add(1);
        res.add(li);
        int num[]={1};
        if(numRows!=1)
		for(int j=0;j<numRows-1;j++)
		{
			java.util.List<Integer> list=new java.util.ArrayList<>();
			list.add(num[0]);
			for(int i=0;i<num.length-1;i++)
			{
				list.add(num[i]+num[i+1]);
			}
			list.add(num[num.length-1]);
			num=java.util.Arrays.copyOf(num,list.size());
			res.add(list);
			for(int i=0;i<num.length;i++)
				num[i]=list.get(i);
		}
        return res;
    }
}
