// Day 28

import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
        String str="",rev="";
		Scanner sc=new Scanner(System.in);
		
        while(!str.contains("exit"))
        {
        	
        	System.out.println("Enter a String : ");
        	str = sc.next(); 
        	int length = str.length(); 
        	for (int i = length - 1; i >= 0; i--) 
        		rev = rev + str.charAt(i); 

        	System.out.println(rev);
        }
	}
}