/***********************************************************
 * ********************************************************
 * Problem : Pair Star
Send Feedback
Given a string S, compute recursively a new string
 where identical chars that are adjacent in the original 
 string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a

Approach: 

If there is an empty string then simply return. 
This forms our base condition.
Check if the first two characters are identical. 
If yes, then insert ” * ” between them.
As we have now checked for identical characters 
at the first two positions of the string so we 
now make a recursive 
call without the first character of the string.
 **********************************************************
 ***********************************************************/

package recursion;
import java.util.*;
public class PairString {
	static String output ="";
	public static void pairStar(String str,int i) {
		output = output+str.charAt(i);
		if( i == str.length()-1)
			return ;
		if(str.charAt(i)==str.charAt(i+1))
			output = output+'*';
		pairStar(str,i+1);	
	}
	
public static String addStar(String str) {
	pairStar(str,0);
	return output;
}
//Driver Code:
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.next();
	System.out.println(addStar(str));
}

}
