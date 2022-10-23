/*
Example 1:


Input: n = 3
Output: 1
Explanation: At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off]. 
So you should return 1 because there is only one bulb is on.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 1
*/

class Solution {
    public int bulbSwitch(int n) {
       int count = 1, numberofsquare = 0;
       while(count * count  <= n)
       {
           count++;
           numberofsquare++;
       }
       return numberofsquare;
    }
}
