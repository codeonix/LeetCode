/******************************************************************************************************
*******************************************************************************************************
Recursion :
1. Do some smaller work(base case)
2.Remaining work will be done by recursion(Recursive case).


Problem : Recursive code for factorial of a number :
Algorithm : 
1.Take a number from user.
2.Write base case if (n==1 || n==2) then return 1.
3.write recursive case  n*fact(n-1).
*******************************************************************************************************
******************************************************************************************************/
/*                               Recursive Code for factorial                                         */

import java.util.Scanner;
public class Recursion{
       public static int   recursiveCodeForFactorial(int n){
           //base case 
            if(n==0 || n==1)
             return 1;
            else
             return n*recursiveCodeForFactorial(n-1); //recursive case
          }
     //Driver code
    public static void main(String ssr[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number to find factorial :");
        int n = s.nextInt();
        System.out.println("The factorial of "+  n + " is : " + recursiveCodeForFactorial(n));
    }
}
