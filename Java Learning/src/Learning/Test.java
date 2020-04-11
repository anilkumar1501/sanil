package Learning;

public class Test {

	int a; // Instance Variables 
	int b;
	
	Test(int a, int b)  //Local Variables
	{
		this.a=a;
		this.b=b; // This is a reference variable that refers to current object
	}
	
	void display()
	{
		System.out.println("a=" +a+"b=" +b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test Obj= new Test(10,20);
		Obj.display();
		
	}

}


// It can be used to refer instance variable of current class