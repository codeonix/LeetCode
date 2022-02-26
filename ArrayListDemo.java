package linkedList;
import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String[] args) {
	//just like dynamic array class firstly create arr[10] after filling it increases 1.5 times previous capacity .
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(1,80);
	System.out.println(al.size());
	System.out.println(al.get(2));
	ArrayList<Integer> arr = new ArrayList<Integer>(20); // 20 by default elements in array list .
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(1,80);
	arr.set(0, 20); //replace the value at particular index
	arr.remove(0);//remove the array element and shift array left by 1 .
	Integer x =10;
	arr.remove(x);
	for(int i =0;i<=arr.size()-1;i++) {
		System.out.print(arr.get(i)+ " ");
	}
	System.out.println();
	ArrayList<String> list = new ArrayList<String>() ;
	list.add( "apple" );
	list.add( "banana" );
	list.add( "carrot" );
	list.add( 0, "mango" );
	
	for(int i =0;i<=list.size()-1;i++) {
		System.out.print(list.get(i)+ " ");
	}
	System.out.println();
	//Enhanced for loop or for each loop
	for(int i : arr) {
		System.out.print(i+ " ");
	}
}
}
