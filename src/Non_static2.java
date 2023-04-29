

public class Non_static2 {// Non Static method with argument
	
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("Addtion is "+ c);
	}
	
	public static void base() {
		System.out.println("Base method is running");
	}
	public static void main(String[] args) {
		
		Non_static2 z =new Non_static2();
		
		z.add(56, 56);
		
		
		base();
		
		Non_static2.base();
	}
	
	
	

}
