package authSystemDemo.business.concretes;


import java.util.ArrayList;
import java.util.List;

import authSystemDemo.business.abstracts.AuthService;
import authSystemDemo.business.abstracts.UserService;
import authSystemDemo.core.utils.EmailSender;
import authSystemDemo.core.utils.validation.EmailValidator;
import authSystemDemo.entities.concretes.User;
import authSystemDemo.entities.concretes.UserForLogin;
import authSystemDemo.entities.concretes.UserForRegister;

public class AuthManager implements AuthService{


	private UserService userService;
	
	public AuthManager(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void login(UserForLogin userForLogin) {
		if (!this.checkUser(userForLogin.getEmail())) {
			System.out.println("Giri� ba�ar�l�");			
			return;
		}
		System.out.println("E posta adresi kay�tl� de�il.");
		
	}

	@Override
	public void register(UserForRegister userForRegister) {
		// Kay�t kurallar�
		
		if (!EmailValidator.isValidEmail(userForRegister.getEmail())) {
			System.out.println("E-mail istenilen formatta olmal�.");
			return;
		}
		
		if (!this.checkUser(userForRegister.getEmail())) {
			System.out.println("Bu hesap zaten var.");
			return;
		}
		
		if(!this.checkFirstAndLastName(userForRegister.getFirstName(), userForRegister.getLastName()))
			return;
		
		if(!this.checkPassword(userForRegister.getPassword()))
			return;
		
		var user = new User(
				1, //auto increment db
				userForRegister.getFirstName(),
				userForRegister.getLastName(),
				userForRegister.getEmail(),
				userForRegister.getPassword()
				);
		
		userService.add(user);
		System.out.println("Kay�t ba�ar�l�");
		
		if (EmailSender.emailSend(user)) {
			System.out.println("Hesap do�ruland�.");
		}
		
	}
	
	private boolean checkFirstAndLastName(String firstName, String lastName) {
		if (firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Ad ve Soyad en az iki karakter olmal�d�r.");	
			return false; 					
		}
		return true;		
	}
	
	private boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmal�d�r.");			
			return false;
		}
		return true;
	}
	
	private boolean checkUser(String email) {
		List<User> users = new ArrayList<User>();  
		users.add(new User(1, "Sinan", "Kara", "snan@test.com", "123456"));

		for(User user:users) 			
			if (user.getEmail() == email) 
				return false;
		
		return true;
	}
	
	

}
