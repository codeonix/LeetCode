/*************************************************************************************
*****************************  Find Power Of A Number ********************************

Problem : Find power of a number
Send Feedback
Write a program to find x to the power n (i.e. x^n). Take x and n from the user.
 You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Algorithm : 
1.take x and n from user.
2.take a loop from 1 to n.
3. ans = ans *x.

****************************************************************************************
****************************************************************************************
________________________________________________________________________________________*/

import java.util.Scanner;
public class PowerOfANumber{
  public static void power(int x,int n){
           int res = 1;
         for(int i =1;i<=n;i++)
             res = res*x;
         System.out.println(res);
        }

//Driver Code :
 public static void main(String ssr[]){
  Scanner s = new Scanner(System.in);
  int x = s.nextInt();
  int n = s.nextInt();
   power(x,n);

   }
}
