package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "REPEAT");

		// 2. Call the printCustomMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length(); i > 0; i--) {
				System.out.print(s.substring(i - 1, i));
			}
			System.out.println("");
		}, "BACKWARDS");
		// 3. Call the printCustomMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(s.substring(i, i + 1).toLowerCase());
				} else {
					System.out.print(s.substring(i, i + 1).toUpperCase());
				}
			}
			System.out.println("");
		}, "MIXED");
		// 4. Call the printCustomMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.substring(i, i + 1));
				if (i != s.length() - 1) {
					System.out.print(".");
				}
			}
			System.out.println("");
		}, "PERIODS");
		// 5. Call the printCustomMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (s.substring(i, i + 1).equalsIgnoreCase("a")) {

				} else if (s.substring(i, i + 1).equalsIgnoreCase("e")) {

				} else if (s.substring(i, i + 1).equalsIgnoreCase("i")) {

				} else if (s.substring(i, i + 1).equalsIgnoreCase("o")) {

				} else if (s.substring(i, i + 1).equalsIgnoreCase("u")) {

				} else {
					System.out.print(s.substring(i, i + 1));
				}
			}
			System.out.println("");
		}, "NO VOWELS");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
