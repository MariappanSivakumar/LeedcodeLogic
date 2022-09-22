/*
Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
*/

class Solution {
    public int dayOfYear(String date) {
    String num[]=date.split("-");
    boolean isleap=false;
        int leap[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int nonleap[]={31,28,31,30,31,30,31,31,30,31,30,31};
    if(Integer.parseInt(num[0])%4==0)
    {
        if(Integer.parseInt(num[0])%100==0)
        {
            if(Integer.parseInt(num[0])%400==0)
            {
                isleap=true;
            }
            else 
            {
                isleap=false;
            }
        }
        else 
            isleap=true;
    }
        int total=0;
        if(isleap)
        {
            total=0;
            for(int i=0;i<Integer.parseInt(num[1])-1;i++)
            {
                total+=leap[i];
            }
            total+=Integer.parseInt(num[2]);
        }
        else 
        {
            total=0;
            for(int i=0;i<Integer.parseInt(num[1])-1;i++)
            {
                total+=nonleap[i];
            }
            total+=Integer.parseInt(num[2]);
        }
        return total;
    }
}
