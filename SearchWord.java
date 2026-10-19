import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class SearchWord {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("notes.txt")) {
            writer.write("Java is easy. Java is powerful. Learn Java.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String searchWord = sc.next();

        int count = 0;

        try (BufferedReader br =
                 new BufferedReader(new FileReader("notes.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}