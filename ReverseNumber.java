//Day 14

import java.util.*;
public class ReverseNumber {


	
	public static void main(String[] args) {
		// Write your code here
		int n,rev = 0;  
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
       while(n != 0)   
		{  
			int rem = n % 10;  
			rev = rev * 10 + rem;  
			n = n/10;  
		}  
		System.out.println(rev);  




	}
}