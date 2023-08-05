package Oops_Inheritance;


public class carTest {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // override method
		b.stop(); //inherited
		b.autoParking(); //individual 
		b.refuel(); // inherited
		b.engine(); //inherited
		BMW.wheels(); //static method
		b.brake(); //Inherited
		b.seats(); //Inherited 
		b.musicSystem();
		BMW.power();
		
		
		System.out.println("========");
		
		car c = new car();
		c.start();
		c.stop();
		c.refuel();
		car.wheels();
		c.accelerator();
		c.brake();
		car.steering(); 
		c.musicSystem();
		c.power();
		
		
		// c.autoparking
		//top casting 
		
		System.out.println("--------");
		car c1 = new BMW(); // child class object can be referred by parent class ref
		c1.start();
		c1.stop();
		car.wheels();
		c1.brake();
		c1.seats();
		c1.musicSystem();
		System.out.println("-----");
		
		//c1.autoparking();--> In topcasting, we cannot call child class individual method with parent class reference even though object created is child class object

		//BMW b1 = (BMW)new car(); //Classcast exception
		//b1.autoParking();
		//b1.start();
		//b1.stop();
		
		Vehicle v = new Vehicle();
		v.engine();
		v.brake();
		v.accelerator();
		//v.start() --> cannot call child class method
		
		System.out.println("-------");
		Vehicle v1 = new BMW();
		v1.engine();
		v1.accelerator();
		v1.seats();
		v1.brake();
		Vehicle.steering();
		//v1.wheels(); cannot call child class static method
		
		System.out.println("-------");
		Automobile A1 = new car();
		Automobile.steering();
		A1.seats();
	}

}
