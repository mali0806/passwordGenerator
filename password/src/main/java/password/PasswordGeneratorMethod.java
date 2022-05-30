package password;

import java.security.SecureRandom;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class PasswordGeneratorMethod extends HttpServlet {

	public String passwordGen(HttpServletRequest request) {
		int maxLength = Integer.parseInt(request.getParameter("maxlen"));
		String strSplChar = request.getParameter("splchar");

		// ASCII range – alphanumeric (0-9, a-z, A-Z)
		String chars;
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		// each iteration of the loop randomly chooses a character from the given
		// ASCII range and appends it to the `StringBuilder` instance
		if (maxLength >= 0 && !strSplChar.isEmpty() && strSplChar.equalsIgnoreCase("Y")) {
			chars = "!@#$%^&*()_+{}[]|?><.,ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		} else if (maxLength >= 0) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

		}

		else {
			sb.append("");
		}

		return sb.toString();
	}

}
