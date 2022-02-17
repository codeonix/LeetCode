/*****************************************************************************************
******************************************************************************************
Problem : Check An is Array is Sorted or not and only use that array itself don't
create a new array to do copy and paste remaining element of array (recursive case.)

Algorithm :
1.Base case would be if start index==arr.length-1 return true or n==1 for spliting from
end.
2.Recusrsive case would be :
        i.split from start  
             a.if(arr[0] > arr[1]) return false.
             b.return  isArraySorted(arr,start+1);
       ii.Split from end :
             a.if(arr[n-1]<arr [n-2] return false.
            b.return isArraySorted(arr,n-1).
*****************************************************************************************
***************************************************************************************/
import java.util.Scanner;
public class IsArraySorted{
    public static  boolean  isArraySorted(int arr[],int n){
     if(n == 1 )
         return true;
    if(arr[n-1] < arr[n-2])
         return false;
         return isArraySorted(arr,n-1);
      }
//Driver Code:
  public static void main(String ssr[]){
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<=n-1;i++)
             arr[i] = s.nextInt();
        System.out.println(isArraySorted(arr,n));
     }
}
   
    
