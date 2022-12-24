//Day 34

import java.util.*;
class Remove_Alge_Expression
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		String result = str.replaceAll("[(){}]","");
     	System.out.println(result);
	}
}