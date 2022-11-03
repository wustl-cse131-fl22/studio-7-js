package studio7;

public class Die {

	private int nSides;
	
	public Die(int iniNSides) {
		nSides = iniNSides;
	}
	
	public int randomSide() {
		return (int)(Math.random()*this.nSides) + 1;
	}
	public static void main(String[] args) {
		Die One = new Die(5);
		System.out.print("number on the side: " + One.randomSide());
	}

}
