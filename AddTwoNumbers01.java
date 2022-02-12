//Coding Ninja - Get Started With Java 
//You have given two numbers and you have to add them and print .

//Algorithm :
 //01.Take Two Numbers From User.
//01.Add Them and Store Them Into A Variable.
//01.Use That Variable .

//Time Complexity : O(1) and Space Complexity =O(1).

//solution of above algorithm in java : 
import java.util.Scanner;
public class AddTwoNumbers01{
public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Two Numbers : ");
       int num1 = s.nextInt();
       int num2 = s.nextInt();
      int res = num1+num2;
     System.out.println("Sum of " + num1 + " and " + num2 + " is " + res);
     }
   }

