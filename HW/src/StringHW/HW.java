package StringHW;

public class HW {

	public static void main(String[] args) {
		System.out.println(repeatLetters("The"));

		System.out.println(hasAlmostBob("88b0b"));

		System.out.println(join("Word", "X", 3));

		System.out.println(isDoubled("hotshots"));

	}

	private static boolean isDoubled(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (numOfTimes(s, s.substring(i, i + 1)) != 2) {
				return false;
			}
		}

		return true;

	}

	private static int numOfTimes(String s, String c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.substring(i, i + 1).equals(c)) {
				count++;
			}
		}
		return count;
	}

	private static String join(String s, String sep, int num) {
		String temp = "";

		for (int i = 0; i < num; i++) {
			temp += s + sep;
		}

		return temp;

		// this way better. concat is bad i think

		/*
		 * StringBuilder sb = new StringBuilder(temp); for (int i = 0; i < num; i++) {
		 * sb.append(s); sb.append(sep); }
		 * 
		 * return sb.toString();
		 */

	}

	private static String repeatLetters(String s) {
		String dup = "";
		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < 2; k++) {
				dup += s.substring(i, i + 1);
			}
		}
		return dup;

	}

	public static boolean hasAlmostBob(String phrase) {
		String temp;
		for (int i = 1; i < phrase.length() - 1; i++) {
			temp = phrase.substring(i - 1, i + 2);
			if (temp.indexOf("b") == 0 && temp.indexOf("b", 1) == 2)
				return true;
		}

		return false;

	}

}
