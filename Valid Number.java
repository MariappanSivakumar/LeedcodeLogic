class Solution {
    public boolean isNumber(String s) {
        boolean vaild=false;int dot=0;
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            vaild=true;
         else if(s.charAt(i)=='e')
         {
             if(s.charAt(i)=='e'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                vaild=true;
             else{ vaild=false;break;}
            if(s.charAt(i)=='e'&&i>=1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                 vaild=true;
            else {vaild=false;break;}
         }
         else if(s.charAt(i)=='.')
         {
             dot++;
            if(s.charAt(i)=='.'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                 vaild=true;
             else {vaild=false;}
             if(s.charAt(i)=='.'&&i>1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                 vaild=true;
         }
            else if(s.charAt(i)=='+'&&i>=1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                 vaild=false;
             else if(s.charAt(i)=='+'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                 vaild=true;
            else if(s.charAt(i)=='-'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                 vaild=false;
             else if(s.charAt(i)=='+'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                 vaild=true;
            else if(s.charAt(i)=='E')
         {
            if(s.charAt(i)=='E'&&i<s.length()-1&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')
                 vaild=true;
             else vaild=false;
             if(s.charAt(i)=='E'&&i>=1&&s.charAt(i-1)>='0'&&s.charAt(i-1)<='9')
                 vaild=true;
         }
         else vaild=false;
         if(dot==2)
             vaild=false;
            if(!vaild)
             break;
     }
        return vaild;
    }
}
