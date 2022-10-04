/*
Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
*/


class Solution {
    public List<Integer> getRow(int rowIndex) {
        java.util.ArrayList<Integer> li=new java.util.ArrayList<>();
        li.add(1);
        int num[]={1};
        if(rowIndex!=0)
		for(int j=0;j<rowIndex;j++)
		{
            li.clear();
			java.util.List<Integer> list=new java.util.ArrayList<>();
			list.add(num[0]);
			for(int i=0;i<num.length-1;i++)
			{
				list.add(num[i]+num[i+1]);
			}
			list.add(num[num.length-1]);
			num=java.util.Arrays.copyOf(num,list.size());
            if(j+1==(rowIndex))
                return list;
			for(int i=0;i<num.length;i++)
				num[i]=list.get(i);
		}
        return li;
    }
}
