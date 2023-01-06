//Day 47

import java.util.*;
import static java.lang.System.out;
class Longest_Palind
{
	public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size= sc.nextInt();
        int rem,max=0,num,sum=0,temp;
        int a[] = new int[size];
        System.out.println("Enter the Elements of array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         
        for(int i=0;i<a.length;i++)
        { 
            num=a[i];
            temp=num;
            while(num>0)
            {
                rem=num%10;
                sum=(sum*10)+rem;
                num=num/10;
            }
            if(temp==sum)
            {
                if(temp>max)
                    max=temp;
            }
            sum=0;
        }
        out.println(max);
    }
}
