class Solution {
    public boolean search(int[] nums, int target) {
        java.util.Set<Integer> set=new java.util.TreeSet<Integer>();
        for(int i:nums)
            set.add(i);
        return set.contains(target)==true?true:false;
    }
}
