class Solution {
    public int reverse(int x) {
        long sum=0;
        int minus=0;
        if(x<0)
            minus=1;
        x=Math.abs(x);
        while(x>0)
        {
                sum=(sum*10)+x%10;
                x/=10;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
            sum=0;
            if(minus==1)
                sum*=-1;
        return (int)sum;
    }
}
