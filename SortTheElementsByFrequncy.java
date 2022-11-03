/*

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c)==false)
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            } 
        }
        Map<Integer, String> mapObj = new TreeMap();
        List<Integer> set = new ArrayList();
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            int n = entry.getValue();
            char c = entry.getKey();
            String word = "";
            for(int i=0;i<n;i++)
            {
                word+=c;
            }
            if(mapObj.containsKey(n) == false)
            {
                mapObj.put(n,word);
                set.add(n);
            }else 
            {
                mapObj.put(n,mapObj.get(n)+word);
            }
        }
        String word = "";
        java.util.Collections.sort(set);
        for(int i = set.size()-1;i>=0;i--)
        {
            word+=mapObj.get(set.get(i));
        }
        System.out.println(mapObj);
        return word;
    }
}
