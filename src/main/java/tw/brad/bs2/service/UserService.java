package tw.brad.bs2.service;

import tw.brad.bs2.model.User;
import tw.brad.bs2.model.UserReturn;

public interface UserService {
	public UserReturn addUser(User user);
}