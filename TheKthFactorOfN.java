/*
Example 1:

Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
Example 2:

Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
Example 3:

Input: n = 4, k = 4
Output: -1
Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
*/

class Solution {
    public int kthFactor(int n, int k) {
        java.util.List < Integer > factorsStore = new java.util.ArrayList <> ();
        for(int i=1; i<=n ; i++)
        {
            if( n%i == 0 )
            {
                factorsStore.add(i);
                if( factorsStore.size() == k )
                    return factorsStore.get(factorsStore.size()-1);
            }
        }
        return -1;
    }
}
