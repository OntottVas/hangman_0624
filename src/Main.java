import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "kecske";
        char[] charArray = new char[result.length()];
        charInicialize(charArray);

        Scanner scanner = new Scanner(System.in);
        while (!win(result, charArray)) {
            Character character = scanner.nextLine().charAt(0);

            if (character == '0') {
                break;
            }

            for (int i = 0; i < charArray.length; i++) {
                if (character == result.charAt(i)) {
                    charArray[i] = character;
                }
            }
            System.out.println(Arrays.toString(charArray));

        }
        System.out.println("Congratulations, you won!");

        // beolvasni
        // k -> YES
        // o -> NO


    }

    /*public boolean characterCheck(String result) {
        boolean win = false;
        while (!win) {
            System.out.println("Give me a letter.");
            String character = scanner.nextLine();

            boolean match = false;
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) ==)
            }
        }
    }*/

    //TODO metódus charArray feltöltésére '_' -vel
    public static void charInicialize(char[] charArray) {
        Arrays.fill(charArray, '_');
    }

    public static void printArray(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }

    //TODO metódus character check -re


    public static boolean win(String result, char[] charArray) {
        String match = "";
        for (char c : charArray) {
            match += c;
        }

        return match.equals(result);
    }

}