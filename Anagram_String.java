//Day 39

import java.util.*;

class Anagram_String
 {
  public static void main(String[] args)
   {
   		Scanner sc = new Scanner(System.in);
   		System.out.println("Enter 1st String:");
    	String str1 = sc.next();
    	System.out.println("Enter 2nd String:");
    	String str2 = sc.next();
    
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();

    	
    	if(str1.length() == str2.length()) 
    	{

     		char[] charArray1 = str1.toCharArray();
        	char[] charArray2 = str2.toCharArray();

      		Arrays.sort(charArray1);
      		Arrays.sort(charArray2);

      		boolean result = Arrays.equals(charArray1, charArray2);

      		if(result) 
      		{
        		System.out.println("Anagram");
      		}
        	else
        	{
        		System.out.println("Not Anagram");
        	}
    	}
    	else 
    	{
      		System.out.println("Not Anagram");
    	}
    }
}