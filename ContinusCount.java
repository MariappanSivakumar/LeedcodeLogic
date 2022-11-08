/*
Example 1:
Enter the String...:
aaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccccccddddddddddddddddeee
a26b29c25d16e3

Example 2:
Enter the String...:
sdkhfjsdhhashfkhsdhkfhkshdfsf
sdkhfjsdh2ashfkhsdhkfhkshdfsf
*/
class NumberSay
{
	public String getString()
	{
		String input ="";
		try 
		{
			input = ((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		}catch(java.io.IOException e){}
		return input;
	}
	public static void main(String ar[])
	{
		System.out.println("Enter the String...:");
		String input = new NumberSay().getString();
		int len = input.length();
		int count = 1;
		String word ="";
		for(int i=0;i<len-1;i++)
		{
			if(input.charAt(i) == input.charAt(i+1))
			{
				count++;
			}else {
				if(count !=1)
				word  += input.charAt(i) +""+ count;
				else word+= input.charAt(i);
				count = 1;
			}
		}
		if(count!=1)word+=""+input.charAt(input.length()-1)+""+count;
		else word+= input.charAt(input.length()-1);
		System.out.println(word);
	}
}
