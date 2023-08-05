package Oops_MethodsConcepts;

public class Customer {
	
	String name; //Class Variables are also called as instance variables 
	int age;
	
	//Method cannot be created inside the method. We can a method from another method --> Hence methods are independent --> Parallel to each other
	
	// 3 types of methods 
	
	//1. No return and no input
	public void test()
	{
		System.out.println("No input No return Method");
	}
	//2. some return and no input
	//a . return type : int
	public int sum()
	{
		int a =10;
		int b =30;
		int c =a+b;
		return c;
	}
	
	public static String programmingLanguage()
	{
		String lang = "java";
		System.out.println("Return without parameters passing");
		System.out.println("Programming language is java");
		return lang;
		
	}
	// 3. Some return and some input
	
	public int add(int a , int b)
	{
		System.out.println("Return with parameters passing");
		int c = a+b;
		return c;
	}
	
	

	public static void main(String[] args) {
		
   Customer cm = new Customer();
   cm.test();
   cm.name="Sam";
   int rep = cm.sum();
   System.out.println(rep);
   
   String lang = Customer.programmingLanguage();
   if(lang.equals("java"))
   {
	   System.out.println("Select the job applicant");
   }
   else {
	   System.out.println("Hold the resume");
   }
   int add = cm.add(30, 40);
   System.out.println(add);
	}

}
