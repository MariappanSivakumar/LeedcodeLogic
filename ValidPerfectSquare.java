/*
Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
*/


class Solution {
    public boolean isPerfectSquare(int num) {
     long n=1;
     if(num==1)return true;
     for(int i=1;i<num;i++)
     {
         if(i*i>num)break;
         if(i*i==num)return true;
     }  
     return false;
    }
}
