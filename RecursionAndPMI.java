/*****************************************************************************************
******************************************************************************************
 Recusrion and PMI :Principal of mathematical Induction 

ALgorithm : 
1. Prove base case is true . means f(1) or f(0) is/are true.
2.Assume f(k) is true.
3.Prove f(k+1) is true as well.

sum(1) = 1*(1+1)/2 = 1
Assume sum(k) = k*(k+1)/2
sum(k+1) =sum(k) +(k+1) =  (k+1)*(k+2)/2 = k*(k+1)/2 + 2*(k+1)/2 
 
Problem : sum of N natural numbers by recursion : 
******************************************************************************************
*****************************************************************************************/

import java.util.Scanner;
public class RecursionAndPMI{
    public static int recursiveCodeForSum(int n){
               if (n==1)
                return 1;  //base case
               else
                return n + recursiveCodeForSum( n-1);  //recursive code
            }
  //Driver code :
  public static void main(String ssr[]){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number : ");
      int n = s.nextInt();
      System.out.println("Sum of "+ n + " natural number is :"+ recursiveCodeForSum(n));
     }
}
