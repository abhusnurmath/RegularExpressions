import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegexExamples {
	public static void main(String[] args) {
	  //adding a comment there
		File f = new File("Countries"); //comment
		String xyz = "sfdfd";
		Pattern fiveLetter = Pattern.compile("^\\w{5}$") ; 
		try {
			Scanner scanner = new Scanner(f);
			while(scanner.hasNextLine()) {
				String s = scanner.nextLine();
				Matcher m = fiveLetter.matcher(s);
				if ((m.find()) && s.charAt(0) == 'I') {
					System.out.println(s);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
