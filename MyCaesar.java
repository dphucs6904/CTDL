package Lab1_Task2;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	private int n;

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	public char encryptChar(char c) {
		if (Character.isLetter(c)) {
			char upperC = Character.toUpperCase(c);
			int index = (upperC - 'A' + n) % 26;
			if (index < 0) {
				index += 26;
			}
			return ALPHABET[index];
		} else {
			return c;
		}
	}

	public String encrypt(String input) {
		StringBuilder encryptedText = new StringBuilder();
		for (char c : input.toCharArray()) {
			encryptedText.append(encryptChar(c));
		}
		return encryptedText.toString();
	}

	public char decryptChar(char c) {
		if (Character.isLetter(c)) {
			char upperC = Character.toUpperCase(c);
			int index = (upperC - 'A' - n) % 26;
			if (index < 0) {
				index += 26;
			}
			return ALPHABET[index];
		} else {
			return c;
		}
	}

	public String decrypt(String input) {
		StringBuilder decryptedText = new StringBuilder();
		for (char c : input.toCharArray()) {
			decryptedText.append(decryptChar(c));
		}
		return decryptedText.toString();
	}

	public static void main(String[] args) {
		MyCaesar caesar = new MyCaesar(3);
		String originalText = "HELLO WORLD";
		String encryptedText = caesar.encrypt(originalText);
		System.out.println("Encrypted: " + encryptedText);
		String decryptedText = caesar.decrypt(encryptedText);
		System.out.println("Decrypted: " + decryptedText);
	}
}
