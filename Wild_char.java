// Day 41

import java.util.*;
class Wild_char
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter String containing wild Charcater");

        String wild = sc.next();
        System.out.println("Enter String to be matched");
        String str = sc.next();

        boolean flagA = true, flagB = false;
        int m = wild.length(), n = str.length();
        boolean check[][] = new boolean[m + 1][n + 1];
        check[0][0] = true;

        for (int i = 1; i <= n; i++) check[0][i] = false;
        for (int i = 1; i <= m; i++) {
            if (wild.charAt(i - 1) == '*')
                check[i][0] = check[i - 1][0];
            else
                check[i][0] = false;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (wild.charAt(i - 1) == str.charAt(j - 1))
                    check[i][j] = check[i - 1][j - 1];
                else if (wild.charAt(i - 1) == '?')
                    check[i][j] = check[i - 1][j - 1];
                else if (wild.charAt(i - 1) == '*')
                    check[i][j] = check[i - 1][j] || check[i][j - 1];
                else
                    check[i][j] = false;
            }
        }

        if (check[m][n])
            System.out.println("Yes they match");
        else
            System.out.println("No they don't match");
	}
}