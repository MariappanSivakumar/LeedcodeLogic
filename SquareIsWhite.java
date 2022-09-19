/*

*/


class Solution {
    public static int decode(char c)
    {
        return (int)c-96;
    }
    public boolean squareIsWhite(String coordinates) {
        int stringvalue=decode(coordinates.charAt(0));
        if(stringvalue%2!=0)
        {
            int num=Integer.parseInt(""+coordinates.charAt(1));
            if(num%2==0)
                return true;
        }
        else 
        {
            int num=Integer.parseInt(""+coordinates.charAt(1));
            if(num%2!=0)
                return true;
        }
        return false;
    }
}
