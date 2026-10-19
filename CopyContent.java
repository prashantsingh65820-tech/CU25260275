import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyContent {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("PrashantSingh.txt");
             FileWriter writer = new FileWriter("backup.txt")) {

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}