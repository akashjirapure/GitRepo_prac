

public class Non_static {// Non Static method with argument
	
	public void add(int a, int b) {
		int c= a+b;
		System.out.println("Addtion is "+ c);
	}
	public static void main(String[] args) {
		
		Non_static z =new Non_static();
		
		z.add(56, 56);
	}
	
	

}
