package SITS;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10,y = 30;
		
		addtwonumbers(10,50);
		addtwonumbers(250,500);
		addtwonumbers(100,300);
		multiplytwonumbers(5,10);
		
	
	}

	private static void multiplytwonumbers(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Multiply Two Numbers : "+i*j);
	}

	private static void addtwonumbers(int x, int y) {
		// TODO Auto-generated method stub
		int z;
		z=x+y;
		System.out.println("Adding two numbers "+z); 	
	}

	
}
