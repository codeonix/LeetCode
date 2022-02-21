/*********************************************************************
 ***************************** Sum of Digits *************************
 Problem :Sum of digits (recursive)
Send Feedback
Write a recursive function that returns the sum of the digits of a given
 integer.
 
**************************************************************************
*************************************************************************/
package recursion;
import java.util.*;
public class SumOfDigits {

public static int sumOfDigits(int n){
   if(n/10 ==0)
	   return n;
   int lastDigit = n % 10;
   n = n/10;
   int ans = lastDigit + sumOfDigits(n);
   return ans ;

	}
//Driver Code:
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println(sumOfDigits(n));
}
}
	

