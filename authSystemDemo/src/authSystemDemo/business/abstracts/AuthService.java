package authSystemDemo.business.abstracts;

import authSystemDemo.entities.concretes.UserForLogin;
import authSystemDemo.entities.concretes.UserForRegister;

public interface AuthService {
	void login(UserForLogin userForLogin);
	void register(UserForRegister userForRegister);
}
