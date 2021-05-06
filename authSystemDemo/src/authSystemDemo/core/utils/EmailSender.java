package authSystemDemo.core.utils;

import authSystemDemo.entities.concretes.User;

public class EmailSender {

	public static boolean emailSend(User user) {
		System.out.println("Sevgili " + user.getFirstName() +"," + "aþaðýdaki baðlantýya týklayarak hesabýný aktifleþtirebilirsin.\nBAGLANTÝ");
		return true;
	}
}

