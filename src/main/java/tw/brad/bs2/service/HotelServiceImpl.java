package tw.brad.bs2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.brad.bs2.dao.HotelDao;
import tw.brad.bs2.model.Hotel;

@Component
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelDao hotelDao;
	
	@Override
	public void addHotelFromUrl(String url) {
		RestTemplate restTemplate = new RestTemplate();
		String content = restTemplate.getForObject(url, String.class);
		//System.out.println(content);
		
		String json = content.replace("\"Name\":", "\"name\":")
							.replace("\"Address\":", "\"address\":")
							.replace("\"Tel\":", "\"tel\":");
		
		//String content = "[{\"name\":\"test3\",\"id\":7},{\"name\":\"test3\",\"id\":7}]";
		
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			List<Hotel> list = mapper.readValue(json, new TypeReference<List<Hotel>>() {});
			System.out.println(list.size());
			//Hotel hotel = list.get(0);
			//System.out.println(hotel.getName() + ":" + hotel.getAddress() + ":" + hotel.getTel());
			
			int dbNum = hotelDao.add(list);
			System.out.println(dbNum);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelDao.add(hotel);
	}

	@Override
	public Hotel getHotel(Long id) {
		return hotelDao.get(id);
	}

	@Override
	public List<Hotel> getHotel(String key) {
		return hotelDao.get(key);
	}

}