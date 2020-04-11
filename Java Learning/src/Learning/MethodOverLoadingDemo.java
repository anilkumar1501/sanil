package Learning;

class Casio {
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
}

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casio Obj = new Casio();
		
		Obj.add(3,4);
		Obj.add(4, 5,6);
		Obj.add(3.5, 4.5);
		

	}

}
