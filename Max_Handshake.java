// Day 26

import java.util.*;
class Max_Handshake
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int total = num * (num-1) / 2;
        System.out.println("Total number of handshakes = "+ total);
	}
}