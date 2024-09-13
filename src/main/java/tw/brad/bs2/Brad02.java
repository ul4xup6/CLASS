package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Brad02 {
	@Autowired
	private MySetting mySetting;
	
	
	@RequestMapping("/brad02")
	public String brad02() {
		return String.format("<h1>%s</h1>", mySetting.getTitle());
	}
}
