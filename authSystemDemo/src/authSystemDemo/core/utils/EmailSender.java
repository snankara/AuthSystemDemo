package authSystemDemo.core.utils;

import authSystemDemo.entities.concretes.User;

public class EmailSender {

	public static boolean emailSend(User user) {
		System.out.println("Sevgili " + user.getFirstName() +"," + "a�a��daki ba�lant�ya t�klayarak hesab�n� aktifle�tirebilirsin.\nBAGLANT�");
		return true;
	}
}

