/*************************************************************************
 * *********************  ###Count Zero Recursively  **********************
 *************************************************************************
 Problem :Given an integer N, count and return the number of zeros that are 
 present in the given integer using recursion.
 */

package recursion;
import java.util.Scanner;

public class CountZeroRec {
	public static int countZerosRec(int n){
	
		if(n/10 == 0 && n!=0 )
			return 0;
		else if(n==0)
		return 1;
		int lastDigit = n%10;
		n = n/10;
		if(lastDigit == 0)
			return  countZerosRec(n)+1;
		else
			return countZerosRec(n);
			
	}
	//Driver code
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}
}
