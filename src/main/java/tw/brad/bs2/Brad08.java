package tw.brad.bs2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * RESTful
 * POST: Create
 * GET: Read
 * PUT: Update
 * DELETE: Delete
 * 
*/

@RestController
public class Brad08 {
	@GetMapping("/users")
	public String Brad081() {
		return "brad081";
	}
	
	@GetMapping("/users/{id}")
	public String Brad082(@PathVariable Integer id) {
		return "brad082";
	}
	
	@GetMapping("/users/{id}/bikes")
	public String Brad083(@PathVariable Integer id) {
		return "brad083";
	}
	
	@GetMapping("/users/{id}/bikes/{bid}")
	public String Brad084(@PathVariable Integer id,
				@PathVariable Integer bid) {
		return "brad084";
	}
	
	@PostMapping("/user")
	public String Brad085(@RequestBody User user) {
		
		return "brad085";
	}
	
	@PutMapping("/user/{id}")
	public String Brad086(@PathVariable Integer id, @RequestBody User user) {
		return "brad086";
	}
	
	@DeleteMapping("/user/{id}")
	public String Brad086(@PathVariable Integer id) {
		return "brad086";
	}
	
}
