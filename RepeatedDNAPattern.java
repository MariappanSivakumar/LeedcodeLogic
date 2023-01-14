class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        s+=" ";
        int leng = s.length();
        Set<String> val = new HashSet();
        List<String> result = new ArrayList();
        if(leng < 10)return result;

        StringBuffer dna = new StringBuffer();
        for(int i=0;i<10;i++){
            dna.append(s.charAt(i));
        }
        for(int i=10;i<leng;i++){
            if(!val.add(String.valueOf(dna))){
                if(!result.contains(String.valueOf(dna)))
                result.add(String.valueOf(dna));
            }
            dna.deleteCharAt(0);
            dna.append( s.charAt(i) ); 
        }
        return result;
    }
}
