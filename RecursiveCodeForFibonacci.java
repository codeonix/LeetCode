/***********************************************************************************
***********************************************************************************
Problem : You havr given a number n and you have to find fib(n).
Algorithm :
1.Take n from user.
2.base case would be if n==1 or n==0 return 1.
3.recursive case : return fib(n-1) + fib(n-2).

*************************************************************************************
************************************************************************************/

import java.util.Scanner;
public class RecursiveCodeForFibonacci{
        public static int fib(int n){
          if (n==0 || n==1)
            return 1; //base case
         return fib(n-1) +fib(n-2);//recursive case 
       }
   //Driver code :
   public static void main(String ssr[]){
       Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      System.out.println(fib(n));
    }
}
