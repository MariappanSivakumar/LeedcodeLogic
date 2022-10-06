/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/


class Solution {
    public int maxProfit(int[] prices) {
     int max=0;
     for(int firstloop=0 ; firstloop< prices.length; firstloop++ )
     {
         for(int secondloop=firstloop+1; secondloop<prices.length  && (prices[firstloop]<prices[secondloop]) ; secondloop++ )
         {
             if(max<(prices[secondloop]-prices[firstloop]))
                max=prices[secondloop]-prices[firstloop];
         }
     }   
     return max;
    }
}
