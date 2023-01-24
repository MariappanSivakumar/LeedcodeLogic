class Solution {
    class Count {
        int val ;
        int frequency;
        public Count(int val, int frequency){
            this.val = val;
            this.frequency = frequency;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap();
        for(int i : nums){
            map.put(i, map.getOrDefault( i, 0)+1);
        } 
        List<Count> list = new ArrayList();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(new Count(entry.getKey(), entry.getValue()));
        }
        java.util.Collections.sort(list, (Count o1, Count o2) -> {
            return o1.frequency == o2.frequency ? 0 :( o1.frequency < o2.frequency ? 1 : -1);
        });
        int result[] = new int[k];
        int count = 0;
        for(Count i : list){
            if(count == k)break;
            result[count++] = i.val;
        }
        return result;
    }
}
