package Javacpomceps;

public class ObjandClass {

	int n1;
	int n2;
	static int result;
	
	public void Addition()
	{
		result = n1+n2;
		System.out.println("Result is "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjandClass obj = new ObjandClass();
		obj.n1=10;
		obj.n2=20;
		obj.Addition();	
		
		

	}

}
