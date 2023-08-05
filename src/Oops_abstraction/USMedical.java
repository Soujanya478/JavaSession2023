package Oops_abstraction;

public interface USMedical extends Who, UN{
	
	int min_fee = 100;
	
	public void physioService();
	public void ENTServices();
	public void RenalServices();
	public void emergencyServices();
	
	public String get(int a, int b);
	public String get(int a);
	

}
