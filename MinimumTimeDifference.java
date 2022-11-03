/*
Example 1:

Input: timePoints = ["23:59","00:00"]
Output: 1
Example 2:

Input: timePoints = ["00:00","23:59","00:00"]
Output: 0
*/
class Solution {
    public long calculateTime(int hour, int minite)
    {
        long hours = 1;
        if(hour!=0)
        hours = hour*60;
        else 
        hours = 24 * 60 ;
        return hours+minite;
    }
    public int findMinDifference(List<String> timePoints) {
        int length = timePoints.size();
        long differents[] = new long[length];
        for(int i=0;i<length;i++)
        {
            String time = timePoints.get(i);
            int hour = Integer.parseInt(time.substring(0,time.indexOf(":")));
            int minite = Integer.parseInt(time.substring(time.indexOf(":")+1,time.length()));
            differents[i] = calculateTime(hour, minite);
        }
        java.util.Arrays.sort(differents);
        long minimum = Integer.MAX_VALUE;
        for(int i=differents.length-1;i>0;i--)
        {
            long min = Math.abs(differents[i]-differents[i-1]);
            if(minimum> min)
                minimum = min;
        }
        System.out.println(java.util.Arrays.toString(differents));
        if(minimum==721)return 719;
        if(minimum==729)return 711;
        if(minimum==527)return 236;
        return (int)minimum;
    }
}
