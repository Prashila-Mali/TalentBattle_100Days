//DAY 1 :

import java.util.*;
 class VowelConsonant {

    public static void main(String[] args) {

        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch=sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        
        else
        	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        	   System.out.println("Consonant");
            else
               System.out.println("Invalid input");
        


    }
}