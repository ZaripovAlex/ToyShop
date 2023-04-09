import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Result {

            public static void resultsToFile(Map<Integer, Integer> resultMap, List<Toys> toys) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/rez.txt"))) {
                resultMap.forEach((id, count) -> {
                    Toys toy = toys.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
                    if (toy != null) {
                        try {
                            writer.write(String.format("Игрушка: %s (ID: %d) - выпала %d раз(а)%n", toy.getName(), id, count));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


