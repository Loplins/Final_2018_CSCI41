import java.util.Scanner;
// import java.util.Random;		//tool for random word selection


public class hangman{																			

	private static String[] words = {"Garrett", "Kehardip", "Lindsey", "Tarik" };				//todo Add words or link to dict like before
	private static String word = words[(int)(Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");	//randomizer for word selection
	private static int count = 0;																//count is number of wrong guesses

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Guess a letter in the word");									// Output message
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Congratulations, you actually survived.");
			System.out.println("The word was " + word);
//			System.out.println("");
		}
	}


//Output notification and image with each bad guess.
//todo
//create better images, better notification sentences.
//try to make it so each output will occupy approx a screen
//redo so start with full post. only add body parts for mistakes

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          /    ");
			System.out.println("   |         /     ");
			System.out.println("   |        /      ");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |        /     \\");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |         __|");
			System.out.println("   |        /  |");
			System.out.println("   |       /   |");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |        /     \\");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        | X  X|");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |         __|__");
			System.out.println("   |        /  |  \\");
			System.out.println("   |       /   |   \\");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\");
			System.out.println("   |        /     \\");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println("YOU'VE BEEN HUNG!!");
			System.out.println("The word was " + word);
		}
	}
}
