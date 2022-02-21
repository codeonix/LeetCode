/*************************************************************************
 *************************************************************************
 ***************** Check Palindrome (Recursive ) **************************
 
Problem :Check Palindrome (recursive)
Send Feedback
Check whether a given String S is a palindrome using recursion. Return 
true or false.

1.Base case start >= end return true
2.small comparision : compare first and last 
3.call recursion on remaining characters 
**************************************************************************
**************************************************************************/
package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	public static boolean isStringPalindrome(String str,int start,int end) {
	if(start >= end)
		return true;
	if(str.charAt(start)!=str.charAt(end)) 
		return false;
         start ++;
         end --;
	    boolean ans =isStringPalindrome(str, start, end);
	    return ans ;
	}
	
	//Driver Code
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str =s.next();
		System.out.println(isStringPalindrome(str, 0, str.length()-1));
		
	}
}

