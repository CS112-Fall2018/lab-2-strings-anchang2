/** 
 * My StringFun class function executes the following:
 * length() - returns a number value indiciating the length of the string,
 * equals(otherString) - compares the s string to the otherString to see if they are the same thing and returns a boolean of true or false, 
 * substring(startIndex, endIndex) - returns part of your string depending on your start and end index,
 * 		EX. (1,4) - it would return index 1, 2, 3 of ur string, 
 * trim() - removes any extra white spaces of the string, 
 * indexOf(subString) - returns the index of where the subString first appears, 
 * lastIndexOf(subString) - returns the index of where the subString last appears, 
 * charAt(index) - returns the character at the given index, 
 * toUpperCase() - returns the string as all upper case,
 * toLowerCase() - returns the string as all lower case 
 * @author Amanda Chang
 */
public class StringFun {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("List only 3 arguments!");
			return;
		}
		String s = args[0];
		String otherString = args[1];
		String subString = args[2];
		System.out.println("Three Strings:");
		System.out.println(s);
		System.out.println(otherString);
		System.out.println(subString);
		System.out.println("Length of the string:");
		System.out.println(s.length());
		System.out.println(otherString.length());
		System.out.println(subString.length());
		System.out.println("Are the strings equal?:");
		System.out.println(s.equals(otherString));
		System.out.println(otherString.equals(otherString));
		System.out.println(subString.equals(otherString));
		System.out.println("Substring Index:");
		System.out.println(s.substring(0,2));
		System.out.println(otherString.substring(0,2));
		System.out.println(subString.substring(0,2));
		System.out.println("Trim:");
		System.out.println(s.trim());
		System.out.println(otherString.trim());
		System.out.println(subString.trim());
		System.out.println("Index of:");
		System.out.println(s.indexOf(subString));
		System.out.println(otherString.indexOf(subString));
		System.out.println(subString.indexOf(subString));
		System.out.println("Last index of:");
		System.out.println(s.lastIndexOf(subString));
		System.out.println(otherString.lastIndexOf(subString));
		System.out.println(subString.lastIndexOf(subString));
		System.out.println("Character at:");
		System.out.println(s.charAt(3));
		System.out.println(otherString.charAt(3));
		System.out.println(subString.charAt(3));
		System.out.println("Uppercase:");  
		System.out.println(s.toUpperCase());
		System.out.println(otherString.toUpperCase());
		System.out.println(subString.toUpperCase());
		System.out.println("Lowercase:");
		System.out.println(s.toLowerCase());
		System.out.println(otherString.toLowerCase());
		System.out.println(subString.toLowerCase());

	}
}