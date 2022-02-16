/**********************************************************************************
***********************************************************************************
Count Number Of Digits in a Word : 
Probelm : Given the code to find out and return the number of digits present in a
 number recursively. But it contains few bugs, that you need to rectify such that
 all the test cases should pass.

Algorithm : 
1.take number from user.
2.Base case would be if number is of 1 digit means n/10 will give 0 .
3.Recursive case would be : 1+ func(n/10).

********************************************************************************
*******************************************************************************/

import java.util.Scanner;
public class RecursiveCodeForCountDigits{
      public static int recursiveCodeForCountDigits(int n ){
            if(n/10 ==0)
                  return 1;
                  return   1+ recursiveCodeForCountDigits(n/10);
            }
    //Driver Code 
   public static void main(String ssr[]){
              Scanner s = new Scanner(System.in);
              int n =s.nextInt();
             System.out.println(recursiveCodeForCountDigits(n));
        }
}
