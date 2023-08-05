package Oops_abstraction;

public class ApolloHospital extends Hospital implements USMedical,UkMedical,InMedical{
	
	
	//US
	@Override
	public void physioService() {
		System.out.println("Apollo Hospital - PhysioServices");
		
	}
	//US
	@Override
	public void ENTServices() {
		System.out.println("Apollo Hospital - ENTServices");
		
	}
	//US
	@Override
	public void RenalServices() {
		System.out.println("Apollo Hospital - RenalServices");
		
	}
	//UK
	@Override
	public void dentalServices() {
		System.out.println("Apollo Hospital - dentalServices");
		
	}
	//UK
	@Override
	public void orthoServices() {
		System.out.println("Apollo Hospital - OrthoServices");
		
	}
	//UK
	@Override
	public void ophthamologyServices() {
		System.out.println("Apollo Hospital - ophthamologyServices");
		
	}
	@Override
	public void gaestroServices() {
		System.out.println("Apollo Hospital - gaestroServices");
		
	}
	@Override
	public void radiologyServices() {
		System.out.println("Apollo Hospital - radiologyServices");
		
	}
	@Override
	public void neurologyServices() {
		System.out.println("Apollo Hospital - neurologyServices");
		
	}	

	public void medicalInsurance()
	{
		System.out.println("Apollo Hospital - MedicalInsurance");
	}
	@Override
	public void emergencyServices() {
		
		System.out.println("Emergency Services - Apollo Hospital ");
		
	}
	@Override
	public String get(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String get(int a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void HealthReg() {
		System.out.println("Who -- Health Regulatory- Apollo Hospital");
		
	}
	@Override
	public void medicalNews() {
		System.out.println("UN _ Medical News - Apollo Hospital");
		
	}
	
	public void billing()  // We can override the default method by using public method
	{
		System.out.println("Default method - billing - Apollo Hospital");
	}
}
