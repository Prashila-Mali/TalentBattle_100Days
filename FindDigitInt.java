//Day 9

import java.util.*;
class FindDigitInt
{

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number:");
    int num=sc.nextInt();
    int count = 0; 

    while(num!=0){
         num = num/10;
         count++;
      }
   
    System.out.println("Number of digits: " + count);
  }
}



