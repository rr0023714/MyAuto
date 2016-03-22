package JavaPrograms;

public abstract class Employee {
	
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String addresss, int number){
		System.out.println("Constructing an Employee");
		this.name=name;
		this.address=addresss;
		this.number=number;
		}

	public void mailCheck(){
		System.out.println("Emailing check to " +this.name + "" +this.address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}

	
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", number="
				+ number + "]";
	}


	
}
