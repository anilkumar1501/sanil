package Learning;

public class Calc {
	
	int num1;
	int num2;
	static int result;
	
	public void perform()
	{
		result=num1+num2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc obj= new Calc(); // Objects knows Something and does something
		obj.num1=10;
		obj.num2=10;
	
		System.out.println(obj.result);
		
	}

}
