package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad03 {
	@Value("${title}")
	private String title;
	
	@Value("${name:World}")
	private String myName;
	
	@RequestMapping("brad03")
	public String brad03() {
		return String.format("<h1>%s</h1><hr /><div>Hello, %s</div>", title, myName);
	}
}
