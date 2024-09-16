package tw.brad.bs2.service;

import org.mindrot.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tw.brad.bs2.dao.UserDao;
import tw.brad.bs2.model.User;
import tw.brad.bs2.model.UserReturn;
import tw.brad.bs2.model.UserV2;
import tw.brad.bs2.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserReturn addUser(User user)  {
		user.setPasswd(BCrypt.hashpw(user.getPasswd(), BCrypt.gensalt()));
		
		User newUser = userDao.add(user);
		UserReturn userReturn = new UserReturn();
		
		if (newUser != null) {
			userReturn.setMesg("OK");
			userReturn.setId(user.getId());
			userReturn.setAccount(user.getAccount());
			userReturn.setName(user.getName());
		}else {
			userReturn.setMesg("ERR");
		}
		return userReturn; 
	}

	@Override
	public User getUser(Long id) {
		return userDao.getById(id);
	}

	@Override
	public UserV2 addUser(UserV2 user) {
		user.setPasswd(BCrypt.hashpw(user.getPasswd(), BCrypt.gensalt()));
		UserV2 user2 = userRepository.save(user);
		return user2;
	}

}