package tw.brad.bs2;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad10 {
	
	@RequestMapping("/brad101")
	public ResponseEntity<User> brad101() {
		User user = new User();
		user.setId(12L);
		user.setName("brad");
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
	}
	
	@RequestMapping("/brad102")
	public String brad102() {	
//		return "brad102";
		throw new RuntimeException();
	}
	
	@RequestMapping("brad103")
	public String brad103() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
	@RequestMapping("brad104")
	public String brad104() throws IOException{
		throw new IOException();
	}
	
	
}