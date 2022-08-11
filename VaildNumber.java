class Solution {
    public static String setCharAt(String s,int n)
    {
         String temp=new String();
        for(int i=0;i<s.length();i++)
            if(i!=n)
            temp+=""+s.charAt(i);
            else temp+="0";
        return temp;
    }
    public boolean isNumber(String s) {
        boolean vaild=false;int dot=0;
        double d=0;
    for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='.')
            dot++;
        else
            if(s.charAt(i)=='E'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'&&i>=1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                setCharAt(s,i);
        else
            if(s.charAt(i)=='e'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'&&i>=1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                setCharAt(s,i);
        if(dot!=0)
        {
            try
            {
                d=Double.parseDouble(s);
                vaild=true;
            }
            catch(NumberFormatException e){}
        }
        else if(dot==0) 
        {
            try
            {
                d=Integer.parseInt(s);
                vaild=true;
            }catch(NumberFormatException e){}
        }
        else 
        {
            vaild=false;
        }
        return vaild;
    }
}
