import java.util.*;

public class Replace0to1

{
      public static void main(String[] args)
      {

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a Number: ");
          int n = sc.nextInt();
          int new_num=0;
          if(n == 0)
            new_num=1;

          while(n>0)
           {
             int rem = n%10;
             if(rem == 0)
              rem = 1;
              n = n/10;
              new_num=new_num*10+rem;

            }

             while(new_num>0)

              {

                  int r = new_num%10;

                  n= n*10 + r;

                  new_num =new_num / 10;

              }

             System.out.println(n);

        }

}