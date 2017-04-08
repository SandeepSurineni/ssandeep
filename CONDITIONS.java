import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CONDITIONS{
	
public static void main(String[] args) {
		String data,vowels ="aeiou";
		String consonants = "bcdfghjklmnpqrstvwxyz";
		String digits = "0123456789";
		System.out.println("Enter lower case character or digit. No data ends. ");
		Scanner scanner1 = new Scanner(System.in);
		
		data = scanner1.next();
	   
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
	     Matcher m = p.matcher(data);
		boolean check = m.find();
		System.out.println("status: "+check);
		while(check == false) {
			if(vowels.contains(data))
				System.out.println("The Letter "+data+" is Vowel");
			else if(consonants.contains(data))
				System.out.println("The Leter "+data+" is Consonant");
			else if(digits.contains(data))
				System.out.println("The Letter "+data+" is a digit");
			else 
				System.out.println("Problems Found");
		}
		
	}

}
