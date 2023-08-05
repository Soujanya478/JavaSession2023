package constructorChaining;

public class employee {
	
	String name;
	int age;
	double salary;
	
	
	public employee() {
		this("Sam",2);
	}
	public employee(String name, int age) {
	    this(name,age,90.0);
		this.name = "samhita";
		this.age = 3;
	}
	public employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public static void main(String args[]) {
	employee emp = new employee();
	System.out.println(emp.name);
	System.out.println(emp.age);
	System.out.println(emp.salary);
	
	} 
}
