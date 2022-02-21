/************************************************************************
 ************************************************************************
 *
 *Problem :Multiplication (Recursive)
Send Feedback
Given two integers M & N, calculate and return their multiplication
 using recursion. You can only use subtraction and
 addition for your calculation. No other operators are allowed.

 *************************************************************************
 **************************************************************************/
package recursion;
import java.util.Scanner;
public class Multiplication {
       public static int multiplyTwoIntegers(int m, int n){
		if(n==0)
			return 0;
		return multiplyTwoIntegers(m, n-1)+m;
	}
       //Driver Code
       public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}
}
