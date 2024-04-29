import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            // Open a file for reading
            File file = new File("Revise.txt");
            FileReader reader = new FileReader(file);

            // Read and print the contents of the file
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
