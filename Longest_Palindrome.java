//Day 47

import java.util.*;
class Longest_Palindrome
{
	public static boolean isPalindrome(int n) 
    {
        int rem,num,rev=0;
        num=n;
           
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
              
        if(num==rev)
            return true;
        else
            return false;
    }

    public static int largest(int []arr, int n) 
    {
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }
            
        for (i = n - 1; i >= 0; --i) 
        { 
            if (isPalindrome(arr[i])) 
                return arr[i]; 
        }
        return -1; 
    }
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size= sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the Elements of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		 int larger=largest(a, size);
            if(larger==-1)
                 System.out.println("There is no palindrome number in the array"); 
            else
                 System.out.println("Longest Palindrome Number:"+larger);
	}

	
}