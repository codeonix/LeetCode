/**************************************************************************************
************************** Remove X ***************************************************
 Problem : Given a string, compute recursively a new string where all 'x' chars have
 been removed.

Algorithm :
1.Base case : if str.length() == 0 return str.
2.smallOutput = removeX(str.substring(1));
3.if str.charAt(0) == 'x' return smallOutput
4.else return  str.charAt(0) +smallOutput;

****************************************************************************************
*****************----------------------------------------------*************************
***************************************************************************************/

import java.util.Scanner;
public class RemoveX{
 public static String removeX(String str,char ch){
  if(str.length() == 0)
     return str;
String  smallOutput = removeX(str.substring(1),ch);
  if(str.charAt(0) == ch)
   return smallOutput;
  return str.charAt(0) +smallOutput;
  }

//Driver Code :
public static void main(String ssr[]){
 Scanner s = new Scanner(System.in);
String str = s.next();
char ch = s.next().charAt(0);
System.out.println(removeX(str,ch));
    }
}
