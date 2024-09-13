package tw.brad.bs2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brad11 {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@RequestMapping("/brad111")
	public String brad111() {
		String sql = "INSERT INTO user (account,passwd,name) VALUES ('brad','brad','Brad')";
		
		Map<String, Object> map = new HashMap<String, Object>();
		namedParameterJdbcTemplate.update(sql, map);
		
		return "brad111";
	}

	@RequestMapping("/brad112")
	public String brad112() {
		String sql = "INSERT INTO user (account,passwd,name) VALUES (:account, :passwd, :name)";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("account", "mark");
		map.put("passwd", "mark");
		map.put("name", "馬克");
		
		namedParameterJdbcTemplate.update(sql, map);
		
		return "brad112";
	}
	
	
	
}