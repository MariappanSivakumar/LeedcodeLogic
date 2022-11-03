/*
Example 1:


Input: bank = ["011001","000000","010100","001000"]
Output: 8
Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
 * bank[0][1] -- bank[2][1]
 * bank[0][1] -- bank[2][3]
 * bank[0][2] -- bank[2][1]
 * bank[0][2] -- bank[2][3]
 * bank[0][5] -- bank[2][1]
 * bank[0][5] -- bank[2][3]
 * bank[2][1] -- bank[3][2]
 * bank[2][3] -- bank[3][2]
Note that there is no beam between any device on the 0th row with any on the 3rd row.
This is because the 2nd row contains security devices, which breaks the second condition.
Example 2:


Input: bank = ["000","111","000"]
Output: 0
Explanation: There does not exist two devices located on two different rows.

*/

class Solution {
    public int OnceCount(String s)
    {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int length = bank.length;
        java.util.List<Integer> list = new java.util.ArrayList();
        int value = 0;
        for(int i=0;i<length;i++)
        {
            value = OnceCount(bank[i]);
            if(value!=0)
            list.add(value);
        }
        int listlength = list.size();
        int totallasers = 0;
        if(listlength>1)
        {
            for(int i=0;i<listlength-1;i++)
            {
                int mul = list.get(i)*list.get(i+1);
                totallasers+=mul;
            }
        }
        return totallasers;
    }
}
