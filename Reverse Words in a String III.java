class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String temp[]=s.split(" ");
        s="";
        for(int i=0;i<temp.length;i++)
        {
            for(int j=temp[i].length()-1;j>=0;j--)
                s+=String.valueOf(temp[i].charAt(j));
            if(i!=temp.length-1)
                s+=" ";
        }
        return s;
    }
}
