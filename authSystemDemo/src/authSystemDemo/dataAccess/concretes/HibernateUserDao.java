package authSystemDemo.dataAccess.concretes;

import authSystemDemo.dataAccess.abstracts.UserDao;
import authSystemDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Added :" + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated :" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted :" + user.getFirstName());
		
	}
}
