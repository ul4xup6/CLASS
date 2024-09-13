package tw.brad.bs2;

import org.springframework.stereotype.Component;

import tw.brad.bs2.Bike;

@Component
public class Bike1 implements Bike{
 
	@Override
	public void upSpeed() {
		System.out.println("Bike1:upSpeed");
	}
 
	@Override
	public void downSpeed() {
		System.out.println("Bike1:downSpeed");
	}
	
}
