/**************************************************************************************
******************************** Sum Of Even And Odd **********************************

Problem : Write a program to input an integer N and print the sum of all its even digits
 and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245",
 even digits are 2 & 4 and odd digits are 1, 3 & 5.


Algorithm :
1.Take  a number from user.
2.while (num >0)
3.lastDigit = n % 10
4.n=n/10
5.if(lastDigit %2 ==0 ) sumEven+=lastDigit .
6.else sumOdd+=lastDigit.

****************************************************************************************
***************************************************************************************/

import java.util.Scanner;
public class SumOfEvenAndOdd{
   public static void sum(int n){
   int sumEven = 0,sumOdd=0;
 while(n>0){
    int lastDigit = n % 10;
    n /= 10;
    if(lastDigit %2 == 0)
    sumEven +=lastDigit;
   else
    sumOdd += lastDigit;
    }
 System.out.print(sumEven + " "+sumOdd);
    }
//Driver Code
public static void main(String ssr[]){
  Scanner s= new Scanner(System.in);
  int n = s.nextInt();
  sum(n);
   }
}
