package Oops_abstraction;

public class TestHosp {
	
	

	public static void main(String[] args) {
		
		ApolloHospital ah = new ApolloHospital();
		ah.gaestroServices();
		ah.dentalServices();
		ah.ENTServices();
		ah.neurologyServices();
		ah.ophthamologyServices();
		ah.orthoServices();
		ah.gaestroServices();
		ah.emergencyServices();
		ah.HealthReg();
		ah.hospProtocols();
		ah.medicalNews();
		ah.phDCourses();
		ah.billing();
		
		System.out.println(USMedical.min_fee);
		System.out.println(ApolloHospital.min_fee);
		
		System.out.println("===========");
		USMedical us = new ApolloHospital(); // topcasting
		us.emergencyServices();
		us.ENTServices();
		us.RenalServices();
		us.physioService();
		us.HealthReg();
		
		
		System.out.println("======");
		InMedical in = new ApolloHospital();
		in.billing();
		
		
		
	}

}
