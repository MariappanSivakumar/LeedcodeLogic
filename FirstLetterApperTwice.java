class Solution {
    char result;
    public char repeatedCharacter(String s) {
        char ch[] = s.toCharArray();
        String remainWord = "";
        Set<Character> set = new LinkedHashSet();
        for(int i=0;i<ch.length;i++){
            if(!set.add(ch[i])){
                remainWord += ch[i];
            }
        }
        int min = Integer.MAX_VALUE;
        for(char c : set){
            int index = -1;
            if((index = remainWord.indexOf(c))!=-1 && min > index){
                min = Math.min( index, min);
                result = c;
            }
        }
        return result;
    }
}
