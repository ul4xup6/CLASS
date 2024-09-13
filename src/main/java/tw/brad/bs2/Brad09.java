package tw.brad.bs2;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@RestController
//@Validated
public class Brad09 {
	
	@RequestMapping("/brad091")
	public String brad91(@RequestBody @Valid User user) {
		System.out.println("OK1");
		
		return "/brad091";
	}
	
	@RequestMapping("/brad092/{id}")
	public String brad092(@PathVariable @Min(10) @Max(100) Integer id) {
		System.out.println("brad092:" + id);
		
		return "/brad092";
	}
	
	@RequestMapping("/brad092")
	public String brad092(@PathVariable @Size User user) {
		System.out.println("brad092:" + user.getName() + user.getEmail());
		
		return "/brad092";
	}
	
}
