//Day 40

import java.util.*;
class Replace_Sub_String
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
        String str = sc.next();

        System.out.println("Enter a Substring to be remove:");
        String str1 = sc.next();

        System.out.println("Enter a New Substring :");
        String str2 = sc.next();
        
        String new_str = str.replaceAll(str1, str2);
        System.out.println("New String: \n" + new_str);
	}
}