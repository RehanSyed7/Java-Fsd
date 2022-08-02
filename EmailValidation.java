import java.util.regex.*;
import java.util.*;

public class EmailValidation {
	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("syedrehan^gmail.co.in");
		emails.add("syedrehan@gmail.com");
		emails.add("syedrehan#gmail.com");
		emails.add(",syedrehan@mphasis@gmail.com");
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches() + "\n");
		}
	}

}