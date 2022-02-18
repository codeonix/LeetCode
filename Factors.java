/***************************************************************************************
******************************* Factors of a Number ************************************

Problem : Write a program to print all the factors of a number other than 1 and the
 number itself.

Algorithm :
1.Take a number From User.
2.Take a loop from 2 to n/2 
3.if( n % i  ==0 ) print i .

*****************************************************************************************
-----------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------
*****************************************************************************************/

import java.util.Scanner;
public class Factors{
  public static void factors(int n){
   for(int i=2;i<=n/2;i++){
   if(n % i ==0)
   System.out.print(i+ " ");
  }
}
//Driver Code :
 public static  void main(String ssr[]){
   Scanner s= new Scanner(System.in);
  int n = s.nextInt();
  factors(n);
  }
}
