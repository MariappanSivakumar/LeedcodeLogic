class Solution {
    public int maxArea(int[] height) {
        int big=0,IN=0;
        String temp=new String();
        for(int i=0;i<height.length;i++)
            temp+=String.valueOf(height[i]);
        if(height.length!=0)
        for(int i=0;i<height.length;i++)
        {
            if(big<height[i])
            {
                big=height[i];
                IN=1;
            }
            else if(IN==1)
            {
                break;
            }
        }
        int small=0;
        if(height.length!=0)
        for(int i=height.length-1;i>=0;i--)
        {
            if(small<height[i])
            {
                small=height[i];
                IN=1;
            }
            else if(IN==1)
            {
                break;
            }
        }
        int diff=(temp.lastIndexOf(""+small)+1)-(temp.indexOf(""+big)+1);
        if(big!=small)
        diff=big>small?(diff*small):(diff*big);
        else if(big==small&&height.length>=3)
            diff=big*2;
        else diff=diff;
            return diff;
    }
}
