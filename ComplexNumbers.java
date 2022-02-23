package complex;

public class ComplexNumbers {
private int real ;
private int imaginary;
public ComplexNumbers(int real,int imaginary) {
	this.real = real;
	this.imaginary = imaginary;
}
public void setReal(int n) {
	this.real = n;
}
public void setImaginary(int n) {
	this.imaginary = n;
}

public void add(ComplexNumbers c2) {
	this.real = this.real + c2.real;
	this.imaginary = this.imaginary + c2.imaginary;
}

public void multiply(ComplexNumbers c2) {
	this.real = this.real * c2.real - this.imaginary * c2.imaginary;
	this.imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
}
public static ComplexNumbers add(ComplexNumbers c1,ComplexNumbers c2) {
	int newReal = c1.real + c2.real;
	int newImaginary = c1.imaginary + c2.imaginary;
	ComplexNumbers c3 = new ComplexNumbers(newReal, newImaginary);
	return c3;
}
public void print() {
	System.out.println(real+ " + i"+imaginary);
}
}
