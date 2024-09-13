package tw.brad.bs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class MyConf2 {
	@Autowired
	private ResourceLoader resourceLoader;
	
	
	@Bean("mySetting")
	public MySetting getMySetting() {
		//除錯
//		System.out.println("getmysetting");
		try {
			Resource resource = resourceLoader.getResource("classpath:mysetting.json");
			//除錯
//			System.out.println(resource.getFile().getAbsoluteFile());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while((line = reader.readLine()) != null ) {
				sb.append(line);
			} 
			reader.close();
			System.out.println(sb.toString());
			
//			JSONObject root = new JSONObject(sb.toString());
//			System.out.println(root.getString("title"));
//			
//			MySetting mySetting = new MySetting();
//			System.out.println(root.get("title"));
			
			ObjectMapper objMapper = new ObjectMapper();
			MySetting mySetting =  objMapper.readValue(sb.toString(), MySetting.class);
			System.out.println(mySetting.getTitle());
			
			return mySetting;
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		return null;
	}
}
