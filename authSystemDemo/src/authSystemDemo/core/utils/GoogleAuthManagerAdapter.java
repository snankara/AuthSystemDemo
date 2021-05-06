package authSystemDemo.core.utils;

import authSystemDemo.business.abstracts.AuthService;
import authSystemDemo.entities.concretes.UserForLogin;
import authSystemDemo.entities.concretes.UserForRegister;
import authSystemDemo.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	private GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	
	@Override
	public void login(UserForLogin userForLogin) {		
		this.googleAuthManager.login(userForLogin.getEmail());
		
	}

	@Override
	public void register(UserForRegister userForRegister) {
		this.googleAuthManager.register(userForRegister.getEmail());
		
	}
}
