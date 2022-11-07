/*
Example 1:

Input: sentence = "there are $1 $2 and 5$ candies in the shop", discount = 50
Output: "there are $0.50 $1.00 and 5$ candies in the shop"
Explanation: 
The words which represent prices are "$1" and "$2". 
- A 50% discount on "$1" yields "$0.50", so "$1" is replaced by "$0.50".
- A 50% discount on "$2" yields "$1". Since we need to have exactly 2 decimal places after a price, we replace "$2" with "$1.00".
Example 2:

Input: sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$", discount = 100
Output: "1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$"
Explanation: 
Applying a 100% discount on any price will result in 0.
The words representing prices are "$3", "$5", "$6", and "$9".
Each of them is replaced by "$0.00".
*/

class Solution {
    public boolean isValid(String word)
    {
        if(word.length()==1)return false;

        for(int i=1;i<word.length();i++)
            if(!(word.charAt(i)>='0' && word.charAt(i)<='9'))return false;
        return true;
    }
    public String discountPrices(String sentence, int discount) {
        String arr[] = sentence.split(" ");
        if((sentence.indexOf("$")==-1 || sentence.indexOf(" ")==-1) && arr.length!=1)return sentence;
        sentence ="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].charAt(0)=='$' &&  isValid(arr[i]))
            {
                double sum = Double.parseDouble(arr[i].substring(1,arr[i].length()));
                double calculate = sum - (sum*discount)/100.0;
                String word = String.format("$%.2f",calculate);
                arr[i] = word;
            }
            if(i!=arr.length-1)
                sentence+=arr[i]+" ";
            else sentence+=arr[i];
        }
        return sentence;   
    }

}
