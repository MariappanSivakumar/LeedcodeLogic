/*
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
*/

class Solution {
    public String doSort( String s1)
    {
        char word1[] = s1.toCharArray();
        java.util.Arrays.sort(word1);
        return java.util.Arrays.toString(word1);
    }    
    public List<List<String>> groupAnagrams(String[] strs) {
        java.util.Map<String,String> anagrams = new java.util.HashMap();
        java.util.List<List<String>> groupanagram = new java.util.ArrayList(); 
        java.util.List<String> nullvalues = new ArrayList();
        for( String s : strs )  
        {
            String value  = doSort(s); 
            if(s.equals(""))
            {
                nullvalues.add("");
            }
            else 
            if(anagrams.containsKey(value) == false)
            {
                anagrams.put( value, s);
            }else 
            {
                anagrams.put( value, anagrams.get(value)+","+s);
            }
        }  
        if(nullvalues.size()!=0)
        groupanagram.add(nullvalues);
        for( java.util.Map.Entry<String,String> entry : anagrams.entrySet())
        {
            groupanagram.add( java.util.Arrays.asList( entry.getValue().split(",") ));
        }
        System.out.println(anagrams);
        return groupanagram;
    }
}
