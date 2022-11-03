package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int iNum, int iDenom) {
		numerator = iNum;
		denominator = iDenom;
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	public String addition(Fraction f2) {
		int newDenom = this.denominator * f2.denominator;
		int newNum = this.numerator*f2.denominator + this.denominator*f2.numerator;
		return newNum + "/" + newDenom;
	}
	public String multiplication(Fraction f2) {//change type to Fraction 
		int newDenom = this.denominator * f2.denominator;
		int newNum = this.numerator*f2.numerator;
		return newNum + "/" + newDenom;//new fraction  = new Fraction(new denom, new num);
	}
	public String reciprocal() {
		return this.denominator + "/" + this.numerator;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,5);
		Fraction f2 = new Fraction(6,7);
		//Fraction f3 = f1.multiplication(f2);
		System.out.println("Fraction 1: " + f1.toString());
		System.out.println("Reciprocal of f1: " + f1.reciprocal());
		System.out.println("Fraction 2: " + f2.toString());
		System.out.println("Reciprocal of f2: " + f2.reciprocal());
		System.out.println("Addition: " + f1.addition(f2));
		System.out.println("Multiplication: " + f1.multiplication(f2));
		System.out.println("Reciprocal: " + f1.reciprocal());
	}

}
