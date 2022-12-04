import java.util.*;
class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		int temp=n,sum=0;

		while(n!=0)
		{
			int rem = n % 10;  
		    sum = (sum) + ( rem * rem * rem );
			n = n / 10;  
		}

        if(temp==sum)
        {
        	System.out.println("Armstrong Number");
        }
        else
        {
        	System.out.println("Not a Armstrong Number");
        }
	}
}