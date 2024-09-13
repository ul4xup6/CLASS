package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad01 {
	@Autowired
	private Bike gBike;
	
	@Autowired
	private Bike mBike;
	
	@RequestMapping("/brad01")
	public String myweb() {
		gBike.upSpeed();
		GBike bike = (GBike)gBike;
		System.out.println(bike.getSpeed());
		
		mBike.downSpeed();
		
		return "Brad01";
	}
	
	
}
