package studio7;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
	}

	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
	public String toString() {
		return "length of rectangle: " + this.length + ", " + "width of rectangle: " + this.width;
	}
	
	public int area() {
		return this.length * this.width;
	}
	public boolean compare(Rectangle rectangle) {
		//return this.area() > area;
		if(this.area()>rectangle.area()) {
			return true;
		}
		return false;
	}
	
	public int perimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(1, 2);
		Rectangle R2 = new Rectangle(4, 5);
		//int A1 = R1.area();
		//int A2 = R2.area();
		System.out.println("R1: " + R1.toString());
		System.out.println("perimeter: " + R1.perimeter());
		System.out.println("area: " + R1.area());
		System.out.println("R2: " + R2.toString());
		System.out.println("perimeter: " + R2.perimeter());
		System.out.println("area: " + R2.area());
		System.out.println("R1 is greater than R2: " + R1.compare(R2));
		System.out.println("R1 is a square: " + R1.isSquare());
		System.out.println("R2 is a square: " + R2.isSquare());
	}

}
