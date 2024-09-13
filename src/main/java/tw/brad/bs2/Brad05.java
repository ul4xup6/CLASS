package tw.brad.bs2;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad05 {
	
	
	@RequestMapping("/brad05")
	public Student brad05() {
		Student s1 = new Student();
		s1.setName("brad");
		s1.setAge(18);
		s1.setGender(false);
		List<GBike> bikes = s1.getBikes();
		GBike g1 = new GBike(); g1.setGear(6); g1.setSpeed(1.6);
		GBike g2 = new GBike(); g2.setGear(6); g2.setSpeed(1.6);
		GBike g3 = new GBike(); g3.setGear(6); g3.setSpeed(1.6);

		bikes.add(g1);bikes.add(g2);bikes.add(g3);
			
		
		return s1;
	}
}
