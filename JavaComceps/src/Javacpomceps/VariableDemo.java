package Javacpomceps;

public class VariableDemo {
	
	static int k=50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableDemo obj1 = new VariableDemo();
		obj1.VarMethod();
		obj1.VarMethod2();
		System.out.println("Value of k is "+k);

	}
	
	public void VarMethod() {
		
		int i=10;
		System.out.println("Value of i is "+i);
		System.out.println("Value of k is "+k);
	}

	public void VarMethod2()
	{
		System.out.println("Value of k is "+k);
	}
}
