import java.util.*;
public class PigLatin {
	public static String pigLatinSimple(String s) {
		s = s.toLowerCase();
		if (s.charAt(0) == 'a' || s.charAt(0) == 'u' || s.charAt(0) == 'o' || s.charAt(0) == 'i' || s.charAt(0) == 'e') {
			return s + "hay";
		}
		return s.substring(1) + s.charAt(0) + "ay";
	}
	public static String pigLatin(String s) {
		s = s.toLowerCase();
		if (s.length() <= 2) return pigLatinSimple(s);
		String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
		String f2l = s.substring(0, 2);
		for (int i = 0; i < digraphs.length; i++) {
			if (f2l.equals(digraphs[i])) {
				return s.substring(2) + f2l + "ay";
			}
		}
		return pigLatinSimple(s);
	}
	public static String pigLatinBest(String s) {
		s = s.toLowerCase();
		if (s.charAt(0) < 'a' || s.charAt(0) > 'z') return s;
		if (s.charAt(s.length() - 1) < 'a' || s.charAt(s.length() - 1) > 'z') return pigLatin(s.substring(0, s.length() - 1)) + s.substring(s.length() - 1);
		return pigLatin(s);
	}
	public static void main(String[] args) {
		Scanner lines = new Scanner(System.in);
		while (lines.hasNextLine()) {
			Scanner words = new Scanner(lines.nextLine());
			while (words.hasNext()) {
				System.out.print(pigLatinBest(words.next()));
				if (words.hasNext()) System.out.print(" ");
			}
			if (lines.hasNextLine()) System.out.println();
		}
	}
}
