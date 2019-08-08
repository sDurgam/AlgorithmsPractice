
public class BracketMatch {

	public static void main(String[] args) {
		System.out.println(bracketMatch("(())"));
	}

	static int bracketMatch(String text) {
		int count = 0;
		int left = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == '(') {
				left++;
			}
			if (ch == ')') {
				if (left > 0)
					left--;
				else
					count++;
			}
		}
		return count + left;
	}
}
