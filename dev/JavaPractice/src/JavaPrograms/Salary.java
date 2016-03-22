package JavaPrograms;

public class Salary extends Employee {

	private double salary;
	public Salary(String name, String addresss, int number, double salary) {
		super(name, addresss, number);
		setSalary(salary);
		
	}
	
	@Override
	public void mailCheck() {
		System.out.println("Within mail check of Salary class");
		System.out.println("Mailing check with " +getName() + " salary " +salary);
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		if(newSalary>=0.0){ 
		salary = newSalary;
		}
	}
	public double computePay(){
		System.out.println("Computing salary pay for " +getName());
		return salary/52;
		
	}
	
}
