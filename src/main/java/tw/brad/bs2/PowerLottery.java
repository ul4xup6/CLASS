package tw.brad.bs2;

import java.util.Random;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerLottery implements Lottery, InitializingBean {
	public PowerLottery() {
		System.out.println("PowerLottery()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public Integer createLottery() {
		int lottery = new Random().nextInt(1, 48+1);
		return lottery;
	}
	
}
