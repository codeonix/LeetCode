package dynamicarrayclass;

public class DynamicArrayUse {
public static void main(String[] args) {
	DynamicArray d1 = new DynamicArray();
	
	for(int i=1;i<=100;i++) {
		d1.add(100+i);
	}
	System.out.println(d1.size());
	System.out.println(d1.get(2));
    d1.set(3,170);
    System.out.println(d1.get(3));
    
    while(!d1.isEmpty()) {
    	System.out.println(d1.removeLast());
    	System.out.println("size - "+ d1.size());
    }
}
}
