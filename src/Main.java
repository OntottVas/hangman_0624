import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "kecske";
        char[] charArray = new char[result.length()];

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Character character = scanner.nextLine().charAt(0);
            if (result.contains(character.toString())) {
                System.out.println("YES");
                for (int i = 0; i < charArray.length; i++) {
                    if(character == result.charAt(i)) {
                        charArray[i] = character;
                    } else {
                        charArray[i] = '-';
                    }
                }
                System.out.println(Arrays.toString(charArray));
            } else {
                System.out.println("NO");
            }
        }


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
}