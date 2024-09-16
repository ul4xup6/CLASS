package tw.brad.bs2.service;

import tw.brad.bs2.model.User;
import tw.brad.bs2.model.UserReturn;
import tw.brad.bs2.model.UserV2;

public interface UserService {
	public UserReturn addUser(User user);
	public User getUser(Long id);
	public UserV2 addUser(UserV2 user);
}