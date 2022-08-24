/*
Example 1:

Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
Example 2:

Input: num = 4009
Output: 13
Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
*/

class Solution {
    public int minimumSum(int num) {
        char c[]=new char[(""+num).length()];
        for(int i=0;i<c.length;i++)
            c[i]=(""+num).charAt(i);
        java.util.Arrays.sort(c);
        int value=(Integer.parseInt(""+c[0]+c[2]));
        value+=(Integer.parseInt(""+c[1]+c[3]));
        return value;
    }
}
