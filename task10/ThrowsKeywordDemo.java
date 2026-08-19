import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordDemo {

    static void readFile() throws IOException {

        FileReader file = new FileReader("data.txt");

    }

    public static void main(String[] args) {

        try {
            readFile();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}