package oops;

public class Fraction {
private int numerator;
private int denumerator;
public Fraction(int numerator ,int denumerator) {
	this.numerator = numerator;
	this.denumerator = denumerator;
	simplify();
}
 
private void simplify() {
	
	int gcd = 1;
	int smaller = Math.min(numerator, denumerator);
	for(int i=2;i <= smaller;i++) {
		if(numerator % i ==0 && denumerator % i ==0 ) {
			gcd =i;
		}
		
	}
	numerator = numerator/gcd;
	denumerator = denumerator/gcd;
}
public void increment() {
	numerator = numerator + denumerator;
	simplify();
}

public void  setNumeraor(int num) {
	this.numerator = num;
	simplify();
}

public void setDenumerator(int num) {
	if(num == 0) {
		//Throw Error
		return;
	}
	this.denumerator = num;
}

public int getNumerator() {
	return numerator;
}
public int getDenumerator() {
	return denumerator;
}


public void print() {
	System.out.println(numerator + "/"+denumerator);
}

public void add(Fraction f2) {
	//First fraction is the fraction on which fruction is called
	//second fraction is passed as arguments
this.numerator =	this.numerator * f2.denumerator + this.denumerator *f2.numerator;
this.denumerator = this.denumerator * f2.denumerator;
simplify();
}

public static  Fraction add(Fraction f1,Fraction f2) {
	int newNum = f1.numerator * f2.denumerator + f1.denumerator * f2.numerator;
	int newDenom = f1.denumerator * f2.denumerator;
	Fraction f3 = new Fraction(newNum,newDenom);
	return f3;
	
}
}
