package tw.brad.bs2;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/*
 * {
 *  "id" : 1,
 *  "name" : "Brad"
 * }
 */


public class User {
	@NotNull
	private Long id;
	
	@Size(min=6, max=10)
	private String name;
	
	@Email
	private String email;
	
	@Pattern(regexp = "^[A-Z][12][0-9]{8}$")
	private String twid;
	
	@NotBlank // String
	private String account;
	
	@NotEmpty  // List, Set, Map, [] => size>0
	private List<String> courses;
	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public List<String> getCourse() {
		return courses;
	}
	public void setCourse(List<String> course) {
		this.courses = course;
	}
	public String getTwid() {
		return twid;
	}
	public void setTwid(String twid) {
		this.twid = twid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
