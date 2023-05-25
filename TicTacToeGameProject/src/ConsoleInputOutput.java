import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputOutput {

	public String takePlayerInputString() {
		try {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			return input;
		} catch (InputMismatchException e) {
			System.out.println("Input mismatched");
			return null;
		}

	}

	public int takePlayerInputInt() {
		try {
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			return input;
		} catch (InputMismatchException e) {
			System.out.println("Input mismatched");
			return 0;
		}
	}

	public void showMesssage(String message) {
		System.out.println(message);
	}

	public void showMesssage(String message, boolean newLine) {
		try {
			if (newLine) {
				showMesssage(message);
			} else {
				System.out.print(message);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal arguements");
		}
	}

	public void showErrorMesssage(String message) {
		System.err.println(message);
	}
}