package dynamicarrayclass;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	//constructor
	public DynamicArray() {
	   data = new int[5];
	   nextElementIndex =0;
	} 
	//size of the array
	public int size() {
		return nextElementIndex ;
	}
	
	//is Array is empty or not
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	//Get an element from array by giving index
	public int get(int i) {
		if(i>=nextElementIndex) {
			//throw error
			return -1;
		}
		return data[i];
	}
	
	//Add new Element 
	public void add(int newElement) {
		
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		
		data[nextElementIndex] = newElement;
		nextElementIndex ++;
	}
	
	//if array is full then double the capacity of the array
	private void doubleCapacity() {
		//copy all the previous elements 
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0 ; i < temp.length; i++) {
			data[i] = temp[i];
		}
		
		}
	//replace current element :
			public void set(int index,int n) {
				if(index >= nextElementIndex) {
					// Throw index out of bounds error
					return ;
				}
				data[index] = n;
			}
			
	//remove last
			public int removeLast() {
				if(nextElementIndex ==0) {
					return -1;
				}
				int temp = data[nextElementIndex -1];
				nextElementIndex --;
				data[nextElementIndex] = 0;
				return temp;
			}
	
}
