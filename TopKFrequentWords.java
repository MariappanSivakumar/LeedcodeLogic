class Solution {
    class Count {
        String val ;
        int frequency;
        public Count(String val, int frequency){
            this.val = val;
            this.frequency = frequency;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap();
        for(String i : words){
            map.put(i, map.getOrDefault( i, 0)+1);
        } 
        List<Count> list = new ArrayList();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            list.add(new Count(entry.getKey(), entry.getValue()));
        }
        java.util.Collections.sort(list, (Count o1, Count o2) -> {
            return o1.frequency == o2.frequency ? 0 :( o1.frequency < o2.frequency ? 1 : -1);
        });
        List<String> result = new ArrayList();
        int count = 0;
        for(Count i : list){
            if(count == k)break;
            count++;
            result.add( i.val );
        }
        return result;
    }
}
