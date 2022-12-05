import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
        int flag=0,i;

        for(i=2;i<n;i++)
        {
        	if(n%i==0)
        	{
        		flag++;
        		break;
        	}
        }
        if(flag==0)
        {
        	System.out.println("Prime Number");
        }
        else
        {
        	System.out.println("Not Prime Number");
        }
        
	}
	
}