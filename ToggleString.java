// Day 31

import java.util.*;
class ToggleString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
	    String str1="",s1="";
	    str1 = sc.next();
	    for (int i = 0; i < str1.length(); i++) {
		if(Character.isUpperCase(str1.charAt(i))) 
			 s1=s1+Character.toLowerCase(str1.charAt(i));
		else 
			 s1=s1+Character.toUpperCase(str1.charAt(i));
	}
	System.out.println(s1);

	}
}