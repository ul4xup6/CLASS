package tw.brad.bs2.dao;

import tw.brad.bs2.model.User;
import java.util.*;

public interface UserDao {
	public User add(User user);
	
	public void delete(User user);
	public void delete(User user, Long id);
	
	public void update(User user);
	public void update(User user, Long id);
	
	public List<User> getAll();
	public User getById(Long id);
	public User getByAccount(String account);
	
}