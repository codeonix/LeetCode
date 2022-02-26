package linkedList;
import java.util.*;
public class RemoveCosecutiveElements {
public static ArrayList<Integer> removeConsecutiveDuplicates(int arr[]){
	ArrayList<Integer> result = new ArrayList<Integer>();
	result.add(arr[0]);
	for(int i=1;i<= arr.length-1;i++) {
		if(arr[i] != arr[i-1])
			 result.add(arr[i]);	
	}
	return result;
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<=arr.length -1 ;i++)
		arr[i]= s.nextInt();
	ArrayList<Integer> list = removeConsecutiveDuplicates(arr);
	for(int i=0;i<=list.size()-1;i++)
		System.out.print(list.get(i)+ " ");
}
}
