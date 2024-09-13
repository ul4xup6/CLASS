package tw.brad.bs2;

import java.util.List;

import org.mindrot.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.brad.bs2.model.User;


@RestController
public class Brad13 {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@RequestMapping("/brad131")
	public String Brad131(@RequestBody List<User>  userList) {
		String sql = "INSERT INTO user (account,passwd,name) VALUES (:account, :passwd, :name)";
		
		MapSqlParameterSource[] source = new MapSqlParameterSource[userList.size()];
		for(int i=0; i<userList.size(); i++) {
			User user = userList.get(i);
			source[i] = new MapSqlParameterSource();
			source[i].addValue("account", user.getAccount());
			source[i].addValue("passwd", BCrypt.hashpw(user.getPasswd(), BCrypt.gensalt()));
			source[i].addValue("name", user.getName());
		}
		
		namedParameterJdbcTemplate.batchUpdate(sql, source);
		
		return "ok";
	}
	
	@RequestMapping("/brad132")
	public String brad132() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx";
		String content = restTemplate.getForObject(url, String.class);
		System.out.println(content);

		return "brad132";
	}
	
//	@RequestMapping("/brad133")
//	public User brad133() throws Exception{
//		String user = "{\"account\": \"test1\", \"passwd\": \"test2\", \"name\":\"test3\"}";
//		ObjectMapper mapper = new ObjectMapper();
//	
//		try {
//			User newUser = mapper.readValue(user, User.class);
//			return newUser;
//		} catch (Exception e) {
//			System.out.println(e);
//			throw new Exception();
//		}
//	}
	
	@RequestMapping("/brad133")
	public List<User> brad133() throws Exception{
		String user = "[{\"name\":\"test3\",\"id\":7},{\"name\":\"test3\",\"id\":7}]";
		ObjectMapper mapper = new ObjectMapper();
		try {
			List<User> list = mapper.readValue(user, new TypeReference<List<User>>() {});
			System.out.println(list.size());
			return list;
		} catch (Exception e) {
			System.out.println(e);
			throw new Exception();
		}
	}
}
