package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad04 {
	@Autowired
	@Qualifier("bigLottery")
	private Lottery lottery1;

	@Autowired
	@Qualifier("powerLottery")
	private Lottery lottery2;
	
	@Autowired
	private MySetting mySetting;
	
	
	@RequestMapping("/brad04")
	public String brad04() {
		System.out.println(String.format("%s : %d", 
				mySetting.getBigLottery(), lottery1.createLottery()));
		System.out.println(String.format("%s : %d", 
				mySetting.getPowerLottery(), lottery2.createLottery()));
		
		((BigLottery)lottery1).m1();
		((BigLottery)lottery1).poker1();
		return "brad04";
	}
	
}