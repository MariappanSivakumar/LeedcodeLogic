/*
Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
*/

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==6)return true;
        int left=1, right=num/2;
        int totalsum=0;
        while(left<=right){
            if(left==right){
                totalsum+=left;
            }else {
                if( num%left == 0 ) totalsum+=left;
                if( num%right == 0) totalsum+=right;
            }
            left++;
            right--;
            if(num<totalsum)return false;
        }
        if(totalsum==num)
        return true;
        else return false;
    }
}
