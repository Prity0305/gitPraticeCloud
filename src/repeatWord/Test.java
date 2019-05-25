package repeatWord;

public class Test {

	private static String input = "durgadurgadurgadurga";

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (stringBuilder.indexOf(Character.toString(ch)) == -1) {
				stringBuilder.append(ch);
			}
		}
		System.out.println(stringBuilder);
	}
}
