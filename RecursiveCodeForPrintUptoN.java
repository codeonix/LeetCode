/********************************************************************************
*********************************************************************************
Recursive Code For Print From one to N .
Problem: You have to take a number from user and then you havr to print all the 
numbers from 1 to n.

Algorithm : 
1.Take a number from User.
2.Base case Would be if n=1 print 1.
3.Recursive case :
      a : func(n-1)
      b:  print(n)
**********************************************************************************
*********************************************************************************/
 
import java.util.Scanner;
public class RecursiveCodeForPrintUptoN{
     public static void print(int n){
       if ( n==1){
           System.out.print(1 + " ");//base case
           return;
        }
           print(n-1);               //recursive case
           System.out.print(n + " "); //recursive case
       }
// Driver code :main
 public static void main(String ssr[]){
         Scanner s = new Scanner(System.in);
          int n =s.nextInt();
          print(n);
      }
} 

