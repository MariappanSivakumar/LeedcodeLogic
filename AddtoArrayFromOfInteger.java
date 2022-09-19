/*
Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       java.math.BigInteger bigNumber=java.math.BigInteger.valueOf(k);
        String value=new String();
        for(int i=0;i<num.length;i++)
            value+=String.valueOf(num[i]);
        bigNumber=bigNumber.add(new java.math.BigInteger(value));
        value=String.valueOf(bigNumber);
        java.util.List<Integer> list=new java.util.LinkedList<Integer>();
        for(int i=0;i<value.length();i++)
            list.add(Integer.parseInt(""+value.charAt(i)));
        return list;
    }
}
