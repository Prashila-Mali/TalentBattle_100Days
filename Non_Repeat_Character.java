//Day 38

import java.util.*;
class Non_Repeat_Character
{
	public static void main(String[] args) 
	{
		int max_count = 0;
        char max_char=Character.MIN_VALUE;

        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter a String:");
        String str = sc.nextLine(); 

        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++; 
        }
        for (int i = 0; i < 256; i++)
        {
            if (arr[i] == 1)
            {
                System.out.print((char)i);
            }
        }
	}
}