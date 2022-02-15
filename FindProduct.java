/****************************************************************************************
****************************************************************************************
Problem : You are given a single non-negative integer, N. You need to calculate and print
 N   factorial (N!) .N factorial is defined as the product of all integers from 1 to N
 (both inclusive) .

Algorithm : 
01.Take  Number from user .
02.Take fact =1.
03.Take a loop from 1 to n .
04. fact = fact*i;
05.i++;
06.print fact outside te loop .

Time complexity : O(n)
Space Complexity : O(1)

******************************************************************************************
*****************************************************************************************/

 

import java.util.Scanner;
class FindProduct {
public static void main(String ssr[]){
       Scanner s = new Scanner(System.in);
      int n =s.nextInt();
      long fact =1;
      for(int i=1;i<=n;i++)
       fact *=i;
    System.out.println("Factorial of " + n + " is : " + fact);
    }
}
