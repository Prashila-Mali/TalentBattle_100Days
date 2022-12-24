//Day 32

import java.util.*;
class Remove_Vowel_String
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		String str = ""; 
		System.out.println("Enter a String :"); 
		str=sc.next();
		str= str.replaceAll("[aeiou]",""); 
		System.out.println(str);
	}
}
