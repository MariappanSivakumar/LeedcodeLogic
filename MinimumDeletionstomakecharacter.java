/*
Example 1:

Input: s = "aab"
Output: 0
Explanation: s is already good.
Example 2:

Input: s = "aaabbbcc"
Output: 2
Explanation: You can delete two 'b's resulting in the good string "aaabcc".
Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
Example 3:

Input: s = "ceabaacb"
Output: 2
Explanation: You can delete both 'c's resulting in the good string "eabaab".
Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).
*/

class Solution {
    public static int send(int num[])
    {
        int sumnum=0,sumi=0;
        for(int i=0;i<num.length;i++)
        {
            sumi+=(i+1);
            sumnum+=num[i];
        }
        return Math.abs(sumnum-sumi);
    }
    public int minDeletions(String s) {
        java.util.Map<Character,Integer> map=new java.util.HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))==true)
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        int n[]=new int[map.size()];
        int count=0;
        for(java.util.Map.Entry e:map.entrySet())
            n[count++]=Integer.parseInt(""+e.getValue());
        java.util.Arrays.sort(n);
        return send(n);
    }
}
