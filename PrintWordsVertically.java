/*
Example 1:

Input: s = "HOW ARE YOU"
Output: ["HAY","ORO","WEU"]
Explanation: Each word is printed vertically. 
 "HAY"
 "ORO"
 "WEU"
Example 2:

Input: s = "TO BE OR NOT TO BE"
Output: ["TBONTB","OEROOE","   T"]
Explanation: Trailing spaces is not allowed. 
"TBONTB"
"OEROOE"
"   T"
Example 3:

Input: s = "CONTEST IS COMING"
Output: ["CIC","OSO","N M","T I","E N","S G","T"]
*/

class Solution {
    public List<String> printVertically(String s) {
        List<String> listofwords = new ArrayList();
        String words[] = s.split(" ");
        for( int i=0;  ; i++ )
        {
            String juststoreandgetperpose = ""; 
            boolean isexecute = true;
            for( int j = 0; j<words.length; j++ )
            {
                try {
                    juststoreandgetperpose += words[j].charAt(i);
                    isexecute =  false;
                }catch(StringIndexOutOfBoundsException e){
                    juststoreandgetperpose+=" ";
                }
            }
            if(isexecute)break;
            if(juststoreandgetperpose.charAt(0)==' ' || juststoreandgetperpose.charAt(juststoreandgetperpose.length()-1)==' ')
            {
                String temp = juststoreandgetperpose;
                for(int m=juststoreandgetperpose.length()-1;m>=0;m--)
                {
                    if(juststoreandgetperpose.charAt(m)!=' ')
                    {
                        temp = juststoreandgetperpose.substring(0,m+1);
                        break;
                    }
                }
                juststoreandgetperpose = temp;
            }
            listofwords.add(juststoreandgetperpose);
        }
        return listofwords;
    }
}
