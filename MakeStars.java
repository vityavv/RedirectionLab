import java.util.*;
public class MakeStars {
	public static void main(String[] args) {
		Scanner lines = new Scanner(System.in);
		while (lines.hasNextLine()) {
			Scanner words = new Scanner(lines.nextLine());
			while (words.hasNext()) {
				String word = words.next();
				for (int i = 0; i < word.length(); i++) System.out.print("*");
				if (words.hasNext()) System.out.print(" ");
			}
			if (lines.hasNextLine()) System.out.println();
		}
	}
}
