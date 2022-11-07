/*
Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
*/


class Solution {

    public String addString(String num1, String num2)
    {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        String temp = "";
    
        int carry = 0;
        while(n1>=0 || n2>=0)
        {
            int sum = 0;
            if(n1>=0) sum += Integer.parseInt(""+num1.charAt(n1--));
            if(n2>=0) sum += Integer.parseInt(""+num2.charAt(n2--));
            sum+=carry;
            if(sum>9){
                int mod = sum%10;
                temp  = mod + temp;
                carry = sum/10;
            } else {
                temp=sum + temp;
                carry = 0;
            }
        }   
        if(carry!=0)temp = carry + temp; 
        return temp;
    }
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")) return "0";
        String add = "0";
        int count = 0;
        for(int i=num2.length()-1;i>=0;i--)
        {
            int carry = 0;
            String temp = "";
            for(int j=num1.length()-1;j>=0;j--)
            {
                int sum = Integer.parseInt(""+num2.charAt(i)) * Integer.parseInt(""+num1.charAt(j))+carry;
                if(sum>9){
                    int mod = sum%10;
                    temp  = mod + temp;
                    carry = sum/10;
                } else {
                    temp=sum + temp;
                    carry = 0;
                }
            }
            if(carry!=0) temp = ""+carry + temp;
            for(int space = 0;space<count;space++) temp += "0";
            count++;
            System.out.println(temp+" "+add);
            add = addString( temp, add);
        }
        return add;
    }
}
