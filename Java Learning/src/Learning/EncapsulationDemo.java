package Learning;

//Encapsulation: Binding data with methods is called Enacpasulation
class Student {
	
	private int Rollno;
	private String name ;
	
	public void setRollno(int r)  //Setters
	{
	
		Rollno= r;
		
	}
	
	public int getRollno()       //Getters
	{
		return Rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student ();
		S1.setRollno(2);
		S1.setName("Anil");
		System.out.println(S1.getRollno());
		System.out.println(S1.getName());
	}

}
