package concepts;

public class AstaticBlock {
	
	static {
		System.out.println("First static block is executed....");
	}
	
	public static void main(String[] args) {
		System.out.println("Seocnd main block is executed....");
	}

}
