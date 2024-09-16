package tw.brad.bs2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * 注意: thymeleaf ==> Controller
 */

@Controller
public class MyController {
	
	
	@GetMapping("/index.html")
	public String home() {
		return "index";	// thymeleaf => templates => xxx.html
	}
	
	@GetMapping("/brad01")
	public String brad01() {
		return "brad01";	// thymeleaf => templates => brad01.html
	}
	
	@GetMapping("/brad02")
	public String brad02() {
		return "brad02";	// thymeleaf => templates => brad01.html
	}
	
	@GetMapping("/user/reg")
	public String reg() {
		return "reg";	// thymeleaf => templates => brad01.html
	}
	
}