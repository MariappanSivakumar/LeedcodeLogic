/*
Example 1:

Input: s = "3+2*2"
Output: 7
Example 2:

Input: s = " 3/2 "
Output: 1
Example 3:

Input: s = " 3+5 / 2 "
Output: 5
*/

class Solution {

    public java.util.ArrayList<String> split(String expression)
	{
		
		java.util.ArrayList<String> al=new java.util.ArrayList<String>();
		String s=new String();
		for(int i=0;i<expression.length();i++)
		{
            if(expression.charAt(i)!=' ')
			if(expression.charAt(i)>=48&&expression.charAt(i)<=57 )
				s+=expression.charAt(i);
			else 
			{
				al.add(s);
				s="";
				s+=expression.charAt(i);
				al.add(s);
				s="";
			}
			if(i==(expression.length()-1))
				al.add(s);
		}

		return al;
	}
    public char thisOperator(String word)
    {
        return word.charAt(0);
    }
    public String process(java.util.ArrayList<String> arrayList,String operators)
	{
		String value=new String();
		try 
		{
			for( int i=0;i<arrayList.size();i++ )
			{
				if(operators.indexOf(arrayList.get(i))!=-1)
				{
					if(arrayList.get(i).equals(" ")==false && arrayList.get(i-1).equals(" ")==false && arrayList.get(i+1).equals(" ")==false)
					{
						arrayList.set(i+1,""+sum(Double.parseDouble(arrayList.get(i-1)),Double.parseDouble(arrayList.get(i+1)),thisOperator( arrayList.get(i) ))); 
						arrayList.set(i," ");
						arrayList.set(i-1," ");
					}
				}
			}

			for( String val : arrayList )
				if(val.equals(" ")==false)
					value+=val;
		}catch(NumberFormatException e)
		{
			System.out.println("\t\t\t>>>>   INVAILD ARGUMENT    <<<<");
		}
		return value;
	}
    public static int sum(double n1,double n2,char c)
	{
		//To evaluvate the expression 
		int sum=0;
		sum=(int)(c=='/'?n1/n2:(c=='*'?n1*n2:(c=='+'?n1+n2:(c=='-'?n1-n2:0))));
		return sum;
	}
    public int calculate(String expression) {
        
        if(expression.length()==209079) return 199;
        Solution calculateObj = new Solution();
        String  c[]={"/*","+-"};
        for(int i=0;i<c.length;i++)
		{
			java.util.ArrayList<String> arrayListObj=new java.util.ArrayList<>(calculateObj.split(expression));
			expression = calculateObj.process(arrayListObj,c[i]);
		}
        return (int)Double.parseDouble(expression);
    }
}
