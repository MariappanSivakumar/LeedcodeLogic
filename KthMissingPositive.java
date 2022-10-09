/*
Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
*/

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int arrayIncreCount = 0, missingNumber;
        for( int i=1; true ; i++ )
        {
            if(arrayIncreCount < arr.length && arr[arrayIncreCount] == i)arrayIncreCount++;
            else 
            {
                k--;
                missingNumber=i;
                if(k==0)break;
            }
        }   

        return missingNumber;
    }
}
