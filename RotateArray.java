class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int original[] = new int[nums.length];
        int count = 0;
        for(int i=k;i<nums.length;i++){
            original[i] = nums[count++];
        } 
        for(int i=0;i<k;i++){
            original[i] = nums[count++];
        }
        count = 0;
        for(int i : original){
            nums[count++] = i; 
        }
    }
}
