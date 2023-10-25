

public class Pangram {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; 
            }
        }

        return true;
    }
}
