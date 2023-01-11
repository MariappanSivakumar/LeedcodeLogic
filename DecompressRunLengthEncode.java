class Solution {
    class Node {
        int val;
        Node next;
        public Node(){}
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    Node node;
    public int[] decompressRLElist(int[] nums) {
        int leng = nums.length; 
        int size = 0;
        for(int i=0;i<leng;i+=2){
            for(int j=0;j<nums[i];j++){
                node = new Node(nums[i+1], node);
                size++;
            }
        }
        int count = size-1;
        int value[] = new int[size];
        while(node!=null){
            value[count--] = node.val;
            node = node.next;
        }
        return value;
    }
}
