package Learning;

 class Calc1 {
	
	int num1;
	int num2;
	
	public Calc1()
	{
		num1=5;
		num2=5;
		System.out.println("in constructror");
	}
	public Calc1(int n) 
	{
		num1=n;
		num2=n;
		
	}
	
	public Calc1(int n,float f)
	{
		num1=n;
		num2=(int) f;
		
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Calc1 Obj = new Calc1(10, 9.5f); //Custructor 
	 System.out.println(Obj.num1);
	 System.out.println(Obj.num2);
	 

	}

}

