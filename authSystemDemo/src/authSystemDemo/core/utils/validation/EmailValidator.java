package authSystemDemo.core.utils.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator{
	
	public static boolean isValidEmail(String email) {
		final String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
