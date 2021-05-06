package authSystemDemo;

import authSystemDemo.business.abstracts.AuthService;
import authSystemDemo.business.concretes.AuthManager;
import authSystemDemo.business.concretes.UserManager;
import authSystemDemo.core.utils.GoogleAuthManagerAdapter;
import authSystemDemo.dataAccess.concretes.HibernateUserDao;
import authSystemDemo.entities.concretes.UserForLogin;
import authSystemDemo.entities.concretes.UserForRegister;

public class Main {

	public static void main(String[] args) {
		
//		UserService userService = new UserManager(new HibernateUserDao());
//		User user = new User(1,"Sinan", "Kara", "snan@test.com", "123456");
//		userService.add(user);
		
		
		UserForRegister userForRegister = new UserForRegister("Sinan","Kara", "snan@test.com", "123456");
		UserForLogin userForLogin = new UserForLogin("snan@test.com", "123456");
		
		AuthService authService = new AuthManager(new UserManager(new HibernateUserDao()));
		authService.register(userForRegister);
//		authService.login(userForLogin);
		
		//Google Auth
//		AuthService googleAuthService = new GoogleAuthManagerAdapter();
//		googleAuthService.register(userForRegister);		
//		googleAuthService.login(userForLogin);
		
	}

}
