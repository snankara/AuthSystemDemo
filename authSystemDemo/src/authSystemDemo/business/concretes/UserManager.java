package authSystemDemo.business.concretes;

import authSystemDemo.business.abstracts.UserService;
import authSystemDemo.dataAccess.abstracts.UserDao;
import authSystemDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);		
	}

}
