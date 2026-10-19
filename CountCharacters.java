import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CountCharacters {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write("Java is easy\n");
            writer.write("File handling in Java");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return;
        }

        int lines = 0;
        int words = 0;
        int characters = 0;

        try (BufferedReader br =
                 new BufferedReader(new FileReader("data.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String trimmed = line.trim();

                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}