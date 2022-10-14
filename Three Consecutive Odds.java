/*
Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
*/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int countOddNumber=0;
        for(int num : arr)
        {
            if( num%2 != 0 ) countOddNumber++;
            else countOddNumber=0;
            if( countOddNumber == 3 )return true; 
        }
        return false;
    }
}
