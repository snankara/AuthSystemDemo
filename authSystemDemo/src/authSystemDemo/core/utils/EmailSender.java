package authSystemDemo.core.utils;

import authSystemDemo.entities.concretes.User;

public class EmailSender {

	public static boolean emailSend(User user) {
		System.out.println("Sevgili " + user.getFirstName() +"," + "aşağıdaki bağlantıya tıklayarak hesabını aktifleştirebilirsin.\nBAGLANTİ");
		return true;
	}
}

