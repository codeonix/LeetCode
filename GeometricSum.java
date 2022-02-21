/*************************************************************************
 * ************************** Geometric Sum ******************************
 * Problem :Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 

Algorithm :
Approach:
In the above-mentioned problem, we are asked to use recursion. 
We will calculate the last term and call recursion on the remaining n-1 
terms each time. The final sum returned is the result.
Below is the implementation of the above approach: 
 */

package recursion;
import java.text.DecimalFormat;
import java.util.*;

public class GeometricSum {
	public static double findGeometricSum(int k){
		if( k==0)
			return 1;
		return  findGeometricSum(k-1) + 1/(double)Math.pow(2, k); 
     }
	//Driver Code :
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(findGeometricSum(k)));
	}
}
