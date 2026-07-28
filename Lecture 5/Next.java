import java.util.Scanner;

public class Next {

    static class Alphabet {
        private char c;

        public Alphabet(char c) {
            this.c = c;
        }

        public char getNextCharacter() {
            if (c == 'z')
                return 'a';
            return (char) (c + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        Alphabet alphabet = new Alphabet(c);

        System.out.println(alphabet.getNextCharacter());


    }
}
