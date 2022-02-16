/****************************************************************************************
*****************************************************************************************
Problem :Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.

Algorithm :
1. Take x and n From user .
2. Base case would be x^1 = x.
3.Recursive case : x^n = x * x^(n-1).

******************************************************************************************
*****************************************************************************************/

import java.util.Scanner;
public class RecursiveCodeForXPowerN{
    public  static long recursiveCodeForXPowerN(int x ,int n){
        if( n == 1)
         return  x;  //base case
         return x*recursiveCodeForXPowerN(x,n-1); //recursive code 
     }
  //Driver code :
  public static void main(String ssr[]){
     Scanner s = new Scanner(System.in);
     int x = s.nextInt();
     int n = s.nextInt();
     System.out.println(recursiveCodeForXPowerN(x,n));
     }
}
