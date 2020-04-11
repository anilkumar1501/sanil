package Learning;

class A 
{
	public void move()
	{
		System.out.println("in A");
	}
}

class B extends A
{
	public void move()
	{
		System.out.println("in B");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj1= new B();
		obj1.move();
		

	}

}
