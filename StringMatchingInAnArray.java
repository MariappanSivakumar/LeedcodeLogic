class Solution {
    public List<String> stringMatching(String[] words) {
        java.util.List<String> list=new java.util.ArrayList<String>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j&&words[i].indexOf(words[j])!=-1)
                {
                    if(list.contains(words[j])==false)
                        list.add(words[j]);
                }
            }
        }
        return list;
    }
}
