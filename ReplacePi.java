/***********************************************************************************
************************************************************************************
*************************** Replace Pi  *******************************************
------------------------------------------------------------------------------------

Problem : replace pi in a string with 3.14 

Algorithm : 
1.base case : str.length() <=1 return str.
2.if(str.charAt(0) == 'p' && str.charAt(1) =='i' ) //recursion on String of length n-2
3.else  // recursion on  String n-1.


*************************************************************************************
************************************************************************************/
import java.util.Scanner;
public class ReplacePi{
public static String replacePi(String str){
  if(str.length() <=1)
      return str;
 if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
  String smallOutput = replacePi(str.substring(2));
  return  "3.14"+smallOutput;
}
else{
String smallOutput = replacePi(str.substring(1));
 return str.charAt(0)+smallOutput;
   }
}

//Driver Code :
public static void main(String ssr[]){
 Scanner s = new Scanner(System.in);
 String str = s.next();
 System.out.println(replacePi(str));
   }
}
