import java.util.Scanner;
public class Merge_Sort{
 public static void mergeSort(int  arr[]){
if(arr.length <=1)
    return ;
int arr1[] = new int[arr.length/2];
int arr2[] = new int[arr.length - arr1.length];

for(int i=0;i< arr.length/2 ;i++)
   arr1[i] = arr[i];

for(int i=arr.length/2;i< arr.length ;i++)
   arr2[i- arr.length/2] = arr[i];

 mergeSort(arr1);
mergeSort(arr2);


// merge both arr1 and arr2 :
merge(arr1,arr2,arr);

    }

//Merge two sorted arrays :
 public static void merge(int arr1[],int arr2[],int arr[]){
   int i = 0,j=0,k=0;
while(i<arr1.length && j<arr2.length){
if(arr1[i] <= arr2[j])
   arr[k++] = arr1[i++];
else 
   arr[k++] = arr2[j++];
}
//copying remaining element 
if(i< arr1.length)
while(i<arr1.length)
   arr[k++] = arr1[i++];
   

if(j <arr2.length)
while( j <  arr2.length)
  arr[k++] = arr2[j++];


}


//Driver Code :
public static void main(String ssr[]){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int arr[] = new int[n];
for(int i=0;i<=n-1;i++)
   arr[i] = s.nextInt();
 mergeSort(arr);
for(int i=0;i<=n-1;i++)
 System.out.print(arr[i] + "  ");
   }
}
