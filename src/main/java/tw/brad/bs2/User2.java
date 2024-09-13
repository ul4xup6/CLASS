package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
	@Autowired
	private Bike bike;
	
	public void rideBike() {
		bike.upSpeed();
	}
	
}