import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Loader {

        public static List<Toys> loadFile() {
            List<Toys> toys = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("src/main/file.txt"))) {
                String line;
                while ((line = reader.readLine())  != null) {
                    String[] parts = line.split(";");
                    int id = Integer.parseInt(parts[0].trim());
                    int weight = Integer.parseInt(parts[1].trim());
                    String name = parts[2].trim();
                    toys.add(new Toys(id, weight, name));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return toys;
        }
    }


