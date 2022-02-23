package complex;



public class ComplexUse {
public static void main(String[] args) {
	ComplexNumbers c1 = new ComplexNumbers(2,3);
	c1.print();
	c1.setReal(4);
	c1.setImaginary(5);
	c1.print();
	
	
	ComplexNumbers c2 = new ComplexNumbers(4,3);
	c1.add(c2);
	c1.print();
	c2.print();
	
	ComplexNumbers c3 = new ComplexNumbers(2,3);
	c3.multiply(c2);
	c3.print();
	c2.print();
	
	ComplexNumbers c4 = ComplexNumbers.add(c1,c2);
	c1.print();
	c2.print();
	c4.print();
}
}
