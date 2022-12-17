//Day 30

import java.util.*;
class WithoutLen
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The String :");
	    String str = sc.next();
	    int i = 0;
        for(char c: str.toCharArray()) 
        {
            i++;
        }
        System.out.println(i);
	}
}

      