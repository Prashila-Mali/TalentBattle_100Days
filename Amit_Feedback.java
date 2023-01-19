//Day 64

import java.util.*;
import static java.lang.System.out;
class Amit_Feedback
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for(int i=0;i<str.length();i++)
		{
			String res = str.substring(i,i+3);
			String result = (res.equals("010") || res.equals("101"))? "Good" : "Bad";
			out.println(result);
			break;
		}
		
	}
}