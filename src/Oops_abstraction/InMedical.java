package Oops_abstraction;

public interface InMedical {

	public void gaestroServices();
	public void radiologyServices();
	public void neurologyServices();
	public void emergencyServices();
	
	//After JDK 1.8, static method can have definition in interface
	
	public static void InMedPharm() { // static not allowed for abs method  
		System.out.println("USMedical - USMedicalPharm");
	}
	
	default void billing()
	{
		System.out.println("Default method - billing - InMedical");
	}
}
