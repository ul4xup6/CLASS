package tw.brad.bs2;

import tw.brad.bs2.Bike;


public class Bike2 implements Bike {
	@Override
	public void upSpeed() {
		System.out.println("Bike2:upSpeed");
	}
 
	@Override
	public void downSpeed() {
		System.out.println("Bike2:downSpeed");
	}
	
}
