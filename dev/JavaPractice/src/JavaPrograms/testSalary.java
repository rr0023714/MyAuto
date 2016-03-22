package JavaPrograms;

public class testSalary {

	public static void main(String[] args) {
		
		Salary s = new Salary("rakesh", "10 Cedar Pointe loop", 23714,100000);
		System.out.println("calling mail check instance using salary reference");
		s.mailCheck();
		
		Employee e = new Salary("asha", "10 Cedar Pointe loop", 23715,120000);
		System.out.println("calling mail check instance using employee reference");
		e.mailCheck();

	}

}
