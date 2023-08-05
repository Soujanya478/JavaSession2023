package ExceptionHandling;

public class Employee {
	
	String name ="Sam";
	public static void main(String[] args) {
	
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			
		Employee emp = new Employee();
		emp = null;
		System.out.println(emp.name);
		int i =9/0;
		System.out.println(i);
		System.out.println("B");
		System.out.println("B");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught");
			e.printStackTrace();//reporting purpose
			//print stack trace will give more info on exception
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
			e.printStackTrace();//reporting purpose
//			//print stack trace will give more info on exception
		}
		
		System.out.println("A");

	}

}
