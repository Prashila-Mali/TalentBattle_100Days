//Day 33

import java.util.*;
class Palindrome_String
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a String :"); 
		String str = sc.next();
		String rev ="";
		int len = str.length(); 
		for(int i=len-1;i>=0;i--)
			rev = rev + str.charAt(i);

		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");


	}
}
