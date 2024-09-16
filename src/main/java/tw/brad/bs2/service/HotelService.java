package tw.brad.bs2.service;

import java.util.List;

import tw.brad.bs2.model.Hotel;

public interface HotelService {
	public void addHotelFromUrl(String url);
	public Hotel addHotel(Hotel hotel);
	public Hotel getHotel(Long id);
	public List<Hotel> getHotel(String key);
}